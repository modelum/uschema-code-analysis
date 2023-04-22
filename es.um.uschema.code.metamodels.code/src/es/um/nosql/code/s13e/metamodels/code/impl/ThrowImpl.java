/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Throw;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.ThrowImpl#getException <em>Exception</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.ThrowImpl#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrowImpl extends StatementImpl implements Throw
{
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected es.um.nosql.code.s13e.metamodels.code.Exception exception;

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
	protected ThrowImpl()
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
		return CodePackage.Literals.THROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public es.um.nosql.code.s13e.metamodels.code.Exception getException()
	{
		if (exception != null && exception.eIsProxy()) {
			InternalEObject oldException = (InternalEObject)exception;
			exception = (es.um.nosql.code.s13e.metamodels.code.Exception)eResolveProxy(oldException);
			if (exception != oldException) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.THROW__EXCEPTION, oldException, exception));
			}
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.um.nosql.code.s13e.metamodels.code.Exception basicGetException()
	{
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setException(es.um.nosql.code.s13e.metamodels.code.Exception newException)
	{
		es.um.nosql.code.s13e.metamodels.code.Exception oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.THROW__EXCEPTION, oldException, exception));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.THROW__DATA_PRODUCER, oldDataProducer, newDataProducer);
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
				msgs = ((InternalEObject)dataProducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.THROW__DATA_PRODUCER, null, msgs);
			if (newDataProducer != null)
				msgs = ((InternalEObject)newDataProducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.THROW__DATA_PRODUCER, null, msgs);
			msgs = basicSetDataProducer(newDataProducer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.THROW__DATA_PRODUCER, newDataProducer, newDataProducer));
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
			case CodePackage.THROW__DATA_PRODUCER:
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
			case CodePackage.THROW__EXCEPTION:
				if (resolve) return getException();
				return basicGetException();
			case CodePackage.THROW__DATA_PRODUCER:
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
			case CodePackage.THROW__EXCEPTION:
				setException((es.um.nosql.code.s13e.metamodels.code.Exception)newValue);
				return;
			case CodePackage.THROW__DATA_PRODUCER:
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
			case CodePackage.THROW__EXCEPTION:
				setException((es.um.nosql.code.s13e.metamodels.code.Exception)null);
				return;
			case CodePackage.THROW__DATA_PRODUCER:
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
			case CodePackage.THROW__EXCEPTION:
				return exception != null;
			case CodePackage.THROW__DATA_PRODUCER:
				return dataProducer != null;
		}
		return super.eIsSet(featureID);
	}

} //ThrowImpl
