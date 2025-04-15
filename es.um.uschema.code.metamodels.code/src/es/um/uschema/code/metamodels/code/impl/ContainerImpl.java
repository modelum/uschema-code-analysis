/**
 */
package es.um.uschema.code.metamodels.code.impl;

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

import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.CodePackage;
import es.um.uschema.code.metamodels.code.ContainerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.ContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.ContainerImpl#getCodeContainer <em>Code Container</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.ContainerImpl#getSubContainer <em>Sub Container</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.ContainerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements es.um.uschema.code.metamodels.code.Container
{
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerType TYPE_EDEFAULT = ContainerType.FILE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ContainerType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeContainer() <em>Code Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeContainer> codeContainer;

	/**
	 * The cached value of the '{@link #getSubContainer() <em>Sub Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<es.um.uschema.code.metamodels.code.Container> subContainer;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl()
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
		return CodePackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ContainerType newType)
	{
		ContainerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONTAINER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeContainer> getCodeContainer()
	{
		if (codeContainer == null) {
			codeContainer = new EObjectContainmentEList<CodeContainer>(CodeContainer.class, this, CodePackage.CONTAINER__CODE_CONTAINER);
		}
		return codeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<es.um.uschema.code.metamodels.code.Container> getSubContainer()
	{
		if (subContainer == null) {
			subContainer = new EObjectContainmentEList<es.um.uschema.code.metamodels.code.Container>(es.um.uschema.code.metamodels.code.Container.class, this, CodePackage.CONTAINER__SUB_CONTAINER);
		}
		return subContainer;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONTAINER__NAME, oldName, name));
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
			case CodePackage.CONTAINER__CODE_CONTAINER:
				return ((InternalEList<?>)getCodeContainer()).basicRemove(otherEnd, msgs);
			case CodePackage.CONTAINER__SUB_CONTAINER:
				return ((InternalEList<?>)getSubContainer()).basicRemove(otherEnd, msgs);
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
			case CodePackage.CONTAINER__TYPE:
				return getType();
			case CodePackage.CONTAINER__CODE_CONTAINER:
				return getCodeContainer();
			case CodePackage.CONTAINER__SUB_CONTAINER:
				return getSubContainer();
			case CodePackage.CONTAINER__NAME:
				return getName();
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
			case CodePackage.CONTAINER__TYPE:
				setType((ContainerType)newValue);
				return;
			case CodePackage.CONTAINER__CODE_CONTAINER:
				getCodeContainer().clear();
				getCodeContainer().addAll((Collection<? extends CodeContainer>)newValue);
				return;
			case CodePackage.CONTAINER__SUB_CONTAINER:
				getSubContainer().clear();
				getSubContainer().addAll((Collection<? extends es.um.uschema.code.metamodels.code.Container>)newValue);
				return;
			case CodePackage.CONTAINER__NAME:
				setName((String)newValue);
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
			case CodePackage.CONTAINER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CodePackage.CONTAINER__CODE_CONTAINER:
				getCodeContainer().clear();
				return;
			case CodePackage.CONTAINER__SUB_CONTAINER:
				getSubContainer().clear();
				return;
			case CodePackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
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
			case CodePackage.CONTAINER__TYPE:
				return type != TYPE_EDEFAULT;
			case CodePackage.CONTAINER__CODE_CONTAINER:
				return codeContainer != null && !codeContainer.isEmpty();
			case CodePackage.CONTAINER__SUB_CONTAINER:
				return subContainer != null && !subContainer.isEmpty();
			case CodePackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ContainerImpl
