package es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.UnaryOperation;
import es.um.uschema.code.metamodels.code.UnaryOperationType;

public class UpdateExpressionBuilder extends StatementBuilder
{
	private static final String PLUSPLUS = "++";
	private static final String MINUSMINUS = "--";
	private static final String PREFIX_PROPERTY = "prefix";
	private static final String NAME_PROPERTY = "name";
	private static final String OPERATOR_PROPERTY = "operator";
	private static final String ARGUMENT_PROPERTY = "argument";

	private CodeFactory codeFactory;

	public UpdateExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		UnaryOperation unaryOperation = codeFactory.createUnaryOperation();

		setOperator(jsonObject, warningRepository, unaryOperation);
		setVariable(jsonObject, warningRepository, codeModelRepository, unaryOperation);

		new LocationBuilder().createLocation(jsonObject, unaryOperation);

		return ListUtils.toList(unaryOperation);
	}

	private void setVariable(JSONObject jsonObject, WarningRepository warningRepository,
			CodeModelRepository codeModelRepository, UnaryOperation unaryOperation)
	{
		JSONObject argumentObject = jsonObject.optJSONObject(ARGUMENT_PROPERTY);
		if (argumentObject != null)
		{

			String name = argumentObject.optString(NAME_PROPERTY);
			if (name != null)
				unaryOperation.setVariable(codeModelRepository.getVariablesRepository().getVariable(name));
			else
				warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, argumentObject, this.getClass());
		} else
			warningRepository.createPropertyNotFoundWarning(ARGUMENT_PROPERTY, jsonObject, this.getClass());
	}

	private void setOperator(JSONObject jsonObject, WarningRepository warningRepository, UnaryOperation unaryOperation)
	{

		String operator = jsonObject.optString(OPERATOR_PROPERTY);
		if (operator != null)
		{
			boolean prefix = jsonObject.optBoolean(PREFIX_PROPERTY);
			setExpressionType(prefix, unaryOperation, operator);
		}
		else
			warningRepository.createPropertyNotFoundWarning(OPERATOR_PROPERTY, jsonObject, this.getClass());
	}

	private void setExpressionType(boolean prefix, UnaryOperation unaryOperation, String operator)
	{
		if (prefix)
		{
			if (PLUSPLUS.equals(operator))
				unaryOperation.setType(UnaryOperationType.PRE_PLUSPLUS);
			else if (MINUSMINUS.equals(operator))
				unaryOperation.setType(UnaryOperationType.PRE_MINUSMINUS);
		} else
		{
			if (operator.equals(PLUSPLUS))
				unaryOperation.setType(UnaryOperationType.POST_PLUSPLUS);
			else if (operator.equals(MINUSMINUS))
				unaryOperation.setType(UnaryOperationType.POST_MINUSMINUS);
		}
	}

}
