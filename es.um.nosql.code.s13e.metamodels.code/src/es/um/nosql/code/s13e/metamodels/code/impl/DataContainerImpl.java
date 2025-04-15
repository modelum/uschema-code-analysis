/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.Assignable;
import es.um.nosql.code.s13e.metamodels.code.CodeLocation;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.ConditionalExpression;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Property;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getStart <em>Start</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getEnd <em>End</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getDataContainer <em>Data Container</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.impl.DataContainerImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataContainerImpl extends TypeImpl implements DataContainer {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected CodeLocation start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected CodeLocation end;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected Assignable initialization;

	/**
	 * The cached value of the '{@link #getDataContainer() <em>Data Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataContainer()
	 * @generated
	 * @ordered
	 */
	protected DataContainer dataContainer;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<DataContainer> parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.DATA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLocation getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(CodeLocation newStart, NotificationChain msgs) {
		CodeLocation oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__START, oldStart, newStart);
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
	public void setStart(CodeLocation newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.DATA_CONTAINER__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.DATA_CONTAINER__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLocation getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(CodeLocation newEnd, NotificationChain msgs) {
		CodeLocation oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__END, oldEnd, newEnd);
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
	public void setEnd(CodeLocation newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.DATA_CONTAINER__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.DATA_CONTAINER__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.DATA_CONTAINER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignable getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialization(Assignable newInitialization, NotificationChain msgs) {
		Assignable oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__INITIALIZATION, oldInitialization, newInitialization);
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
	public void setInitialization(Assignable newInitialization) {
		if (newInitialization != initialization) {
			NotificationChain msgs = null;
			if (initialization != null)
				msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.DATA_CONTAINER__INITIALIZATION, null, msgs);
			if (newInitialization != null)
				msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.DATA_CONTAINER__INITIALIZATION, null, msgs);
			msgs = basicSetInitialization(newInitialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__INITIALIZATION, newInitialization, newInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataContainer getDataContainer() {
		if (dataContainer != null && dataContainer.eIsProxy()) {
			InternalEObject oldDataContainer = (InternalEObject)dataContainer;
			dataContainer = (DataContainer)eResolveProxy(oldDataContainer);
			if (dataContainer != oldDataContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.DATA_CONTAINER__DATA_CONTAINER, oldDataContainer, dataContainer));
			}
		}
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataContainer basicGetDataContainer() {
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataContainer(DataContainer newDataContainer) {
		DataContainer oldDataContainer = dataContainer;
		dataContainer = newDataContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DATA_CONTAINER__DATA_CONTAINER, oldDataContainer, dataContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CodePackage.DATA_CONTAINER__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataContainer> getParent() {
		if (parent == null) {
			parent = new EObjectContainmentEList<DataContainer>(DataContainer.class, this, CodePackage.DATA_CONTAINER__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.DATA_CONTAINER__START:
				return basicSetStart(null, msgs);
			case CodePackage.DATA_CONTAINER__END:
				return basicSetEnd(null, msgs);
			case CodePackage.DATA_CONTAINER__INITIALIZATION:
				return basicSetInitialization(null, msgs);
			case CodePackage.DATA_CONTAINER__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case CodePackage.DATA_CONTAINER__PARENT:
				return ((InternalEList<?>)getParent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.DATA_CONTAINER__START:
				return getStart();
			case CodePackage.DATA_CONTAINER__END:
				return getEnd();
			case CodePackage.DATA_CONTAINER__NAME:
				return getName();
			case CodePackage.DATA_CONTAINER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.DATA_CONTAINER__INITIALIZATION:
				return getInitialization();
			case CodePackage.DATA_CONTAINER__DATA_CONTAINER:
				if (resolve) return getDataContainer();
				return basicGetDataContainer();
			case CodePackage.DATA_CONTAINER__PROPERTIES:
				return getProperties();
			case CodePackage.DATA_CONTAINER__PARENT:
				return getParent();
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
			case CodePackage.DATA_CONTAINER__START:
				setStart((CodeLocation)newValue);
				return;
			case CodePackage.DATA_CONTAINER__END:
				setEnd((CodeLocation)newValue);
				return;
			case CodePackage.DATA_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case CodePackage.DATA_CONTAINER__TYPE:
				setType((Type)newValue);
				return;
			case CodePackage.DATA_CONTAINER__INITIALIZATION:
				setInitialization((Assignable)newValue);
				return;
			case CodePackage.DATA_CONTAINER__DATA_CONTAINER:
				setDataContainer((DataContainer)newValue);
				return;
			case CodePackage.DATA_CONTAINER__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CodePackage.DATA_CONTAINER__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends DataContainer>)newValue);
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
			case CodePackage.DATA_CONTAINER__START:
				setStart((CodeLocation)null);
				return;
			case CodePackage.DATA_CONTAINER__END:
				setEnd((CodeLocation)null);
				return;
			case CodePackage.DATA_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodePackage.DATA_CONTAINER__TYPE:
				setType((Type)null);
				return;
			case CodePackage.DATA_CONTAINER__INITIALIZATION:
				setInitialization((Assignable)null);
				return;
			case CodePackage.DATA_CONTAINER__DATA_CONTAINER:
				setDataContainer((DataContainer)null);
				return;
			case CodePackage.DATA_CONTAINER__PROPERTIES:
				getProperties().clear();
				return;
			case CodePackage.DATA_CONTAINER__PARENT:
				getParent().clear();
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
			case CodePackage.DATA_CONTAINER__START:
				return start != null;
			case CodePackage.DATA_CONTAINER__END:
				return end != null;
			case CodePackage.DATA_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CodePackage.DATA_CONTAINER__TYPE:
				return type != null;
			case CodePackage.DATA_CONTAINER__INITIALIZATION:
				return initialization != null;
			case CodePackage.DATA_CONTAINER__DATA_CONTAINER:
				return dataContainer != null;
			case CodePackage.DATA_CONTAINER__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CodePackage.DATA_CONTAINER__PARENT:
				return parent != null && !parent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				case CodePackage.DATA_CONTAINER__START: return CodePackage.STATEMENT__START;
				case CodePackage.DATA_CONTAINER__END: return CodePackage.STATEMENT__END;
				default: return -1;
			}
		}
		if (baseClass == Assignable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataProducer.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case CodePackage.DATA_CONTAINER__NAME: return CodePackage.VARIABLE__NAME;
				case CodePackage.DATA_CONTAINER__TYPE: return CodePackage.VARIABLE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (derivedFeatureID) {
				case CodePackage.DATA_CONTAINER__INITIALIZATION: return CodePackage.PROPERTY__INITIALIZATION;
				case CodePackage.DATA_CONTAINER__DATA_CONTAINER: return CodePackage.PROPERTY__DATA_CONTAINER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				case CodePackage.STATEMENT__START: return CodePackage.DATA_CONTAINER__START;
				case CodePackage.STATEMENT__END: return CodePackage.DATA_CONTAINER__END;
				default: return -1;
			}
		}
		if (baseClass == Assignable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConditionalExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataProducer.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case CodePackage.VARIABLE__NAME: return CodePackage.DATA_CONTAINER__NAME;
				case CodePackage.VARIABLE__TYPE: return CodePackage.DATA_CONTAINER__TYPE;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (baseFeatureID) {
				case CodePackage.PROPERTY__INITIALIZATION: return CodePackage.DATA_CONTAINER__INITIALIZATION;
				case CodePackage.PROPERTY__DATA_CONTAINER: return CodePackage.DATA_CONTAINER__DATA_CONTAINER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataContainerImpl
