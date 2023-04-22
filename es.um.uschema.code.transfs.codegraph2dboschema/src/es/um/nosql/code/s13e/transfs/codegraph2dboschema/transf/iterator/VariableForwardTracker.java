package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.ConditionalExpression;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Expression;
import es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.NewDataContainer;
import es.um.nosql.code.s13e.metamodels.code.Operation;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.metamodels.codeGraph.Edge;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaFactory;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Type;

public class VariableForwardTracker extends ForwardTracker
{
	private Type type;
	private List<DataProducer> dataProducerList;
	
	public VariableForwardTracker()
	{
		this.dataProducerList = new LinkedList<DataProducer>();
	}
	
	public Type trackVariableBackwardsForType(Node node, Variable variable)
	{
		type = null;
		trackForwards(node, variable);
		
		return type;
	}

	@Override
	public Node processNodeWithExpectedVariable(Node node, Variable variable)
	{
		Statement statement = node.getStatement();
		node = processStatement(node, variable, statement);
		
		return node;
	}

	private Node processStatement(Node node, Variable variable, Statement statement) {
		if (statement instanceof Call)
		{
			Call call = (Call) statement;
			call.getArguments().forEach(argument -> {
				DataProducer dp = argument.getDataProducer();
				processDataProducer(node, variable, dp);
			});
		} else if (statement instanceof PropertyAccess && ((PropertyAccess) statement).getName().equals("forEach")) {
			return processPropertyAccess(node, variable);
		} else if (statement instanceof Expression) {
			Expression expression = (Expression) statement;
			EList<ConditionalExpression> conditionalExpressions = expression.getConditionalExpression();
			
			for (ConditionalExpression conditionalExpression : conditionalExpressions) {
				if (conditionalExpression instanceof PropertyAccess) {
					dataProducerList.add((PropertyAccess) conditionalExpression);
				} else if (conditionalExpression instanceof Literal) {
					Literal literal = (Literal) conditionalExpression;
					Attribute attribute = DatabaseOperationsSchemaFactory.eINSTANCE.createAttribute();
					attribute.setName(literal.getType().getType());
					type = attribute;
				}
			}
			
			return processPropertyAccess(node, variable);
		} else {
			return trackForwards(node, variable);
		}
		
		return node;
	}

	private Node processPropertyAccess(Node node, Variable variable)
	{
		List<Edge> outgoingEdges = node.getOutgoingEdges();
		if (outgoingEdges.size() > 0) {
			Node targetNode = outgoingEdges.get(0).getTarget();
			
			for (Variable insideVariable : targetNode.getVariables())
				return trackForwards(targetNode, insideVariable);
		} else {
			return trackForwards(node, variable);
		}
		
		return node;
	}

	private void processDataProducer(Node node, Variable variable, DataProducer dp)
	{
		if (dp instanceof NewDataContainer) {
			NewDataContainer newDataContainer = (NewDataContainer) dp;
			DataContainer dataContainer = newDataContainer.getDataContainer();
			dataContainer.getProperties().forEach(p -> processDataProducer(node, variable, p));
		} else if (dp instanceof Operation) {
			Operation operation = (Operation) dp;
			operation.getDataProducers().forEach(p -> processDataProducer(node, variable, p));
		} else if (dp instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) dp;
			DataProducer insideDataProducer = propertyAccess.getDataProducer();
			processPropertyAccess(variable, propertyAccess, insideDataProducer);
		} else if (!(dp instanceof Literal)){
			dataProducerList.add(dp);
		}
	}

	private void processPropertyAccess(Variable variable, PropertyAccess propertyAccess,
			DataProducer insideDataProducer)
	{
		if (insideDataProducer instanceof VariableAccess) {
			VariableAccess variableAccess = (VariableAccess) insideDataProducer;
			Variable propertyAccessVariable = variableAccess.getVariable();
			
			if (propertyAccessVariable.equals(variable) ||
				propertyAccessVariable.getName().equals(variable.getName()))  {
				dataProducerList.add(propertyAccess);
			}
		} else if (insideDataProducer instanceof PropertyAccess) {
			PropertyAccess insidePropertyAccess = (PropertyAccess) insideDataProducer;
			DataProducer insideInsideDataProducer = insidePropertyAccess.getDataProducer();
			if (insideInsideDataProducer instanceof VariableAccess) {
				VariableAccess variableAccess = (VariableAccess) insideInsideDataProducer;
				Variable propertyAccessVariable = variableAccess.getVariable();
				
				if (propertyAccessVariable.equals(variable) ||
					propertyAccessVariable.getName().equals(variable.getName()))  {
					dataProducerList.add(propertyAccess);
				}
			}
		} else if (insideDataProducer instanceof IndexBasedAccess) {
			IndexBasedAccess indexBasedAccess = (IndexBasedAccess) insideDataProducer;
			DataProducer insideInsideDataProducer = indexBasedAccess.getDataProducer();
			if (insideInsideDataProducer instanceof VariableAccess) {
				VariableAccess variableAccess = (VariableAccess) insideInsideDataProducer;
				Variable propertyAccessVariable = variableAccess.getVariable();
				
				if (propertyAccessVariable.equals(variable) ||
					propertyAccessVariable.getName().equals(variable.getName()))  {
					dataProducerList.add(propertyAccess);
				}
			} else if (insideInsideDataProducer instanceof PropertyAccess) {
				processPropertyAccess(variable, (PropertyAccess) insideInsideDataProducer, insideInsideDataProducer);
			}
		}
	}
	
	public List<DataProducer> getDataProducerList()
	{
		return dataProducerList.stream().distinct().collect(Collectors.toList());
	}
	
	public void clearDataProducerList()
	{
		dataProducerList.clear();
	}
	
}
