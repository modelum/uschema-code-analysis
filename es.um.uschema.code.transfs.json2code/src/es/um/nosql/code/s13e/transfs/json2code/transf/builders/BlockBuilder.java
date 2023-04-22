package es.um.nosql.code.s13e.transfs.json2code.transf.builders;

import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class BlockBuilder extends StatementBuilder
{
	private static final String BODY_PROPERTY = "body";

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		JSONArray bodyArray = jsonObject.optJSONArray(BODY_PROPERTY);
		if (bodyArray != null)
		{
			List<Statement> statements = new LinkedList<Statement>();
			for (int i = 0; i < bodyArray.length(); i++)
			{
				JSONObject optJSONObject = bodyArray.optJSONObject(i);
				if (statements != null)
					statements.addAll(jsonAnalyzer.analyzeStatement(optJSONObject, false));
				else
					warningRepository.createStatementNotProcessed(optJSONObject, this.getClass());
			}
			return statements;
		} else
			warningRepository.createPropertyNotFoundWarning(BODY_PROPERTY, jsonObject, this.getClass());

		return ListUtils.toList();
	}

}
