/**
 */
package es.um.uschema.code.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.Return#getDataProducers <em>Data Producers</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.code.CodePackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Statement
{
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
	 * @see es.um.uschema.code.metamodels.code.CodePackage#getReturn_DataProducers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProducer> getDataProducers();

} // Return
