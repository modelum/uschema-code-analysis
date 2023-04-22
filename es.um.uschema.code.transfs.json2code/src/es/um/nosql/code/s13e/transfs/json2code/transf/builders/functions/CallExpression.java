package es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class CallExpression extends StatementBuilder
{
	private static final String OBJECT = "object";
	private static final String PROPERTY = "property";
	private static final String MEMBER_EXPRESSION = "MemberExpression";
	private static final String IDENTIFIER = "Identifier";
	private static final String TYPE_PROPERTY = "type";
	private static final String CALLEE_PROPERTY = "callee";
	private static final String ARGUMENTS_PROPERTY = "arguments";
	private static final String NAME_PROPERTY = "name";

	private CodeFactory codeFactory;

	public CallExpression()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Call call = codeFactory.createCall();

		processCallee(jsonObject, jsonAnalyzer, call, codeModelRepository, warningRepository);
		processArguments(jsonObject, call, jsonAnalyzer, warningRepository);

		new LocationBuilder().createLocation(jsonObject, call);

		return ListUtils.toList(call);
	}

	private void processCallee(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, Call call, CodeModelRepository codeModelRepository,
			WarningRepository warningRepository)
	{
		JSONObject calleObject = jsonObject.optJSONObject(CALLEE_PROPERTY);
		if (calleObject != null)
		{
			List<Statement> analyzeStatement = jsonAnalyzer.analyzeStatement(calleObject, false);
			for (Statement statement : analyzeStatement)
			{
				if (statement instanceof DataProducer)
					call.setDataProducer((DataProducer) statement);
			}
			
			String typeObject = calleObject.optString(TYPE_PROPERTY);
			if (typeObject != null)
			{
				if (IDENTIFIER.equals(typeObject))
					processFunctionCall(calleObject, call, codeModelRepository, warningRepository);
				else if (MEMBER_EXPRESSION.equals(typeObject))
					processObjectPropertyFunctionCall(call, calleObject, codeModelRepository,warningRepository);
			} else
				warningRepository.createPropertyNotFoundWarning(TYPE_PROPERTY, calleObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(CALLEE_PROPERTY, jsonObject, this.getClass());
	}

	private void processFunctionCall(JSONObject calleObject, Call call, CodeModelRepository codeModelRepository,
			WarningRepository warningRepository)
	{
		String identifierName = getIdentifierName(calleObject, warningRepository);
		call.setName(identifierName);
		if (identifierName != null)
			codeModelRepository.getCallHierarchy().setUnprocessedCall(identifierName, call);
		else
			warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, calleObject, this.getClass());
	}

	private void processObjectPropertyFunctionCall(Call call, JSONObject calleObject,  CodeModelRepository codeModelRepository,
			WarningRepository warningRepository)
	{
		JSONObject objectObject = calleObject.optJSONObject(OBJECT);
		if (objectObject != null)
		{
			String identifierName = getIdentifierName(objectObject, warningRepository);
			
			JSONObject propertyObject = calleObject.optJSONObject(PROPERTY);
			if (propertyObject != null)
			{
				String propertyName = getIdentifierName(propertyObject, warningRepository);
				call.setName(propertyName);
				String callableBlockName = identifierName + '.' + propertyName;
				codeModelRepository.getCallHierarchy().setUnprocessedCall(callableBlockName, call);
			} else
				warningRepository.createPropertyNotFoundWarning(PROPERTY, calleObject, this.getClass());
		} else
			warningRepository.createPropertyNotFoundWarning(OBJECT, calleObject, this.getClass());
	}

	private String getIdentifierName(JSONObject jsonObject, WarningRepository warningRepository)
	{
		String name = jsonObject.optString(NAME_PROPERTY);
		if (name != null)
			return name;

		warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, jsonObject, this.getClass());
		return null;
	}

	private void processArguments(JSONObject jsonObject, Call call, JSONAnalyzer jsonAnalyzer,
			WarningRepository warningRepository)
	{
		JSONArray argumentsArray = jsonObject.optJSONArray(ARGUMENTS_PROPERTY);

		if (argumentsArray != null)
		{
			for (int i = 0; i < argumentsArray.length(); i++)
			{
				JSONObject argument = argumentsArray.optJSONObject(i);
				setParameter(call, argument, i, jsonAnalyzer, warningRepository);
			}
		} else
			warningRepository.createJSONArrayNotFoundWarning(ARGUMENTS_PROPERTY, jsonObject, this.getClass());
	}

	private void setParameter(Call call, JSONObject argument, int i, JSONAnalyzer jsonAnalyzer,
			WarningRepository warningRepository)
	{
		if (argument != null)
		{
			Argument argumentModel = codeFactory.createArgument();
			List<Statement> statements = jsonAnalyzer.analyzeStatement(argument, false);
			statements.stream()
				.filter(DataProducer.class::isInstance).map(DataProducer.class::cast)
				.forEach(dp -> {
					argumentModel.setDataProducer(dp);
					if (dp instanceof VariableAccess)
						argumentModel.setName(((VariableAccess) dp).getName());
				});

			call.getArguments().add(argumentModel);
		} else
			warningRepository.createPropertyNotFoundInJSONArrayWarning(i, argument, this.getClass());
	}

}
