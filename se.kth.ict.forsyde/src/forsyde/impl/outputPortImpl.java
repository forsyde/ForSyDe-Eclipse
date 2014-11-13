/**
 */
package forsyde.impl;

import forsyde.ForsydePackage;
import forsyde.outputPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forsyde.impl.outputPortImpl#getBoundProcess <em>Bound Process</em>}</li>
 *   <li>{@link forsyde.impl.outputPortImpl#getBoundPort <em>Bound Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class outputPortImpl extends PortImpl implements outputPort {
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
	protected outputPort boundPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected outputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForsydePackage.Literals.OUTPUT_PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.OUTPUT_PORT__BOUND_PROCESS, oldBoundProcess, boundProcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.OUTPUT_PORT__BOUND_PROCESS, oldBoundProcess, boundProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outputPort getBoundPort() {
		if (boundPort != null && boundPort.eIsProxy()) {
			InternalEObject oldBoundPort = (InternalEObject)boundPort;
			boundPort = (outputPort)eResolveProxy(oldBoundPort);
			if (boundPort != oldBoundPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.OUTPUT_PORT__BOUND_PORT, oldBoundPort, boundPort));
			}
		}
		return boundPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outputPort basicGetBoundPort() {
		return boundPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundPort(outputPort newBoundPort) {
		outputPort oldBoundPort = boundPort;
		boundPort = newBoundPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.OUTPUT_PORT__BOUND_PORT, oldBoundPort, boundPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForsydePackage.OUTPUT_PORT__BOUND_PROCESS:
				if (resolve) return getBoundProcess();
				return basicGetBoundProcess();
			case ForsydePackage.OUTPUT_PORT__BOUND_PORT:
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
			case ForsydePackage.OUTPUT_PORT__BOUND_PROCESS:
				setBoundProcess((forsyde.Process)newValue);
				return;
			case ForsydePackage.OUTPUT_PORT__BOUND_PORT:
				setBoundPort((outputPort)newValue);
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
			case ForsydePackage.OUTPUT_PORT__BOUND_PROCESS:
				setBoundProcess((forsyde.Process)null);
				return;
			case ForsydePackage.OUTPUT_PORT__BOUND_PORT:
				setBoundPort((outputPort)null);
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
			case ForsydePackage.OUTPUT_PORT__BOUND_PROCESS:
				return boundProcess != null;
			case ForsydePackage.OUTPUT_PORT__BOUND_PORT:
				return boundPort != null;
		}
		return super.eIsSet(featureID);
	}

} //outputPortImpl
