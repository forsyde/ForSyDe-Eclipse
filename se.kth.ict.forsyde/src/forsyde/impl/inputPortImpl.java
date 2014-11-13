/**
 */
package forsyde.impl;

import forsyde.ForsydePackage;
import forsyde.inputPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forsyde.impl.inputPortImpl#getBoundProcess <em>Bound Process</em>}</li>
 *   <li>{@link forsyde.impl.inputPortImpl#getBoundPort <em>Bound Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class inputPortImpl extends PortImpl implements inputPort {
	/**
	 * The cached value of the '{@link #getBoundProcess() <em>Bound Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundProcess()
	 * @generated
	 * @ordered
	 */
	protected forsyde.Process boundProcess;
	/**
	 * The cached value of the '{@link #getBoundPort() <em>Bound Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundPort()
	 * @generated
	 * @ordered
	 */
	protected inputPort boundPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected inputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForsydePackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forsyde.Process getBoundProcess() {
		if (boundProcess != null && boundProcess.eIsProxy()) {
			InternalEObject oldBoundProcess = (InternalEObject)boundProcess;
			boundProcess = (forsyde.Process)eResolveProxy(oldBoundProcess);
			if (boundProcess != oldBoundProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.INPUT_PORT__BOUND_PROCESS, oldBoundProcess, boundProcess));
			}
		}
		return boundProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forsyde.Process basicGetBoundProcess() {
		return boundProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundProcess(forsyde.Process newBoundProcess) {
		forsyde.Process oldBoundProcess = boundProcess;
		boundProcess = newBoundProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.INPUT_PORT__BOUND_PROCESS, oldBoundProcess, boundProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inputPort getBoundPort() {
		if (boundPort != null && boundPort.eIsProxy()) {
			InternalEObject oldBoundPort = (InternalEObject)boundPort;
			boundPort = (inputPort)eResolveProxy(oldBoundPort);
			if (boundPort != oldBoundPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.INPUT_PORT__BOUND_PORT, oldBoundPort, boundPort));
			}
		}
		return boundPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inputPort basicGetBoundPort() {
		return boundPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundPort(inputPort newBoundPort) {
		inputPort oldBoundPort = boundPort;
		boundPort = newBoundPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.INPUT_PORT__BOUND_PORT, oldBoundPort, boundPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForsydePackage.INPUT_PORT__BOUND_PROCESS:
				if (resolve) return getBoundProcess();
				return basicGetBoundProcess();
			case ForsydePackage.INPUT_PORT__BOUND_PORT:
				if (resolve) return getBoundPort();
				return basicGetBoundPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ForsydePackage.INPUT_PORT__BOUND_PROCESS:
				setBoundProcess((forsyde.Process)newValue);
				return;
			case ForsydePackage.INPUT_PORT__BOUND_PORT:
				setBoundPort((inputPort)newValue);
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
			case ForsydePackage.INPUT_PORT__BOUND_PROCESS:
				setBoundProcess((forsyde.Process)null);
				return;
			case ForsydePackage.INPUT_PORT__BOUND_PORT:
				setBoundPort((inputPort)null);
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
			case ForsydePackage.INPUT_PORT__BOUND_PROCESS:
				return boundProcess != null;
			case ForsydePackage.INPUT_PORT__BOUND_PORT:
				return boundPort != null;
		}
		return super.eIsSet(featureID);
	}

} //inputPortImpl
