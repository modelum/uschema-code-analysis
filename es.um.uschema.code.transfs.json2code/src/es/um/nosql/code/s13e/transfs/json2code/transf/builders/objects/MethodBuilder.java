package es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.Statement;

public class MethodBuilder extends StatementBuilder
{
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		JSONObject blockJSONObject = jsonObject.optJSONObject("value");
		if (blockJSONObject != null)
		{
			return jsonAnalyzer.analyzeStatement(blockJSONObject, false);
		} else
		{
			warningRepository.createJSONObjectNotFoundWarning("value", jsonObject, this.getClass());
		}
		
		return ListUtils.toList();
	}

}
