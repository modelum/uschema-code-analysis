/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.CompositionImpl#getDataStructure <em>Data Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends TypeImpl implements Composition
{
	/**
	 * The cached value of the '{@link #getDataStructure() <em>Data Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStructure()
	 * @generated
	 * @ordered
	 */
	protected DataStructure dataStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl()
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
		return DatabaseOperationsSchemaPackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStructure getDataStructure()
	{
		return dataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStructure(DataStructure newDataStructure, NotificationChain msgs)
	{
		DataStructure oldDataStructure = dataStructure;
		dataStructure = newDataStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE, oldDataStructure, newDataStructure);
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
	public void setDataStructure(DataStructure newDataStructure)
	{
		if (newDataStructure != dataStructure) {
			NotificationChain msgs = null;
			if (dataStructure != null)
				msgs = ((InternalEObject)dataStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE, null, msgs);
			if (newDataStructure != null)
				msgs = ((InternalEObject)newDataStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE, null, msgs);
			msgs = basicSetDataStructure(newDataStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE, newDataStructure, newDataStructure));
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
			case DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE:
				return basicSetDataStructure(null, msgs);
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
			case DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE:
				return getDataStructure();
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
			case DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE:
				setDataStructure((DataStructure)newValue);
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
			case DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE:
				setDataStructure((DataStructure)null);
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
			case DatabaseOperationsSchemaPackage.COMPOSITION__DATA_STRUCTURE:
				return dataStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionImpl
