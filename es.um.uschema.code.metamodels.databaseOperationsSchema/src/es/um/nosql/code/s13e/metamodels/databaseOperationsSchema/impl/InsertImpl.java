/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Insert;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.InsertImpl#getInsertDataStructure <em>Insert Data Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertImpl extends DatabaseOperationImpl implements Insert
{
	/**
	 * The cached value of the '{@link #getInsertDataStructure() <em>Insert Data Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertDataStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStructure> insertDataStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertImpl()
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
		return DatabaseOperationsSchemaPackage.Literals.INSERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataStructure> getInsertDataStructure()
	{
		if (insertDataStructure == null) {
			insertDataStructure = new EObjectResolvingEList<DataStructure>(DataStructure.class, this, DatabaseOperationsSchemaPackage.INSERT__INSERT_DATA_STRUCTURE);
		}
		return insertDataStructure;
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
			case DatabaseOperationsSchemaPackage.INSERT__INSERT_DATA_STRUCTURE:
				return getInsertDataStructure();
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
			case DatabaseOperationsSchemaPackage.INSERT__INSERT_DATA_STRUCTURE:
				getInsertDataStructure().clear();
				getInsertDataStructure().addAll((Collection<? extends DataStructure>)newValue);
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
			case DatabaseOperationsSchemaPackage.INSERT__INSERT_DATA_STRUCTURE:
				getInsertDataStructure().clear();
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
			case DatabaseOperationsSchemaPackage.INSERT__INSERT_DATA_STRUCTURE:
				return insertDataStructure != null && !insertDataStructure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsertImpl
