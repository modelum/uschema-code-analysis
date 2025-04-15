/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.DataContainer#getProperties <em>Properties</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.DataContainer#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getDataContainer()
 * @model
 * @generated
 */
public interface DataContainer extends Type, DataProducer, Property
{
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getDataContainer_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.DataContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getDataContainer_Parent()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataContainer> getParent();

} // DataContainer
