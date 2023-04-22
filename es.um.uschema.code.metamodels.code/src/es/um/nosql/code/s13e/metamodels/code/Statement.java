/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Statement#getStart <em>Start</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Statement#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(CodeLocation)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getStatement_Start()
	 * @model containment="true"
	 * @generated
	 */
	CodeLocation getStart();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Statement#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(CodeLocation value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(CodeLocation)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getStatement_End()
	 * @model containment="true"
	 * @generated
	 */
	CodeLocation getEnd();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Statement#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(CodeLocation value);

} // Statement
