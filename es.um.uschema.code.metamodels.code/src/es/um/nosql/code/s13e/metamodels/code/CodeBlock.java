/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeBlock#getStatements <em>Statements</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeBlock#getCodeBlockType <em>Code Block Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeBlock#getVariables <em>Variables</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeBlock#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends EObject
{
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeBlock_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Code Block Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.nosql.code.s13e.metamodels.code.CodeBlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Block Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Block Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodeBlockType
	 * @see #setCodeBlockType(CodeBlockType)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeBlock_CodeBlockType()
	 * @model
	 * @generated
	 */
	CodeBlockType getCodeBlockType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.CodeBlock#getCodeBlockType <em>Code Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Block Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodeBlockType
	 * @see #getCodeBlockType()
	 * @generated
	 */
	void setCodeBlockType(CodeBlockType value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeBlock_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeBlock_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.CodeBlock#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

} // CodeBlock
