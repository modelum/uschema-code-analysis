/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Type;
import es.um.nosql.code.s13e.metamodels.code.Variable;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeBlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeBlockImpl#getCodeBlockType <em>Code Block Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeBlockImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.CodeBlockImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeBlockImpl extends MinimalEObjectImpl.Container implements CodeBlock
{
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The default value of the '{@link #getCodeBlockType() <em>Code Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBlockType()
	 * @generated
	 * @ordered
	 */
	protected static final CodeBlockType CODE_BLOCK_TYPE_EDEFAULT = CodeBlockType.FUNCTION;

	/**
	 * The cached value of the '{@link #getCodeBlockType() <em>Code Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBlockType()
	 * @generated
	 * @ordered
	 */
	protected CodeBlockType codeBlockType = CODE_BLOCK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockImpl()
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
		return CodePackage.Literals.CODE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getStatements()
	{
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, CodePackage.CODE_BLOCK__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlockType getCodeBlockType()
	{
		return codeBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeBlockType(CodeBlockType newCodeBlockType)
	{
		CodeBlockType oldCodeBlockType = codeBlockType;
		codeBlockType = newCodeBlockType == null ? CODE_BLOCK_TYPE_EDEFAULT : newCodeBlockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE_BLOCK__CODE_BLOCK_TYPE, oldCodeBlockType, codeBlockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables()
	{
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, CodePackage.CODE_BLOCK__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getReturnType()
	{
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.CODE_BLOCK__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType()
	{
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(Type newReturnType)
	{
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE_BLOCK__RETURN_TYPE, oldReturnType, returnType));
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
			case CodePackage.CODE_BLOCK__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case CodePackage.CODE_BLOCK__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case CodePackage.CODE_BLOCK__STATEMENTS:
				return getStatements();
			case CodePackage.CODE_BLOCK__CODE_BLOCK_TYPE:
				return getCodeBlockType();
			case CodePackage.CODE_BLOCK__VARIABLES:
				return getVariables();
			case CodePackage.CODE_BLOCK__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case CodePackage.CODE_BLOCK__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case CodePackage.CODE_BLOCK__CODE_BLOCK_TYPE:
				setCodeBlockType((CodeBlockType)newValue);
				return;
			case CodePackage.CODE_BLOCK__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case CodePackage.CODE_BLOCK__RETURN_TYPE:
				setReturnType((Type)newValue);
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
			case CodePackage.CODE_BLOCK__STATEMENTS:
				getStatements().clear();
				return;
			case CodePackage.CODE_BLOCK__CODE_BLOCK_TYPE:
				setCodeBlockType(CODE_BLOCK_TYPE_EDEFAULT);
				return;
			case CodePackage.CODE_BLOCK__VARIABLES:
				getVariables().clear();
				return;
			case CodePackage.CODE_BLOCK__RETURN_TYPE:
				setReturnType((Type)null);
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
			case CodePackage.CODE_BLOCK__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case CodePackage.CODE_BLOCK__CODE_BLOCK_TYPE:
				return codeBlockType != CODE_BLOCK_TYPE_EDEFAULT;
			case CodePackage.CODE_BLOCK__VARIABLES:
				return variables != null && !variables.isEmpty();
			case CodePackage.CODE_BLOCK__RETURN_TYPE:
				return returnType != null;
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
		result.append(" (codeBlockType: ");
		result.append(codeBlockType);
		result.append(')');
		return result.toString();
	}

} //CodeBlockImpl
