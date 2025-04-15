package es.um.nosql.code.s13e.transfs.json2code.transf.builders.exceptions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.Catch;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.Finally;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Try;

public class TryBuilder extends StatementBuilder
{
	private static final String BLOCK_PROPERTY = "block";
	private static final String HANDLER_PROPERTY = "handler";
	private static final String FINALIZER_PROPERTY = "finalizer";
	
	private CodeFactory codeFactory;

	public TryBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Try tryStatement = codeFactory.createTry();
		
		processTryCodeBlock(jsonObject, jsonAnalyzer, warningRepository, tryStatement);
		processHandler(jsonObject, jsonAnalyzer, warningRepository, tryStatement);
		processFinalizer(jsonObject, jsonAnalyzer, tryStatement);
		
		new LocationBuilder().createLocation(jsonObject, tryStatement);
		
		return ListUtils.toList(tryStatement);
	}

	private void processFinalizer(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, Try tryStatement)
	{
		Finally finallyStatement = codeFactory.createFinally();
		tryStatement.setFinally(finallyStatement);
		CodeBlock codeBlock = codeFactory.createCodeBlock();
		finallyStatement.setCodeBlock(codeBlock);
		
		JSONObject finalizerJSONObject = jsonObject.optJSONObject(FINALIZER_PROPERTY);
		if (finalizerJSONObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(finalizerJSONObject, false);
			codeBlock.getStatements().addAll(statements);
		}
	}

	private void processTryCodeBlock(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Try tryStatement)
	{
		CodeBlock codeBlock = codeFactory.createCodeBlock();
		tryStatement.setCodeBlock(codeBlock);
		
		JSONObject blockJSONObject = jsonObject.optJSONObject(BLOCK_PROPERTY);
		if (blockJSONObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(blockJSONObject, false);
			codeBlock.getStatements().addAll(statements);
		} else
			warningRepository.createJSONObjectNotFoundWarning(BLOCK_PROPERTY, jsonObject, this.getClass());
	}

	private void processHandler(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Try tryStatement)
	{
		JSONObject handlerJSONObject = jsonObject.optJSONObject(HANDLER_PROPERTY);
		if (handlerJSONObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(handlerJSONObject, false);
			if (statements.size() > 0)
			{
				Statement statement = statements.get(0);
				if (statement instanceof Catch)
					tryStatement.getCatchs().add((Catch) statement);
			}
		} else
			warningRepository.createJSONObjectNotFoundWarning(HANDLER_PROPERTY, jsonObject, this.getClass());
	}

}
