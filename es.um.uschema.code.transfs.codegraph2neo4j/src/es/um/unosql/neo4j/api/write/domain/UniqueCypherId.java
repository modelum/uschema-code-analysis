package es.um.unosql.neo4j.api.write.domain;

public class UniqueCypherId
{
	private static UniqueCypherId instance;
	private long id;
	
	private UniqueCypherId() { }
	
	public static UniqueCypherId getInstance()
	{
		if (instance == null)
			instance = new UniqueCypherId();
		
		return instance;
	}
	
	public Long getNextId()
	{
		return (++id);
	}
	
}
