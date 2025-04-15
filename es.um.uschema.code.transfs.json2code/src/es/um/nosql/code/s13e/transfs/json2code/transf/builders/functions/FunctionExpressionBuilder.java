package es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.ContainersBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.CodeBlockType;
import es.um.uschema.code.metamodels.code.Statement;

public class FunctionExpressionBuilder extends StatementBuilder
{
	private static final String ID_PROPERTY = "id";
	private static final String NAME_PROPERTY = "name";
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		ContainersBuilder containersBuilder = new ContainersBuilder(codeModelRepository);
		CallableBlock callableBlock = containersBuilder.createCallableBlock(CodeBlockType.FUNCTION);
		
		FunctionPartsBuilder functionPartsBuilder = new FunctionPartsBuilder();
		processId(jsonObject, warningRepository, callableBlock);
		functionPartsBuilder.processParameters(jsonObject, warningRepository, callableBlock);
		functionPartsBuilder.processBody(callableBlock, jsonObject, warningRepository, jsonAnalyzer);

		return ListUtils.toList(callableBlock);
	}

	private void processId(JSONObject jsonObject, WarningRepository warningRepository, CallableBlock callableBlock)
	{
		JSONObject idObject = jsonObject.optJSONObject(ID_PROPERTY);
		if (idObject != null)
		{
			String name = idObject.optString(NAME_PROPERTY);
			if (name != null) 
			{
				callableBlock.setName(name);
				callableBlock.setFunctionName(name);
			} else
				warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, idObject, this.getClass());
		}
	}

}
