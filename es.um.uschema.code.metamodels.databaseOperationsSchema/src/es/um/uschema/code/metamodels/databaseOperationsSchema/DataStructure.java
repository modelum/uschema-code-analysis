/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure#getFields <em>Fields</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDataStructure()
 * @model
 * @generated
 */
public interface DataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.databaseOperationsSchema.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDataStructure_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDataStructure_Container()
	 * @model
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // DataStructure
