/**
 */
package es.um.uschema.code.metamodels.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Data Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.NewDataContainer#getDataContainer <em>Data Container</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getNewDataContainer()
 * @model
 * @generated
 */
public interface NewDataContainer extends DataProducer
{
	/**
	 * Returns the value of the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Container</em>' containment reference.
	 * @see #setDataContainer(DataContainer)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getNewDataContainer_DataContainer()
	 * @model containment="true"
	 * @generated
	 */
	DataContainer getDataContainer();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.NewDataContainer#getDataContainer <em>Data Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Container</em>' containment reference.
	 * @see #getDataContainer()
	 * @generated
	 */
	void setDataContainer(DataContainer value);

} // NewDataContainer
