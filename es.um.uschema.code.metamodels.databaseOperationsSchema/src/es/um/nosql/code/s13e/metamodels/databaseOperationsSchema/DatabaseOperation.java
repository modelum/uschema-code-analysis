/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema;

import es.um.nosql.code.s13e.metamodels.code.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getFollowingDatabaseOperation <em>Following Database Operation</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getPrecedingDatabaseOperation <em>Preceding Database Operation</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getContainer <em>Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getStatement <em>Statement</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getTargetingParameter <em>Targeting Parameter</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperation()
 * @model abstract="true"
 * @generated
 */
public interface DatabaseOperation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Following Database Operation</b></em>' reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following Database Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following Database Operation</em>' reference list.
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperation_FollowingDatabaseOperation()
	 * @model
	 * @generated
	 */
	EList<DatabaseOperation> getFollowingDatabaseOperation();

	/**
	 * Returns the value of the '<em><b>Preceding Database Operation</b></em>' reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding Database Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding Database Operation</em>' reference list.
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperation_PrecedingDatabaseOperation()
	 * @model
	 * @generated
	 */
	EList<DatabaseOperation> getPrecedingDatabaseOperation();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperation_Container()
	 * @model
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(Statement)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperation_Statement()
	 * @model
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Targeting Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeting Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeting Parameter</em>' containment reference.
	 * @see #setTargetingParameter(OperationParameter)
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getDatabaseOperation_TargetingParameter()
	 * @model containment="true"
	 * @generated
	 */
	OperationParameter getTargetingParameter();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation#getTargetingParameter <em>Targeting Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targeting Parameter</em>' containment reference.
	 * @see #getTargetingParameter()
	 * @generated
	 */
	void setTargetingParameter(OperationParameter value);

} // DatabaseOperation
