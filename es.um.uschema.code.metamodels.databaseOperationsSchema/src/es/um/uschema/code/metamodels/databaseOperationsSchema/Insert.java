/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Insert#getInsertDataStructure <em>Insert Data Structure</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getInsert()
 * @model
 * @generated
 */
public interface Insert extends DatabaseOperation {
	/**
	 * Returns the value of the '<em><b>Insert Data Structure</b></em>' reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Data Structure</em>' reference list.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getInsert_InsertDataStructure()
	 * @model
	 * @generated
	 */
	EList<DataStructure> getInsertDataStructure();

} // Insert
