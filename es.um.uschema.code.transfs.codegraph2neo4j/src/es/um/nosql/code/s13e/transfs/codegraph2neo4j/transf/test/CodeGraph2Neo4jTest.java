package es.um.nosql.code.s13e.transfs.codegraph2neo4j.transf.test;

import es.um.nosql.code.s13e.transfs.codegraph2neo4j.transf.CodeGraph2Neo4j;

public class CodeGraph2Neo4jTest {

	public static void main(String[] args) {
		CodeGraph2Neo4j codeGraph2neo4j = new CodeGraph2Neo4j();
		codeGraph2neo4j.codeGraph2neo4j("inputs/codeGraphModel.xmi");
		
		System.out.println(codeGraph2neo4j.getScript().toString());
	}
	
}
