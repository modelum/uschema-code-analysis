/**
 */
package es.um.nosql.code.s13e.metamodels.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getProperty <em>Property</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getName <em>Name</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getNextAccess <em>Next Access</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getPropertyAccess()
 * @model
 * @generated
 */
public interface PropertyAccess extends DataProducer
{
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getPropertyAccess_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getPropertyAccess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Access</em>' containment reference.
	 * @see #setNextAccess(PropertyAccess)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getPropertyAccess_NextAccess()
	 * @model containment="true"
	 * @generated
	 */
	PropertyAccess getNextAccess();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getNextAccess <em>Next Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Access</em>' containment reference.
	 * @see #getNextAccess()
	 * @generated
	 */
	void setNextAccess(PropertyAccess value);

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
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getPropertyAccess_DataProducer()
	 * @model containment="true"
	 * @generated
	 */
	DataProducer getDataProducer();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess#getDataProducer <em>Data Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Producer</em>' containment reference.
	 * @see #getDataProducer()
	 * @generated
	 */
	void setDataProducer(DataProducer value);

} // PropertyAccess
