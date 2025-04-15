package es.um.nosql.code.s13e.transfs.codegraph2neo4j.transf;

import java.util.List;

import es.um.uschema.code.metamodels.codeGraph.CodeGraph;
import es.um.uschema.code.metamodels.codeGraph.CodeSubGraph;
import es.um.uschema.code.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.transfs.code2text.javascript.transf.statements.StatementsPrinter;
import es.um.unosql.neo4j.api.write.domain.Neo4jNode;
import es.um.unosql.neo4j.api.write.domain.Neo4jRelationship;
import es.um.unosql.neo4j.api.write.domain.Neo4jStore;
import es.um.uschema.code.metamodels.code.Statement;

public class CodeGraphProcessor
{
	private StatementsPrinter statementsPrinter;
	private Neo4jStore neo4jStore;
	
	public CodeGraphProcessor() {
		this.statementsPrinter = new StatementsPrinter();
		this.neo4jStore = new Neo4jStore();
	}

	public void convertToCodeGrahps(CodeGraph application)
	{
		for (CodeSubGraph codeSubGraph : application.getSubGrahps())
			processSubGraph(codeSubGraph);
	}

	private Neo4jNode createNode(Node n)
	{
		Neo4jNode neo4jNode = new Neo4jNode(n.hashCode(), n.getNodeType().getLiteral())
			.addProperty("type", n.getNodeType().getLiteral());
		
		if (n.getStatement() != null)
		{
			neo4jNode.addProperty("statement", getClassName(n.getStatement()));
			neo4jNode.addProperty("snippet", statementsPrinter.generateStatement(n.getStatement()));
			neo4jNode.addProperty("variables", n.getVariables().stream().map(v -> v.getName()).toArray());
		}
		
		return neo4jNode;
	}

	private String getClassName(Statement statement) {
		String simpleName = statement.getClass().getSimpleName();
		
		return simpleName.substring(0, simpleName.indexOf("Impl"));
	}

	private void processSubGraph(CodeSubGraph codeSubGraph)
	{
		codeSubGraph.getNodes().forEach(node -> {
			Neo4jNode originNode = createNode(node);
			neo4jStore.saveNode(originNode);
			
			node.getOutgoingEdges().forEach(edge -> {
				String relType = edge.getType().getLiteral().toString();
				Neo4jRelationship neo4jRelationship = new Neo4jRelationship(relType, originNode, createNode(edge.getTarget()));
				neo4jStore.saveRelationship(neo4jRelationship);
			});
		});
	}

	public String generateCypherScriptAsString()
	{
		return neo4jStore.generateCypherScriptAsString();
	}
	
	public List<String> generateCypherScript()
	{
		return neo4jStore.generateCypherScript();
	}
	
	
}
