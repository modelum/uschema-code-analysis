/**
 */
package es.um.uschema.code.metamodels.codeGraph.impl;

import es.um.uschema.code.metamodels.code.CodeBlock;

import es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph;
import es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Block Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeBlockSubGraphImpl#getCodeBlock <em>Code Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeBlockSubGraphImpl extends CodeSubGraphImpl implements CodeBlockSubGraph {
	/**
	 * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' reference.
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
	protected CodeBlockSubGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeGraphPackage.Literals.CODE_BLOCK_SUB_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlock getCodeBlock() {
		if (codeBlock != null && codeBlock.eIsProxy()) {
			InternalEObject oldCodeBlock = (InternalEObject)codeBlock;
			codeBlock = (CodeBlock)eResolveProxy(oldCodeBlock);
			if (codeBlock != oldCodeBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeGraphPackage.CODE_BLOCK_SUB_GRAPH__CODE_BLOCK, oldCodeBlock, codeBlock));
			}
		}
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock basicGetCodeBlock() {
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeBlock(CodeBlock newCodeBlock) {
		CodeBlock oldCodeBlock = codeBlock;
		codeBlock = newCodeBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGraphPackage.CODE_BLOCK_SUB_GRAPH__CODE_BLOCK, oldCodeBlock, codeBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeGraphPackage.CODE_BLOCK_SUB_GRAPH__CODE_BLOCK:
				if (resolve) return getCodeBlock();
				return basicGetCodeBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeGraphPackage.CODE_BLOCK_SUB_GRAPH__CODE_BLOCK:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodeGraphPackage.CODE_BLOCK_SUB_GRAPH__CODE_BLOCK:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodeGraphPackage.CODE_BLOCK_SUB_GRAPH__CODE_BLOCK:
				return codeBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeBlockSubGraphImpl
