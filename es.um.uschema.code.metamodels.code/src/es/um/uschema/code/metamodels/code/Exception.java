/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.Exception#getExceptionName <em>Exception Name</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getException()
 * @model
 * @generated
 */
public interface Exception extends EObject
{
	/**
	 * Returns the value of the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Name</em>' attribute.
	 * @see #setExceptionName(String)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getException_ExceptionName()
	 * @model
	 * @generated
	 */
	String getExceptionName();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Exception#getExceptionName <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Name</em>' attribute.
	 * @see #getExceptionName()
	 * @generated
	 */
	void setExceptionName(String value);

} // Exception
