/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.Selection#getType <em>Type</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Selection#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends Statement
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.uschema.code.metamodels.code.SelectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.code.SelectionType
	 * @see #setType(SelectionType)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getSelection_Type()
	 * @model
	 * @generated
	 */
	SelectionType getType();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Selection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.code.SelectionType
	 * @see #getType()
	 * @generated
	 */
	void setType(SelectionType value);

	/**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getSelection_Case()
	 * @model containment="true"
	 * @generated
	 */
	EList<Case> getCase();

} // Selection
