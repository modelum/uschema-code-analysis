/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.NewClass#getArguments <em>Arguments</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.NewClass#getCodeContainer <em>Code Container</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.NewClass#getCallableBlock <em>Callable Block</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getNewClass()
 * @model
 * @generated
 */
public interface NewClass extends DataProducer
{
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getNewClass_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Code Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Container</em>' reference.
	 * @see #setCodeContainer(CodeContainer)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getNewClass_CodeContainer()
	 * @model
	 * @generated
	 */
	CodeContainer getCodeContainer();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.NewClass#getCodeContainer <em>Code Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Container</em>' reference.
	 * @see #getCodeContainer()
	 * @generated
	 */
	void setCodeContainer(CodeContainer value);

	/**
	 * Returns the value of the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callable Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Block</em>' reference.
	 * @see #setCallableBlock(CallableBlock)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getNewClass_CallableBlock()
	 * @model
	 * @generated
	 */
	CallableBlock getCallableBlock();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.NewClass#getCallableBlock <em>Callable Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable Block</em>' reference.
	 * @see #getCallableBlock()
	 * @generated
	 */
	void setCallableBlock(CallableBlock value);

} // NewClass
