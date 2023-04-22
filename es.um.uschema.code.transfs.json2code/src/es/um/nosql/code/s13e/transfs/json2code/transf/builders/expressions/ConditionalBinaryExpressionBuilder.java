package es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.ConditionalExpression;
import es.um.nosql.code.s13e.metamodels.code.Expression;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class ConditionalBinaryExpressionBuilder extends StatementBuilder
{
	private static final String OPERATOR_PROPERTY = "operator";
	private static final String LEFT_PROPERTY = "left";
	private static final String RIGHT_PROPERTY = "right";

	private CodeFactory codeFactory;

	public ConditionalBinaryExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Expression expression = codeFactory.createExpression();

		processOperator(jsonObject, warningRepository, expression);
		processSide(jsonObject, warningRepository, jsonAnalyzer, expression, LEFT_PROPERTY);
		processSide(jsonObject, warningRepository, jsonAnalyzer, expression, RIGHT_PROPERTY);

		new LocationBuilder().createLocation(jsonObject, expression);

		return ListUtils.toList(expression);
	}

	private void processOperator(JSONObject jsonObject, WarningRepository warningRepository, Expression expression)
	{
		String operator = jsonObject.optString(OPERATOR_PROPERTY);
		if (operator != null)
			expression.setType(operator);
		else
			warningRepository.createPropertyNotFoundWarning(operator, jsonObject, this.getClass());
	}

	private void processSide(JSONObject jsonObject, WarningRepository warningRepository, JSONAnalyzer jsonAnalyzer,
			Expression expression, String side)
	{
		JSONObject sideObject = jsonObject.optJSONObject(side);
		if (sideObject != null)
		{
			EList<ConditionalExpression> expressions = expression.getConditionalExpression();
			List<Statement> statements = jsonAnalyzer.analyzeStatement(sideObject, false);
			ListUtils.addAllObjects(warningRepository, expressions, statements, ConditionalExpression.class, sideObject,
					this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(side, jsonObject, this.getClass());
	}

}
