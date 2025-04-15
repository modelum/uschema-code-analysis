/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema.impl;

import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Read;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReadImpl#getResultDataStructure <em>Result Data Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadImpl extends DatabaseOperationImpl implements Read {
	/**
	 * The cached value of the '{@link #getResultDataStructure() <em>Result Data Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDataStructure()
	 * @generated
	 * @ordered
	 */
	protected DataStructure resultDataStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseOperationsSchemaPackage.Literals.READ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStructure getResultDataStructure() {
		if (resultDataStructure != null && resultDataStructure.eIsProxy()) {
			InternalEObject oldResultDataStructure = (InternalEObject)resultDataStructure;
			resultDataStructure = (DataStructure)eResolveProxy(oldResultDataStructure);
			if (resultDataStructure != oldResultDataStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseOperationsSchemaPackage.READ__RESULT_DATA_STRUCTURE, oldResultDataStructure, resultDataStructure));
			}
		}
		return resultDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructure basicGetResultDataStructure() {
		return resultDataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultDataStructure(DataStructure newResultDataStructure) {
		DataStructure oldResultDataStructure = resultDataStructure;
		resultDataStructure = newResultDataStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.READ__RESULT_DATA_STRUCTURE, oldResultDataStructure, resultDataStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseOperationsSchemaPackage.READ__RESULT_DATA_STRUCTURE:
				if (resolve) return getResultDataStructure();
				return basicGetResultDataStructure();
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
			case DatabaseOperationsSchemaPackage.READ__RESULT_DATA_STRUCTURE:
				setResultDataStructure((DataStructure)newValue);
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
			case DatabaseOperationsSchemaPackage.READ__RESULT_DATA_STRUCTURE:
				setResultDataStructure((DataStructure)null);
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
			case DatabaseOperationsSchemaPackage.READ__RESULT_DATA_STRUCTURE:
				return resultDataStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //ReadImpl
