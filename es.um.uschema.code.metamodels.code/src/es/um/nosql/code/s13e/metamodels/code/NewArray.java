/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.NewArray#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getNewArray()
 * @model
 * @generated
 */
public interface NewArray extends DataProducer
{
	/**
	 * Returns the value of the '<em><b>Data Producer</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.nosql.code.s13e.metamodels.code.DataProducer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Producer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Producer</em>' containment reference list.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getNewArray_DataProducer()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProducer> getDataProducer();

} // NewArray
