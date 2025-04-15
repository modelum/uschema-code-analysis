package es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects;

import java.util.List;
import java.util.Optional;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.Argument;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.CodeBlockType;
import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.CodeContainerType;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.NewClass;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.VariableAccess;

public class NewExpressionBuilder extends StatementBuilder
{

	private static final String CALLEE_PROPERTY = "callee";
	private static final String ARGUMENTS_PROPERTY = "arguments";
	private static final String NAME_PROPERTY = "name";

	private CodeFactory codeFactory;

	public NewExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		NewClass newClass = codeFactory.createNewClass();

		processCallee(jsonObject, jsonAnalyzer, newClass, codeModelRepository, warningRepository);
		processArguments(jsonObject, newClass, jsonAnalyzer, warningRepository);

		new LocationBuilder().createLocation(jsonObject, newClass);
		
		return ListUtils.toList(newClass);
	}

	private void processCallee(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, NewClass newClass, CodeModelRepository codeModelRepository,
			WarningRepository warningRepository)
	{
		JSONObject calleObject = jsonObject.optJSONObject(CALLEE_PROPERTY);
		if (calleObject != null)
		{
			String identifierName = getIdentifierName(calleObject, warningRepository);
			CodeContainer codeContainer = codeModelRepository.getType().getClassDataContainer(identifierName);
			
			if (codeContainer == null)
				codeContainer = createNewExternalClassCodeContainer(codeModelRepository);
			
			newClass.setCodeContainer(codeContainer);
			
			Optional<CallableBlock> constructor = codeContainer.getCodeBlock()
					.stream().filter(CallableBlock.class::isInstance).map(CallableBlock.class::cast)
					.filter(cb -> cb.getCodeBlockType().equals(CodeBlockType.CONSTRUCTOR)).findFirst();
			if (constructor.isPresent())
			{
				newClass.setCallableBlock(constructor.get());
			}
		} else
			warningRepository.createJSONObjectNotFoundWarning(CALLEE_PROPERTY, jsonObject, this.getClass());
	}

	private CodeContainer createNewExternalClassCodeContainer(CodeModelRepository codeModelRepository)
	{
		CodeContainer codeContainer;
		codeContainer = codeModelRepository.getCodeBuilder().createCodeContainer(CodeContainerType.CLASS);
		codeContainer.setDataContainer(codeFactory.createDataContainer());
		codeModelRepository.saveClassCodeContainer(codeContainer);
		codeModelRepository.getType().saveCodeContainerType(codeContainer);
		return codeContainer;
	}

	private String getIdentifierName(JSONObject jsonObject, WarningRepository warningRepository)
	{
		String name = jsonObject.optString(NAME_PROPERTY);
		if (name != null)
			return name;

		warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, jsonObject, this.getClass());
		return null;
	}

	private void processArguments(JSONObject jsonObject, NewClass newClass, JSONAnalyzer jsonAnalyzer,
			WarningRepository warningRepository)
	{
		JSONArray argumentsArray = jsonObject.optJSONArray(ARGUMENTS_PROPERTY);

		if (argumentsArray != null)
		{
			for (int i = 0; i < argumentsArray.length(); i++)
			{
				JSONObject argument = argumentsArray.optJSONObject(i);
				setParameter(newClass, argument, i, jsonAnalyzer, warningRepository);
			}
		} else
			warningRepository.createJSONArrayNotFoundWarning(ARGUMENTS_PROPERTY, jsonObject, this.getClass());
	}

	private void setParameter(NewClass newClass, JSONObject argument, int i, JSONAnalyzer jsonAnalyzer,
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

			newClass.getArguments().add(argumentModel);
		} else
			warningRepository.createPropertyNotFoundInJSONArrayWarning(i, argument, this.getClass());
	}

}
