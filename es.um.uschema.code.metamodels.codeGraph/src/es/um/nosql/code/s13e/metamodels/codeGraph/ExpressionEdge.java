/**
 */
package es.um.nosql.code.s13e.metamodels.codeGraph;

import es.um.nosql.code.s13e.metamodels.code.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.codeGraph.ExpressionEdge#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage#getExpressionEdge()
 * @model
 * @generated
 */
public interface ExpressionEdge extends Edge
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage#getExpressionEdge_Expression()
	 * @model
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.codeGraph.ExpressionEdge#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ExpressionEdge
