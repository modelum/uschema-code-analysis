package es.um.nosql.code.s13e.transfs.codegraph2neo4j.transf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.utils.CodeGraphReader;
import es.um.unosql.neo4j.api.write.database.connection.Neo4jDatabase;

public class CodeGraph2Neo4j {

	private CodeGraphProcessor graphProcessor;
	
	public CodeGraph2Neo4j() {
		this.graphProcessor = new CodeGraphProcessor();
	}

	public void codeGraph2neo4j(String inputFileName) {
		CodeGraph application = new CodeGraphReader().readCodeGraphModel(inputFileName);
		graphProcessor.convertToCodeGrahps(application);
	}
	
	public String getScript() {
		return graphProcessor.generateCypherScriptAsString();
	}

	public void printToFile(String outputFileName) throws IOException {
		String dirPath = outputFileName.substring(0, outputFileName.lastIndexOf("/"));
		File file = new File(dirPath);
		file.mkdirs();
		
		FileWriter fileWriter = new FileWriter(new File(outputFileName));
		fileWriter.write(graphProcessor.generateCypherScriptAsString());
		fileWriter.close();
	}

	public void printToNeo4j(String uri, String user, String password) {
		Neo4jDatabase neo4jDatabase = new Neo4jDatabase(uri, user, password);
		neo4jDatabase.insertGraph(graphProcessor.generateCypherScript());
		neo4jDatabase.close();
	}
	
}
