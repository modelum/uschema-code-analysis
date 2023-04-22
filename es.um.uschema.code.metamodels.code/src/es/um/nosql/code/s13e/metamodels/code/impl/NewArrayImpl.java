/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.NewArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.NewArrayImpl#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewArrayImpl extends DataProducerImpl implements NewArray
{
	/**
	 * The cached value of the '{@link #getDataProducer() <em>Data Producer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProducer()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProducer> dataProducer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewArrayImpl()
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
		return CodePackage.Literals.NEW_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataProducer> getDataProducer()
	{
		if (dataProducer == null) {
			dataProducer = new EObjectContainmentEList<DataProducer>(DataProducer.class, this, CodePackage.NEW_ARRAY__DATA_PRODUCER);
		}
		return dataProducer;
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
			case CodePackage.NEW_ARRAY__DATA_PRODUCER:
				return ((InternalEList<?>)getDataProducer()).basicRemove(otherEnd, msgs);
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
			case CodePackage.NEW_ARRAY__DATA_PRODUCER:
				return getDataProducer();
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
			case CodePackage.NEW_ARRAY__DATA_PRODUCER:
				getDataProducer().clear();
				getDataProducer().addAll((Collection<? extends DataProducer>)newValue);
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
			case CodePackage.NEW_ARRAY__DATA_PRODUCER:
				getDataProducer().clear();
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
			case CodePackage.NEW_ARRAY__DATA_PRODUCER:
				return dataProducer != null && !dataProducer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NewArrayImpl
