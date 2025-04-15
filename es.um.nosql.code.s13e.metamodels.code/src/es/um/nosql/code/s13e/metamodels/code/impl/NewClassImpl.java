/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.NewClass;

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
 * An implementation of the model object '<em><b>New Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.NewClassImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.NewClassImpl#getCodeContainer <em>Code Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.NewClassImpl#getCallableBlock <em>Callable Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewClassImpl extends DataProducerImpl implements NewClass {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getCodeContainer() <em>Code Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeContainer()
	 * @generated
	 * @ordered
	 */
	protected CodeContainer codeContainer;

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
	protected NewClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.NEW_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, CodePackage.NEW_CLASS__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeContainer getCodeContainer() {
		if (codeContainer != null && codeContainer.eIsProxy()) {
			InternalEObject oldCodeContainer = (InternalEObject)codeContainer;
			codeContainer = (CodeContainer)eResolveProxy(oldCodeContainer);
			if (codeContainer != oldCodeContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.NEW_CLASS__CODE_CONTAINER, oldCodeContainer, codeContainer));
			}
		}
		return codeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeContainer basicGetCodeContainer() {
		return codeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeContainer(CodeContainer newCodeContainer) {
		CodeContainer oldCodeContainer = codeContainer;
		codeContainer = newCodeContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.NEW_CLASS__CODE_CONTAINER, oldCodeContainer, codeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallableBlock getCallableBlock() {
		if (callableBlock != null && callableBlock.eIsProxy()) {
			InternalEObject oldCallableBlock = (InternalEObject)callableBlock;
			callableBlock = (CallableBlock)eResolveProxy(oldCallableBlock);
			if (callableBlock != oldCallableBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.NEW_CLASS__CALLABLE_BLOCK, oldCallableBlock, callableBlock));
			}
		}
		return callableBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableBlock basicGetCallableBlock() {
		return callableBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallableBlock(CallableBlock newCallableBlock) {
		CallableBlock oldCallableBlock = callableBlock;
		callableBlock = newCallableBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.NEW_CLASS__CALLABLE_BLOCK, oldCallableBlock, callableBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.NEW_CLASS__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.NEW_CLASS__ARGUMENTS:
				return getArguments();
			case CodePackage.NEW_CLASS__CODE_CONTAINER:
				if (resolve) return getCodeContainer();
				return basicGetCodeContainer();
			case CodePackage.NEW_CLASS__CALLABLE_BLOCK:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackage.NEW_CLASS__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case CodePackage.NEW_CLASS__CODE_CONTAINER:
				setCodeContainer((CodeContainer)newValue);
				return;
			case CodePackage.NEW_CLASS__CALLABLE_BLOCK:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodePackage.NEW_CLASS__ARGUMENTS:
				getArguments().clear();
				return;
			case CodePackage.NEW_CLASS__CODE_CONTAINER:
				setCodeContainer((CodeContainer)null);
				return;
			case CodePackage.NEW_CLASS__CALLABLE_BLOCK:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodePackage.NEW_CLASS__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case CodePackage.NEW_CLASS__CODE_CONTAINER:
				return codeContainer != null;
			case CodePackage.NEW_CLASS__CALLABLE_BLOCK:
				return callableBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //NewClassImpl
