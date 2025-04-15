package es.um.nosql.code.s13e.transfs.code2text.javascript.transf.containers

import es.um.uschema.code.metamodels.code.CallableBlock
import es.um.uschema.code.metamodels.code.CodeBlock
import es.um.uschema.code.metamodels.code.CodeBlockType
import es.um.uschema.code.metamodels.code.CodeContainer
import es.um.uschema.code.metamodels.code.Container
import es.um.uschema.code.metamodels.code.ContainerType
import es.um.nosql.code.s13e.transfs.code2text.javascript.transf.statements.StatementsPrinter
import java.io.File
import java.io.FileWriter
import java.util.List
import es.um.uschema.code.metamodels.code.CodeContainerType

class CodeContainerPrinter {
	
	def void processContainers(List<Container> containers, File dir) 
	{
		for (Container container : containers) {
			var file = null as File
			if (container.type.equals(ContainerType.FOLDER)) {
				file = new File(dir.absoluteFile + "/" + container.name)
				file.mkdirs
			} else if (container.type.equals(ContainerType.FILE)) {
				file = new File(dir.absoluteFile + "/" +  container.name + ".js")
				file.createNewFile
			}
			
			if (container.codeContainer.size > 0)
			{
				var FileWriter fileWriter = new FileWriter(file)
				for (CodeContainer codeContainer : container.codeContainer) 
				{
					fileWriter.append(
						processCodeContainer(codeContainer)
					)
				}
				fileWriter.close
			}
			if (container.subContainer.size > 0) {
				processContainers(container.subContainer, file)
			} 
			
		} 
	}
	
	def processCodeContainer(CodeContainer codeContainer)
	 {
		var String result = ""
		var StatementsPrinter statementsPrinter = new StatementsPrinter
		
		if (codeContainer.type.equals(CodeContainerType.CLASS))
		{
			result += 
				'''
				class «codeContainer.name»
				{
					«generateMethods(statementsPrinter, codeContainer)»
				}
				'''
		}
		else
		{
			var CodeBlock inlineCodeBlock = null;
			for (CodeBlock codeBlock : codeContainer.codeBlock) 
			{
				if (codeBlock.codeBlockType.equals(CodeBlockType.INLINE_CODE)) 
				{
					inlineCodeBlock = codeBlock;
				} else
				{
					result += processFunctionCodeBlock(codeBlock, statementsPrinter)
				} 
			}
			
			if (inlineCodeBlock !== null)
			{
				result += statementsPrinter.generateStatements(inlineCodeBlock)
			}
		}
		
		return result;
	}
	
	def generateMethods(StatementsPrinter statementsPrinter, CodeContainer codeContainer)
	{
		var String result = ""
		for (callableBlock : codeContainer.codeBlock) {
			if (callableBlock instanceof CallableBlock)
			{
				result +=
				'''
				«callableBlock.name»(«FOR p : callableBlock.parameters SEPARATOR ', '»«p.name»«ENDFOR»)
				{
					«statementsPrinter.generateStatements(callableBlock.statements)»
				}
				'''
			}
		}
		
		return result
	}
	
	def String processFunctionCodeBlock(CodeBlock codeBlock, StatementsPrinter statementsPrinter) {
		if (codeBlock instanceof CallableBlock)
		{
			return
			'''
			function «codeBlock.name»(«FOR p : codeBlock.parameters SEPARATOR ', '»«p.name»«ENDFOR»)
			{
				«statementsPrinter.generateStatements(codeBlock)»
			}
			'''
		}
	}
	
}