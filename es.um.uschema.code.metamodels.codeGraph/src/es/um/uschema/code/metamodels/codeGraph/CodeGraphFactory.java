/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage
 * @generated
 */
public interface CodeGraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeGraphFactory eINSTANCE = es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Callable Block Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callable Block Sub Graph</em>'.
	 * @generated
	 */
	CallableBlockSubGraph createCallableBlockSubGraph();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Code Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Graph</em>'.
	 * @generated
	 */
	CodeGraph createCodeGraph();

	/**
	 * Returns a new object of class '<em>Edge Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Call</em>'.
	 * @generated
	 */
	EdgeCall createEdgeCall();

	/**
	 * Returns a new object of class '<em>Expression Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Edge</em>'.
	 * @generated
	 */
	ExpressionEdge createExpressionEdge();

	/**
	 * Returns a new object of class '<em>Code Block Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Block Sub Graph</em>'.
	 * @generated
	 */
	CodeBlockSubGraph createCodeBlockSubGraph();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodeGraphPackage getCodeGraphPackage();

} //CodeGraphFactory
