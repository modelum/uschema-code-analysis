/**
 */
package es.um.uschema.code.metamodels.codeGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.EdgeCall#getCall <em>Call</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getEdgeCall()
 * @model
 * @generated
 */
public interface EdgeCall extends Edge {
	/**
	 * Returns the value of the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' reference.
	 * @see #setCall(CallableBlockSubGraph)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getEdgeCall_Call()
	 * @model
	 * @generated
	 */
	CallableBlockSubGraph getCall();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.EdgeCall#getCall <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(CallableBlockSubGraph value);

} // EdgeCall
