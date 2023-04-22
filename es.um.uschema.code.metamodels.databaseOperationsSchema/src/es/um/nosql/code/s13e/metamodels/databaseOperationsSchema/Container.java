/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container#getDataStructures <em>Data Structures</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject
{
	/**
	 * Returns the value of the '<em><b>Data Structures</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structures</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getContainer_DataStructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStructure> getDataStructures();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Container
