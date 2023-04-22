package es.um.unosql.neo4j.api.write.database.connection;

import java.util.List;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Config;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Logging;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;

public class Neo4jDatabase implements AutoCloseable
{
	private static final boolean DEBUG = false;
	
	private Driver driver;

	public Neo4jDatabase(String uri) {
		this.driver = GraphDatabase.driver(uri, AuthTokens.none(),
				Config.builder().withLogging(Logging.none()).withoutEncryption().build());
	}

	public Neo4jDatabase(String uri, String user, String pass) {
		this.driver = GraphDatabase.driver(uri, AuthTokens.basic(user, pass),
				Config.builder().withLogging(Logging.none()).withoutEncryption().build());
	}
	
	public Driver getDriver() {
		return driver;
	}

	public void pushInto(List<String> cypherList)
	{
		if (DEBUG) {	
			dropData();
		}
		
		for (String query : cypherList) {
			try (Session session = driver.session()) {
				session.run(query);
		    	session.close();
		    }
		}
	
	}

	public void insertGraph(List<String> cypherList)
	{
		try (Session session = driver.session()) {
			Transaction transaction = session.beginTransaction();
			int queriesExectued = 0;
			for (String query : cypherList) {
				transaction.run(query);
				queriesExectued++;
				
				if (queriesExectued >= 100) {
					transaction.commit();
					transaction.close();
					transaction = session.beginTransaction();
					queriesExectued = 0;
				}
			}
			
			transaction.commit();
			transaction.close();
	    	session.close();
	    }
	}

	public void dropData() {
		try (Session session = driver.session()) {
			session.run("MATCH (n) DETACH DELETE n");
			session.close();
		}
	}
	
	@Override
	public void close() {
		driver.close();
	}
}
