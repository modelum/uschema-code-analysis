/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.Finally;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finally</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.FinallyImpl#getCodeBlock <em>Code Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinallyImpl extends MinimalEObjectImpl.Container implements Finally
{
	/**
	 * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBlock()
	 * @generated
	 * @ordered
	 */
	protected CodeBlock codeBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinallyImpl()
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
		return CodePackage.Literals.FINALLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlock getCodeBlock()
	{
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeBlock(CodeBlock newCodeBlock, NotificationChain msgs)
	{
		CodeBlock oldCodeBlock = codeBlock;
		codeBlock = newCodeBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.FINALLY__CODE_BLOCK, oldCodeBlock, newCodeBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeBlock(CodeBlock newCodeBlock)
	{
		if (newCodeBlock != codeBlock) {
			NotificationChain msgs = null;
			if (codeBlock != null)
				msgs = ((InternalEObject)codeBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.FINALLY__CODE_BLOCK, null, msgs);
			if (newCodeBlock != null)
				msgs = ((InternalEObject)newCodeBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.FINALLY__CODE_BLOCK, null, msgs);
			msgs = basicSetCodeBlock(newCodeBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FINALLY__CODE_BLOCK, newCodeBlock, newCodeBlock));
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
			case CodePackage.FINALLY__CODE_BLOCK:
				return basicSetCodeBlock(null, msgs);
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
			case CodePackage.FINALLY__CODE_BLOCK:
				return getCodeBlock();
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
			case CodePackage.FINALLY__CODE_BLOCK:
				setCodeBlock((CodeBlock)newValue);
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
			case CodePackage.FINALLY__CODE_BLOCK:
				setCodeBlock((CodeBlock)null);
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
			case CodePackage.FINALLY__CODE_BLOCK:
				return codeBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //FinallyImpl
