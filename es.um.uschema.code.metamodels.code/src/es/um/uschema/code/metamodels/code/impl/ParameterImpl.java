/**
 */
package es.um.uschema.code.metamodels.code.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.CodePackage;
import es.um.uschema.code.metamodels.code.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.ParameterImpl#getCallableBlock <em>Callable Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends VariableImpl implements Parameter
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
	protected ParameterImpl()
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
		return CodePackage.Literals.PARAMETER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.PARAMETER__CALLABLE_BLOCK, oldCallableBlock, callableBlock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PARAMETER__CALLABLE_BLOCK, oldCallableBlock, callableBlock));
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
			case CodePackage.PARAMETER__CALLABLE_BLOCK:
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
			case CodePackage.PARAMETER__CALLABLE_BLOCK:
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
			case CodePackage.PARAMETER__CALLABLE_BLOCK:
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
			case CodePackage.PARAMETER__CALLABLE_BLOCK:
				return callableBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
