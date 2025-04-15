package es.um.nosql.code.s13e.transfs.code2codegraph.transf.iterators;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph;
import es.um.uschema.code.metamodels.codeGraph.CodeSubGraph;
import es.um.uschema.code.metamodels.codeGraph.EdgeType;
import es.um.uschema.code.metamodels.codeGraph.Node;
import es.um.uschema.code.metamodels.codeGraph.NodeType;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.analyzers.CodeAnalyzer;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders.CodeGraphBuilder;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository.CallHierarchy;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository.CodeGraphModelRepository;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.CodeBlockType;
import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.ConditionalExpression;
import es.um.uschema.code.metamodels.code.Container;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Expression;
import es.um.uschema.code.metamodels.code.Parameter;
import es.um.uschema.code.metamodels.code.Return;
import es.um.uschema.code.metamodels.code.Statement;

public class CodeIterator
{ 
	private CodeAnalyzer codeAnalyzer;
	private CodeGraphModelRepository codeGraphModelRepository;
	private CodeGraphBuilder codeGraphBuilder;
	
	private Node endNode;

	public CodeIterator(CodeAnalyzer codeAnalyzer, CodeGraphBuilder codeGraphBuilder, CodeGraphModelRepository codeGraphModelRepository)
	{
		this.codeAnalyzer = codeAnalyzer;
		this.codeGraphBuilder = codeGraphBuilder;
		this.codeGraphModelRepository = codeGraphModelRepository;
	}

	public void processCode(Code code) 
	{
		codeGraphBuilder.createApplication(code);
		iterateOverContainers(code.getContainer());
	}

	private void iterateOverContainers(List<Container> containers) 
	{
		containers.forEach(c -> {
			iterateOverContainer(c);
			iterateOverContainers(c.getSubContainer());
		});
	}
	
	private void iterateOverContainer(Container container) 
	{
		container.getCodeContainer()
			.forEach(codeContainer -> {
				if (codeContainer instanceof CallableBlock) {
					iterateOverCallableBlock((CallableBlock) codeContainer);
				} else {
					iterateOverCodeContainer(codeContainer);
				}
			});
	}
	
	private void iterateOverCodeContainer(CodeContainer codeContainer) 
	{
		codeContainer.getCodeBlock()
			.forEach(codeBlock -> {
				if (codeBlock instanceof CallableBlock) {
					iterateOverCallableBlock((CallableBlock) codeBlock);
				} else {
					iterateOverCodeBlock(codeBlock);
				}
			});
	}

	public void iterateOverCallableBlock(CallableBlock callableBlock) 
	{
		CodeSubGraph callableBlockSubGraph = codeGraphBuilder.createCallableBlockSubGraph(callableBlock);
		if (callableBlock.getStatements().size() > 0)
		{
			Node lastNode = createStartNode(callableBlock, callableBlockSubGraph);
			createParameters(callableBlock, callableBlockSubGraph, lastNode);
			
			createEndNodeIterateOverStatements(callableBlock, callableBlockSubGraph, lastNode);
		}	
		endNode = null;
	}

	private void createEndNodeIterateOverStatements(CallableBlock callableBlock, CodeSubGraph callableBlockSubGraph,
			Node lastNode)
	{
		endNode = codeGraphBuilder.createEndNode();
		callableBlockSubGraph.getNodes().add(endNode);
		saveLastFunctionNode(callableBlock, endNode);
		lastNode = iterateStatementsWithReturn(callableBlockSubGraph, lastNode, callableBlock.getStatements(), endNode);
//		if (lastNode.getOutgoingEdges().size() == 0) {
		codeGraphBuilder.createEdge(lastNode, endNode, EdgeType.NEXT);
//		}
	}

	public Node iterateOverCallableBlock(CallableBlock callableBlock, Node lastNode) 
	{
		CodeSubGraph callableBlockSubGraph = codeGraphBuilder.createCallableBlockSubGraph(callableBlock);
		if (callableBlock.getStatements().size() > 0)
		{
			Node startNode = createStartNode(callableBlock, callableBlockSubGraph);
			codeGraphBuilder.createEdge(lastNode, startNode, EdgeType.CALL);
			lastNode = startNode;
			createParameters(callableBlock, callableBlockSubGraph, startNode);
			
			createEndNodeIterateOverStatements(callableBlock, callableBlockSubGraph, lastNode);
			
			return endNode;
		}	
		
		return null;
	}
	
	private Node createStartNode(CodeBlock codeBlock, CodeSubGraph codeSubGraph)
	{
		Node lastNode = codeGraphBuilder.createStartNode();
		codeSubGraph.getNodes().add(lastNode);
		saveFirstFunctionNode(codeBlock, lastNode);
		return lastNode;
	}
	
	private void createEndNode(CodeBlock codeBlock, CodeSubGraph codeSubGraph, Node lastNode)
	{
		Node endNode = codeGraphBuilder.createEndNode(lastNode);
		codeSubGraph.getNodes().add(endNode);
		saveLastFunctionNode(codeBlock, endNode);
	}

	private void createParameters(CallableBlock callableBlock, CodeSubGraph codeSubGraph,
			Node lastNode)
	{
		for (Parameter parameter : callableBlock.getParameters())
		{
			Node node = codeGraphBuilder.createParameterNode(parameter);
			codeSubGraph.getNodes().add(node);
			codeGraphBuilder.createEdge(lastNode, node, EdgeType.PARAMETER);
		}
	}
	
	private void iterateOverCodeBlock(CodeBlock codeBlock) 
	{
		CodeBlockSubGraph codeBlockSubGraph = codeGraphBuilder.createCodeBlockSubGraph(codeBlock);
		iterateStatements(codeBlockSubGraph, codeBlock);
	}
	
	private void iterateStatements(CodeSubGraph codeSubGraph, CodeBlock codeBlock) 
	{
		if (codeBlock.getStatements().size() > 0)
		{
			Node lastNode = createStartNode(codeBlock, codeSubGraph);
			lastNode = iterateStatements(codeSubGraph, lastNode, codeBlock.getStatements(), EdgeType.NEXT);
			createEndNode(codeBlock, codeSubGraph, lastNode);
		}
	}

	public Node iterateStatementsWithReturn(CodeSubGraph codeSubGraph, Node lastNode, List<Statement> statements, Node endNode) 
	{
		for(Statement statement : statements) 
		{
			lastNode = iterateStatement(codeSubGraph, lastNode, statement, NodeType.STATEMENT_NODE, EdgeType.NEXT);
			if (statement instanceof Return)
			{
				codeGraphBuilder.createEdge(lastNode, endNode, EdgeType.RETURN);
			}
		}
		
		return lastNode;
	}
	
	public Node iterateOverStatementCodeBlock(CodeSubGraph codeSubGraph, Node lastNode, CodeBlock codeBlock) 
	{
		return iterateStatements(codeSubGraph, lastNode, codeBlock.getStatements(), EdgeType.NEXT);
	}

	private void saveFirstFunctionNode(CodeBlock codeBlock, Node lastNode)
	{
		if (codeBlock instanceof CallableBlock) 
		{
			CallHierarchy callHierarchy = codeGraphModelRepository.getCallHierarchy();
			
			CallableBlock callableBlock = (CallableBlock) codeBlock;
			if (callableBlock.getCodeBlockType().equals(CodeBlockType.CONSTRUCTOR))
			{
				EObject eContainer = callableBlock.eContainer();
				if (eContainer instanceof CodeContainer)
				{
					CodeContainer codeContainer = (CodeContainer) eContainer;
					callHierarchy.saveStartNode(codeContainer.getName() + "." + callableBlock.getName(), lastNode);
				}
			} else
			{
				callHierarchy.saveStartNode(callableBlock.getName(), lastNode);
			}
		}
	}
	
	public Node iterateStatements(CodeSubGraph codeSubGraph, Node lastNode, List<Statement> statements, EdgeType firstEdgeType) 
	{
		boolean first = true;
		for(Statement statement : statements) 
		{
			if (first)
			{
				lastNode = iterateStatement(codeSubGraph, lastNode, statement, NodeType.STATEMENT_NODE, firstEdgeType);
				first = false;
			} else 
			{
				lastNode = iterateStatement(codeSubGraph, lastNode, statement, NodeType.STATEMENT_NODE, EdgeType.NEXT);
			}
		}
		
		return lastNode;
	}
	
	public Node iterateOverDataProducers(CodeSubGraph codeSubGraph, Node lastNode, List<DataProducer> dataProducers, NodeType nodeType, EdgeType edgeType) 
	{
		for (DataProducer dataProducer : dataProducers) 
			lastNode = iterateStatement(codeSubGraph, lastNode, dataProducer, nodeType, edgeType);
		
		return lastNode;
	}	

	public Node iterateOverConditionalExpression(CodeSubGraph codeSubGraph, Node lastNode,
			List<ConditionalExpression> conditionalExpressions, EdgeType edgeType)
	{
		for (ConditionalExpression conditionalExpression : conditionalExpressions) 
		{
			if (conditionalExpression instanceof Expression)
			{
				lastNode = iterateStatement(codeSubGraph, lastNode, (Expression) conditionalExpression, NodeType.STATEMENT_NODE, edgeType);
			}
		}
		
		return lastNode;
	}
	
	public Node iterateStatement(CodeSubGraph codeSubGraph, Node lastNode, Statement statement, NodeType nodeType, EdgeType edgeType) 
	{
		lastNode = codeAnalyzer.processStatement(codeSubGraph, lastNode, statement, nodeType, edgeType);
		if (statement instanceof Return)
		{
			codeGraphBuilder.createEdge(lastNode, endNode, EdgeType.RETURN);
		}
		
		return lastNode;
	}
	
	private void saveLastFunctionNode(CodeBlock codeBlock, Node endNode)
	{
		CallHierarchy callHierarchy = codeGraphModelRepository.getCallHierarchy();
		
		if (codeBlock instanceof CallableBlock)
		{
			CallableBlock callableBlock = (CallableBlock) codeBlock;
			if (callableBlock.getCodeBlockType().equals(CodeBlockType.CONSTRUCTOR))
			{
				EObject eContainer = callableBlock.eContainer();
				if (eContainer instanceof CodeContainer)
				{
					CodeContainer codeContainer = (CodeContainer) eContainer;
					callHierarchy.saveEndNode(codeContainer.getName() + "." + callableBlock.getName(), endNode);
				}
			} else
			{
				callHierarchy.saveEndNode(((CallableBlock) codeBlock).getName(), endNode);
			}
		}
	}
}
