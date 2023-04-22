package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.codeGraph.Edge;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.codeGraph.NodeType;

public abstract class ForwardTracker
{
	public Node trackForwards(Node node, Variable variable) {
		for(Edge edge : node.getOutgoingEdges())
		{
			Node targetNode = edge.getTarget();

			if (!edge.getType().equals(EdgeType.ARGUMENT) && !edge.getType().equals(EdgeType.PARAMETER))
			{
				if (targetNode.getVariables().contains(variable))
				{
					Node newNode = processNodeWithExpectedVariable(targetNode, variable);
					if (newNode != null && newNode.getNodeType().equals(NodeType.END_NODE)) 
						return newNode;
				}
			}
			
			for (Variable nodeVariable : targetNode.getVariables())
			{
				if (!edge.getType().equals(EdgeType.ARGUMENT) && !edge.getType().equals(EdgeType.PARAMETER))
				{
					if (variable.getName().equals(nodeVariable.getName()))
					{
						Node newNode = processNodeWithExpectedVariable(targetNode, variable);
						if (newNode != null && newNode.getNodeType().equals(NodeType.END_NODE)) 
							return newNode;
					}
				}
			}
		}
		
		for(Edge edge : node.getOutgoingEdges())
		{
			if (!edge.getType().equals(EdgeType.ARGUMENT) && !edge.getType().equals(EdgeType.PARAMETER))
			{
				Node targetNode = edge.getTarget();
				Node newNode = trackForwards(targetNode, variable);
				if (newNode != null && newNode.getNodeType().equals(NodeType.END_NODE)) 
					return newNode;
			}
		}
		
		return null;
	}

	public abstract Node processNodeWithExpectedVariable(Node node, Variable variable);
	
}
