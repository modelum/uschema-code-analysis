/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.CodeContainerType;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.Variable;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeContainerImpl#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeContainerImpl#getDataContainer <em>Data Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeContainerImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeContainerImpl extends TypeImpl implements CodeContainer
{
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CodeContainerType TYPE_EDEFAULT = CodeContainerType.CLASS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeContainerType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeBlock> codeBlock;

	/**
	 * The cached value of the '{@link #getDataContainer() <em>Data Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataContainer()
	 * @generated
	 * @ordered
	 */
	protected DataContainer dataContainer;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeContainerImpl()
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
		return CodePackage.Literals.CODE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeContainerType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CodeContainerType newType)
	{
		CodeContainerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE_CONTAINER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeBlock> getCodeBlock()
	{
		if (codeBlock == null) {
			codeBlock = new EObjectContainmentEList<CodeBlock>(CodeBlock.class, this, CodePackage.CODE_CONTAINER__CODE_BLOCK);
		}
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataContainer getDataContainer()
	{
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataContainer(DataContainer newDataContainer, NotificationChain msgs)
	{
		DataContainer oldDataContainer = dataContainer;
		dataContainer = newDataContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.CODE_CONTAINER__DATA_CONTAINER, oldDataContainer, newDataContainer);
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
	public void setDataContainer(DataContainer newDataContainer)
	{
		if (newDataContainer != dataContainer) {
			NotificationChain msgs = null;
			if (dataContainer != null)
				msgs = ((InternalEObject)dataContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.CODE_CONTAINER__DATA_CONTAINER, null, msgs);
			if (newDataContainer != null)
				msgs = ((InternalEObject)newDataContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.CODE_CONTAINER__DATA_CONTAINER, null, msgs);
			msgs = basicSetDataContainer(newDataContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE_CONTAINER__DATA_CONTAINER, newDataContainer, newDataContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariable()
	{
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, CodePackage.CODE_CONTAINER__VARIABLE);
		}
		return variable;
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
			case CodePackage.CODE_CONTAINER__CODE_BLOCK:
				return ((InternalEList<?>)getCodeBlock()).basicRemove(otherEnd, msgs);
			case CodePackage.CODE_CONTAINER__DATA_CONTAINER:
				return basicSetDataContainer(null, msgs);
			case CodePackage.CODE_CONTAINER__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
			case CodePackage.CODE_CONTAINER__TYPE:
				return getType();
			case CodePackage.CODE_CONTAINER__NAME:
				return getName();
			case CodePackage.CODE_CONTAINER__CODE_BLOCK:
				return getCodeBlock();
			case CodePackage.CODE_CONTAINER__DATA_CONTAINER:
				return getDataContainer();
			case CodePackage.CODE_CONTAINER__VARIABLE:
				return getVariable();
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
			case CodePackage.CODE_CONTAINER__TYPE:
				setType((CodeContainerType)newValue);
				return;
			case CodePackage.CODE_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case CodePackage.CODE_CONTAINER__CODE_BLOCK:
				getCodeBlock().clear();
				getCodeBlock().addAll((Collection<? extends CodeBlock>)newValue);
				return;
			case CodePackage.CODE_CONTAINER__DATA_CONTAINER:
				setDataContainer((DataContainer)newValue);
				return;
			case CodePackage.CODE_CONTAINER__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
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
			case CodePackage.CODE_CONTAINER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CodePackage.CODE_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodePackage.CODE_CONTAINER__CODE_BLOCK:
				getCodeBlock().clear();
				return;
			case CodePackage.CODE_CONTAINER__DATA_CONTAINER:
				setDataContainer((DataContainer)null);
				return;
			case CodePackage.CODE_CONTAINER__VARIABLE:
				getVariable().clear();
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
			case CodePackage.CODE_CONTAINER__TYPE:
				return type != TYPE_EDEFAULT;
			case CodePackage.CODE_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CodePackage.CODE_CONTAINER__CODE_BLOCK:
				return codeBlock != null && !codeBlock.isEmpty();
			case CodePackage.CODE_CONTAINER__DATA_CONTAINER:
				return dataContainer != null;
			case CodePackage.CODE_CONTAINER__VARIABLE:
				return variable != null && !variable.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CodeContainerImpl
