/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import es.um.uschema.code.metamodels.code.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.Node#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.Node#getStatement <em>Statement</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.Node#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.Node#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends GraphPart {
	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.codeGraph.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getNode_OutgoingEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(Statement)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getNode_Statement()
	 * @model
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.Node#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.um.uschema.code.metamodels.codeGraph.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.codeGraph.NodeType
	 * @see #setNodeType(NodeType)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getNode_NodeType()
	 * @model
	 * @generated
	 */
	NodeType getNodeType();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.Node#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see es.um.uschema.code.metamodels.codeGraph.NodeType
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeType value);

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.codeGraph.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getNode_IncomingEdges()
	 * @model
	 * @generated
	 */
	EList<Edge> getIncomingEdges();

} // Node
