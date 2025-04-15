/**
 */
package es.um.uschema.code.metamodels.codeGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.Edge#getType <em>Type</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.Edge#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends GraphPart {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NEXT"</code>.
	 * The literals are from the enumeration {@link es.um.uschema.code.metamodels.codeGraph.EdgeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.codeGraph.EdgeType
	 * @see #setType(EdgeType)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getEdge_Type()
	 * @model default="NEXT"
	 * @generated
	 */
	EdgeType getType();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.Edge#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.codeGraph.EdgeType
	 * @see #getType()
	 * @generated
	 */
	void setType(EdgeType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getEdge_Target()
	 * @model
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getEdge_Source()
	 * @model
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

} // Edge
