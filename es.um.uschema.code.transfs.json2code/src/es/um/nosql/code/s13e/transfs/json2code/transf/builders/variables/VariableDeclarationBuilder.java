package es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables;

import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.VariableDeclaration;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class VariableDeclarationBuilder extends StatementBuilder
{
	private static final String DECLARATIONS_PROPERTY = "declarations";

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		String kind = jsonObject.optString("kind");
		if (kind == null || kind.isEmpty())
			kind = "var";
		
		JSONArray bodyArray = jsonObject.optJSONArray(DECLARATIONS_PROPERTY);
		if (bodyArray != null)
		{
			return processDeclarations(jsonAnalyzer, kind, bodyArray);
		} else
			warningRepository.createJSONArrayNotFoundWarning(DECLARATIONS_PROPERTY, jsonObject, this.getClass());

		return ListUtils.toList();
	}

	private List<Statement> processDeclarations(JSONAnalyzer jsonAnalyzer, String kind, JSONArray bodyArray)
	{
		List<Statement> statements = new LinkedList<Statement>();
		
		for (int i = 0; i < bodyArray.length(); i++)
		{
			JSONObject optJSONObject = bodyArray.optJSONObject(i);
			List<Statement> analyzedStatements = jsonAnalyzer.analyzeStatement(optJSONObject, false);
			for (Statement statement : analyzedStatements)
			{
				if (statement instanceof VariableDeclaration)
				{
					VariableDeclaration variableDeclaration = (VariableDeclaration) statement;
					variableDeclaration.setKind(kind);
					statements.add(variableDeclaration);
				}
			}
		}
		
		return statements;
	}

}
