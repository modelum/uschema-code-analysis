/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field#getName <em>Name</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field#getDuplicatedField <em>Duplicated Field</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getField_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duplicated Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duplicated Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicated Field</em>' reference.
	 * @see #setDuplicatedField(Field)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getField_DuplicatedField()
	 * @model
	 * @generated
	 */
	Field getDuplicatedField();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field#getDuplicatedField <em>Duplicated Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duplicated Field</em>' reference.
	 * @see #getDuplicatedField()
	 * @generated
	 */
	void setDuplicatedField(Field value);

} // Field
