package es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class LogicalExpressionBuilder extends StatementBuilder
{
	private static final String OPERATOR_PROPERTY = "operator";
	private static final String LEFT_PROPERTY = "left";
	private static final String RIGHT_PROPERTY = "right";

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{

		String operator = jsonObject.optString(OPERATOR_PROPERTY);
		if (operator != null)
		{
			if (isConditional(operator)) {
				String left = jsonObject.optString(LEFT_PROPERTY);
				String right = jsonObject.optString(RIGHT_PROPERTY);
				
				if (left != null && right != null)
					return new ConditionalBinaryExpressionBuilder().build(jsonObject, jsonAnalyzer,
						codeModelRepository, warningRepository);
			} 
		} else
			warningRepository.createPropertyNotFoundWarning(OPERATOR_PROPERTY, jsonObject, this.getClass());

		return ListUtils.toList();
	}

	private boolean isConditional(String operator)
	{
		switch (operator)
		{
			case "&&":return true;
			case "||": return true;
		}
		
		return false;
	}


}
