/**
 */
package es.um.uschema.code.metamodels.codeGraph.impl;

import es.um.uschema.code.metamodels.code.Code;

import es.um.uschema.code.metamodels.codeGraph.CodeGraph;
import es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage;
import es.um.uschema.code.metamodels.codeGraph.CodeSubGraph;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphImpl#getCode <em>Code</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphImpl#getSubGrahps <em>Sub Grahps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeGraphImpl extends MinimalEObjectImpl.Container implements CodeGraph {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getSubGrahps() <em>Sub Grahps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGrahps()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSubGraph> subGrahps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeGraphPackage.Literals.CODE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Code)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeGraphPackage.CODE_GRAPH__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(Code newCode) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGraphPackage.CODE_GRAPH__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeSubGraph> getSubGrahps() {
		if (subGrahps == null) {
			subGrahps = new EObjectContainmentEList<CodeSubGraph>(CodeSubGraph.class, this, CodeGraphPackage.CODE_GRAPH__SUB_GRAHPS);
		}
		return subGrahps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeGraphPackage.CODE_GRAPH__SUB_GRAHPS:
				return ((InternalEList<?>)getSubGrahps()).basicRemove(otherEnd, msgs);
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
			case CodeGraphPackage.CODE_GRAPH__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case CodeGraphPackage.CODE_GRAPH__SUB_GRAHPS:
				return getSubGrahps();
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
			case CodeGraphPackage.CODE_GRAPH__CODE:
				setCode((Code)newValue);
				return;
			case CodeGraphPackage.CODE_GRAPH__SUB_GRAHPS:
				getSubGrahps().clear();
				getSubGrahps().addAll((Collection<? extends CodeSubGraph>)newValue);
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
			case CodeGraphPackage.CODE_GRAPH__CODE:
				setCode((Code)null);
				return;
			case CodeGraphPackage.CODE_GRAPH__SUB_GRAHPS:
				getSubGrahps().clear();
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
			case CodeGraphPackage.CODE_GRAPH__CODE:
				return code != null;
			case CodeGraphPackage.CODE_GRAPH__SUB_GRAHPS:
				return subGrahps != null && !subGrahps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeGraphImpl
