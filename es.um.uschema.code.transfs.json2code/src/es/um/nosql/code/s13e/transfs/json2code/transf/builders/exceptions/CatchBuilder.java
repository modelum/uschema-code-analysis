package es.um.nosql.code.s13e.transfs.json2code.transf.builders.exceptions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Catch;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class CatchBuilder extends StatementBuilder
{
	private static final String BODY_PROPERTY = "body";
	private static final String PARAM_PROPERTY = "param";
	
	private CodeFactory codeFactory;

	public CatchBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Catch catchStatement = codeFactory.createCatch();
		
		processParameter(jsonObject, jsonAnalyzer, warningRepository, catchStatement);
		processCatchCodeBlock(jsonObject, jsonAnalyzer, warningRepository, catchStatement);
		
		new LocationBuilder().createLocation(jsonObject, catchStatement);
		
		return ListUtils.toList(catchStatement);
	}

	private void processParameter(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Catch catchStatement)
	{
		JSONObject blockJSONObject = jsonObject.optJSONObject(PARAM_PROPERTY);
		if (blockJSONObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(blockJSONObject, false);
			if (statements.size() == 1)
			{
				Statement statement = statements.get(0);
				if (statement instanceof DataProducer)
					catchStatement.setDataProducer((DataProducer) statement);
			}
		} else
			warningRepository.createJSONObjectNotFoundWarning(PARAM_PROPERTY, jsonObject, this.getClass());
	}
	
	private void processCatchCodeBlock(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Catch catchStatement)
	{
		CodeBlock codeBlock = codeFactory.createCodeBlock();
		catchStatement.setCodeBlock(codeBlock);
		
		JSONObject blockJSONObject = jsonObject.optJSONObject(BODY_PROPERTY);
		if (blockJSONObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(blockJSONObject, false);
			codeBlock.getStatements().addAll(statements);
		} else
			warningRepository.createJSONObjectNotFoundWarning(BODY_PROPERTY, jsonObject, this.getClass());
	}

}
