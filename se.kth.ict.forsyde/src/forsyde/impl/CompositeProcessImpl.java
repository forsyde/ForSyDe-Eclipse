/**
 */
package forsyde.impl;

import forsyde.CompositeProcess;
import forsyde.ForsydePackage;
import forsyde.Port;

import forsyde.ProcessNetwork;
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
 * An implementation of the model object '<em><b>Composite Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forsyde.impl.CompositeProcessImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link forsyde.impl.CompositeProcessImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeProcessImpl extends ProcessImpl implements CompositeProcess {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ProcessNetwork component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForsydePackage.Literals.COMPOSITE_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, ForsydePackage.COMPOSITE_PROCESS__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessNetwork getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (ProcessNetwork)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.COMPOSITE_PROCESS__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessNetwork basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ProcessNetwork newComponent) {
		ProcessNetwork oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.COMPOSITE_PROCESS__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ForsydePackage.COMPOSITE_PROCESS__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case ForsydePackage.COMPOSITE_PROCESS__PORTS:
				return getPorts();
			case ForsydePackage.COMPOSITE_PROCESS__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case ForsydePackage.COMPOSITE_PROCESS__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case ForsydePackage.COMPOSITE_PROCESS__COMPONENT:
				setComponent((ProcessNetwork)newValue);
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
			case ForsydePackage.COMPOSITE_PROCESS__PORTS:
				getPorts().clear();
				return;
			case ForsydePackage.COMPOSITE_PROCESS__COMPONENT:
				setComponent((ProcessNetwork)null);
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
			case ForsydePackage.COMPOSITE_PROCESS__PORTS:
				return ports != null && !ports.isEmpty();
			case ForsydePackage.COMPOSITE_PROCESS__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeProcessImpl
