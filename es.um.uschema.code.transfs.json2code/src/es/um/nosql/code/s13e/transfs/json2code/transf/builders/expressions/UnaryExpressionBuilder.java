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
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.UnaryExpression;

public class UnaryExpressionBuilder extends StatementBuilder
{
	private static final String ARGUMENT_PROPERTY = "argument";
	private CodeFactory codeFactory;

	public UnaryExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		UnaryExpression unaryExpression = codeFactory.createUnaryExpression();
		setArgumentDataProducer(jsonObject, jsonAnalyzer, warningRepository, unaryExpression);
		setPrefix(jsonObject, unaryExpression);
		setOperator(jsonObject, unaryExpression);
		
		new LocationBuilder().createLocation(jsonObject, unaryExpression);

		return ListUtils.toList(unaryExpression);
	}

	private void setOperator(JSONObject jsonObject, UnaryExpression unaryExpression)
	{
		String operator = jsonObject.optString("operator");
		if (operator != null)
		{
			unaryExpression.setOperator(operator);
		}
	}

	private void setPrefix(JSONObject jsonObject, UnaryExpression unaryExpression)
	{
		Boolean prefix = jsonObject.optBoolean("prefix");
		if (prefix != null)
		{
			unaryExpression.setType(prefix ? "pre" : "post");
		}
	}

	private void setArgumentDataProducer(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			WarningRepository warningRepository, UnaryExpression unaryExpression)
	{
		JSONObject argumentObject = jsonObject.optJSONObject(ARGUMENT_PROPERTY);
		if (argumentObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(argumentObject, false);
			for (Statement statement : statements)
			{
				if (statement instanceof DataProducer)
				{
					unaryExpression.setDataProducer((DataProducer) statement);
				}
			}
		} else
			warningRepository.createPropertyNotFoundWarning(ARGUMENT_PROPERTY, jsonObject, this.getClass());
	}

}
