/**
 */
package es.um.nosql.code.s13e.metamodels.codeGraph.impl;

import es.um.nosql.code.s13e.metamodels.code.CallableBlock;

import es.um.nosql.code.s13e.metamodels.codeGraph.CallableBlockSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable Block Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.codeGraph.impl.CallableBlockSubGraphImpl#getCallableBlock <em>Callable Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallableBlockSubGraphImpl extends CodeSubGraphImpl implements CallableBlockSubGraph
{
	/**
	 * The cached value of the '{@link #getCallableBlock() <em>Callable Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallableBlock()
	 * @generated
	 * @ordered
	 */
	protected CallableBlock callableBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableBlockSubGraphImpl()
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
		return CodeGraphPackage.Literals.CALLABLE_BLOCK_SUB_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallableBlock getCallableBlock()
	{
		if (callableBlock != null && callableBlock.eIsProxy()) {
			InternalEObject oldCallableBlock = (InternalEObject)callableBlock;
			callableBlock = (CallableBlock)eResolveProxy(oldCallableBlock);
			if (callableBlock != oldCallableBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK, oldCallableBlock, callableBlock));
			}
		}
		return callableBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableBlock basicGetCallableBlock()
	{
		return callableBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallableBlock(CallableBlock newCallableBlock)
	{
		CallableBlock oldCallableBlock = callableBlock;
		callableBlock = newCallableBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK, oldCallableBlock, callableBlock));
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
			case CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK:
				if (resolve) return getCallableBlock();
				return basicGetCallableBlock();
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
			case CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK:
				setCallableBlock((CallableBlock)newValue);
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
			case CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK:
				setCallableBlock((CallableBlock)null);
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
			case CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK:
				return callableBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //CallableBlockSubGraphImpl
