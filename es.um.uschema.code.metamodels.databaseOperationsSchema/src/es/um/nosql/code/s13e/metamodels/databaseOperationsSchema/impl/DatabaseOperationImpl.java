/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl;

import es.um.nosql.code.s13e.metamodels.code.Statement;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.OperationParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl#getFollowingDatabaseOperation <em>Following Database Operation</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl#getPrecedingDatabaseOperation <em>Preceding Database Operation</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl#getTargetingParameter <em>Targeting Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DatabaseOperationImpl extends MinimalEObjectImpl.Container implements DatabaseOperation
{
	/**
	 * The cached value of the '{@link #getFollowingDatabaseOperation() <em>Following Database Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingDatabaseOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseOperation> followingDatabaseOperation;

	/**
	 * The cached value of the '{@link #getPrecedingDatabaseOperation() <em>Preceding Database Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingDatabaseOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseOperation> precedingDatabaseOperation;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container container;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement statement;

	/**
	 * The cached value of the '{@link #getTargetingParameter() <em>Targeting Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetingParameter()
	 * @generated
	 * @ordered
	 */
	protected OperationParameter targetingParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseOperationImpl()
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
		return DatabaseOperationsSchemaPackage.Literals.DATABASE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseOperation> getFollowingDatabaseOperation()
	{
		if (followingDatabaseOperation == null) {
			followingDatabaseOperation = new EObjectResolvingEList<DatabaseOperation>(DatabaseOperation.class, this, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION);
		}
		return followingDatabaseOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseOperation> getPrecedingDatabaseOperation()
	{
		if (precedingDatabaseOperation == null) {
			precedingDatabaseOperation = new EObjectResolvingEList<DatabaseOperation>(DatabaseOperation.class, this, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION);
		}
		return precedingDatabaseOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container getContainer()
	{
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container basicGetContainer()
	{
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container newContainer)
	{
		es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getStatement()
	{
		if (statement != null && statement.eIsProxy()) {
			InternalEObject oldStatement = (InternalEObject)statement;
			statement = (Statement)eResolveProxy(oldStatement);
			if (statement != oldStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__STATEMENT, oldStatement, statement));
			}
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetStatement()
	{
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatement(Statement newStatement)
	{
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameter getTargetingParameter()
	{
		return targetingParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetingParameter(OperationParameter newTargetingParameter, NotificationChain msgs)
	{
		OperationParameter oldTargetingParameter = targetingParameter;
		targetingParameter = newTargetingParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER, oldTargetingParameter, newTargetingParameter);
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
	public void setTargetingParameter(OperationParameter newTargetingParameter)
	{
		if (newTargetingParameter != targetingParameter) {
			NotificationChain msgs = null;
			if (targetingParameter != null)
				msgs = ((InternalEObject)targetingParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER, null, msgs);
			if (newTargetingParameter != null)
				msgs = ((InternalEObject)newTargetingParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER, null, msgs);
			msgs = basicSetTargetingParameter(newTargetingParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER, newTargetingParameter, newTargetingParameter));
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER:
				return basicSetTargetingParameter(null, msgs);
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION:
				return getFollowingDatabaseOperation();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION:
				return getPrecedingDatabaseOperation();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__STATEMENT:
				if (resolve) return getStatement();
				return basicGetStatement();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER:
				return getTargetingParameter();
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION:
				getFollowingDatabaseOperation().clear();
				getFollowingDatabaseOperation().addAll((Collection<? extends DatabaseOperation>)newValue);
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION:
				getPrecedingDatabaseOperation().clear();
				getPrecedingDatabaseOperation().addAll((Collection<? extends DatabaseOperation>)newValue);
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__CONTAINER:
				setContainer((es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container)newValue);
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER:
				setTargetingParameter((OperationParameter)newValue);
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION:
				getFollowingDatabaseOperation().clear();
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION:
				getPrecedingDatabaseOperation().clear();
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__CONTAINER:
				setContainer((es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container)null);
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__STATEMENT:
				setStatement((Statement)null);
				return;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER:
				setTargetingParameter((OperationParameter)null);
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION:
				return followingDatabaseOperation != null && !followingDatabaseOperation.isEmpty();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION:
				return precedingDatabaseOperation != null && !precedingDatabaseOperation.isEmpty();
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__CONTAINER:
				return container != null;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__STATEMENT:
				return statement != null;
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATION__TARGETING_PARAMETER:
				return targetingParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseOperationImpl
