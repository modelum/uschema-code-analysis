/**
 */
package es.um.uschema.code.metamodels.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.Throw#getException <em>Exception</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Throw#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getThrow()
 * @model
 * @generated
 */
public interface Throw extends Statement
{
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(es.um.uschema.code.metamodels.code.Exception)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getThrow_Exception()
	 * @model
	 * @generated
	 */
	es.um.uschema.code.metamodels.code.Exception getException();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Throw#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(es.um.uschema.code.metamodels.code.Exception value);

	/**
	 * Returns the value of the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Producer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Producer</em>' containment reference.
	 * @see #setDataProducer(DataProducer)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getThrow_DataProducer()
	 * @model containment="true"
	 * @generated
	 */
	DataProducer getDataProducer();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Throw#getDataProducer <em>Data Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Producer</em>' containment reference.
	 * @see #getDataProducer()
	 * @generated
	 */
	void setDataProducer(DataProducer value);

} // Throw
