/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.ReferenceImpl#getTargetContainer <em>Target Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.ReferenceImpl#getTargetField <em>Target Field</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.ReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends TypeImpl implements Reference
{
	/**
	 * The cached value of the '{@link #getTargetContainer() <em>Target Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetContainer()
	 * @generated
	 * @ordered
	 */
	protected es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container targetContainer;

	/**
	 * The cached value of the '{@link #getTargetField() <em>Target Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetField()
	 * @generated
	 * @ordered
	 */
	protected Field targetField;

	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected Attribute referenceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl()
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
		return DatabaseOperationsSchemaPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container getTargetContainer()
	{
		if (targetContainer != null && targetContainer.eIsProxy()) {
			InternalEObject oldTargetContainer = (InternalEObject)targetContainer;
			targetContainer = (es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container)eResolveProxy(oldTargetContainer);
			if (targetContainer != oldTargetContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseOperationsSchemaPackage.REFERENCE__TARGET_CONTAINER, oldTargetContainer, targetContainer));
			}
		}
		return targetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container basicGetTargetContainer()
	{
		return targetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetContainer(es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container newTargetContainer)
	{
		es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container oldTargetContainer = targetContainer;
		targetContainer = newTargetContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.REFERENCE__TARGET_CONTAINER, oldTargetContainer, targetContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field getTargetField()
	{
		if (targetField != null && targetField.eIsProxy()) {
			InternalEObject oldTargetField = (InternalEObject)targetField;
			targetField = (Field)eResolveProxy(oldTargetField);
			if (targetField != oldTargetField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseOperationsSchemaPackage.REFERENCE__TARGET_FIELD, oldTargetField, targetField));
			}
		}
		return targetField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetTargetField()
	{
		return targetField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetField(Field newTargetField)
	{
		Field oldTargetField = targetField;
		targetField = newTargetField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.REFERENCE__TARGET_FIELD, oldTargetField, targetField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getReferenceType()
	{
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceType(Attribute newReferenceType, NotificationChain msgs) {
		Attribute oldReferenceType = referenceType;
		referenceType = newReferenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE, oldReferenceType, newReferenceType);
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
	public void setReferenceType(Attribute newReferenceType) {
		if (newReferenceType != referenceType) {
			NotificationChain msgs = null;
			if (referenceType != null)
				msgs = ((InternalEObject)referenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE, null, msgs);
			if (newReferenceType != null)
				msgs = ((InternalEObject)newReferenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE, null, msgs);
			msgs = basicSetReferenceType(newReferenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE, newReferenceType, newReferenceType));
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
			case DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE:
				return basicSetReferenceType(null, msgs);
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
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_CONTAINER:
				if (resolve) return getTargetContainer();
				return basicGetTargetContainer();
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_FIELD:
				if (resolve) return getTargetField();
				return basicGetTargetField();
			case DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE:
				return getReferenceType();
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
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_CONTAINER:
				setTargetContainer((es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container)newValue);
				return;
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_FIELD:
				setTargetField((Field)newValue);
				return;
			case DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE:
				setReferenceType((Attribute)newValue);
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
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_CONTAINER:
				setTargetContainer((es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container)null);
				return;
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_FIELD:
				setTargetField((Field)null);
				return;
			case DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE:
				setReferenceType((Attribute)null);
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
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_CONTAINER:
				return targetContainer != null;
			case DatabaseOperationsSchemaPackage.REFERENCE__TARGET_FIELD:
				return targetField != null;
			case DatabaseOperationsSchemaPackage.REFERENCE__REFERENCE_TYPE:
				return referenceType != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
