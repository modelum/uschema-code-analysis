package es.um.nosql.code.s13e.transfs.dboschema2text.duplication.transf.main

import es.um.nosql.code.s13e.transfs.dboschema2text.duplication.transf.Dboschema2text

class Dboschema2textMain 
{
	def static void main(String[] args) 
	{
		var dboschema2text = new Dboschema2text()
		dboschema2text.dboschema2text("./inputs/dboSchemaModel.xmi", "./outputs")
	}
	
}