/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Read#getResultDataStructure <em>Result Data Structure</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getRead()
 * @model
 * @generated
 */
public interface Read extends DatabaseOperation
{
	/**
	 * Returns the value of the '<em><b>Result Data Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Data Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Data Structure</em>' reference.
	 * @see #setResultDataStructure(DataStructure)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getRead_ResultDataStructure()
	 * @model
	 * @generated
	 */
	DataStructure getResultDataStructure();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Read#getResultDataStructure <em>Result Data Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Data Structure</em>' reference.
	 * @see #getResultDataStructure()
	 * @generated
	 */
	void setResultDataStructure(DataStructure value);

} // Read
