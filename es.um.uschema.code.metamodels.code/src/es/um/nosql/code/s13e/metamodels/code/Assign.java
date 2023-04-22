/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Assign#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Assign#getVariable <em>Variable</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Assign#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Assign#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Assign#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Statement
{
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Assignable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getAssign_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignable> getOutputs();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getAssign_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Assign#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.DataProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getAssign_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProducer> getInputs();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getAssign_Type()
	 * @model default=""
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Assign#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getAssign_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Assign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Assign
