/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Update#getUpdateParameter <em>Update Parameter</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getUpdate()
 * @model
 * @generated
 */
public interface Update extends DatabaseOperation
{
	/**
	 * Returns the value of the '<em><b>Update Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Parameter</em>' containment reference.
	 * @see #setUpdateParameter(OperationParameter)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getUpdate_UpdateParameter()
	 * @model containment="true"
	 * @generated
	 */
	OperationParameter getUpdateParameter();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Update#getUpdateParameter <em>Update Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Parameter</em>' containment reference.
	 * @see #getUpdateParameter()
	 * @generated
	 */
	void setUpdateParameter(OperationParameter value);

} // Update
