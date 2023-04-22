package es.um.nosql.code.s13e.transfs.code2codegraph.transf.analyzers;

import es.um.nosql.code.s13e.metamodels.code.Case;
import es.um.nosql.code.s13e.metamodels.code.Selection;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders.CodeGraphBuilder;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.iterators.CodeIterator;

public class SelectionAnalyzer
{
	private CodeGraphBuilder codeGraphBuilder;
	private CodeIterator codeIterator;

	public SelectionAnalyzer(CodeGraphBuilder codeGraphBuilder)
	{
		this.codeGraphBuilder = codeGraphBuilder;
	}

	public Node processSelection(CodeSubGraph codeSubGraph, Node lastNode, Selection selection, EdgeType edgeType)
	{
		Node selectionNode = codeGraphBuilder.createControlNode();
		selectionNode.setStatement(selection);
		codeSubGraph.getNodes().add(selectionNode);
		codeGraphBuilder.createEdge(lastNode, selectionNode, edgeType);

		Node selectionEndNode = codeGraphBuilder.createControlNode();
		
		generateCases(codeSubGraph, selection, selectionNode, selectionEndNode);
		
		codeSubGraph.getNodes().add(selectionEndNode);
		
		// If there is not a Default/Else case
		if (! selection.getCase().stream().filter(c -> c.getConditionalExpression().size() == 0).findFirst().isPresent())
		{
			return selectionNode;
		}
		
		return selectionEndNode;
	}

	private void generateCases(CodeSubGraph codeSubGraph, Selection selection, Node selectionNode,
			Node selectionEndNode)
	{
		for (Case caseStatement : selection.getCase())
		{
			Node conditionNode = codeIterator.iterateOverConditionalExpression(codeSubGraph, selectionNode, caseStatement.getConditionalExpression(), EdgeType.SELECTION);
			if (caseStatement.getConditionalExpression().size() == 0)
			{
				conditionNode = codeGraphBuilder.createNode();
				codeSubGraph.getNodes().add(conditionNode);
				codeGraphBuilder.createEdge(selectionNode, conditionNode, EdgeType.ELSE);
			}
			
			Node lastCaseNode = codeIterator.iterateStatements(codeSubGraph, conditionNode, caseStatement.getCodeBlock().getStatements(), EdgeType.NEXT);
			codeGraphBuilder.createEdge(lastCaseNode, selectionEndNode, EdgeType.JUMP);
		}
	}
	
	public void setCodeIterator(CodeIterator codeIterator)
	{
		this.codeIterator = codeIterator;
	}

}
