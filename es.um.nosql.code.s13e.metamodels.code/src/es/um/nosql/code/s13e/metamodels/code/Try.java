/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Try#getCatchs <em>Catchs</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Try#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Try#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getTry()
 * @model
 * @generated
 */
public interface Try extends Statement {
	/**
	 * Returns the value of the '<em><b>Catchs</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Catch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catchs</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getTry_Catchs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catch> getCatchs();

	/**
	 * Returns the value of the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Block</em>' containment reference.
	 * @see #setCodeBlock(CodeBlock)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getTry_CodeBlock()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getCodeBlock();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Try#getCodeBlock <em>Code Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Block</em>' containment reference.
	 * @see #getCodeBlock()
	 * @generated
	 */
	void setCodeBlock(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally</em>' containment reference.
	 * @see #setFinally(Finally)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getTry_Finally()
	 * @model containment="true"
	 * @generated
	 */
	Finally getFinally();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Try#getFinally <em>Finally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally</em>' containment reference.
	 * @see #getFinally()
	 * @generated
	 */
	void setFinally(Finally value);

} // Try
