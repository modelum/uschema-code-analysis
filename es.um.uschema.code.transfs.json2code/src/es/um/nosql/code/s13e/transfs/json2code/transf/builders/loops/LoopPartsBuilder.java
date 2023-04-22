package es.um.nosql.code.s13e.transfs.json2code.transf.builders.loops;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.Loop;
import es.um.nosql.code.s13e.metamodels.code.LoopPart;
import es.um.nosql.code.s13e.metamodels.code.LoopPartType;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class LoopPartsBuilder
{

	public static final String TEST_PROPERTY = "test";
	public static final String UPDATE_PROPERTY = "update";
	public static final String BODY_PROPERTY = "body";
	public static final String INIT_PROPERTY = "init";

	public CodeFactory codeFactory;

	public LoopPartsBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	public void createCodeBlock(CodeModelRepository codeModelRepository, Loop forLoop)
	{
		CodeBlock codeBlock = codeFactory.createCodeBlock();
		codeBlock.setCodeBlockType(CodeBlockType.LOOP_BLOCK);
		forLoop.setCodeBlock(codeBlock);
		
		codeModelRepository.saveTemporallyCodeBlock(codeBlock);
	}

	public void processBody(JSONObject jsonObject, WarningRepository warningRepository, JSONAnalyzer jsonAnalyzer,
			Loop forLoop)
	{
		JSONObject bodyObject = jsonObject.optJSONObject(BODY_PROPERTY);
		if (bodyObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(bodyObject, false);
			if (statements != null)
				forLoop.getCodeBlock().getStatements().addAll(statements);
			else
				warningRepository.createStatementNotProcessed(bodyObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(BODY_PROPERTY, jsonObject, this.getClass());
	}

	public void processUpdate(JSONObject jsonObject, WarningRepository warningRepository, JSONAnalyzer jsonAnalyzer,
			Loop forLoop)
	{
		JSONObject updateObject = jsonObject.optJSONObject(UPDATE_PROPERTY);
		if (updateObject != null)
		{
			List<Statement> statement = jsonAnalyzer.analyzeStatement(updateObject, false);

			LoopPart updateLoopPart = codeFactory.createLoopPart();
			updateLoopPart.setType(LoopPartType.UPDATER);
			if (statement != null)
				updateLoopPart.getStatement().addAll(statement);
			else
				warningRepository.createStatementNotProcessed(updateObject, this.getClass());

			forLoop.getLoopPart().add(updateLoopPart);
		} else
			warningRepository.createJSONObjectNotFoundWarning(UPDATE_PROPERTY, jsonObject, this.getClass());
	}

	public void processTest(JSONObject jsonObject, WarningRepository warningRepository, JSONAnalyzer jsonAnalyzer,
			Loop forLoop)
	{
		JSONObject testObject = jsonObject.optJSONObject(TEST_PROPERTY);
		if (testObject != null)
		{
			List<Statement> statement = jsonAnalyzer.analyzeStatement(testObject, false);

			LoopPart testLoopPart = codeFactory.createLoopPart();
			testLoopPart.setType(LoopPartType.CONDITION);
			if (statement != null)
				testLoopPart.getStatement().addAll(statement);
			else
				warningRepository.createStatementNotProcessed(testObject, this.getClass());

			forLoop.getLoopPart().add(testLoopPart);
		} else
			warningRepository.createJSONObjectNotFoundWarning(TEST_PROPERTY, jsonObject, this.getClass());
	}

	public void processInitialization(JSONObject jsonObject, WarningRepository warningRepository,
			JSONAnalyzer jsonAnalyzer, Loop forLoop)
	{
		JSONObject initObject = jsonObject.optJSONObject(INIT_PROPERTY);
		if (initObject != null)
		{
			List<Statement> statement = jsonAnalyzer.analyzeStatement(initObject, false);

			LoopPart initLoopPart = codeFactory.createLoopPart();
			initLoopPart.setType(LoopPartType.INITIALIZATION);
			if (statement != null)
				initLoopPart.getStatement().addAll(statement);
			else
				warningRepository.createStatementNotProcessed(initObject, this.getClass());

			forLoop.getLoopPart().add(initLoopPart);
		} else
			warningRepository.createJSONObjectNotFoundWarning(INIT_PROPERTY, jsonObject, this.getClass());
	}

}
