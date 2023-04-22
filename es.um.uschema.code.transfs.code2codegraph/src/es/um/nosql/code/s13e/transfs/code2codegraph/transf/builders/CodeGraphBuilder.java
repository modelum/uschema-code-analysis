package es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders;

import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.Parameter;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CallableBlockSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeBlockSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphFactory;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.Edge;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.codeGraph.NodeType;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository.CodeGraphModelRepository;

public class CodeGraphBuilder 
{
	private CodeGraphModelRepository codeGraphModelRepository;
	private CodeGraphFactory codeGraphFactory;

	public CodeGraphBuilder(CodeGraphModelRepository codeGraphModelRepository) 
	{
		this.codeGraphModelRepository = codeGraphModelRepository;
		this.codeGraphFactory = CodeGraphFactory.eINSTANCE;
	}

	public CodeGraph createApplication(Code code) 
	{
		CodeGraph application = codeGraphFactory.createCodeGraph();
		application.setCode(code);
		
		codeGraphModelRepository.saveApplication(application);
		
		return application;
	}

	public CallableBlockSubGraph createCallableBlockSubGraph(CallableBlock callableBlock) 
	{
		CallableBlockSubGraph CallableBlockSubGraph = codeGraphFactory.createCallableBlockSubGraph();
		CallableBlockSubGraph.setCallableBlock(callableBlock);
		
		codeGraphModelRepository.saveCallableBlockSubGraph(CallableBlockSubGraph);
		
		return CallableBlockSubGraph;
	}

	public CodeBlockSubGraph createCodeBlockSubGraph(CodeBlock codeBlock) 
	{
		CodeBlockSubGraph CodeBlockSubGraph = codeGraphFactory.createCodeBlockSubGraph();
		CodeBlockSubGraph.setCodeBlock(codeBlock);
		
		codeGraphModelRepository.saveCodeBlockSubGraph(CodeBlockSubGraph);
		
		return CodeBlockSubGraph;
	}

	public Node createControlNode() 
	{
		Node node = codeGraphFactory.createNode();
		node.setNodeType(NodeType.CONTROL_NODE);
		
		return node;
	}
	
	public Node createNode() 
	{
		Node node = codeGraphFactory.createNode();
		node.setNodeType(NodeType.STATEMENT_NODE);
		
		return node;
	}
	
	public Node createNode(Statement statement, NodeType nodeType) 
	{
		Node node = codeGraphFactory.createNode();
		node.setStatement(statement);
		node.setNodeType(nodeType);
		
		return node;
	}
	
	public Node createParameterNode(Parameter parameter) 
	{
		Node node = codeGraphFactory.createNode();
		node.setStatement(parameter);
		node.setNodeType(NodeType.PARAMETER);
		node.getVariables().add(parameter);
		
		return node;
	}

	public Node createStartNode() 
	{
		Node startNode = codeGraphFactory.createNode();
		startNode.setNodeType(NodeType.START_NODE);
		
		return startNode;
	}

	public Node createEndNode() 
	{
		Node endNode = codeGraphFactory.createNode();
		endNode.setNodeType(NodeType.END_NODE);
		
		return endNode;
	}

	public Node createEndNode(Node lastNode) 
	{
		Node endNode = createEndNode();
		createEdge(lastNode, endNode, EdgeType.NEXT);
		
		return endNode;
	}

	public Node createSavedNode(CodeSubGraph codeSubGraph, Statement statement)
	{
		Node node = createNode(statement, NodeType.STATEMENT_NODE);
		codeSubGraph.getNodes().add(node);
		
		return node;
	}

	public Node createNodeFromLastNode(CodeSubGraph codeSubGraph, Node lastNode, Statement statement, NodeType nodeType, EdgeType edgeType) 
	{
		Node newNode = createNode(statement, nodeType);
		codeSubGraph.getNodes().add(newNode);
		
		createEdge(lastNode, newNode, edgeType);
		
		return newNode;
	}
	
	public Node createNodeFromLastNode(CodeSubGraph codeSubGraph, Node lastNode, Statement statement, Variable variable, NodeType nodeType, EdgeType edgeType) 
	{
		Node newNode = createNode(statement, nodeType);
		newNode.getVariables().add(variable);
		codeSubGraph.getNodes().add(newNode);
		
		createEdge(lastNode, newNode, edgeType);
		
		return newNode;
	}

	public Node createNodeFromLastNodeUsingExpressionEdge(CodeSubGraph codeSubGraph, Node lastNode, Statement statement) 
	{
		Node newNode = createNode(statement, NodeType.STATEMENT_NODE);
		codeSubGraph.getNodes().add(newNode);
		
		createExpressionEdge(lastNode, newNode);
		
		return newNode;
	}

	public Node createNodeFromLastNodeUsingCallEdge(CodeSubGraph codeSubGraph, Node lastNode, Statement statement) 
	{
		Node newNode = createNode(statement, NodeType.STATEMENT_NODE);
		codeSubGraph.getNodes().add(newNode);
		
		createCallEdge(lastNode, newNode);
		
		return newNode;
	}

	public Edge createEdge(Node lastNode, Node newNode, EdgeType edgeType) 
	{
		if (lastNode != null && newNode != null)
		{
			Edge edge = codeGraphFactory.createEdge();
			setCommonEdgeProperties(edge, lastNode, newNode, edgeType);
			
			return edge;
		}
		
		return null;
	}

	public Edge createExpressionEdge(Node lastNode, Node newNode) 
	{
		if (lastNode != null)
		{
			Edge edge = codeGraphFactory.createExpressionEdge();
			setCommonEdgeProperties(edge, lastNode, newNode, EdgeType.EXPRESSION);

			return edge;
		}
		
		return null;
	}

	public Edge createCallEdge(Node lastNode, Node newNode) 
	{
		if (lastNode != null)
		{
			Edge edge = codeGraphFactory.createEdgeCall();
			setCommonEdgeProperties(edge, lastNode, newNode, EdgeType.CALL);
		
			return edge;
		}
		
		return null;
	}

	private void setCommonEdgeProperties(Edge edge, Node sourceNode, Node targetNode, EdgeType edgeType)
	{
		edge.setSource(sourceNode);
		edge.setTarget(targetNode);
		edge.setType(edgeType);
		
		sourceNode.getOutgoingEdges().add(edge);
		targetNode.getIncomingEdges().add(edge);
	}
	
	
}
