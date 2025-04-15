/**
 */
package es.um.uschema.code.metamodels.code.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.um.uschema.code.metamodels.code.CodePackage;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Property;
import es.um.uschema.code.metamodels.code.PropertyAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl#getNextAccess <em>Next Access</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAccessImpl extends DataProducerImpl implements PropertyAccess
{
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

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
	 * The cached value of the '{@link #getNextAccess() <em>Next Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextAccess()
	 * @generated
	 * @ordered
	 */
	protected PropertyAccess nextAccess;

	/**
	 * The cached value of the '{@link #getDataProducer() <em>Data Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProducer()
	 * @generated
	 * @ordered
	 */
	protected DataProducer dataProducer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAccessImpl()
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
		return CodePackage.Literals.PROPERTY_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getProperty()
	{
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.PROPERTY_ACCESS__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty()
	{
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(Property newProperty)
	{
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PROPERTY_ACCESS__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PROPERTY_ACCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAccess getNextAccess()
	{
		return nextAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextAccess(PropertyAccess newNextAccess, NotificationChain msgs)
	{
		PropertyAccess oldNextAccess = nextAccess;
		nextAccess = newNextAccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.PROPERTY_ACCESS__NEXT_ACCESS, oldNextAccess, newNextAccess);
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
	public void setNextAccess(PropertyAccess newNextAccess)
	{
		if (newNextAccess != nextAccess) {
			NotificationChain msgs = null;
			if (nextAccess != null)
				msgs = ((InternalEObject)nextAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.PROPERTY_ACCESS__NEXT_ACCESS, null, msgs);
			if (newNextAccess != null)
				msgs = ((InternalEObject)newNextAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.PROPERTY_ACCESS__NEXT_ACCESS, null, msgs);
			msgs = basicSetNextAccess(newNextAccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PROPERTY_ACCESS__NEXT_ACCESS, newNextAccess, newNextAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProducer getDataProducer()
	{
		return dataProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProducer(DataProducer newDataProducer, NotificationChain msgs)
	{
		DataProducer oldDataProducer = dataProducer;
		dataProducer = newDataProducer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.PROPERTY_ACCESS__DATA_PRODUCER, oldDataProducer, newDataProducer);
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
	public void setDataProducer(DataProducer newDataProducer)
	{
		if (newDataProducer != dataProducer) {
			NotificationChain msgs = null;
			if (dataProducer != null)
				msgs = ((InternalEObject)dataProducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.PROPERTY_ACCESS__DATA_PRODUCER, null, msgs);
			if (newDataProducer != null)
				msgs = ((InternalEObject)newDataProducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.PROPERTY_ACCESS__DATA_PRODUCER, null, msgs);
			msgs = basicSetDataProducer(newDataProducer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PROPERTY_ACCESS__DATA_PRODUCER, newDataProducer, newDataProducer));
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
			case CodePackage.PROPERTY_ACCESS__NEXT_ACCESS:
				return basicSetNextAccess(null, msgs);
			case CodePackage.PROPERTY_ACCESS__DATA_PRODUCER:
				return basicSetDataProducer(null, msgs);
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
			case CodePackage.PROPERTY_ACCESS__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case CodePackage.PROPERTY_ACCESS__NAME:
				return getName();
			case CodePackage.PROPERTY_ACCESS__NEXT_ACCESS:
				return getNextAccess();
			case CodePackage.PROPERTY_ACCESS__DATA_PRODUCER:
				return getDataProducer();
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
			case CodePackage.PROPERTY_ACCESS__PROPERTY:
				setProperty((Property)newValue);
				return;
			case CodePackage.PROPERTY_ACCESS__NAME:
				setName((String)newValue);
				return;
			case CodePackage.PROPERTY_ACCESS__NEXT_ACCESS:
				setNextAccess((PropertyAccess)newValue);
				return;
			case CodePackage.PROPERTY_ACCESS__DATA_PRODUCER:
				setDataProducer((DataProducer)newValue);
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
			case CodePackage.PROPERTY_ACCESS__PROPERTY:
				setProperty((Property)null);
				return;
			case CodePackage.PROPERTY_ACCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodePackage.PROPERTY_ACCESS__NEXT_ACCESS:
				setNextAccess((PropertyAccess)null);
				return;
			case CodePackage.PROPERTY_ACCESS__DATA_PRODUCER:
				setDataProducer((DataProducer)null);
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
			case CodePackage.PROPERTY_ACCESS__PROPERTY:
				return property != null;
			case CodePackage.PROPERTY_ACCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CodePackage.PROPERTY_ACCESS__NEXT_ACCESS:
				return nextAccess != null;
			case CodePackage.PROPERTY_ACCESS__DATA_PRODUCER:
				return dataProducer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PropertyAccessImpl
