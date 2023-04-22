package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.codeGraph.Edge;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;

public abstract class BackwardTracker
{
	public Node trackBackwards(Node node, Variable variable) {
		for(Edge edge : node.getIncomingEdges())
		{
			Node sourceNode = edge.getSource();
			if (sourceNode.getVariables().contains(variable))
			{
				return processNodeWithExpectedVariable(sourceNode, variable);
			} 
			for (Variable nodeVariable : sourceNode.getVariables())
			{
				if (variable.getName().equals(nodeVariable.getName())) {
					return processNodeWithExpectedVariable(sourceNode, variable);
				}
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

	public abstract Node processNodeWithExpectedVariable(Node node, Variable variable);
	
}
