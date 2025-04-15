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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.code.CodePackage;
import es.um.uschema.code.metamodels.code.Type;
import es.um.uschema.code.metamodels.code.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CodeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CodeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CodeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CodeImpl#getException <em>Exception</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.code.impl.CodeImpl#getGlobalVariable <em>Global Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeImpl extends MinimalEObjectImpl.Container implements Code
{
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<es.um.uschema.code.metamodels.code.Container> container;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<es.um.uschema.code.metamodels.code.Exception> exception;

	/**
	 * The cached value of the '{@link #getGlobalVariable() <em>Global Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> globalVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeImpl()
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
		return CodePackage.Literals.CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage()
	{
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage)
	{
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<es.um.uschema.code.metamodels.code.Container> getContainer()
	{
		if (container == null) {
			container = new EObjectContainmentEList<es.um.uschema.code.metamodels.code.Container>(es.um.uschema.code.metamodels.code.Container.class, this, CodePackage.CODE__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes()
	{
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, CodePackage.CODE__TYPES);
		}
		return types;
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
			exception = new EObjectContainmentEList<es.um.uschema.code.metamodels.code.Exception>(es.um.uschema.code.metamodels.code.Exception.class, this, CodePackage.CODE__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getGlobalVariable()
	{
		if (globalVariable == null) {
			globalVariable = new EObjectContainmentEList<Variable>(Variable.class, this, CodePackage.CODE__GLOBAL_VARIABLE);
		}
		return globalVariable;
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
			case CodePackage.CODE__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
			case CodePackage.CODE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case CodePackage.CODE__EXCEPTION:
				return ((InternalEList<?>)getException()).basicRemove(otherEnd, msgs);
			case CodePackage.CODE__GLOBAL_VARIABLE:
				return ((InternalEList<?>)getGlobalVariable()).basicRemove(otherEnd, msgs);
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
			case CodePackage.CODE__LANGUAGE:
				return getLanguage();
			case CodePackage.CODE__CONTAINER:
				return getContainer();
			case CodePackage.CODE__TYPES:
				return getTypes();
			case CodePackage.CODE__EXCEPTION:
				return getException();
			case CodePackage.CODE__GLOBAL_VARIABLE:
				return getGlobalVariable();
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
			case CodePackage.CODE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case CodePackage.CODE__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends es.um.uschema.code.metamodels.code.Container>)newValue);
				return;
			case CodePackage.CODE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case CodePackage.CODE__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends es.um.uschema.code.metamodels.code.Exception>)newValue);
				return;
			case CodePackage.CODE__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
				getGlobalVariable().addAll((Collection<? extends Variable>)newValue);
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
			case CodePackage.CODE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case CodePackage.CODE__CONTAINER:
				getContainer().clear();
				return;
			case CodePackage.CODE__TYPES:
				getTypes().clear();
				return;
			case CodePackage.CODE__EXCEPTION:
				getException().clear();
				return;
			case CodePackage.CODE__GLOBAL_VARIABLE:
				getGlobalVariable().clear();
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
			case CodePackage.CODE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case CodePackage.CODE__CONTAINER:
				return container != null && !container.isEmpty();
			case CodePackage.CODE__TYPES:
				return types != null && !types.isEmpty();
			case CodePackage.CODE__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case CodePackage.CODE__GLOBAL_VARIABLE:
				return globalVariable != null && !globalVariable.isEmpty();
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
		result.append(" (language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //CodeImpl
