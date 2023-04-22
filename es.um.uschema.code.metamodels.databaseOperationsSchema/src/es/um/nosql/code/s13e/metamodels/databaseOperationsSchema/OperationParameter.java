/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.OperationParameter#getParameterFields <em>Parameter Fields</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getOperationParameter()
 * @model
 * @generated
 */
public interface OperationParameter extends EObject
{
	/**
	 * Returns the value of the '<em><b>Parameter Fields</b></em>' reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Fields</em>' reference list.
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#getOperationParameter_ParameterFields()
	 * @model
	 * @generated
	 */
	EList<Field> getParameterFields();

} // OperationParameter
