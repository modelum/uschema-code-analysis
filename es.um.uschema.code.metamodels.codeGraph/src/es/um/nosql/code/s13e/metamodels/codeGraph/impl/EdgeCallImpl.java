/**
 */
package es.um.nosql.code.s13e.metamodels.codeGraph.impl;

import es.um.nosql.code.s13e.metamodels.codeGraph.CallableBlockSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.codeGraph.impl.EdgeCallImpl#getCall <em>Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeCallImpl extends EdgeImpl implements EdgeCall
{
	/**
	 * The cached value of the '{@link #getCall() <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCall()
	 * @generated
	 * @ordered
	 */
	protected CallableBlockSubGraph call;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeCallImpl()
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
		return CodeGraphPackage.Literals.EDGE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallableBlockSubGraph getCall()
	{
		if (call != null && call.eIsProxy()) {
			InternalEObject oldCall = (InternalEObject)call;
			call = (CallableBlockSubGraph)eResolveProxy(oldCall);
			if (call != oldCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeGraphPackage.EDGE_CALL__CALL, oldCall, call));
			}
		}
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableBlockSubGraph basicGetCall()
	{
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCall(CallableBlockSubGraph newCall)
	{
		CallableBlockSubGraph oldCall = call;
		call = newCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGraphPackage.EDGE_CALL__CALL, oldCall, call));
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
			case CodeGraphPackage.EDGE_CALL__CALL:
				if (resolve) return getCall();
				return basicGetCall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case CodeGraphPackage.EDGE_CALL__CALL:
				setCall((CallableBlockSubGraph)newValue);
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
			case CodeGraphPackage.EDGE_CALL__CALL:
				setCall((CallableBlockSubGraph)null);
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
			case CodeGraphPackage.EDGE_CALL__CALL:
				return call != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeCallImpl
