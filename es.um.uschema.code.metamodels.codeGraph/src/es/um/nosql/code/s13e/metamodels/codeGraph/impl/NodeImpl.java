/**
 */
package es.um.nosql.code.s13e.metamodels.codeGraph.impl;

import es.um.nosql.code.s13e.metamodels.code.Statement;

import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage;
import es.um.nosql.code.s13e.metamodels.codeGraph.Edge;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.codeGraph.NodeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.codeGraph.impl.NodeImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.codeGraph.impl.NodeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.codeGraph.impl.NodeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.codeGraph.impl.NodeImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends GraphPartImpl implements Node
{
	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outgoingEdges;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement statement;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType NODE_TYPE_EDEFAULT = NodeType.START_NODE;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeType nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingEdges() <em>Incoming Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> incomingEdges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CodeGraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getOutgoingEdges()
	{
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectContainmentEList<Edge>(Edge.class, this, CodeGraphPackage.NODE__OUTGOING_EDGES);
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getStatement()
	{
		if (statement != null && statement.eIsProxy()) {
			InternalEObject oldStatement = (InternalEObject)statement;
			statement = (Statement)eResolveProxy(oldStatement);
			if (statement != oldStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeGraphPackage.NODE__STATEMENT, oldStatement, statement));
			}
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetStatement()
	{
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(Statement newStatement)
	{
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGraphPackage.NODE__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeType getNodeType()
	{
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeType(NodeType newNodeType)
	{
		NodeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGraphPackage.NODE__NODE_TYPE, oldNodeType, nodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getIncomingEdges()
	{
		if (incomingEdges == null) {
			incomingEdges = new EObjectResolvingEList<Edge>(Edge.class, this, CodeGraphPackage.NODE__INCOMING_EDGES);
		}
		return incomingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case CodeGraphPackage.NODE__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case CodeGraphPackage.NODE__OUTGOING_EDGES:
				return getOutgoingEdges();
			case CodeGraphPackage.NODE__STATEMENT:
				if (resolve) return getStatement();
				return basicGetStatement();
			case CodeGraphPackage.NODE__NODE_TYPE:
				return getNodeType();
			case CodeGraphPackage.NODE__INCOMING_EDGES:
				return getIncomingEdges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case CodeGraphPackage.NODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case CodeGraphPackage.NODE__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case CodeGraphPackage.NODE__NODE_TYPE:
				setNodeType((NodeType)newValue);
				return;
			case CodeGraphPackage.NODE__INCOMING_EDGES:
				getIncomingEdges().clear();
				getIncomingEdges().addAll((Collection<? extends Edge>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case CodeGraphPackage.NODE__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case CodeGraphPackage.NODE__STATEMENT:
				setStatement((Statement)null);
				return;
			case CodeGraphPackage.NODE__NODE_TYPE:
				setNodeType(NODE_TYPE_EDEFAULT);
				return;
			case CodeGraphPackage.NODE__INCOMING_EDGES:
				getIncomingEdges().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case CodeGraphPackage.NODE__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case CodeGraphPackage.NODE__STATEMENT:
				return statement != null;
			case CodeGraphPackage.NODE__NODE_TYPE:
				return nodeType != NODE_TYPE_EDEFAULT;
			case CodeGraphPackage.NODE__INCOMING_EDGES:
				return incomingEdges != null && !incomingEdges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nodeType: ");
		result.append(nodeType);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
