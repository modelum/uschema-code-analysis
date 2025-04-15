/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema.impl;

import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.OperationParameter;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.OperationParameterImpl#getParameterFields <em>Parameter Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationParameterImpl extends MinimalEObjectImpl.Container implements OperationParameter {
	/**
	 * The cached value of the '{@link #getParameterFields() <em>Parameter Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> parameterFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseOperationsSchemaPackage.Literals.OPERATION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getParameterFields() {
		if (parameterFields == null) {
			parameterFields = new EObjectResolvingEList<Field>(Field.class, this, DatabaseOperationsSchemaPackage.OPERATION_PARAMETER__PARAMETER_FIELDS);
		}
		return parameterFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseOperationsSchemaPackage.OPERATION_PARAMETER__PARAMETER_FIELDS:
				return getParameterFields();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabaseOperationsSchemaPackage.OPERATION_PARAMETER__PARAMETER_FIELDS:
				getParameterFields().clear();
				getParameterFields().addAll((Collection<? extends Field>)newValue);
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
			case DatabaseOperationsSchemaPackage.OPERATION_PARAMETER__PARAMETER_FIELDS:
				getParameterFields().clear();
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
			case DatabaseOperationsSchemaPackage.OPERATION_PARAMETER__PARAMETER_FIELDS:
				return parameterFields != null && !parameterFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationParameterImpl
