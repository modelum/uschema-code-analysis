/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Operations Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaImpl#getDatabaseOperations <em>Database Operations</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaImpl#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseOperationsSchemaImpl extends MinimalEObjectImpl.Container implements DatabaseOperationsSchema
{
	/**
	 * The cached value of the '{@link #getDatabaseOperations() <em>Database Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseOperation> databaseOperations;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container> containers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseOperationsSchemaImpl()
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
		return DatabaseOperationsSchemaPackage.Literals.DATABASE_OPERATIONS_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseOperation> getDatabaseOperations()
	{
		if (databaseOperations == null) {
			databaseOperations = new EObjectContainmentEList<DatabaseOperation>(DatabaseOperation.class, this, DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS);
		}
		return databaseOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container> getContainers()
	{
		if (containers == null) {
			containers = new EObjectContainmentEList<es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container>(es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container.class, this, DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__CONTAINERS);
		}
		return containers;
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS:
				return ((InternalEList<?>)getDatabaseOperations()).basicRemove(otherEnd, msgs);
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS:
				return getDatabaseOperations();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__CONTAINERS:
				return getContainers();
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS:
				getDatabaseOperations().clear();
				getDatabaseOperations().addAll((Collection<? extends DatabaseOperation>)newValue);
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container>)newValue);
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS:
				getDatabaseOperations().clear();
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__CONTAINERS:
				getContainers().clear();
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS:
				return databaseOperations != null && !databaseOperations.isEmpty();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA__CONTAINERS:
				return containers != null && !containers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseOperationsSchemaImpl
