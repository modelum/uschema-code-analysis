package es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.Operation;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class ExpressionBuilder extends StatementBuilder
{

	private static final String EXPRESSION_PROPERTY = "expression";
	private CodeFactory codeFactory;

	public ExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Operation operation = codeFactory.createOperation();

		JSONObject expression = jsonObject.optJSONObject(EXPRESSION_PROPERTY);
		if (expression != null)
			return jsonAnalyzer.analyzeStatement(expression, false);
		else
			warningRepository.createJSONObjectNotFoundWarning(EXPRESSION_PROPERTY, jsonObject, this.getClass());
		
		new LocationBuilder().createLocation(jsonObject, operation);

		return ListUtils.toList(operation);
	}

}
