/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition#getDataStructure <em>Data Structure</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Type
{
	/**
	 * Returns the value of the '<em><b>Data Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structure</em>' containment reference.
	 * @see #setDataStructure(DataStructure)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getComposition_DataStructure()
	 * @model containment="true"
	 * @generated
	 */
	DataStructure getDataStructure();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition#getDataStructure <em>Data Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Structure</em>' containment reference.
	 * @see #getDataStructure()
	 * @generated
	 */
	void setDataStructure(DataStructure value);

} // Composition
