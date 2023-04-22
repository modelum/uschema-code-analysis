/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.Catch;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.Finally;
import es.um.nosql.code.s13e.metamodels.code.Try;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.TryImpl#getCatchs <em>Catchs</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.TryImpl#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.TryImpl#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryImpl extends StatementImpl implements Try
{
	/**
	 * The cached value of the '{@link #getCatchs() <em>Catchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Catch> catchs;

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
	 * The cached value of the '{@link #getFinally() <em>Finally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinally()
	 * @generated
	 * @ordered
	 */
	protected Finally finally_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryImpl()
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
		return CodePackage.Literals.TRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Catch> getCatchs()
	{
		if (catchs == null) {
			catchs = new EObjectContainmentEList<Catch>(Catch.class, this, CodePackage.TRY__CATCHS);
		}
		return catchs;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.TRY__CODE_BLOCK, oldCodeBlock, newCodeBlock);
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
				msgs = ((InternalEObject)codeBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.TRY__CODE_BLOCK, null, msgs);
			if (newCodeBlock != null)
				msgs = ((InternalEObject)newCodeBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.TRY__CODE_BLOCK, null, msgs);
			msgs = basicSetCodeBlock(newCodeBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.TRY__CODE_BLOCK, newCodeBlock, newCodeBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Finally getFinally()
	{
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinally(Finally newFinally, NotificationChain msgs)
	{
		Finally oldFinally = finally_;
		finally_ = newFinally;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.TRY__FINALLY, oldFinally, newFinally);
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
	public void setFinally(Finally newFinally)
	{
		if (newFinally != finally_) {
			NotificationChain msgs = null;
			if (finally_ != null)
				msgs = ((InternalEObject)finally_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.TRY__FINALLY, null, msgs);
			if (newFinally != null)
				msgs = ((InternalEObject)newFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.TRY__FINALLY, null, msgs);
			msgs = basicSetFinally(newFinally, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.TRY__FINALLY, newFinally, newFinally));
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
			case CodePackage.TRY__CATCHS:
				return ((InternalEList<?>)getCatchs()).basicRemove(otherEnd, msgs);
			case CodePackage.TRY__CODE_BLOCK:
				return basicSetCodeBlock(null, msgs);
			case CodePackage.TRY__FINALLY:
				return basicSetFinally(null, msgs);
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
			case CodePackage.TRY__CATCHS:
				return getCatchs();
			case CodePackage.TRY__CODE_BLOCK:
				return getCodeBlock();
			case CodePackage.TRY__FINALLY:
				return getFinally();
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
			case CodePackage.TRY__CATCHS:
				getCatchs().clear();
				getCatchs().addAll((Collection<? extends Catch>)newValue);
				return;
			case CodePackage.TRY__CODE_BLOCK:
				setCodeBlock((CodeBlock)newValue);
				return;
			case CodePackage.TRY__FINALLY:
				setFinally((Finally)newValue);
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
			case CodePackage.TRY__CATCHS:
				getCatchs().clear();
				return;
			case CodePackage.TRY__CODE_BLOCK:
				setCodeBlock((CodeBlock)null);
				return;
			case CodePackage.TRY__FINALLY:
				setFinally((Finally)null);
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
			case CodePackage.TRY__CATCHS:
				return catchs != null && !catchs.isEmpty();
			case CodePackage.TRY__CODE_BLOCK:
				return codeBlock != null;
			case CodePackage.TRY__FINALLY:
				return finally_ != null;
		}
		return super.eIsSet(featureID);
	}

} //TryImpl
