/**
 */
package es.um.nosql.code.s13e.metamodels.code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Based Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess#getVariable <em>Variable</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess#getIndex <em>Index</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getIndexBasedAccess()
 * @model
 * @generated
 */
public interface IndexBasedAccess extends Statement, DataProducer
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
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getIndexBasedAccess_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(DataProducer)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getIndexBasedAccess_Index()
	 * @model containment="true"
	 * @generated
	 */
	DataProducer getIndex();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(DataProducer value);

	/**
	 * Returns the value of the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Producer</em>' containment reference.
	 * @see #setDataProducer(DataProducer)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getIndexBasedAccess_DataProducer()
	 * @model containment="true"
	 * @generated
	 */
	DataProducer getDataProducer();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess#getDataProducer <em>Data Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Producer</em>' containment reference.
	 * @see #getDataProducer()
	 * @generated
	 */
	void setDataProducer(DataProducer value);

} // IndexBasedAccess
