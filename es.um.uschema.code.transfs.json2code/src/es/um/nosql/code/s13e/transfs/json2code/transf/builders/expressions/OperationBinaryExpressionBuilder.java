package es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Operation;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class OperationBinaryExpressionBuilder extends StatementBuilder {
	
	private static final String RIGHT_PROPERTY = "right";
	private static final String LEFT_PROPERTY = "left";
	private static final String OPERATOR_PROPERTY = "operator";
	private CodeFactory codeFactory;

	public OperationBinaryExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Operation operation = codeFactory.createOperation();

		String operator = jsonObject.optString(OPERATOR_PROPERTY);
		if (operator != null)
			operation.setType(operator);
		else
			warningRepository.createPropertyNotFoundWarning(operator, jsonObject, this.getClass());

		processSide(jsonObject, warningRepository, jsonAnalyzer, operation, LEFT_PROPERTY);
		processSide(jsonObject, warningRepository, jsonAnalyzer, operation, RIGHT_PROPERTY);

		new LocationBuilder().createLocation(jsonObject, operation);

		return ListUtils.toList(operation);
	}

	private void processSide(JSONObject jsonObject, WarningRepository warningRepository, JSONAnalyzer jsonAnalyzer,
			Operation operation, String side)
	{
		JSONObject sideObject = jsonObject.optJSONObject(side);
		if (sideObject != null)
		{

			List<Statement> statements = jsonAnalyzer.analyzeStatement(sideObject, false);
			if (statements.size() > 0 && statements.stream().allMatch(DataProducer.class::isInstance))
			{
				EList<DataProducer> dataProducers = operation.getDataProducers();
				ListUtils.addAllObjects(warningRepository, dataProducers, statements, DataProducer.class, sideObject, this.getClass());
			} else
				warningRepository.createStatementNotProcessed(sideObject, this.getClass());
		} else
		{
			warningRepository.createJSONObjectNotFoundWarning(side, jsonObject, this.getClass());
		}
	}

}