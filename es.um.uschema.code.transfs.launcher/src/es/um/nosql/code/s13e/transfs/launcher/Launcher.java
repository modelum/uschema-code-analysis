package es.um.nosql.code.s13e.transfs.launcher;

import java.io.File;
import java.io.IOException;

import es.um.nosql.code.s13e.transfs.code2codegraph.transf.Code2CodeGraph;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.CodeGraph2DBOSchema;
import es.um.nosql.code.s13e.transfs.code2text.javascript.transf.Code2Text;
import es.um.nosql.code.s13e.transfs.codegraph2neo4j.transf.CodeGraph2Neo4j;
import es.um.nosql.code.s13e.transfs.dboschema2code.transf.DboSchema2Code;
import es.um.nosql.code.s13e.transfs.dboschema2text.duplication.transf.Dboschema2text;
import es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.DboSchema2uNoSQLSchema;
import es.um.nosql.code.s13e.transfs.json2code.transf.JsonReader2Code;
import es.um.nosql.code.s13e.transfs.text2json.transf.TextReader2Json;

public class Launcher
{
	private static final String NEO4J_PASSWORD = "test";
	private static final String NEO4J_USER = "neo4j";
	private static final String NEO4J_URI = "bolt://localhost:7687";
	
	private static final String USER_DIR = System.getProperty("user.dir");

	private static final String INPUTS_FOLDER = "/inputs/";
	private static final String OUTPUTS_FOLDER = "/outputs/";
	private static final String JSONS_FOLDER = OUTPUTS_FOLDER + "json/";
	private static final String CODE_FOLDER = OUTPUTS_FOLDER + "code/";
	private static final String CODE_GRAPH_FOLDER = OUTPUTS_FOLDER + "codeGraph/";
	private static final String DBOSCHEMA_FOLDER = OUTPUTS_FOLDER + "dboSchema/";
	private static final String NOSQLSCHEMA_MODEL_FOLDER = OUTPUTS_FOLDER + "nosqlschema/";
	private static final String DUPLICATION_UPDATES_FOLDER = OUTPUTS_FOLDER + "duplication/updates";
	private static final String REWRITE_FOLDER = OUTPUTS_FOLDER + "rewrite/";
	private static final String REWRITTEN_CODE_FOLDER = "text/";
	
	private static final String CODE_MODEL_NAME = "codeModel.xmi";
	private static final String CODE_GRAPH_MODEL_NAME = "codeGraphModel.xmi";
	private static final String DBOSCHEMA_MODEL_NAME = "dboSchemaModel.xmi";
	private static final String NOSQLSCHEMA_MODEL_NAME = "noSQLSchemaModel.xmi";
	private static final String CODE_REWRITTEN_MODEL_XMI = "codeRewrittenModel.xmi";

	private static final String CODE_TEXT_FOLDER = OUTPUTS_FOLDER + "tests/code/";
	private static final String NEO4J_SCRIPT = OUTPUTS_FOLDER + "tests/codeGraph/neo4j/neo4j.script";

	private static final boolean DEBUG = true;


	private int transformationNumber;

	public static void main(String[] args) throws IOException
	{
		Launcher launcher = new Launcher();

		launcher.deleteFolder(new File("." + OUTPUTS_FOLDER));
		launcher.javascript2json(USER_DIR + INPUTS_FOLDER, USER_DIR + JSONS_FOLDER);

		launcher.json2code(USER_DIR + JSONS_FOLDER, USER_DIR + CODE_FOLDER);

		if (DEBUG)
			launcher.code2text(USER_DIR + CODE_FOLDER, USER_DIR + CODE_TEXT_FOLDER);

		launcher.code2codeGraph(USER_DIR + CODE_FOLDER + CODE_MODEL_NAME, USER_DIR + CODE_GRAPH_FOLDER + CODE_GRAPH_MODEL_NAME);

		if (DEBUG)
			launcher.codeGraph2neo4j(USER_DIR + CODE_GRAPH_FOLDER + CODE_GRAPH_MODEL_NAME, USER_DIR + NEO4J_SCRIPT);

		launcher.codeGraph2dboSchema(USER_DIR + CODE_GRAPH_FOLDER + CODE_GRAPH_MODEL_NAME, USER_DIR + DBOSCHEMA_FOLDER + DBOSCHEMA_MODEL_NAME);
		
		launcher.dboSchema2uNoSQLSchema(USER_DIR + DBOSCHEMA_FOLDER + DBOSCHEMA_MODEL_NAME, USER_DIR + NOSQLSCHEMA_MODEL_FOLDER + NOSQLSCHEMA_MODEL_NAME);

		launcher.dboSchema2updateText(USER_DIR + DBOSCHEMA_FOLDER + DBOSCHEMA_MODEL_NAME, USER_DIR + DUPLICATION_UPDATES_FOLDER);

		launcher.dboSchema2rewriteCodeText(USER_DIR + DBOSCHEMA_FOLDER + DBOSCHEMA_MODEL_NAME, USER_DIR + REWRITE_FOLDER + CODE_REWRITTEN_MODEL_XMI, USER_DIR + REWRITE_FOLDER + REWRITTEN_CODE_FOLDER);

		System.out.println("\nFinished\n");
	}

	public void deleteFolder(File folder) throws IOException
	{
		File[] files = folder.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) {
					deleteFolder(f);
				} else {
					f.delete();
				}
			}
		}
		folder.delete();
	}

	private void javascript2json(String inputsLocation, String outputsLocation) throws IOException
	{
		System.out.println(++transformationNumber + ".-\tExecuting JavaScriptText2Json");

		TextReader2Json text2Json = new TextReader2Json();
		text2Json.javascript2json(inputsLocation, outputsLocation);

		System.out.println("\tJson files created at: " + outputsLocation);
	}

	private void json2code(String inputsLUri, String outputUri)
	{
		System.out.println(++transformationNumber + ".-\tExecuting json2code");

		JsonReader2Code jsonReader2Code = new JsonReader2Code();
		jsonReader2Code.json2Code(inputsLUri, outputUri);

		System.out.println("\tCode model created at: " + outputUri);
	}

	private void code2text(String inputUri, String outputUri)
	{
		System.out.println(" TEST: " + transformationNumber + ".-\tExecuting code2text");

		Code2Text code2Text = new Code2Text();
		code2Text.code2text(inputUri, outputUri);

		System.out.println("\tText code output created at: " + outputUri);
	}

	private void code2codeGraph(String inputsLUri, String outputUri)
	{
		System.out.println(++transformationNumber + ".-\tExecuting code2codeGraph");

		Code2CodeGraph code2codeGraph = new Code2CodeGraph();
		code2codeGraph.code2codeGraph(inputsLUri, outputUri);

		System.out.println("\tCodeGraph model created at: " + outputUri);
	}

	private void codeGraph2neo4j(String inputUri, String outputUri)
	{
		System.out.println(" TEST: " + transformationNumber + ".-\tExecuting codeGraph2neo4j");

		CodeGraph2Neo4j codeGraph2Neo4j = new CodeGraph2Neo4j();
		codeGraph2Neo4j.codeGraph2neo4j(inputUri);
		try
		{
			codeGraph2Neo4j.printToFile(outputUri);
			System.out.println("\tNeo4j text script created at: " + outputUri);
		} catch (IOException e)
		{
			System.err.println("\tUnable to create text script at: " + outputUri + " \n\tReason: " + e.getLocalizedMessage());
		}
		
		try 
		{
			codeGraph2Neo4j.printToNeo4j(NEO4J_URI, NEO4J_USER, NEO4J_PASSWORD);
			System.out.println("\tCode graphs inserted at [" + NEO4J_URI + "]");
		} catch (Exception e)
		{
			System.err.println("\tUnable to insert grahps into the database. \n\tReason: " + e.getLocalizedMessage());
		}
	
	}

	private void codeGraph2dboSchema(String inputUri, String outputUri)
	{
		System.out.println(++transformationNumber + ".-\tExecuting codeGraph2databaseOperationsSchema");

		CodeGraph2DBOSchema codeGraph2DBOSchema = new CodeGraph2DBOSchema();
		codeGraph2DBOSchema.codeGraph2DBOSchema(inputUri, outputUri);

		System.out.println("\tDatabaseOperationsSchema model created at: " + outputUri);
	}

	private void dboSchema2uNoSQLSchema(String inputUri, String outputUri)
	{
		System.out.println(++transformationNumber + ".-\tExecuting dboSchema2uNoSQLSchema");

		DboSchema2uNoSQLSchema dboSchema2uNoSQLSchema = new DboSchema2uNoSQLSchema();
		dboSchema2uNoSQLSchema.dboSchema2uNoSQLSchema(inputUri, outputUri);
		
		System.out.println("\tuNoSQLSchema model created at: " + outputUri);
	}

	private void dboSchema2updateText(String inputUri, String outputUri)
	{
		System.out.println(++transformationNumber + ".-\tExecuting dboSchema2updateText");

		Dboschema2text dboschema2text = new Dboschema2text();
		dboschema2text.dboschema2text(inputUri, outputUri);
		
		System.out.println("\tDuplication update code generated at: " + outputUri);
	}

	private void dboSchema2rewriteCodeText(String inputUri, String modelOutputUri, String outputUri)
	{
		System.out.println(++transformationNumber + ".-\tExecuting dboSchema2rewriteCodeText");

		DboSchema2Code dboSchema2Code = new DboSchema2Code();
		dboSchema2Code.dboSchema2code(inputUri, modelOutputUri, outputUri);
		
		System.out.println("\tCode rewritten at: " + outputUri);
	}
	
	
	
}
