package es.um.unosql.neo4j.api.write.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Neo4jStore
{
	private static final String NEW_LINE = System.getProperty("line.separator");
	
	private List<Neo4jNode> nodes;
	private List<Neo4jRelationship> relationships;

	public Neo4jStore()
	{
		this.nodes = new LinkedList<Neo4jNode>();
		this.relationships = new LinkedList<Neo4jRelationship>();
	}

	public void saveNode(Neo4jNode node)
	{
		this.nodes.add(node);
	}

	public void saveRelationship(Neo4jRelationship relationship)
	{
		this.relationships.add(relationship);
	}

	public List<Neo4jNode> getNodes()
	{
		return nodes;
	}

	public List<Neo4jRelationship> getRelationships()
	{
		return relationships;
	}

	public List<String> generateCypherScript()
	{
		List<String> cypher = new LinkedList<String>();
//				nodes.stream().flatMap(n -> n.createNecesaryIndexes().stream()).distinct().collect(Collectors.toList());
		nodes.stream().map(n -> n.toCypher()).distinct().forEach(c -> cypher.add(c));
		relationships.stream().map(n -> n.toCypher()).distinct().forEach(c -> cypher.add(c));
		nodes.stream().flatMap(n -> n.deleteIdProperty().stream()).distinct().forEach(c -> cypher.add(c));
//		nodes.stream().flatMap(n -> n.dropIndexes().stream()).distinct().forEach(c -> cypher.add(c));
		
		return cypher;
	}

	public String generateCypherScriptAsString()
	{
		return String.join(NEW_LINE, generateCypherScript());
	}
	
}
