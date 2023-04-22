package es.um.unosql.neo4j.api.write.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Neo4jPropertiesMap
{

	private static final String SPACE = " ";
	private static final String OPENING_SQUARE_BRACKET = "[";
	private static final String CLOSING_SQUARE_BRACKET = "]";
	
	private static final String DOUBLE_QUOTE = "\"";
	private static final String BACKTICK = "`";
	
	private static final String KEY_VALUE_SEPARATOR = ": ";
	private static final String PROPERTY_SEPARATOR = ", ";
	private static final String ARRAY_SEPARATOR = ", ";
	
	private Map<String, Object> properties;

	public Neo4jPropertiesMap()
	{
		this.properties = new HashMap<String, Object>();
	}
	
	public Neo4jPropertiesMap addProperty(String key, Object value)
	{
		properties.put(key, value);
		return this;
	}
	
	public String toJson()
	{
		String json = properties.entrySet().stream()
			.map(e -> {
				if (e.getValue() instanceof String)
					// `key`: \"value\"
					return BACKTICK + e.getKey() + BACKTICK + KEY_VALUE_SEPARATOR + DOUBLE_QUOTE + ((String)e.getValue()).replace("\"", "\\\"") + DOUBLE_QUOTE;
				else if (e.getValue().getClass().isArray())
					// `key`: [value1, value2]
					return BACKTICK + e.getKey() + BACKTICK + KEY_VALUE_SEPARATOR + OPENING_SQUARE_BRACKET + SPACE + arrayToJson((Object[]) e.getValue()) + SPACE +  CLOSING_SQUARE_BRACKET;
				else 
					// `key`: value
					return BACKTICK + e.getKey() + BACKTICK + KEY_VALUE_SEPARATOR + e.getValue();
			}) .collect(Collectors.joining(PROPERTY_SEPARATOR));
		
		return "{ " + json + " }";
	}

	private String arrayToJson(Object[] value)
	{
		if (value.length > 0)
		{
			if (value[0] instanceof String)
			{
				// `key`: [\"value1\", \"value2\"]
				return Stream.of(value).map(v -> DOUBLE_QUOTE + v.toString().replace("\"", "\\\"") + DOUBLE_QUOTE).collect(Collectors.joining(ARRAY_SEPARATOR));
			}
		}

		// `key`: [value1, value2]
		return Stream.of(value).map(v -> v.toString()).collect(Collectors.joining(ARRAY_SEPARATOR));
	}
}
