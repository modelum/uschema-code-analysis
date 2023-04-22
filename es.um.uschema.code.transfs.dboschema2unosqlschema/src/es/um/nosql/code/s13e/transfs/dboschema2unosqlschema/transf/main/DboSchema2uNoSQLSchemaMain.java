package es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.main;

import es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.DboSchema2uNoSQLSchema;

public class DboSchema2uNoSQLSchemaMain
{
	public static void main(String[] args)
	{
		new DboSchema2uNoSQLSchema().dboSchema2uNoSQLSchema("./inputs/dboSchemaModel.xmi", "./outputs/noSQLSchemaModel.xmi");
	}
}
