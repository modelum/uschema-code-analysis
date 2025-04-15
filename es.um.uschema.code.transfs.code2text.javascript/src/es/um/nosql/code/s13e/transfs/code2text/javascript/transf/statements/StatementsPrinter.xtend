package es.um.nosql.code.s13e.transfs.code2text.javascript.transf.statements

import es.um.uschema.code.metamodels.code.Assign
import es.um.uschema.code.metamodels.code.Break
import es.um.uschema.code.metamodels.code.Call
import es.um.uschema.code.metamodels.code.CallableBlock
import es.um.uschema.code.metamodels.code.Case
import es.um.uschema.code.metamodels.code.CaseType
import es.um.uschema.code.metamodels.code.Catch
import es.um.uschema.code.metamodels.code.Code
import es.um.uschema.code.metamodels.code.CodeBlock
import es.um.uschema.code.metamodels.code.CodeBlockType
import es.um.uschema.code.metamodels.code.ConditionalExpression
import es.um.uschema.code.metamodels.code.DataContainer
import es.um.uschema.code.metamodels.code.DataProducer
import es.um.uschema.code.metamodels.code.Expression
import es.um.uschema.code.metamodels.code.Literal
import es.um.uschema.code.metamodels.code.Loop
import es.um.uschema.code.metamodels.code.LoopPart
import es.um.uschema.code.metamodels.code.LoopPartType
import es.um.uschema.code.metamodels.code.LoopType
import es.um.uschema.code.metamodels.code.NewArray
import es.um.uschema.code.metamodels.code.NewDataContainer
import es.um.uschema.code.metamodels.code.Operation
import es.um.uschema.code.metamodels.code.Parameter
import es.um.uschema.code.metamodels.code.Property
import es.um.uschema.code.metamodels.code.PropertyAccess
import es.um.uschema.code.metamodels.code.PropertyAssign
import es.um.uschema.code.metamodels.code.Return
import es.um.uschema.code.metamodels.code.Selection
import es.um.uschema.code.metamodels.code.SelectionType
import es.um.uschema.code.metamodels.code.Statement
import es.um.uschema.code.metamodels.code.Throw
import es.um.uschema.code.metamodels.code.Try
import es.um.uschema.code.metamodels.code.UnaryOperation
import es.um.uschema.code.metamodels.code.UnaryOperationType
import es.um.uschema.code.metamodels.code.Variable
import es.um.uschema.code.metamodels.code.VariableAccess
import es.um.uschema.code.metamodels.code.VariableDeclaration
import java.util.List
import java.util.stream.Collectors
import org.eclipse.emf.common.util.EList
import es.um.uschema.code.metamodels.code.NewClass
import es.um.uschema.code.metamodels.code.Argument
import es.um.uschema.code.metamodels.code.This
import es.um.uschema.code.metamodels.code.CodeContainer
import es.um.uschema.code.metamodels.code.IndexBasedAccess
import es.um.uschema.code.metamodels.code.UnaryExpression
import es.um.uschema.code.metamodels.code.Finally

class StatementsPrinter {
	
	def String generateStatements(CodeBlock codeBlock)
	{
		'''
		«FOR statement : codeBlock.statements»
			«generateStatement(statement)»«IF semicolonNeeded(statement)»;«ENDIF»
		«ENDFOR»
		'''
	}	
	
	def boolean semicolonNeeded(Statement statement)
	{
		if (statement instanceof Loop)
		{
			if (!LoopType.DO_WHILE.equals(statement.type))
				return false
		} else if (statement instanceof Selection || statement instanceof Try)
		{
			return false
		}
		
		return true
	}
	
	/** 
	 * Process Body
	 */
	def String generateStatements(List<Statement> statements)
		'''
		«FOR statement : statements»
			«generateStatement(statement)»«IF semicolonNeeded(statement)»;«ENDIF»
		«ENDFOR»
		'''
	
	def String generateStatements(List<Statement> statements, String separator)
		'''«FOR statement : statements SEPARATOR separator»«generateStatement(statement)»«ENDFOR»'''
	
	/** 
	 * Parameter List of a Function
	 */
	def String createParametersList(List<Parameter> parameterlist)
	{
		return parameterlist.stream().map([name]).collect(Collectors.joining(", "))
	}
	
	/** 
	 * Unary Operations
	 */
	def dispatch String generateStatement(UnaryOperation unaryOperation) 
	{
		if (unaryOperation.type.equals(UnaryOperationType.POST_MINUSMINUS)) {
			return '''«unaryOperation.variable.name»--'''
		} else if (unaryOperation.type.equals(UnaryOperationType.POST_PLUSPLUS)) {
			return '''«unaryOperation.variable.name»++'''
		} else if (unaryOperation.type.equals(UnaryOperationType.PRE_MINUSMINUS)) {
			return '''--«unaryOperation.variable.name»'''
		} else if (unaryOperation.type.equals(UnaryOperationType.PRE_PLUSPLUS)) {
			return '''++«unaryOperation.variable.name»'''
		}  
	}
	
	/** 
	 * Functions
	 */
	def dispatch String generateStatement(CallableBlock callableBlock) 
	{
		if (CodeBlockType.FUNCTION.equals(callableBlock.codeBlockType))
			generateFunction(callableBlock)
		else if (CodeBlockType.LAMBDA.equals(callableBlock.codeBlockType))
			generateLambda(callableBlock)
			
	}
	
	def String generateFunction(CallableBlock callableBlock) 
		'''
		function«generateFunctionName(callableBlock)»(«createParametersList(callableBlock.parameters)») {
			«generateStatements(callableBlock.statements)»
		}'''

	def String generateFunctionName(CallableBlock callableBlock) {
		if (callableBlock.functionName !== null && !callableBlock.functionName.isEmpty)
			''' «callableBlock.functionName»'''
		else
			''''''
	}

	def String generateLambda(CallableBlock callableBlock) 
		'''
		(«createParametersList(callableBlock.parameters)») => {
			«generateStatements(callableBlock.statements)»
		}'''
	
	/** 
	 * Arrays
	 */
	def dispatch String generateStatement(NewArray newArray) 
		'''
		[
			«FOR dp : newArray.dataProducer SEPARATOR ',\n'»«generateStatement(dp)»«ENDFOR»
		]'''
		
	def dispatch String generateStatement(IndexBasedAccess indexBasedAccess) 
		'''«generateStatement(indexBasedAccess.dataProducer)»[«generateStatement(indexBasedAccess.index)»]'''
		
	/** 
	 * New Class
	 */
	def dispatch String generateStatement(NewClass newClass) 
		'''new «newClass.codeContainer.name»(«generateArguments(newClass.arguments)»)'''
			
	/** 
	 * Objects
	 */
	def dispatch String generateStatement(NewDataContainer newDataContainer) 
		'''
		{
			«FOR p : newDataContainer.dataContainer.properties SEPARATOR ',\n'»«generateProperty(p)»«ENDFOR»
		}'''

	def dispatch String generateProperty(DataContainer dataContainer)
		'''
		«dataContainer.name»: {
			«FOR p : dataContainer.properties SEPARATOR ',\n'»«generateProperty(p)»«ENDFOR»
		}'''

	def dispatch String generateProperty(^Property property)
		'''«property.name»: «generateStatement(property.initialization)»'''
	
	/** 
	 * Selection
	 */
	def dispatch String generateStatement(Selection selection) {
		if (selection.type == SelectionType.^IF)
			processIfStatement(selection)
		else if (selection.type == SelectionType.SWITCH)
			processSwitchStatement(selection)
	}
	
	def String processIfStatement(Selection selection) {
		'''
		«FOR caseStatement : selection.^case»
		«generateIfCaseExpression(caseStatement)»
		{
			«generateStatements(caseStatement.codeBlock.statements)»
		}
		«ENDFOR»
		'''
	}
	
	def String generateIfCaseExpression(Case caseStatement)
	{
		var String caseType = caseStatement.type.literal.toLowerCase.replace("_", " ")
		if (CaseType.^ELSE.equals(caseStatement.type))
			return caseType

		return '''«caseType» («generateStatement(caseStatement.conditionalExpression)»)'''
	}
	
	def String processSwitchStatement(Selection selection) {
		'''
		switch («getSwitchDiscriminantVariable(selection)»)
		{
		«FOR caseStatement : selection.^case»
		«generateSwitchCaseExpression(caseStatement)»:
			«generateStatements(caseStatement.codeBlock.statements)»
		«ENDFOR»
		}'''
	}
	
	def String getSwitchDiscriminantVariable(Selection selection) {
		var Case caseStatement = selection.^case.findFirst[c | c.conditionalExpression.size == 1]
		
		var ConditionalExpression cond = caseStatement.conditionalExpression.get(0)		
		if (cond instanceof Expression)
		{
			if (cond.conditionalExpression.size() == 2)
			{
				var ConditionalExpression expr = cond.conditionalExpression.get(0)
				if (expr instanceof VariableAccess)
					return expr.variable.name
			}
		}
		
		""
	}
	
	def String generateSwitchCaseExpression(Case caseStatement)
	{
		if (CaseType.^DEFAULT.equals(caseStatement.type))
			return "default"

		'''case «getCaseLiteral(caseStatement)»'''
	}
	
	def String getCaseLiteral(Case caseStatement) {
		if (caseStatement.conditionalExpression.size() == 1)
		{
			var ConditionalExpression cond = caseStatement.conditionalExpression.get(0)
			if (cond instanceof Expression)
			{
				if (cond.conditionalExpression.size() == 2)
				{
					var ConditionalExpression expr = cond.conditionalExpression.get(1)
					if (expr instanceof Literal)
						return expr.literal
				}
			}
		}
		
		""
	}
	
	/** 
	 * Loops
	 */
	def dispatch generateStatement(Loop loop) {
		if (LoopType.^FOR.equals(loop.type))
			return generateFor(loop)
		else if (LoopType.WHILE.equals(loop.type))
			return generateWhile(loop)
		else if (LoopType.DO_WHILE.equals(loop.type))
			return generateDoWhile(loop)
	}
	
	def String generateFor(Loop loop)
		'''
		for («getLoopPart(loop.loopPart, LoopPartType.INITIALIZATION)
		»; «getLoopPart(loop.loopPart, LoopPartType.CONDITION)
		»; «getLoopPart(loop.loopPart, LoopPartType.UPDATER)»)
		{
			«generateStatements(loop.codeBlock.statements)»
		}'''
	
	def String generateWhile(Loop loop)
		'''
		while («getLoopPart(loop.loopPart, LoopPartType.CONDITION)»)
		{
			«generateStatements(loop.codeBlock.statements)»
		}'''
	
	def String generateDoWhile(Loop loop)
		'''
		do
		{
			«generateStatements(loop.codeBlock.statements)»
		}
		while («getLoopPart(loop.loopPart, LoopPartType.CONDITION)»)'''
	
	
	def String getLoopPart(EList<LoopPart> loopParts, LoopPartType loopPartType)
	{
		var List<Statement> statements = loopParts
			.filter[lp | lp.type.equals(loopPartType)]
			.flatMap[lp | lp.statement].toList
			
		return generateStatements(statements, "")
	}
	
	/** 
	 * Break
	 */
	def dispatch String generateStatement(Break break)
		'''break'''
	
	/** 
	 * Expressions
	 */
	def dispatch String generateStatement(Expression expression) {
		'''«generateStatement(expression.conditionalExpression.get(0))» «expression.type» «generateStatement(expression.conditionalExpression.get(1))»'''
	}
	
	/** 
	 * UnaryExpression
	 */
	def dispatch String generateStatement(UnaryExpression unaryExpression) {
		if (unaryExpression.type == "pre")
		{
			return '''«unaryExpression.operator»«generateStatement(unaryExpression.dataProducer)»'''
		}
		return '''«generateStatement(unaryExpression.dataProducer)»«unaryExpression.operator»'''
	}
	
	/** 
	 * Assign
	 */
	def dispatch String generateStatement(Assign assign)
		'''«generateStatement(assign.variable)» «assign.type» «generateStatement(assign.inputs)»'''
	
	def dispatch String generateStatement(Variable variable)
		'''«variable.name»'''
		
	def dispatch String generateStatement(PropertyAssign propertyAssign)
		'''«generateStatement(propertyAssign.variable)»«generateStatement(propertyAssign.property)» «propertyAssign.type» «generateStatement(propertyAssign.inputs)»'''
	
	/** 
	 * Variable Declaration
	 */
	def dispatch String generateStatement(VariableDeclaration variableDeclaration) 
	{
	    '''«variableDeclaration.kind» «variableDeclaration.variable.name»«
		IF variableDeclaration.initialization !== null» = «generateStatement(variableDeclaration.initialization)
		»«ENDIF»'''
	}
	
	/** 
	 * Return
	 */
	def dispatch String generateStatement(Return returnStatement)
		'''return «generateStatement(returnStatement.dataProducers)»'''
	
	/** 
	 * Call
	 */
	def dispatch String generateStatement(Call callStatement)
	{	
		if (callStatement.dataProducer !== null)
			'''«generateStatement(callStatement.dataProducer)»(«generateArguments(callStatement.arguments)»)'''
		else
		{
			var String functionName = callStatement.name
			if (callStatement.callableBlock !== null)
				functionName = callStatement.callableBlock.name
				
			'''«functionName»(«generateArguments(callStatement.arguments)»)'''
		}
	}
		
	def String generateArguments(EList<Argument> arguments)
		'''«FOR a : arguments SEPARATOR ', '»«generateStatement(a.dataProducer)»«ENDFOR»'''
		
	
	/** 
	 * DataProducers
	 */
	def dispatch String generateStatement(EList<DataProducer> dataProducers) 
	{
		String.join("", dataProducers.map[generateStatement])
	}
	
	/** 
	 * Variable Read
	 */
	def dispatch String generateStatement(VariableAccess variableAccess)
		'''«variableAccess.variable.name»'''
		
	def dispatch String generateStatement(Property property)
	{
		var parent = property.eContainer
		if (parent instanceof Code || parent instanceof CodeContainer)
			return ""
			
		return '''«generateStatement(parent)».«property.name»'''
	}
	
	def dispatch String generateStatement(PropertyAccess propertyAccess)
	{
		if (propertyAccess.nextAccess !== null)
			'''«generateStatement(propertyAccess.nextAccess)».«propertyAccess.name»'''
		else
			'''«generateStatement(propertyAccess.dataProducer)».«propertyAccess.name»'''
	}
	
	/** 
	 * Simple Operation
	 */
	def dispatch String generateStatement(Operation operation)
		'''«generateStatement(operation.dataProducers.get(0))» «operation.type» «generateStatement(operation.dataProducers.get(1))»'''
	
	/** 
	 * Literal
	 */
	def dispatch String generateStatement(Literal literal)
		'''«literal.literal»'''
	/** 
	 * Literal
	 */
	def dispatch String generateStatement(This thisStatement)
		'''this'''
	/** 
	 * Exceptions
	 */
	def dispatch String generateStatement(Throw throwStatement)
		'''throw «generateStatement(throwStatement.dataProducer)»'''
		
	/** 
	 * Try
	 */
	def dispatch String generateStatement(Try tryStatement) 
		'''
		try 
		{
			«generateStatements(tryStatement.codeBlock)»
		} «FOR c : tryStatement.catchs»«generateStatement(c)»«ENDFOR
		»«IF tryStatement.^finally !== null»«generateStatement(tryStatement.^finally)»«ENDIF»'''
		
	
	/** 
	 * Catch
	 */
	def dispatch String generateStatement(Catch catchStatement) 
		'''
		catch («generateStatement(catchStatement.dataProducer)»)
		{
			«generateStatements(catchStatement.codeBlock)»
		} '''
		
	/** 
	 * Catch
	 */
	def dispatch String generateStatement(Finally finallyStatement) 
		'''
		finally
		{
			«generateStatements(finallyStatement.codeBlock)»
		}'''
}