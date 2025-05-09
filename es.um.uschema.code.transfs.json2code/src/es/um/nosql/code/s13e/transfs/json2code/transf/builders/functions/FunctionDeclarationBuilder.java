package es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.Statement;

public class FunctionDeclarationBuilder extends StatementBuilder
{

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, 
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		CallableBlock callableBlock = codeModelRepository.getLastCallableBlock();
		
		FunctionPartsBuilder functionPartsBuilder = new FunctionPartsBuilder();
		functionPartsBuilder.processId(jsonObject, warningRepository, callableBlock);
		functionPartsBuilder.processParameters(jsonObject, warningRepository, callableBlock);
		functionPartsBuilder.processBody(callableBlock, jsonObject, warningRepository, jsonAnalyzer);

		return ListUtils.toList();
	}

}
