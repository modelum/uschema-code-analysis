/**
 */
package es.um.nosql.code.s13e.metamodels.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Parameter#getCallableBlock <em>Callable Block</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Variable {
	/**
	 * Returns the value of the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Block</em>' reference.
	 * @see #setCallableBlock(CallableBlock)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getParameter_CallableBlock()
	 * @model
	 * @generated
	 */
	CallableBlock getCallableBlock();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Parameter#getCallableBlock <em>Callable Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable Block</em>' reference.
	 * @see #getCallableBlock()
	 * @generated
	 */
	void setCallableBlock(CallableBlock value);

} // Parameter
