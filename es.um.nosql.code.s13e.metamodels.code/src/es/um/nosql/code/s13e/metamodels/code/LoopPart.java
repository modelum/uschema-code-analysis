/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.LoopPart#getStatement <em>Statement</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.LoopPart#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoopPart()
 * @model
 * @generated
 */
public interface LoopPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoopPart_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.nosql.code.s13e.metamodels.code.LoopPartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.LoopPartType
	 * @see #setType(LoopPartType)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoopPart_Type()
	 * @model
	 * @generated
	 */
	LoopPartType getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.LoopPart#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.LoopPartType
	 * @see #getType()
	 * @generated
	 */
	void setType(LoopPartType value);

} // LoopPart
