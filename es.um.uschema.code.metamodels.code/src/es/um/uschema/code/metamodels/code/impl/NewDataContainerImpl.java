/**
 */
package es.um.uschema.code.metamodels.code.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.um.uschema.code.metamodels.code.CodePackage;
import es.um.uschema.code.metamodels.code.DataContainer;
import es.um.uschema.code.metamodels.code.NewDataContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Data Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.NewDataContainerImpl#getDataContainer <em>Data Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewDataContainerImpl extends DataProducerImpl implements NewDataContainer
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewDataContainerImpl()
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
		return CodePackage.Literals.NEW_DATA_CONTAINER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER, oldDataContainer, newDataContainer);
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
				msgs = ((InternalEObject)dataContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER, null, msgs);
			if (newDataContainer != null)
				msgs = ((InternalEObject)newDataContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER, null, msgs);
			msgs = basicSetDataContainer(newDataContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER, newDataContainer, newDataContainer));
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
			case CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER:
				return basicSetDataContainer(null, msgs);
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
			case CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER:
				return getDataContainer();
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
			case CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER:
				setDataContainer((DataContainer)newValue);
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
			case CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER:
				setDataContainer((DataContainer)null);
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
			case CodePackage.NEW_DATA_CONTAINER__DATA_CONTAINER:
				return dataContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //NewDataContainerImpl
