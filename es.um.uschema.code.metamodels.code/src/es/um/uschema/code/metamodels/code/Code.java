/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.Code#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Code#getContainer <em>Container</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Code#getTypes <em>Types</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Code#getException <em>Exception</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Code#getGlobalVariable <em>Global Variable</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getCode()
 * @model
 * @generated
 */
public interface Code extends EObject
{
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCode_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Code#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCode_Container()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCode_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCode_Exception()
	 * @model containment="true"
	 * @generated
	 */
	EList<es.um.uschema.code.metamodels.code.Exception> getException();

	/**
	 * Returns the value of the '<em><b>Global Variable</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCode_GlobalVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getGlobalVariable();

} // Code
