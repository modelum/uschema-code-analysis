/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.Operation#getType <em>Type</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.Operation#getDataProducers <em>Data Producers</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Statement, DataProducer
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getOperation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.code.Operation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Data Producers</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.DataProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Producers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Producers</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getOperation_DataProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProducer> getDataProducers();

} // Operation
