package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.test;

import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.CodeGraph2DBOSchema;

public class CodeGraph2DBOSchemaTest
{
	public static void main(String[] args)
	{
		CodeGraph2DBOSchema codeGraph2DBOSchema = new CodeGraph2DBOSchema();
		codeGraph2DBOSchema.codeGraph2DBOSchema("./inputs/codeGraphModel.xmi", "./outputs/dboSchemaModel.xmi");
		
		System.out.println("End");
	}
	
	
}
