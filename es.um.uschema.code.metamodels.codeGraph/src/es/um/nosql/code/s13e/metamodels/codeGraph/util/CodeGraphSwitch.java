/**
 */
package es.um.nosql.code.s13e.metamodels.codeGraph.util;

import es.um.nosql.code.s13e.metamodels.codeGraph.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage
 * @generated
 */
public class CodeGraphSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodeGraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGraphSwitch()
	{
		if (modelPackage == null) {
			modelPackage = CodeGraphPackage.eINSTANCE;
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
			case CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH: {
				CallableBlockSubGraph callableBlockSubGraph = (CallableBlockSubGraph)theEObject;
				T result = caseCallableBlockSubGraph(callableBlockSubGraph);
				if (result == null) result = caseCodeSubGraph(callableBlockSubGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseGraphPart(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseGraphPart(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.CODE_GRAPH: {
				CodeGraph codeGraph = (CodeGraph)theEObject;
				T result = caseCodeGraph(codeGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.EDGE_CALL: {
				EdgeCall edgeCall = (EdgeCall)theEObject;
				T result = caseEdgeCall(edgeCall);
				if (result == null) result = caseEdge(edgeCall);
				if (result == null) result = caseGraphPart(edgeCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.GRAPH_PART: {
				GraphPart graphPart = (GraphPart)theEObject;
				T result = caseGraphPart(graphPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.EXPRESSION_EDGE: {
				ExpressionEdge expressionEdge = (ExpressionEdge)theEObject;
				T result = caseExpressionEdge(expressionEdge);
				if (result == null) result = caseEdge(expressionEdge);
				if (result == null) result = caseGraphPart(expressionEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.CODE_SUB_GRAPH: {
				CodeSubGraph codeSubGraph = (CodeSubGraph)theEObject;
				T result = caseCodeSubGraph(codeSubGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CodeGraphPackage.CODE_BLOCK_SUB_GRAPH: {
				CodeBlockSubGraph codeBlockSubGraph = (CodeBlockSubGraph)theEObject;
				T result = caseCodeBlockSubGraph(codeBlockSubGraph);
				if (result == null) result = caseCodeSubGraph(codeBlockSubGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable Block Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable Block Sub Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallableBlockSubGraph(CallableBlockSubGraph object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeGraph(CodeGraph object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeCall(EdgeCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphPart(GraphPart object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionEdge(ExpressionEdge object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Sub Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSubGraph(CodeSubGraph object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block Sub Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlockSubGraph(CodeBlockSubGraph object)
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

} //CodeGraphSwitch
