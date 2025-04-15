/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema.impl;

import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.uschema.code.metamodels.databaseOperationsSchema.OperationParameter;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Update;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.UpdateImpl#getUpdateParameter <em>Update Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateImpl extends DatabaseOperationImpl implements Update {
	/**
	 * The cached value of the '{@link #getUpdateParameter() <em>Update Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateParameter()
	 * @generated
	 * @ordered
	 */
	protected OperationParameter updateParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseOperationsSchemaPackage.Literals.UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameter getUpdateParameter() {
		return updateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateParameter(OperationParameter newUpdateParameter, NotificationChain msgs) {
		OperationParameter oldUpdateParameter = updateParameter;
		updateParameter = newUpdateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER, oldUpdateParameter, newUpdateParameter);
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
	public void setUpdateParameter(OperationParameter newUpdateParameter) {
		if (newUpdateParameter != updateParameter) {
			NotificationChain msgs = null;
			if (updateParameter != null)
				msgs = ((InternalEObject)updateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER, null, msgs);
			if (newUpdateParameter != null)
				msgs = ((InternalEObject)newUpdateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER, null, msgs);
			msgs = basicSetUpdateParameter(newUpdateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER, newUpdateParameter, newUpdateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER:
				return basicSetUpdateParameter(null, msgs);
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
			case DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER:
				return getUpdateParameter();
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
			case DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER:
				setUpdateParameter((OperationParameter)newValue);
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
			case DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER:
				setUpdateParameter((OperationParameter)null);
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
			case DatabaseOperationsSchemaPackage.UPDATE__UPDATE_PARAMETER:
				return updateParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateImpl
