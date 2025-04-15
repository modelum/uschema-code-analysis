/**
 */
package es.um.uschema.code.metamodels.code.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import es.um.uschema.code.metamodels.code.Argument;
import es.um.uschema.code.metamodels.code.Assign;
import es.um.uschema.code.metamodels.code.Assignable;
import es.um.uschema.code.metamodels.code.Break;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.Case;
import es.um.uschema.code.metamodels.code.Catch;
import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.CodeLocation;
import es.um.uschema.code.metamodels.code.CodePackage;
import es.um.uschema.code.metamodels.code.ConditionalExpression;
import es.um.uschema.code.metamodels.code.Constant;
import es.um.uschema.code.metamodels.code.Container;
import es.um.uschema.code.metamodels.code.DataContainer;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Expression;
import es.um.uschema.code.metamodels.code.Finally;
import es.um.uschema.code.metamodels.code.IndexBasedAccess;
import es.um.uschema.code.metamodels.code.Literal;
import es.um.uschema.code.metamodels.code.Loop;
import es.um.uschema.code.metamodels.code.LoopPart;
import es.um.uschema.code.metamodels.code.NewArray;
import es.um.uschema.code.metamodels.code.NewClass;
import es.um.uschema.code.metamodels.code.NewDataContainer;
import es.um.uschema.code.metamodels.code.Operation;
import es.um.uschema.code.metamodels.code.Parameter;
import es.um.uschema.code.metamodels.code.PrimitiveType;
import es.um.uschema.code.metamodels.code.Property;
import es.um.uschema.code.metamodels.code.PropertyAccess;
import es.um.uschema.code.metamodels.code.PropertyAssign;
import es.um.uschema.code.metamodels.code.Return;
import es.um.uschema.code.metamodels.code.Selection;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.This;
import es.um.uschema.code.metamodels.code.Throw;
import es.um.uschema.code.metamodels.code.Try;
import es.um.uschema.code.metamodels.code.Type;
import es.um.uschema.code.metamodels.code.UnaryExpression;
import es.um.uschema.code.metamodels.code.UnaryOperation;
import es.um.uschema.code.metamodels.code.Variable;
import es.um.uschema.code.metamodels.code.VariableAccess;
import es.um.uschema.code.metamodels.code.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.um.uschema.code.metamodels.code.CodePackage
 * @generated
 */
public class CodeSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSwitch()
	{
		if (modelPackage == null) {
			modelPackage = CodePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID) {
			case CodePackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_CONTAINER: {
				CodeContainer codeContainer = (CodeContainer)theEObject;
				T result = caseCodeContainer(codeContainer);
				if (result == null) result = caseType(codeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseVariable(property);
				if (result == null) result = caseStatement(property);
				if (result == null) result = caseDataProducer(property);
				if (result == null) result = caseAssignable(property);
				if (result == null) result = caseConditionalExpression(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseDataProducer(expression);
				if (result == null) result = caseAssignable(expression);
				if (result == null) result = caseConditionalExpression(expression);
				if (result == null) result = caseStatement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseDataProducer(operation);
				if (result == null) result = caseAssignable(operation);
				if (result == null) result = caseConditionalExpression(operation);
				if (result == null) result = caseStatement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseStatement(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseStatement(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_BLOCK: {
				CodeBlock codeBlock = (CodeBlock)theEObject;
				T result = caseCodeBlock(codeBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseDataProducer(variable);
				if (result == null) result = caseAssignable(variable);
				if (result == null) result = caseConditionalExpression(variable);
				if (result == null) result = caseStatement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.LOOP_PART: {
				LoopPart loopPart = (LoopPart)theEObject;
				T result = caseLoopPart(loopPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseVariable(parameter);
				if (result == null) result = caseDataProducer(parameter);
				if (result == null) result = caseAssignable(parameter);
				if (result == null) result = caseConditionalExpression(parameter);
				if (result == null) result = caseStatement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DATA_CONTAINER: {
				DataContainer dataContainer = (DataContainer)theEObject;
				T result = caseDataContainer(dataContainer);
				if (result == null) result = caseType(dataContainer);
				if (result == null) result = caseProperty(dataContainer);
				if (result == null) result = caseConditionalExpression(dataContainer);
				if (result == null) result = caseVariable(dataContainer);
				if (result == null) result = caseDataProducer(dataContainer);
				if (result == null) result = caseAssignable(dataContainer);
				if (result == null) result = caseStatement(dataContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.DATA_PRODUCER: {
				DataProducer dataProducer = (DataProducer)theEObject;
				T result = caseDataProducer(dataProducer);
				if (result == null) result = caseAssignable(dataProducer);
				if (result == null) result = caseConditionalExpression(dataProducer);
				if (result == null) result = caseStatement(dataProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CALLABLE_BLOCK: {
				CallableBlock callableBlock = (CallableBlock)theEObject;
				T result = caseCallableBlock(callableBlock);
				if (result == null) result = caseCodeBlock(callableBlock);
				if (result == null) result = caseVariable(callableBlock);
				if (result == null) result = caseDataProducer(callableBlock);
				if (result == null) result = caseAssignable(callableBlock);
				if (result == null) result = caseConditionalExpression(callableBlock);
				if (result == null) result = caseStatement(callableBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.EXCEPTION: {
				es.um.uschema.code.metamodels.code.Exception exception = (es.um.uschema.code.metamodels.code.Exception)theEObject;
				T result = caseException(exception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.THROW: {
				Throw throw_ = (Throw)theEObject;
				T result = caseThrow(throw_);
				if (result == null) result = caseStatement(throw_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.NEW_DATA_CONTAINER: {
				NewDataContainer newDataContainer = (NewDataContainer)theEObject;
				T result = caseNewDataContainer(newDataContainer);
				if (result == null) result = caseDataProducer(newDataContainer);
				if (result == null) result = caseAssignable(newDataContainer);
				if (result == null) result = caseConditionalExpression(newDataContainer);
				if (result == null) result = caseStatement(newDataContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseStatement(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ASSIGNABLE: {
				Assignable assignable = (Assignable)theEObject;
				T result = caseAssignable(assignable);
				if (result == null) result = caseStatement(assignable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseVariable(constant);
				if (result == null) result = caseDataProducer(constant);
				if (result == null) result = caseAssignable(constant);
				if (result == null) result = caseConditionalExpression(constant);
				if (result == null) result = caseStatement(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.INDEX_BASED_ACCESS: {
				IndexBasedAccess indexBasedAccess = (IndexBasedAccess)theEObject;
				T result = caseIndexBasedAccess(indexBasedAccess);
				if (result == null) result = caseDataProducer(indexBasedAccess);
				if (result == null) result = caseAssignable(indexBasedAccess);
				if (result == null) result = caseConditionalExpression(indexBasedAccess);
				if (result == null) result = caseStatement(indexBasedAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseStatement(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseDataProducer(literal);
				if (result == null) result = caseAssignable(literal);
				if (result == null) result = caseConditionalExpression(literal);
				if (result == null) result = caseStatement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.UNARY_OPERATION: {
				UnaryOperation unaryOperation = (UnaryOperation)theEObject;
				T result = caseUnaryOperation(unaryOperation);
				if (result == null) result = caseDataProducer(unaryOperation);
				if (result == null) result = caseAssignable(unaryOperation);
				if (result == null) result = caseConditionalExpression(unaryOperation);
				if (result == null) result = caseStatement(unaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.VARIABLE_ACCESS: {
				VariableAccess variableAccess = (VariableAccess)theEObject;
				T result = caseVariableAccess(variableAccess);
				if (result == null) result = caseDataProducer(variableAccess);
				if (result == null) result = caseAssignable(variableAccess);
				if (result == null) result = caseConditionalExpression(variableAccess);
				if (result == null) result = caseStatement(variableAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.TRY: {
				Try try_ = (Try)theEObject;
				T result = caseTry(try_);
				if (result == null) result = caseStatement(try_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CATCH: {
				Catch catch_ = (Catch)theEObject;
				T result = caseCatch(catch_);
				if (result == null) result = caseStatement(catch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseDataProducer(call);
				if (result == null) result = caseAssignable(call);
				if (result == null) result = caseConditionalExpression(call);
				if (result == null) result = caseStatement(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PROPERTY_ACCESS: {
				PropertyAccess propertyAccess = (PropertyAccess)theEObject;
				T result = casePropertyAccess(propertyAccess);
				if (result == null) result = caseDataProducer(propertyAccess);
				if (result == null) result = caseAssignable(propertyAccess);
				if (result == null) result = caseConditionalExpression(propertyAccess);
				if (result == null) result = caseStatement(propertyAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.PROPERTY_ASSIGN: {
				PropertyAssign propertyAssign = (PropertyAssign)theEObject;
				T result = casePropertyAssign(propertyAssign);
				if (result == null) result = caseAssign(propertyAssign);
				if (result == null) result = caseStatement(propertyAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.BREAK: {
				Break break_ = (Break)theEObject;
				T result = caseBreak(break_);
				if (result == null) result = caseStatement(break_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.NEW_ARRAY: {
				NewArray newArray = (NewArray)theEObject;
				T result = caseNewArray(newArray);
				if (result == null) result = caseDataProducer(newArray);
				if (result == null) result = caseAssignable(newArray);
				if (result == null) result = caseConditionalExpression(newArray);
				if (result == null) result = caseStatement(newArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.NEW_CLASS: {
				NewClass newClass = (NewClass)theEObject;
				T result = caseNewClass(newClass);
				if (result == null) result = caseDataProducer(newClass);
				if (result == null) result = caseAssignable(newClass);
				if (result == null) result = caseConditionalExpression(newClass);
				if (result == null) result = caseStatement(newClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.THIS: {
				This this_ = (This)theEObject;
				T result = caseThis(this_);
				if (result == null) result = caseVariable(this_);
				if (result == null) result = caseDataProducer(this_);
				if (result == null) result = caseAssignable(this_);
				if (result == null) result = caseConditionalExpression(this_);
				if (result == null) result = caseStatement(this_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseDataProducer(unaryExpression);
				if (result == null) result = caseAssignable(unaryExpression);
				if (result == null) result = caseConditionalExpression(unaryExpression);
				if (result == null) result = caseStatement(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.FINALLY: {
				Finally finally_ = (Finally)theEObject;
				T result = caseFinally(finally_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodePackage.CODE_LOCATION: {
				CodeLocation codeLocation = (CodeLocation)theEObject;
				T result = caseCodeLocation(codeLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeContainer(CodeContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlock(CodeBlock object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopPart(LoopPart object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataContainer(DataContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProducer(DataProducer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallableBlock(CallableBlock object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(es.um.uschema.code.metamodels.code.Exception object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrow(Throw object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Data Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Data Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewDataContainer(NewDataContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignable(Assignable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Based Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Based Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexBasedAccess(IndexBasedAccess object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperation(UnaryOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAccess(VariableAccess object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTry(Try object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatch(Catch object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAccess(PropertyAccess object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAssign(PropertyAssign object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreak(Break object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewArray(NewArray object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewClass(NewClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThis(This object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinally(Finally object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLocation(CodeLocation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //CodeSwitch
