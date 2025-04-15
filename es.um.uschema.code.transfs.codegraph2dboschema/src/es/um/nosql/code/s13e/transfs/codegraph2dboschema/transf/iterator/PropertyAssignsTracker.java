package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import es.um.uschema.code.metamodels.codeGraph.Edge;
import es.um.uschema.code.metamodels.codeGraph.Node;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Literal;
import es.um.uschema.code.metamodels.code.Property;
import es.um.uschema.code.metamodels.code.PropertyAssign;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Variable;
import es.um.uschema.code.metamodels.code.VariableDeclaration;

public class PropertyAssignsTracker extends BackwardTracker
{
	private CodeGraphBackwardIterator codeGraphIterator;

	public PropertyAssignsTracker(CodeGraphBackwardIterator codeGraphIterator)
	{
		this.codeGraphIterator = codeGraphIterator;
	}

	public Node trackPropertyAssigns(Variable variable, Node node, DataStructure dataStructure)
	{
		Node lastNode = trackBackwards(node, variable);
		while (lastNode != null) 
		{
			Statement statement = lastNode.getStatement();
			if (statement instanceof PropertyAssign) {
				PropertyAssign propertyAssign = (PropertyAssign) statement;
				Property property = propertyAssign.getProperty();
				setPropertyTypeToUndefined(propertyAssign, property);
				codeGraphIterator.createField(lastNode, dataStructure, dataStructure.getContainer(), property);
			}
			
			lastNode = trackBackwards(lastNode, variable);
		}
		
		return lastNode;
	}

	@Override
	public Node trackBackwards(Node node, Variable variable) {
		for(Edge edge : node.getIncomingEdges())
		{
			Node sourceNode = edge.getSource();
			if (sourceNode.getVariables().contains(variable))
			{
				return processNodeWithExpectedVariable(sourceNode, variable);
			} 
		}
		
		for(Edge edge : node.getIncomingEdges())
		{
			Node sourceNode = edge.getSource();
			if (!sourceNode.getVariables().contains(variable))
			{
				return trackBackwards(sourceNode, variable);
			}
		}
		
		return null;
	}
	
	private void setPropertyTypeToUndefined(PropertyAssign propertyAssign, Property property)
	{
		for (DataProducer dataProducer : propertyAssign.getInputs())
		{
			if (dataProducer instanceof Literal) {
				Literal literal = (Literal) dataProducer;
				property.setType(literal.getType());
			}
		}
	}

	@Override
	public Node processNodeWithExpectedVariable(Node node, Variable variable)
	{
		Statement statement = node.getStatement();
		
		if (statement instanceof PropertyAssign) // Target
		{
			return node;
		} else if (statement instanceof VariableDeclaration) // End
		{
			return null;
		} else {
			return trackBackwards(node, variable);
		}
	}
	
}
