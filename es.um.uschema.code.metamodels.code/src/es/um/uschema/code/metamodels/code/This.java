/**
 */
package es.um.uschema.code.metamodels.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>This</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.This#getDataContainer <em>Data Container</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getThis()
 * @model
 * @generated
 */
public interface This extends Statement, Variable
{
	/**
	 * Returns the value of the '<em><b>Data Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Container</em>' reference.
	 * @see #setDataContainer(DataContainer)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getThis_DataContainer()
	 * @model
	 * @generated
	 */
	DataContainer getDataContainer();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.This#getDataContainer <em>Data Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Container</em>' reference.
	 * @see #getDataContainer()
	 * @generated
	 */
	void setDataContainer(DataContainer value);

} // This
