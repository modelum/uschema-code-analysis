package es.um.unosql.neo4j.api.write.domain;

public class Neo4jRelationship
{
	private static final String ID = "id";
	
	private String type;
	private Neo4jPropertiesMap properties;
	private Neo4jNode origin;
	private Neo4jNode target;

	public Neo4jRelationship(String type, Neo4jNode origin, Neo4jNode target)
	{
		this.type = type;
		this.origin = origin;
		this.target = target;
		this.properties = new Neo4jPropertiesMap();
	}

	public Neo4jRelationship addProperty(String key, Object ...value)
	{
		properties.addProperty(key, value);
		
		return this;
	}

	public String toCypher()
	{
		String cypher = getMatchClause("a", origin);
		cypher += getMatchClause("b", target);
		cypher += "MERGE (a)-[:" + type + " " + properties.toJson() + "]->(b);";
		
		return cypher;
	}

	private String getMatchClause(String var, Neo4jNode node)
	{
		if (node.hasId())
			return  "MATCH (" + var + ":" + String.join(":", node.getLabels()) + " {" + ID + ": " + node.getId() + "}) ";
		else 
			return  "MATCH (" + var + ":" + String.join(":", node.getLabels()) + " " + node.getProperties().toJson() + ") ";
	}

}
