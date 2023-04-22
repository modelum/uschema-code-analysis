package es.um.nosql.code.s13e.transfs.dboschema2code.transf.main;

import es.um.nosql.code.s13e.transfs.dboschema2code.transf.DboSchema2Code;

public class DboSchema2CodeMain
{
	public static void main(String[] args)
	{
		DboSchema2Code dboSchema2Code = new DboSchema2Code();
		dboSchema2Code.dboSchema2code("./inputs/dboSchemaModel.xmi", "./outputs/rewrittenCodeModel.xmi", System.getProperty("user.dir") + "/outputs/rewrittenCode/");
	}
}
