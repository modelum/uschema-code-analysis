/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Operations Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema#getDatabaseOperations <em>Database Operations</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperationsSchema()
 * @model
 * @generated
 */
public interface DatabaseOperationsSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Database Operations</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Operations</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperationsSchema_DatabaseOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatabaseOperation> getDatabaseOperations();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.databaseOperationsSchema.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperationsSchema_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

} // DatabaseOperationsSchema
