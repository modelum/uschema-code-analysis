/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.UnaryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.UnaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.UnaryExpressionImpl#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExpressionImpl extends ExpressionImpl implements UnaryExpression
{
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

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
	protected UnaryExpressionImpl()
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
		return CodePackage.Literals.UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator()
	{
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(String newOperator)
	{
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.UNARY_EXPRESSION__OPERATOR, oldOperator, operator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.UNARY_EXPRESSION__DATA_PRODUCER, oldDataProducer, newDataProducer);
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
				msgs = ((InternalEObject)dataProducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.UNARY_EXPRESSION__DATA_PRODUCER, null, msgs);
			if (newDataProducer != null)
				msgs = ((InternalEObject)newDataProducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.UNARY_EXPRESSION__DATA_PRODUCER, null, msgs);
			msgs = basicSetDataProducer(newDataProducer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.UNARY_EXPRESSION__DATA_PRODUCER, newDataProducer, newDataProducer));
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
			case CodePackage.UNARY_EXPRESSION__DATA_PRODUCER:
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
			case CodePackage.UNARY_EXPRESSION__OPERATOR:
				return getOperator();
			case CodePackage.UNARY_EXPRESSION__DATA_PRODUCER:
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
			case CodePackage.UNARY_EXPRESSION__OPERATOR:
				setOperator((String)newValue);
				return;
			case CodePackage.UNARY_EXPRESSION__DATA_PRODUCER:
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
			case CodePackage.UNARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CodePackage.UNARY_EXPRESSION__DATA_PRODUCER:
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
			case CodePackage.UNARY_EXPRESSION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case CodePackage.UNARY_EXPRESSION__DATA_PRODUCER:
				return dataProducer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //UnaryExpressionImpl
