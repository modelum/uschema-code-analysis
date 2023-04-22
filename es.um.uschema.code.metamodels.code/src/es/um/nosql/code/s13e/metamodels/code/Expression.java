/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Expression#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Expression#getConditionalExpression <em>Conditional Expression</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Statement, DataProducer, ConditionalExpression
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getExpression_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Expression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expression</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getExpression_ConditionalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalExpression> getConditionalExpression();

} // Expression
