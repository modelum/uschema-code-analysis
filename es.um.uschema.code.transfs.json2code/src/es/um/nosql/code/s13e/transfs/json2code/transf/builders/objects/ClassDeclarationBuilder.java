package es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.ContainersBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class ClassDeclarationBuilder extends StatementBuilder
{
	private static final String CONSTRUCTOR_PROPERTY = "constructor";
	private static final String ID_NAME_PROPERTY = "/id/name";
	private static final String BODY_PROPERTY = "body";

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		String className = (String) jsonObject.optQuery(ID_NAME_PROPERTY);
//		String superClassName = jsonObject.optString("superClass");

		ContainersBuilder containersBuilder = new ContainersBuilder(codeModelRepository);
		CodeContainer classContainer = containersBuilder.createAndSaveClassContainer(className);
		codeModelRepository.setLastClassContainer(classContainer);
		codeModelRepository.getType().saveClassType(classContainer);
		
		createMethods(jsonObject, jsonAnalyzer, codeModelRepository, warningRepository, classContainer, containersBuilder);
		
		return ListUtils.toList();
	}

	private void createMethods(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository,
			CodeContainer classContainer, ContainersBuilder containersBuilder)
	{
		JSONObject bodyJSONObject = jsonObject.optJSONObject(BODY_PROPERTY);
		if (bodyJSONObject != null)
		{
			JSONArray methodsJSONArray = bodyJSONObject.optJSONArray(BODY_PROPERTY);
			if (methodsJSONArray != null)
			{
				processBody(jsonAnalyzer, classContainer, methodsJSONArray);
			} else
				warningRepository.createJSONObjectNotFoundWarning(BODY_PROPERTY, jsonObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(BODY_PROPERTY, jsonObject, this.getClass());
	}

	private void processBody(JSONAnalyzer jsonAnalyzer, CodeContainer classContainer, JSONArray methodsJSONArray)
	{
		for (int i = 0; i < methodsJSONArray.length(); i++)
		{
			JSONObject methodJSONObject = methodsJSONArray.getJSONObject(i);

			String kind = methodJSONObject.optString("kind");
			
			List<Statement> statements = jsonAnalyzer.analyzeStatement(methodJSONObject, false);
			for (Statement statement : statements)
			{
				String methodName = (String) methodJSONObject.optQuery("/key/name");
				setCallableBlockType(classContainer, kind, statement, methodName);
			}
		}
	}

	private void setCallableBlockType(CodeContainer classContainer, String kind, Statement statement, String methodName)
	{
		if (statement instanceof CallableBlock)
		{
			CallableBlock callableBlock = (CallableBlock) statement;
			classContainer.getCodeBlock().add(callableBlock);
			if (kind != null && CONSTRUCTOR_PROPERTY.equals(kind))
			{
				callableBlock.setCodeBlockType(CodeBlockType.CONSTRUCTOR);
			} else
			{
				callableBlock.setCodeBlockType(CodeBlockType.METHOD);
			}
			callableBlock.setName(methodName);
		}
	}


}
