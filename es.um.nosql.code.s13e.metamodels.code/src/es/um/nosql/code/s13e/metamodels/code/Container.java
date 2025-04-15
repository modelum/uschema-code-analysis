/**
 */
package es.um.nosql.code.s13e.metamodels.code;

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
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Container#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Container#getCodeContainer <em>Code Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Container#getSubContainer <em>Sub Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Container#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.nosql.code.s13e.metamodels.code.ContainerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.ContainerType
	 * @see #setType(ContainerType)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getContainer_Type()
	 * @model
	 * @generated
	 */
	ContainerType getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Container#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.ContainerType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContainerType value);

	/**
	 * Returns the value of the '<em><b>Code Container</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.CodeContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Container</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getContainer_CodeContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeContainer> getCodeContainer();

	/**
	 * Returns the value of the '<em><b>Sub Container</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Container</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getContainer_SubContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getSubContainer();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Container
