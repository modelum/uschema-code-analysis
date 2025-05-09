/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema.impl;

import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.FieldImpl#getDuplicatedField <em>Duplicated Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

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
	 * The cached value of the '{@link #getDuplicatedField() <em>Duplicated Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicatedField()
	 * @generated
	 * @ordered
	 */
	protected Field duplicatedField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseOperationsSchemaPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.FIELD__TYPE, oldType, newType);
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
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.FIELD__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.FIELD__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.FIELD__TYPE, newType, newType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field getDuplicatedField() {
		if (duplicatedField != null && duplicatedField.eIsProxy()) {
			InternalEObject oldDuplicatedField = (InternalEObject)duplicatedField;
			duplicatedField = (Field)eResolveProxy(oldDuplicatedField);
			if (duplicatedField != oldDuplicatedField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseOperationsSchemaPackage.FIELD__DUPLICATED_FIELD, oldDuplicatedField, duplicatedField));
			}
		}
		return duplicatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetDuplicatedField() {
		return duplicatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuplicatedField(Field newDuplicatedField) {
		Field oldDuplicatedField = duplicatedField;
		duplicatedField = newDuplicatedField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.FIELD__DUPLICATED_FIELD, oldDuplicatedField, duplicatedField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseOperationsSchemaPackage.FIELD__TYPE:
				return basicSetType(null, msgs);
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
			case DatabaseOperationsSchemaPackage.FIELD__TYPE:
				return getType();
			case DatabaseOperationsSchemaPackage.FIELD__NAME:
				return getName();
			case DatabaseOperationsSchemaPackage.FIELD__DUPLICATED_FIELD:
				if (resolve) return getDuplicatedField();
				return basicGetDuplicatedField();
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
			case DatabaseOperationsSchemaPackage.FIELD__TYPE:
				setType((Type)newValue);
				return;
			case DatabaseOperationsSchemaPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case DatabaseOperationsSchemaPackage.FIELD__DUPLICATED_FIELD:
				setDuplicatedField((Field)newValue);
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
			case DatabaseOperationsSchemaPackage.FIELD__TYPE:
				setType((Type)null);
				return;
			case DatabaseOperationsSchemaPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatabaseOperationsSchemaPackage.FIELD__DUPLICATED_FIELD:
				setDuplicatedField((Field)null);
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
			case DatabaseOperationsSchemaPackage.FIELD__TYPE:
				return type != null;
			case DatabaseOperationsSchemaPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatabaseOperationsSchemaPackage.FIELD__DUPLICATED_FIELD:
				return duplicatedField != null;
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

} //FieldImpl
