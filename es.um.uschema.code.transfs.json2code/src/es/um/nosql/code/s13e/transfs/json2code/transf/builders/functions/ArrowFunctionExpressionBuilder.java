package es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.ContainersBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class ArrowFunctionExpressionBuilder extends StatementBuilder
{
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		ContainersBuilder containersBuilder = new ContainersBuilder(codeModelRepository);
		CallableBlock callableBlock = containersBuilder.createCallableBlock(CodeBlockType.LAMBDA);
		
		FunctionPartsBuilder functionPartsBuilder = new FunctionPartsBuilder();
		functionPartsBuilder.processParameters(jsonObject, warningRepository, callableBlock);
		functionPartsBuilder.processBody(callableBlock, jsonObject, warningRepository, jsonAnalyzer);

		return ListUtils.toList(callableBlock);
	}

}
