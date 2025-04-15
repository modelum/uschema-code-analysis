package es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.Parameter;
import es.um.uschema.code.metamodels.code.Statement;

public class FunctionPartsBuilder
{
	private static final String BODY_PROPERTY = "body";
	private static final String PARAMS_PROPERTY = "params";
	private static final String ID_PROPERTY = "id";
	private static final String NAME_PROPERTY = "name";
	
	private CodeFactory codeFactory;

	public FunctionPartsBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	public void processId(JSONObject jsonObject, WarningRepository warningRepository, CallableBlock callableBlock)
	{
		JSONObject idObject = jsonObject.optJSONObject(ID_PROPERTY);

		if (idObject != null)
			setNameProperty(idObject, callableBlock, warningRepository);
	}

	public void setNameProperty(JSONObject jsonObject, CallableBlock callableBlock, WarningRepository warningRepository)
	{
		String name = jsonObject.optString(NAME_PROPERTY);
		if (name != null)
		{
			callableBlock.setName(name);
			callableBlock.setFunctionName(name);
		} else
			warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, jsonObject, this.getClass());
	}
	
	public void processParameters(JSONObject jsonObject, WarningRepository warningRepository, CallableBlock callableBlock)
	{
		JSONArray paramsArray = jsonObject.optJSONArray(PARAMS_PROPERTY);

		if (paramsArray != null)
		{
			for (int i = 0; i < paramsArray.length(); i++)
			{
				JSONObject param = paramsArray.optJSONObject(i);
				setParameter(callableBlock, param, i, warningRepository);
			}
		} else
			warningRepository.createJSONArrayNotFoundWarning(PARAMS_PROPERTY, jsonObject, this.getClass());
	}

	public void setParameter(CallableBlock callableBlock, JSONObject param, int i, WarningRepository warningRepository)
	{
		if (param != null)
		{
			Parameter parameter = codeFactory.createParameter();
			callableBlock.getVariables().add(parameter);
			callableBlock.getParameters().add(parameter);

			String name = param.optString(NAME_PROPERTY);
			if (name != null)
				parameter.setName(name);
			else
				warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, param, this.getClass());
		} else
			warningRepository.createPropertyNotFoundInJSONArrayWarning(i, param, this.getClass());
	}
	
	public void processBody(CallableBlock callableBlock, JSONObject jsonObject, WarningRepository warningRepository, JSONAnalyzer jsonAnalyzer)
	{
		JSONObject bodyJSONObject = jsonObject.optJSONObject(BODY_PROPERTY);

		if (bodyJSONObject != null)
		{
			JSONArray bodyArray = bodyJSONObject.optJSONArray(BODY_PROPERTY);
			if (bodyArray != null)
			{
				for (int i = 0; i < bodyArray.length(); i++)
				{
					JSONObject optJSONObject = bodyArray.optJSONObject(i);
					processStatement(callableBlock, warningRepository, jsonAnalyzer, optJSONObject);
				}
			} else
				processStatement(callableBlock, warningRepository, jsonAnalyzer, bodyJSONObject);
		} else
			warningRepository.createJSONObjectNotFoundWarning(BODY_PROPERTY, jsonObject, this.getClass());
	}

	private void processStatement(CallableBlock callableBlock, WarningRepository warningRepository,
			JSONAnalyzer jsonAnalyzer, JSONObject optJSONObject)
	{
		List<Statement> statements = jsonAnalyzer.analyzeStatement(optJSONObject, false);
		if (statements != null)
			callableBlock.getStatements().addAll(statements);
		else
			warningRepository.createStatementNotProcessed(optJSONObject, this.getClass());
	}
	
}
