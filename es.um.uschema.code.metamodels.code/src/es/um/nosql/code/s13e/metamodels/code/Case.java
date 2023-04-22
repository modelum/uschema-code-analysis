/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Case#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Case#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Case#getConditionalExpression <em>Conditional Expression</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.nosql.code.s13e.metamodels.code.CaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.CaseType
	 * @see #setType(CaseType)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCase_Type()
	 * @model
	 * @generated
	 */
	CaseType getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Case#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.CaseType
	 * @see #getType()
	 * @generated
	 */
	void setType(CaseType value);

	/**
	 * Returns the value of the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Block</em>' containment reference.
	 * @see #setCodeBlock(CodeBlock)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCase_CodeBlock()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getCodeBlock();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Case#getCodeBlock <em>Code Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Block</em>' containment reference.
	 * @see #getCodeBlock()
	 * @generated
	 */
	void setCodeBlock(CodeBlock value);

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
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCase_ConditionalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalExpression> getConditionalExpression();

} // Case
