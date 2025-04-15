/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetContainer <em>Target Container</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetField <em>Target Field</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Type {
	/**
	 * Returns the value of the '<em><b>Target Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Container</em>' reference.
	 * @see #setTargetContainer(Container)
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getReference_TargetContainer()
	 * @model
	 * @generated
	 */
	Container getTargetContainer();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetContainer <em>Target Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Container</em>' reference.
	 * @see #getTargetContainer()
	 * @generated
	 */
	void setTargetContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Target Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Field</em>' reference.
	 * @see #setTargetField(Field)
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getReference_TargetField()
	 * @model
	 * @generated
	 */
	Field getTargetField();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetField <em>Target Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Field</em>' reference.
	 * @see #getTargetField()
	 * @generated
	 */
	void setTargetField(Field value);

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' containment reference.
	 * @see #setReferenceType(Attribute)
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getReference_ReferenceType()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getReferenceType();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getReferenceType <em>Reference Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' containment reference.
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(Attribute value);

} // Reference
