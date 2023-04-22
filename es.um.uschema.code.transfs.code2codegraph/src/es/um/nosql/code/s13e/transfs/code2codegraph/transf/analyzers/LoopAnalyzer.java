package es.um.nosql.code.s13e.transfs.code2codegraph.transf.analyzers;

import java.util.List;

import es.um.nosql.code.s13e.metamodels.code.Loop;
import es.um.nosql.code.s13e.metamodels.code.LoopPart;
import es.um.nosql.code.s13e.metamodels.code.LoopPartType;
import es.um.nosql.code.s13e.metamodels.code.LoopType;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.codeGraph.NodeType;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders.CodeGraphBuilder;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.iterators.CodeIterator;

public class LoopAnalyzer
{

	private CodeGraphBuilder codeGraphBuilder;
	private CodeIterator codeIterator;

	public LoopAnalyzer(CodeGraphBuilder codeGraphBuilder)
	{
		this.codeGraphBuilder = codeGraphBuilder;
	}

	public Node processLoop(CodeSubGraph codeSubGraph, Node lastNode, Loop loop, EdgeType edgeType)
	{
		LoopType loopType = loop.getType();

		Node newNode = null;
		if (loopType.equals(LoopType.FOR))
		{
			newNode = processFor(codeSubGraph, lastNode, loop, edgeType);
		} else if (loopType.equals(LoopType.WHILE))
		{
			newNode = processWhile(codeSubGraph, lastNode, loop, edgeType);
		} else if (loopType.equals(LoopType.DO_WHILE))
		{
			newNode = processDoWhile(codeSubGraph, lastNode, loop, edgeType);
		}

		return newNode;
	}

	private Node processWhile(CodeSubGraph codeSubGraph, Node lastNode, Loop loop, EdgeType edgeType)
	{
		Node conditionNode = processCondition(codeSubGraph, lastNode, loop, edgeType);
		Node lastCodeBlockNode = codeIterator.iterateStatements(codeSubGraph, conditionNode,
				loop.getCodeBlock().getStatements(), EdgeType.NEXT);

		codeGraphBuilder.createEdge(lastCodeBlockNode, conditionNode, EdgeType.NEXT);

		return conditionNode;
	}

	private Node processDoWhile(CodeSubGraph codeSubGraph, Node lastNode, Loop loop, EdgeType edgeType)
	{
		List<Statement> statements = loop.getCodeBlock().getStatements();
		if (statements.size() > 0)
		{
			Statement firstStatement = statements.get(0);
			Node firstCodeBlockNode = codeIterator.iterateStatement(codeSubGraph, lastNode, firstStatement, NodeType.STATEMENT_NODE, EdgeType.NEXT);
			Node lastCodeBlockNode = codeIterator.iterateStatements(codeSubGraph, firstCodeBlockNode, statements.subList(1, statements.size()), EdgeType.NEXT);
			Node conditionNode = processCondition(codeSubGraph, lastCodeBlockNode, loop, EdgeType.NEXT);
			codeGraphBuilder.createEdge(conditionNode, firstCodeBlockNode, EdgeType.NEXT);
			
			return conditionNode;
		}
		
		Node conditionNode = processCondition(codeSubGraph, lastNode, loop, EdgeType.NEXT);
		codeGraphBuilder.createEdge(lastNode, conditionNode, EdgeType.NEXT);

		return conditionNode;
	}

	private Node processFor(CodeSubGraph codeSubGraph, Node lastNode, Loop loop, EdgeType edgeType)
	{
		Node inicializationNode = processInicialization(codeSubGraph, lastNode, loop, edgeType);
		Node conditionNode = processCondition(codeSubGraph, inicializationNode, loop, EdgeType.NEXT);
		Node lastCodeBlockNode = codeIterator.iterateStatements(codeSubGraph, conditionNode,
				loop.getCodeBlock().getStatements(), EdgeType.NEXT);
		Node updaterNode = processUpdater(codeSubGraph, lastCodeBlockNode, loop);

		codeGraphBuilder.createEdge(updaterNode, conditionNode, EdgeType.NEXT);

		return conditionNode;
	}

	private Node processInicialization(CodeSubGraph codeSubGraph, Node lastNode, Loop loop, EdgeType edgeType)
	{
		LoopPart inicialization = processLoopPart(loop, LoopPartType.INITIALIZATION);
		return codeIterator.iterateStatements(codeSubGraph, lastNode, inicialization.getStatement(), edgeType);
	}

	private Node processCondition(CodeSubGraph codeSubGraph, Node lastNode, Loop loop, EdgeType edgeType)
	{
		LoopPart condition = processLoopPart(loop, LoopPartType.CONDITION);
		return codeIterator.iterateStatements(codeSubGraph, lastNode, condition.getStatement(), edgeType);
	}

	private Node processUpdater(CodeSubGraph codeSubGraph, Node lastNode, Loop loop)
	{
		LoopPart updater = processLoopPart(loop, LoopPartType.UPDATER);
		return codeIterator.iterateStatements(codeSubGraph, lastNode, updater.getStatement(), EdgeType.NEXT);
	}

	private LoopPart processLoopPart(Loop loop, LoopPartType desiredLoopPartType)
	{
		for (LoopPart loopPart : loop.getLoopPart())
		{
			LoopPartType loopPartType = loopPart.getType();

			if (loopPartType.equals(desiredLoopPartType))
				return loopPart;
		}

		return null;
	}

	public void setCodeIterator(CodeIterator codeIterator)
	{
		this.codeIterator = codeIterator;
	}

}
