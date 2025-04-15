/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Loop#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Loop#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Loop#getLoopPart <em>Loop Part</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Statement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.nosql.code.s13e.metamodels.code.LoopType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.LoopType
	 * @see #setType(LoopType)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoop_Type()
	 * @model
	 * @generated
	 */
	LoopType getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Loop#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.LoopType
	 * @see #getType()
	 * @generated
	 */
	void setType(LoopType value);

	/**
	 * Returns the value of the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Block</em>' containment reference.
	 * @see #setCodeBlock(CodeBlock)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoop_CodeBlock()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getCodeBlock();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Loop#getCodeBlock <em>Code Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Block</em>' containment reference.
	 * @see #getCodeBlock()
	 * @generated
	 */
	void setCodeBlock(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Loop Part</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.LoopPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Part</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoop_LoopPart()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopPart> getLoopPart();

} // Loop
