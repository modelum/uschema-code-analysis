package es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.Statement;

public class BinaryExpressionBuilder extends StatementBuilder
{
	private static final String OPERATOR_PROPERTY = "operator";

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{

		String operator = jsonObject.optString(OPERATOR_PROPERTY);
		if (operator != null)
		{
			if (isConditional(operator))
			{
				return new ConditionalBinaryExpressionBuilder().build(jsonObject, jsonAnalyzer,
						codeModelRepository, warningRepository);
			} else if (isOperation(operator))
				return new OperationBinaryExpressionBuilder().build(jsonObject, jsonAnalyzer,
						codeModelRepository, warningRepository);
		} else
			warningRepository.createPropertyNotFoundWarning(OPERATOR_PROPERTY, jsonObject, this.getClass());

		return ListUtils.toList();
	}

	private boolean isConditional(String operator)
	{
		switch (operator)
		{
			case "<=": return true;
			case "<":  return true;
			case "==": return true;
			case "===": return true;
			case "!=": return true;
			case "!==": return true;
			case ">=": return true;
			case ">":  return true;
			case "AND":return true;
			case "OR": return true;
		}
		
		return false;
	}

	private boolean isOperation(String operator)
	{
		switch (operator)
		{
		case "+": return true;
		case "-": return true;
		case "*": return true;
		case "/": return true;
		case "%": return true;
		case "&": return true;
		case "|": return true;
		}
		
		return false;
	}

}
