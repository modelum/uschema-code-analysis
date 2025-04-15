/**
 */
package es.um.uschema.code.metamodels.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.UnaryOperation#getType <em>Type</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.UnaryOperation#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getUnaryOperation()
 * @model
 * @generated
 */
public interface UnaryOperation extends Statement, DataProducer
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.uschema.code.metamodels.code.UnaryOperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.code.UnaryOperationType
	 * @see #setType(UnaryOperationType)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getUnaryOperation_Type()
	 * @model
	 * @generated
	 */
	UnaryOperationType getType();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.UnaryOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.code.UnaryOperationType
	 * @see #getType()
	 * @generated
	 */
	void setType(UnaryOperationType value);

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
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getUnaryOperation_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.UnaryOperation#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // UnaryOperation
