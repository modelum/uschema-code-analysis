/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import es.um.uschema.code.metamodels.code.CallableBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Block Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.CallableBlockSubGraph#getCallableBlock <em>Callable Block</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getCallableBlockSubGraph()
 * @model
 * @generated
 */
public interface CallableBlockSubGraph extends CodeSubGraph {
	/**
	 * Returns the value of the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Block</em>' reference.
	 * @see #setCallableBlock(CallableBlock)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getCallableBlockSubGraph_CallableBlock()
	 * @model
	 * @generated
	 */
	CallableBlock getCallableBlock();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.CallableBlockSubGraph#getCallableBlock <em>Callable Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable Block</em>' reference.
	 * @see #getCallableBlock()
	 * @generated
	 */
	void setCallableBlock(CallableBlock value);

} // CallableBlockSubGraph
