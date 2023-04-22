package es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders.CodeGraphBuilder;

public class CallHierarchy {

	private Map<String, Node> startNodes;
	private Map<String, List<Node>> unprocessedCalls;
	private HashMap<String, Node> endNodes;
	private CodeGraphBuilder codeGraphBuilder;

	public CallHierarchy(CodeGraphModelRepository codeGraphModelRepository)
	{
		this.startNodes = new HashMap<String, Node>();
		this.endNodes = new HashMap<String, Node>();
		this.unprocessedCalls = new HashMap<String, List<Node>>();
		this.codeGraphBuilder = new CodeGraphBuilder(codeGraphModelRepository);
	}

	public Node getStartNode(String callableBlockName) 
	{
		return startNodes.get(callableBlockName);
	}

	public Node saveStartNode(String callableBlockName, Node node) 
	{
		Node startNode = startNodes.get(callableBlockName);
		if (startNode == null)
			startNodes.put(callableBlockName, node);

		return startNode;
	}

	public Node getEndNode(String callableBlockName) 
	{
		return endNodes.get(callableBlockName);
	}

	public Node saveEndNode(String callableBlockName, Node node) 
	{
		Node endNode = endNodes.get(callableBlockName);
		if (endNode == null)
			endNodes.put(callableBlockName, node);

		return endNode;
	}

	public void setUnprocessedCall(String callableBlockName, Node node) 
	{
		List<Node> calls = unprocessedCalls.get(callableBlockName);
		if (calls == null) 
		{
			calls = new LinkedList<Node>();
			unprocessedCalls.put(callableBlockName, calls);
		}

		calls.add(node);
	}

	public void solveUnprocessedCalls()
	{
		unprocessedCalls.keySet().forEach(callableName -> {
			Node startNode = startNodes.get(callableName);
			Node endNode = endNodes.get(callableName);

			if (startNode != null && endNode != null) // Local defined function
			{
				processLocalDefinedFunction(callableName, startNode, endNode);
			} else 
			{
				processExternalFunction(callableName);
			}
		});
	}

	private void processLocalDefinedFunction(String callableName, Node startNode, Node endNode)
	{
		List<Node> parameters = startNode.getOutgoingEdges().stream()
			.filter(e -> e.getType().equals(EdgeType.PARAMETER))
			.map(e -> e.getTarget())
			.collect(Collectors.toList());
		
		unprocessedCalls.get(callableName).forEach(callNode -> {
			codeGraphBuilder.createEdge(callNode, startNode, EdgeType.CALL);
			codeGraphBuilder.createEdge(endNode, callNode, EdgeType.RETURN);
			
			createArgumentParameterEdges(parameters, callNode);
		});
	}

	private void processExternalFunction(String callableName)
	{
		Node noDefinedFunction = codeGraphBuilder.createNode();
		unprocessedCalls.get(callableName).forEach(callNode -> {
			codeGraphBuilder.createEdge(callNode, noDefinedFunction, EdgeType.CALL);
			codeGraphBuilder.createEdge(noDefinedFunction, callNode, EdgeType.RETURN);
		});
	}

	private void createArgumentParameterEdges(List<Node> parameters, Node callNode)
	{
		List<Node> arguments = callNode.getOutgoingEdges().stream()
			.filter(e -> e.getType().equals(EdgeType.ARGUMENT))
			.map(e -> e.getTarget())
			.collect(Collectors.toList());
		
		for (int i = 0; i < parameters.size() && i < arguments.size(); i++)
		{
			Node parameter = parameters.get(i);
			Node argument = arguments.get(i);

			codeGraphBuilder.createEdge(argument, parameter, EdgeType.ARGUMENT);
		}
	}

}
