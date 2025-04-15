package es.um.nosql.code.s13e.transfs.json2code.transf.analyzers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.Statement;

public class JSONAnalyzer
{
	private static final String TYPE_PROPERTY = "type";

	private WarningRepository warningRepository;
	private CodeModelRepository codeModelRepository;
	private Map<String, StatementBuilder> codeTypes;

	public JSONAnalyzer(WarningRepository warningRepository, CodeModelRepository codeModelRepository)
	{
		this.warningRepository = warningRepository;
		this.codeModelRepository = codeModelRepository;

		this.codeTypes = new HashMap<String, StatementBuilder>();
		for (CodeType codeType : CodeType.values())
			codeTypes.put(codeType.name(), codeType.getBuilder());
	}

	public List<Statement> analyzeStatement(JSONObject jsonObject, boolean saveStatements)
	{
		String typeProperty = jsonObject.optString(TYPE_PROPERTY);
		if (typeProperty != null)
		{
			StatementBuilder builder = codeTypes.get(typeProperty);
			if (builder != null)
			{
				List<Statement> statements = builder.build(jsonObject, this, codeModelRepository, warningRepository);
				
				if (saveStatements)
				{
					CodeBlock bestCodeBlockChoice = codeModelRepository.getBestCodeBlockChoice();
					bestCodeBlockChoice.getStatements().addAll(statements);
				}
				
				return statements;
			} else
				warningRepository.createTypeNotFoundWarning(typeProperty, jsonObject, this.getClass());
		} else
			warningRepository.createPropertyNotFoundWarning(TYPE_PROPERTY, jsonObject, this.getClass());

		return ListUtils.toList();
	}

	public List<Statement> analyzeStatement(JSONArray jsonArray, boolean saveStatements)
	{
		List<Statement> statements = new LinkedList<Statement>();
		
		for (int i = 0; i < jsonArray.length(); i++)
		{
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			List<Statement> analyzedStatements = analyzeStatement(jsonObject, saveStatements);
			statements.addAll(analyzedStatements);
		}

		return statements;
	}

}
