/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.Catch#getException <em>Exception</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Catch#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Catch#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getCatch()
 * @model
 * @generated
 */
public interface Catch extends Statement
{
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCatch_Exception()
	 * @model
	 * @generated
	 */
	EList<es.um.uschema.code.metamodels.code.Exception> getException();

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
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCatch_CodeBlock()
	 * @model containment="true"
	 * @generated
	 */
	CodeBlock getCodeBlock();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Catch#getCodeBlock <em>Code Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Block</em>' containment reference.
	 * @see #getCodeBlock()
	 * @generated
	 */
	void setCodeBlock(CodeBlock value);

	/**
	 * Returns the value of the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Producer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Producer</em>' containment reference.
	 * @see #setDataProducer(DataProducer)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getCatch_DataProducer()
	 * @model containment="true"
	 * @generated
	 */
	DataProducer getDataProducer();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Catch#getDataProducer <em>Data Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Producer</em>' containment reference.
	 * @see #getDataProducer()
	 * @generated
	 */
	void setDataProducer(DataProducer value);

} // Catch
