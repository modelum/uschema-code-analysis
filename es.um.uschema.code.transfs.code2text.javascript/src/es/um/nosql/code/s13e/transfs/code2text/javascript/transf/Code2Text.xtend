package es.um.nosql.code.s13e.transfs.code2text.javascript.transf

import es.um.uschema.code.metamodels.code.Code
import es.um.nosql.code.s13e.transfs.code2text.javascript.transf.containers.CodeContainerPrinter
import java.io.File
import es.um.uschema.code.metamodels.code.utils.CodeReader

class Code2Text {
	
	def code2text(String inputsUri, String outputsUri)
	{
		var inputFile = new File(inputsUri);
		if (inputFile.isDirectory) {
			for (File file : inputFile.listFiles()) {
				if (file.isFile) {
				 	var code = new CodeReader().readCodeModel(file.absolutePath)
				 	generateText(code, outputsUri)
				 }
			}
		}
	}

	def generateText(Code code, String outputsUri) 
	{
		var dir = new File(outputsUri)
		dir.mkdirs;
		new CodeContainerPrinter().processContainers(code.container, dir)
	}

}