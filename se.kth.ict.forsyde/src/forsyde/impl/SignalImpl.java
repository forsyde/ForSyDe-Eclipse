/**
 */
package forsyde.impl;

import forsyde.ForsydePackage;
import forsyde.MoC;
import forsyde.Port;
import forsyde.Signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forsyde.impl.SignalImpl#getName <em>Name</em>}</li>
 *   <li>{@link forsyde.impl.SignalImpl#getMoc <em>Moc</em>}</li>
 *   <li>{@link forsyde.impl.SignalImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link forsyde.impl.SignalImpl#getSourceProcess <em>Source Process</em>}</li>
 *   <li>{@link forsyde.impl.SignalImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link forsyde.impl.SignalImpl#getTargetProcess <em>Target Process</em>}</li>
 *   <li>{@link forsyde.impl.SignalImpl#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl extends MinimalEObjectImpl.Container implements Signal {
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
	 * The default value of the '{@link #getMoc() <em>Moc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoc()
	 * @generated
	 * @ordered
	 */
	protected static final MoC MOC_EDEFAULT = MoC.UT;

	/**
	 * The cached value of the '{@link #getMoc() <em>Moc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoc()
	 * @generated
	 * @ordered
	 */
	protected MoC moc = MOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceProcess() <em>Source Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProcess()
	 * @generated
	 * @ordered
	 */
	protected forsyde.Process sourceProcess;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Port sourcePort;

	/**
	 * The cached value of the '{@link #getTargetProcess() <em>Target Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProcess()
	 * @generated
	 * @ordered
	 */
	protected forsyde.Process targetProcess;

	/**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected Port targetPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForsydePackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.SIGNAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoC getMoc() {
		return moc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoc(MoC newMoc) {
		MoC oldMoc = moc;
		moc = newMoc == null ? MOC_EDEFAULT : newMoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.SIGNAL__MOC, oldMoc, moc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.SIGNAL__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forsyde.Process getSourceProcess() {
		if (sourceProcess != null && sourceProcess.eIsProxy()) {
			InternalEObject oldSourceProcess = (InternalEObject)sourceProcess;
			sourceProcess = (forsyde.Process)eResolveProxy(oldSourceProcess);
			if (sourceProcess != oldSourceProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.SIGNAL__SOURCE_PROCESS, oldSourceProcess, sourceProcess));
			}
		}
		return sourceProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forsyde.Process basicGetSourceProcess() {
		return sourceProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProcess(forsyde.Process newSourceProcess) {
		forsyde.Process oldSourceProcess = sourceProcess;
		sourceProcess = newSourceProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.SIGNAL__SOURCE_PROCESS, oldSourceProcess, sourceProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (Port)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.SIGNAL__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(Port newSourcePort) {
		Port oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.SIGNAL__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forsyde.Process getTargetProcess() {
		if (targetProcess != null && targetProcess.eIsProxy()) {
			InternalEObject oldTargetProcess = (InternalEObject)targetProcess;
			targetProcess = (forsyde.Process)eResolveProxy(oldTargetProcess);
			if (targetProcess != oldTargetProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.SIGNAL__TARGET_PROCESS, oldTargetProcess, targetProcess));
			}
		}
		return targetProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forsyde.Process basicGetTargetProcess() {
		return targetProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProcess(forsyde.Process newTargetProcess) {
		forsyde.Process oldTargetProcess = targetProcess;
		targetProcess = newTargetProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.SIGNAL__TARGET_PROCESS, oldTargetProcess, targetProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getTargetPort() {
		if (targetPort != null && targetPort.eIsProxy()) {
			InternalEObject oldTargetPort = (InternalEObject)targetPort;
			targetPort = (Port)eResolveProxy(oldTargetPort);
			if (targetPort != oldTargetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ForsydePackage.SIGNAL__TARGET_PORT, oldTargetPort, targetPort));
			}
		}
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetTargetPort() {
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPort(Port newTargetPort) {
		Port oldTargetPort = targetPort;
		targetPort = newTargetPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.SIGNAL__TARGET_PORT, oldTargetPort, targetPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForsydePackage.SIGNAL__NAME:
				return getName();
			case ForsydePackage.SIGNAL__MOC:
				return getMoc();
			case ForsydePackage.SIGNAL__DATA_TYPE:
				return getDataType();
			case ForsydePackage.SIGNAL__SOURCE_PROCESS:
				if (resolve) return getSourceProcess();
				return basicGetSourceProcess();
			case ForsydePackage.SIGNAL__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case ForsydePackage.SIGNAL__TARGET_PROCESS:
				if (resolve) return getTargetProcess();
				return basicGetTargetProcess();
			case ForsydePackage.SIGNAL__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
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
			case ForsydePackage.SIGNAL__NAME:
				setName((String)newValue);
				return;
			case ForsydePackage.SIGNAL__MOC:
				setMoc((MoC)newValue);
				return;
			case ForsydePackage.SIGNAL__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case ForsydePackage.SIGNAL__SOURCE_PROCESS:
				setSourceProcess((forsyde.Process)newValue);
				return;
			case ForsydePackage.SIGNAL__SOURCE_PORT:
				setSourcePort((Port)newValue);
				return;
			case ForsydePackage.SIGNAL__TARGET_PROCESS:
				setTargetProcess((forsyde.Process)newValue);
				return;
			case ForsydePackage.SIGNAL__TARGET_PORT:
				setTargetPort((Port)newValue);
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
			case ForsydePackage.SIGNAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ForsydePackage.SIGNAL__MOC:
				setMoc(MOC_EDEFAULT);
				return;
			case ForsydePackage.SIGNAL__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case ForsydePackage.SIGNAL__SOURCE_PROCESS:
				setSourceProcess((forsyde.Process)null);
				return;
			case ForsydePackage.SIGNAL__SOURCE_PORT:
				setSourcePort((Port)null);
				return;
			case ForsydePackage.SIGNAL__TARGET_PROCESS:
				setTargetProcess((forsyde.Process)null);
				return;
			case ForsydePackage.SIGNAL__TARGET_PORT:
				setTargetPort((Port)null);
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
			case ForsydePackage.SIGNAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ForsydePackage.SIGNAL__MOC:
				return moc != MOC_EDEFAULT;
			case ForsydePackage.SIGNAL__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case ForsydePackage.SIGNAL__SOURCE_PROCESS:
				return sourceProcess != null;
			case ForsydePackage.SIGNAL__SOURCE_PORT:
				return sourcePort != null;
			case ForsydePackage.SIGNAL__TARGET_PROCESS:
				return targetProcess != null;
			case ForsydePackage.SIGNAL__TARGET_PORT:
				return targetPort != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", moc: ");
		result.append(moc);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //SignalImpl
