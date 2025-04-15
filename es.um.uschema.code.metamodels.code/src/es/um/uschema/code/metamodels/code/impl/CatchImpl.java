/**
 */
package es.um.uschema.code.metamodels.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.um.uschema.code.metamodels.code.Catch;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.CodePackage;
import es.um.uschema.code.metamodels.code.DataProducer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CatchImpl#getException <em>Exception</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CatchImpl#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CatchImpl#getDataProducer <em>Data Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchImpl extends StatementImpl implements Catch
{
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<es.um.uschema.code.metamodels.code.Exception> exception;

	/**
	 * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBlock()
	 * @generated
	 * @ordered
	 */
	protected CodeBlock codeBlock;

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
	protected CatchImpl()
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
		return CodePackage.Literals.CATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<es.um.uschema.code.metamodels.code.Exception> getException()
	{
		if (exception == null) {
			exception = new EObjectResolvingEList<es.um.uschema.code.metamodels.code.Exception>(es.um.uschema.code.metamodels.code.Exception.class, this, CodePackage.CATCH__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlock getCodeBlock()
	{
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeBlock(CodeBlock newCodeBlock, NotificationChain msgs)
	{
		CodeBlock oldCodeBlock = codeBlock;
		codeBlock = newCodeBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.CATCH__CODE_BLOCK, oldCodeBlock, newCodeBlock);
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
	public void setCodeBlock(CodeBlock newCodeBlock)
	{
		if (newCodeBlock != codeBlock) {
			NotificationChain msgs = null;
			if (codeBlock != null)
				msgs = ((InternalEObject)codeBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.CATCH__CODE_BLOCK, null, msgs);
			if (newCodeBlock != null)
				msgs = ((InternalEObject)newCodeBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.CATCH__CODE_BLOCK, null, msgs);
			msgs = basicSetCodeBlock(newCodeBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CATCH__CODE_BLOCK, newCodeBlock, newCodeBlock));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.CATCH__DATA_PRODUCER, oldDataProducer, newDataProducer);
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
				msgs = ((InternalEObject)dataProducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.CATCH__DATA_PRODUCER, null, msgs);
			if (newDataProducer != null)
				msgs = ((InternalEObject)newDataProducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.CATCH__DATA_PRODUCER, null, msgs);
			msgs = basicSetDataProducer(newDataProducer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CATCH__DATA_PRODUCER, newDataProducer, newDataProducer));
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
			case CodePackage.CATCH__CODE_BLOCK:
				return basicSetCodeBlock(null, msgs);
			case CodePackage.CATCH__DATA_PRODUCER:
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
			case CodePackage.CATCH__EXCEPTION:
				return getException();
			case CodePackage.CATCH__CODE_BLOCK:
				return getCodeBlock();
			case CodePackage.CATCH__DATA_PRODUCER:
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
			case CodePackage.CATCH__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends es.um.uschema.code.metamodels.code.Exception>)newValue);
				return;
			case CodePackage.CATCH__CODE_BLOCK:
				setCodeBlock((CodeBlock)newValue);
				return;
			case CodePackage.CATCH__DATA_PRODUCER:
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
			case CodePackage.CATCH__EXCEPTION:
				getException().clear();
				return;
			case CodePackage.CATCH__CODE_BLOCK:
				setCodeBlock((CodeBlock)null);
				return;
			case CodePackage.CATCH__DATA_PRODUCER:
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
			case CodePackage.CATCH__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case CodePackage.CATCH__CODE_BLOCK:
				return codeBlock != null;
			case CodePackage.CATCH__DATA_PRODUCER:
				return dataProducer != null;
		}
		return super.eIsSet(featureID);
	}

} //CatchImpl
