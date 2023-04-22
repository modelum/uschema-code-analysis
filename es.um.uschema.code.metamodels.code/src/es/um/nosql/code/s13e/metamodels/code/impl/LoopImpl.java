/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.Loop;
import es.um.nosql.code.s13e.metamodels.code.LoopPart;
import es.um.nosql.code.s13e.metamodels.code.LoopType;

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
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.LoopImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.LoopImpl#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.LoopImpl#getLoopPart <em>Loop Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends StatementImpl implements Loop
{
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LoopType TYPE_EDEFAULT = LoopType.WHILE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LoopType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getLoopPart() <em>Loop Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopPart()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopPart> loopPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl()
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
		return CodePackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(LoopType newType)
	{
		LoopType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.LOOP__TYPE, oldType, type));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.LOOP__CODE_BLOCK, oldCodeBlock, newCodeBlock);
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
				msgs = ((InternalEObject)codeBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.LOOP__CODE_BLOCK, null, msgs);
			if (newCodeBlock != null)
				msgs = ((InternalEObject)newCodeBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.LOOP__CODE_BLOCK, null, msgs);
			msgs = basicSetCodeBlock(newCodeBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.LOOP__CODE_BLOCK, newCodeBlock, newCodeBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoopPart> getLoopPart()
	{
		if (loopPart == null) {
			loopPart = new EObjectContainmentEList<LoopPart>(LoopPart.class, this, CodePackage.LOOP__LOOP_PART);
		}
		return loopPart;
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
			case CodePackage.LOOP__CODE_BLOCK:
				return basicSetCodeBlock(null, msgs);
			case CodePackage.LOOP__LOOP_PART:
				return ((InternalEList<?>)getLoopPart()).basicRemove(otherEnd, msgs);
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
			case CodePackage.LOOP__TYPE:
				return getType();
			case CodePackage.LOOP__CODE_BLOCK:
				return getCodeBlock();
			case CodePackage.LOOP__LOOP_PART:
				return getLoopPart();
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
			case CodePackage.LOOP__TYPE:
				setType((LoopType)newValue);
				return;
			case CodePackage.LOOP__CODE_BLOCK:
				setCodeBlock((CodeBlock)newValue);
				return;
			case CodePackage.LOOP__LOOP_PART:
				getLoopPart().clear();
				getLoopPart().addAll((Collection<? extends LoopPart>)newValue);
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
			case CodePackage.LOOP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CodePackage.LOOP__CODE_BLOCK:
				setCodeBlock((CodeBlock)null);
				return;
			case CodePackage.LOOP__LOOP_PART:
				getLoopPart().clear();
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
			case CodePackage.LOOP__TYPE:
				return type != TYPE_EDEFAULT;
			case CodePackage.LOOP__CODE_BLOCK:
				return codeBlock != null;
			case CodePackage.LOOP__LOOP_PART:
				return loopPart != null && !loopPart.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LoopImpl
