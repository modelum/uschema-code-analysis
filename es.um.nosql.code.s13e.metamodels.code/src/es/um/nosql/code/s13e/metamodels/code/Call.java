/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Call#getCallableBlock <em>Callable Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Call#getArguments <em>Arguments</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Call#getName <em>Name</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.Call#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Statement, DataProducer {
	/**
	 * Returns the value of the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Block</em>' reference.
	 * @see #setCallableBlock(CallableBlock)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCall_CallableBlock()
	 * @model
	 * @generated
	 */
	CallableBlock getCallableBlock();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Call#getCallableBlock <em>Callable Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable Block</em>' reference.
	 * @see #getCallableBlock()
	 * @generated
	 */
	void setCallableBlock(CallableBlock value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCall_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Call#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Producer</em>' containment reference.
	 * @see #setDataProducer(DataProducer)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCall_DataProducer()
	 * @model containment="true"
	 * @generated
	 */
	DataProducer getDataProducer();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.Call#getDataProducer <em>Data Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Producer</em>' containment reference.
	 * @see #getDataProducer()
	 * @generated
	 */
	void setDataProducer(DataProducer value);

} // Call
