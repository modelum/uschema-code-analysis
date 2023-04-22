/**
 */
package es.um.nosql.code.s13e.metamodels.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.VariableAccess#getVariable <em>Variable</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.VariableAccess#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getVariableAccess()
 * @model
 * @generated
 */
public interface VariableAccess extends Statement, DataProducer
{
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getVariableAccess_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.VariableAccess#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getVariableAccess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.VariableAccess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VariableAccess
