package es.um.nosql.code.s13e.transfs.code2codegraph.transf.analyzers;

import org.eclipse.emf.ecore.EObject;

import es.um.uschema.code.metamodels.codeGraph.CodeSubGraph;
import es.um.uschema.code.metamodels.codeGraph.EdgeType;
import es.um.uschema.code.metamodels.codeGraph.Node;
import es.um.uschema.code.metamodels.codeGraph.NodeType;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders.CodeGraphBuilder;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.iterators.CodeIterator;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository.CallHierarchy;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository.CodeGraphModelRepository;
import es.um.uschema.code.metamodels.code.Argument;
import es.um.uschema.code.metamodels.code.Assign;
import es.um.uschema.code.metamodels.code.Assignable;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Expression;
import es.um.uschema.code.metamodels.code.IndexBasedAccess;
import es.um.uschema.code.metamodels.code.Loop;
import es.um.uschema.code.metamodels.code.NewClass;
import es.um.uschema.code.metamodels.code.NewDataContainer;
import es.um.uschema.code.metamodels.code.Operation;
import es.um.uschema.code.metamodels.code.Parameter;
import es.um.uschema.code.metamodels.code.PropertyAccess;
import es.um.uschema.code.metamodels.code.Return;
import es.um.uschema.code.metamodels.code.Selection;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Try;
import es.um.uschema.code.metamodels.code.UnaryOperation;
import es.um.uschema.code.metamodels.code.VariableAccess;
import es.um.uschema.code.metamodels.code.VariableDeclaration;

public class CodeAnalyzer {

	private CodeGraphBuilder codeGraphBuilder;
	private CodeIterator codeIterator;
	private CodeGraphModelRepository codeGraphModelRepository;
	private LoopAnalyzer loopAnalyzer;
	private SelectionAnalyzer selectionAnalyzer;
	private TryAnalyzer tryAnalyzer;

	public CodeAnalyzer(CodeGraphBuilder codeGraphBuilder, CodeGraphModelRepository codeGraphModelRepository) {
		this.codeGraphBuilder = codeGraphBuilder;
		this.codeGraphModelRepository = codeGraphModelRepository;
		this.loopAnalyzer = new LoopAnalyzer(codeGraphBuilder);
		this.selectionAnalyzer = new SelectionAnalyzer(codeGraphBuilder);
		this.tryAnalyzer = new TryAnalyzer(codeGraphBuilder);
	}

	public Node processStatement(CodeSubGraph codeSubGraph, Node lastNode, Statement statement, NodeType nodeType, EdgeType edgeType) {
		Node newNode = null;
		
		if (statement instanceof Loop) {
			newNode = loopAnalyzer.processLoop(codeSubGraph, lastNode, (Loop) statement, edgeType);
		} else if (statement instanceof NewClass) {
			newNode = processNewClass(codeSubGraph, lastNode, (NewClass) statement, edgeType);
		} else if (statement instanceof Call) {
			newNode = processCall(codeSubGraph, lastNode, (Call) statement, edgeType);
		} else if (statement instanceof Selection) {
			newNode = selectionAnalyzer.processSelection(codeSubGraph, lastNode, (Selection) statement, edgeType);
		} else if (statement instanceof Try) {
			newNode = tryAnalyzer.processTry(codeSubGraph, lastNode, (Try) statement, edgeType);
		} else if (statement instanceof Assign) {
			newNode = processAssign(codeSubGraph, lastNode, statement, edgeType);
		} else if (statement instanceof Expression) {
			newNode = codeGraphBuilder.createNodeFromLastNode(codeSubGraph, lastNode, statement, nodeType, edgeType);
		} else if (statement instanceof VariableDeclaration) {
			newNode = processVariableDeclaration(codeSubGraph, lastNode, statement, nodeType, edgeType);
		} else if (statement instanceof CallableBlock) {
			if (((CallableBlock)statement).getStatements().size() > 0)
				newNode = codeIterator.iterateOverCallableBlock((CallableBlock) statement, lastNode); 
		} else if (statement instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) statement;
			newNode = codeGraphBuilder.createNodeFromLastNode(codeSubGraph, lastNode, statement, NodeType.CONTROL_NODE, edgeType);
			if (propertyAccess.getDataProducer() != null && propertyAccess.getDataProducer() instanceof Call) {
				newNode = codeIterator.iterateStatement(codeSubGraph, newNode, (Call) propertyAccess.getDataProducer(), nodeType, edgeType);
			}
		} else {
			newNode = codeGraphBuilder.createNodeFromLastNode(codeSubGraph, lastNode, statement, nodeType, edgeType);
		}
		setVariableProperty(statement, newNode);
		
		return newNode;
	}

	private Node processVariableDeclaration(CodeSubGraph codeSubGraph, Node lastNode, Statement statement,
			NodeType nodeType, EdgeType edgeType)
	{
		VariableDeclaration variableDeclaration = (VariableDeclaration) statement;
		Node newNode = codeGraphBuilder.createNodeFromLastNode(codeSubGraph, lastNode, statement, nodeType, edgeType);
		setVariableProperty(statement, newNode);
		
		Assignable initialization = variableDeclaration.getInitialization();
		newNode = processStatement(codeSubGraph, newNode, initialization, nodeType, edgeType);
		
		return newNode;
	}

	private void setVariableProperty(Statement statement, Node newNode)
	{
		if (newNode != null)
		{
			setVariableOfSimpleStatement(statement, newNode); 
			setVariableOfComplexStatement(statement, newNode);
		}
	}

	private void setVariableOfSimpleStatement(Statement statement, Node newNode)
	{
		if (statement instanceof VariableAccess) {
			newNode.getVariables().add(((VariableAccess) statement).getVariable());
		} else if (statement instanceof VariableDeclaration) {
			newNode.getVariables().add(((VariableDeclaration) statement).getVariable());
		} else if (statement instanceof Argument) {
			setVariableProperty(((Argument) statement).getDataProducer(), newNode);
		} else if (statement instanceof IndexBasedAccess) {
			IndexBasedAccess indexBasedAccess = (IndexBasedAccess) statement;
			if (indexBasedAccess.getVariable() != null) {
				newNode.getVariables().add(indexBasedAccess.getVariable());
			} else {
				DataProducer dataProducer = indexBasedAccess.getDataProducer();
				setVariableProperty(dataProducer, newNode);
			}
		} else if (statement instanceof Parameter) {
			newNode.getVariables().add((Parameter) statement);
		} else if (statement instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) statement;
			DataProducer dataProducer = propertyAccess.getDataProducer();
			setVariableProperty(dataProducer, newNode);
		}
	}

	private void setVariableOfComplexStatement(Statement statement, Node newNode)
	{
		if (statement instanceof Assign)
		{
			newNode.getVariables().add(((Assign) statement).getVariable());
			((Assign) statement).getInputs().forEach(dp -> setVariableProperty(dp, newNode));
		} else if (statement instanceof UnaryOperation)
		{
			newNode.getVariables().add(((UnaryOperation) statement).getVariable());
		} else if (statement instanceof Call) {
			((Call) statement).getArguments().forEach(a -> {
				setVariableProperty(a.getDataProducer(), newNode);
			});
		} else if (statement instanceof Expression)
		{
			((Expression) statement).getConditionalExpression().forEach(ce -> {
				if (ce instanceof Statement)
					setVariableProperty((Statement) ce, newNode);
			});
		} else if (statement instanceof Operation)
		{
			((Operation) statement).getDataProducers().forEach(dp -> setVariableProperty(dp, newNode));
		} else if (statement instanceof Return)
		{
			((Return) statement).getDataProducers().forEach(dp -> setVariableProperty(dp, newNode));
		} else if (statement instanceof CallableBlock)
		{
			((CallableBlock) statement).getParameters().forEach(
					par -> setVariableProperty(par, newNode)
			);
		} else if (statement instanceof NewDataContainer)
		{
			((NewDataContainer) statement).getDataContainer().getProperties().forEach(p -> 
				setVariableProperty(p.getInitialization(), newNode)
			);
		}
	}

	private Node processNewClass(CodeSubGraph codeSubGraph, Node lastNode, NewClass newClass, EdgeType edgeType)
	{
		Node newNode = codeGraphBuilder.createNodeFromLastNode(codeSubGraph, lastNode, newClass, NodeType.STATEMENT_NODE, edgeType);
		CallHierarchy callHierarchy = codeGraphModelRepository.getCallHierarchy();
		CallableBlock callableBlock = newClass.getCallableBlock();
		if (callableBlock != null)
		{
			EObject eContainer = callableBlock.eContainer();
			if (callableBlock != null && eContainer instanceof CodeContainer)
			{
				CodeContainer codeContainer = (CodeContainer) eContainer;
				callHierarchy.setUnprocessedCall(codeContainer.getName() + "." + callableBlock.getName(), newNode);
			}
	
			for (Argument argument : newClass.getArguments())
				codeIterator.iterateStatement(codeSubGraph, lastNode, argument.getDataProducer(), NodeType.ARGUMENT, EdgeType.ARGUMENT);
		}
		
		return newNode;
	}
	
	private Node processCall(CodeSubGraph codeSubGraph, Node lastNode, Call call, EdgeType edgeType)
	{
		if (call.getDataProducer() != null)
			lastNode = codeIterator.iterateStatement(codeSubGraph, lastNode, call.getDataProducer(), NodeType.STATEMENT_NODE, EdgeType.NEXT);
		
		Node newNode = codeGraphBuilder.createNodeFromLastNode(codeSubGraph, lastNode, call, NodeType.STATEMENT_NODE, edgeType);
		CallHierarchy callHierarchy = codeGraphModelRepository.getCallHierarchy();
		CallableBlock callableBlock = call.getCallableBlock();
		if (callableBlock != null) {
			callHierarchy.setUnprocessedCall(callableBlock.getName(), newNode);
		} else if (callHierarchy.getStartNode(call.getName()) == null) {
			createNoDefinedFunctionNode(codeSubGraph, call, callHierarchy);
		}
		
		for (Argument argument : call.getArguments())
			codeIterator.iterateStatement(codeSubGraph, newNode, argument.getDataProducer(), NodeType.ARGUMENT, EdgeType.ARGUMENT);
		
		return newNode;
	}

	private void createNoDefinedFunctionNode(CodeSubGraph codeSubGraph, Call call, CallHierarchy callHierarchy)
	{
		Node startNode = codeGraphBuilder.createStartNode();
		codeSubGraph.getNodes().add(startNode);
		callHierarchy.saveStartNode(call.getName(), startNode);
		
		Node endNode = codeGraphBuilder.createEndNode();
		codeSubGraph.getNodes().add(endNode);
		callHierarchy.saveStartNode(call.getName(), endNode);
	}

	private Node processAssign(CodeSubGraph codeSubGraph, Node lastNode, Statement statement, EdgeType edgeType)
	{
		Assign assign = (Assign) statement;
		Node newNode = codeGraphBuilder.createNodeFromLastNode(codeSubGraph, lastNode, statement, NodeType.STATEMENT_NODE, edgeType);
		for (DataProducer dataProducer : assign.getInputs())
		{
			if (dataProducer instanceof Call)
			{
				processStatement(codeSubGraph, newNode, dataProducer, NodeType.STATEMENT_NODE, EdgeType.NEXT);
			} else if (dataProducer instanceof Operation)
			{
				Operation operation = (Operation) dataProducer;
				codeIterator.iterateOverDataProducers(codeSubGraph, newNode, operation.getDataProducers(), NodeType.STATEMENT_NODE, EdgeType.NEXT);
			}
		}
		return newNode;
	}

	public void setCodeIterator(CodeIterator codeIterator) {
		this.codeIterator = codeIterator;
		this.loopAnalyzer.setCodeIterator(codeIterator);
		this.selectionAnalyzer.setCodeIterator(codeIterator);
		this.tryAnalyzer.setCodeIterator(codeIterator);
	}
	
}
