/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getName <em>Name</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getDataContainer <em>Data Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeContainer()
 * @model
 * @generated
 */
public interface CodeContainer extends Type
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.nosql.code.s13e.metamodels.code.CodeContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodeContainerType
	 * @see #setType(CodeContainerType)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeContainer_Type()
	 * @model
	 * @generated
	 */
	CodeContainerType getType();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodeContainerType
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeContainerType value);

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
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code Block</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.CodeBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Block</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeContainer_CodeBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeBlock> getCodeBlock();

	/**
	 * Returns the value of the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Container</em>' containment reference.
	 * @see #setDataContainer(DataContainer)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeContainer_DataContainer()
	 * @model containment="true"
	 * @generated
	 */
	DataContainer getDataContainer();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer#getDataContainer <em>Data Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Container</em>' containment reference.
	 * @see #getDataContainer()
	 * @generated
	 */
	void setDataContainer(DataContainer value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeContainer_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

} // CodeContainer
