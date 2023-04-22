package es.um.unosql.neo4j.api.write.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Neo4jNode {
	private static final String ID = "id";

	private Long id;
	private String[] labels;
	private Neo4jPropertiesMap properties;

	public Neo4jNode(String... labels) {
		this.labels = labels;
		this.properties = new Neo4jPropertiesMap();
		this.id = null;
	}

	public Neo4jNode(long id, String... labels) {
		this.labels = labels;
		this.properties = new Neo4jPropertiesMap();
		this.id = id;
		addProperty(ID, id);
	}

	public Neo4jNode addProperty(String key, Object value) {
		properties.addProperty(key, value);

		return this;
	}

	public String toCypher() {
		return "MERGE (:" + String.join(": ", labels) + " " + properties.toJson() + ");";
	}

	public List<String> createNecesaryIndexes() {
		if (labels.length > 0)
			return Stream.of(labels).map(l -> "CREATE INDEX ON :" + l + "(" + ID + ");").collect(Collectors.toList());

		return Collections.emptyList();
	}

	public List<String> dropIndexes() {
		if (labels.length > 0)
			return Stream.of(labels).map(l -> "DROP INDEX ON :" + l + "(" + ID + ");").collect(Collectors.toList());

		return Collections.emptyList();
	}

	public List<String> deleteIdProperty() {
		if (labels.length > 0)
			return Stream.of(labels).map(l -> "MATCH (n:" + l + ") REMOVE n.id;").collect(Collectors.toList());

		return Collections.emptyList();
	}

	public Long getId() {
		return id;
	}

	public String[] getLabels() {
		return labels;
	}

	public Neo4jPropertiesMap getProperties() {
		return properties;
	}

	public boolean hasId() {
		return id != null;
	}

}
