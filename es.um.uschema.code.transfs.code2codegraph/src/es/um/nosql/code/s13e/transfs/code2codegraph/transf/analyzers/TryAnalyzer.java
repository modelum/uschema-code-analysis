package es.um.nosql.code.s13e.transfs.code2codegraph.transf.analyzers;

import org.eclipse.emf.common.util.EList;

import es.um.nosql.code.s13e.metamodels.code.Catch;
import es.um.nosql.code.s13e.metamodels.code.Finally;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Try;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.codeGraph.NodeType;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders.CodeGraphBuilder;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.iterators.CodeIterator;

public class TryAnalyzer
{
	private CodeGraphBuilder codeGraphBuilder;
	private CodeIterator codeIterator;

	public TryAnalyzer(CodeGraphBuilder codeGraphBuilder)
	{
		this.codeGraphBuilder = codeGraphBuilder;
	}

	public Node processTry(CodeSubGraph codeSubGraph, Node lastNode, Try tryStatement, EdgeType edgeType)
	{
		Node tryFinalNode = codeIterator.iterateStatements(codeSubGraph, lastNode, tryStatement.getCodeBlock().getStatements(), EdgeType.TRY);
		Node tryFinalControlNode = codeGraphBuilder.createControlNode();
		codeSubGraph.getNodes().add(tryFinalControlNode);
		codeGraphBuilder.createEdge(tryFinalNode, tryFinalControlNode, EdgeType.NEXT);
		
		Node tryCatchControlNode = codeGraphBuilder.createControlNode();
		codeSubGraph.getNodes().add(tryCatchControlNode);
		
		for (Catch catchStatement : tryStatement.getCatchs())
		{
			EList<Statement> statements = catchStatement.getCodeBlock().getStatements();
			if (statements.size() > 0)
			{
				Statement firstStatement = statements.get(0);
				Node lastCaseNode = codeIterator.iterateStatement(codeSubGraph, tryFinalControlNode, firstStatement, NodeType.STATEMENT_NODE, EdgeType.CATCH);
				
				lastCaseNode = codeIterator.iterateStatements(codeSubGraph, lastCaseNode, statements.subList(1, statements.size()), EdgeType.NEXT);
				codeGraphBuilder.createEdge(lastCaseNode, tryCatchControlNode, EdgeType.JUMP);
			}
			
		}
		
		Finally finallyStatement = tryStatement.getFinally();
		if (finallyStatement != null)
		{
			Node lastCaseNode = codeIterator.iterateStatements(codeSubGraph, tryCatchControlNode, finallyStatement.getCodeBlock().getStatements(), EdgeType.FINALLY);
		
			Node finallyControlNode = codeGraphBuilder.createControlNode();
			codeSubGraph.getNodes().add(finallyControlNode);
			codeGraphBuilder.createEdge(lastCaseNode, finallyControlNode, EdgeType.JUMP);
			
			return finallyControlNode;
		}
		
		return tryCatchControlNode;
	}

	public void setCodeIterator(CodeIterator codeIterator)
	{
		this.codeIterator = codeIterator;
	}

}
