package es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Assign;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.PropertyAssign;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.This;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class AssignmentExpressionBuilder extends StatementBuilder
{

	private static final String DEFAULT_ASSIGN = "=";
	private static final String OPERATOR_PROPERTY = "operator";
	private static final String RIGHT_PROPERTY = "right";
	private static final String LEFT_PROPERTY = "left";

	private CodeFactory codeFactory;
	private Assign assign;

	public AssignmentExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		assign = codeFactory.createAssign();
		
		setType(jsonObject, warningRepository);		
		processAssingSide(jsonObject, warningRepository, jsonAnalyzer);
		processSide(jsonObject, warningRepository, jsonAnalyzer, RIGHT_PROPERTY);

		assign.setName(assign.getName() + assign.getType());

		new LocationBuilder().createLocation(jsonObject, assign);
		
		return ListUtils.toList(assign);
	}

	private void setType(JSONObject jsonObject, WarningRepository warningRepository)
	{
		String operator = jsonObject.optString(OPERATOR_PROPERTY);
		if (operator != null && !operator.isEmpty())
		{
			assign.setType(operator);
		} else
		{
			assign.setType(DEFAULT_ASSIGN);
			warningRepository.createJSONObjectNotFoundWarning(LEFT_PROPERTY, jsonObject, this.getClass());
		}
	}

	private void processAssingSide(JSONObject jsonObject, WarningRepository warningRepository,
			JSONAnalyzer jsonAnalyzer)
	{
		JSONObject sideObject = jsonObject.optJSONObject(LEFT_PROPERTY);
		if (sideObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(sideObject, false);
			if (statements.size() > 0 && statements.stream().allMatch(DataProducer.class::isInstance))
			{
				Statement statement = statements.get(0);
				if (statement instanceof PropertyAccess)
				{
					processPropertyAccess(sideObject, (PropertyAccess) statement);
				} else if (statement instanceof VariableAccess)
				{
					assignVariable(assign, ((VariableAccess) statement).getVariable());
				}
			} else
				warningRepository.createStatementNotProcessed(sideObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(LEFT_PROPERTY, jsonObject, this.getClass());
	}

	private void processPropertyAccess(JSONObject sideObject, PropertyAccess propertyAccess)
	{
		Assign assignCopy = assign;
		EObject eContainer = propertyAccess.getProperty().eContainer();
		if (eContainer instanceof DataContainer)
		{
			DataContainer dataContainer = (DataContainer) eContainer;
			dataContainer.setName((String) sideObject.query("/object/name"));
		}
		
		PropertyAssign propertyAssign = codeFactory.createPropertyAssign();
		propertyAssign.setType(assignCopy.getType());
		propertyAssign.setProperty(propertyAccess.getProperty());
		
		if (propertyAccess.getDataProducer() instanceof VariableAccess)
			assignVariable(propertyAssign, ((VariableAccess) propertyAccess.getDataProducer()).getVariable());
		else if (propertyAccess.getDataProducer() instanceof This)
			assignVariable(propertyAssign, (This) propertyAccess.getDataProducer());
		
		assign = propertyAssign;
	}

	private void assignVariable(Assign assignStatement, Variable variable)
	{
		assignStatement.setVariable(variable);
		assignStatement.setName(variable.getName());
	}

	private void processSide(JSONObject jsonObject, WarningRepository warningRepository,
			JSONAnalyzer jsonAnalyzer, String side)
	{
		JSONObject sideObject = jsonObject.optJSONObject(side);
		if (sideObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(sideObject, false);
			if (statements.size() > 0
					&& statements.stream().allMatch(DataProducer.class::isInstance))
			{
				EList<DataProducer> dataProducers = assign.getInputs();
				ListUtils.addAllObjects(warningRepository, dataProducers, statements,
						DataProducer.class, sideObject, this.getClass());
			} else
				warningRepository.createStatementNotProcessed(sideObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(side, jsonObject, this.getClass());
	}

}
