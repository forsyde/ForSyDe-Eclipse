/**
 */
package forsyde.impl;

import forsyde.ForsydePackage;
import forsyde.MoC;
import forsyde.ProcessConstructor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forsyde.impl.ProcessConstructorImpl#getName <em>Name</em>}</li>
 *   <li>{@link forsyde.impl.ProcessConstructorImpl#getMoc <em>Moc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessConstructorImpl extends MinimalEObjectImpl.Container implements ProcessConstructor {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForsydePackage.Literals.PROCESS_CONSTRUCTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.PROCESS_CONSTRUCTOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.PROCESS_CONSTRUCTOR__MOC, oldMoc, moc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForsydePackage.PROCESS_CONSTRUCTOR__NAME:
				return getName();
			case ForsydePackage.PROCESS_CONSTRUCTOR__MOC:
				return getMoc();
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
			case ForsydePackage.PROCESS_CONSTRUCTOR__NAME:
				setName((String)newValue);
				return;
			case ForsydePackage.PROCESS_CONSTRUCTOR__MOC:
				setMoc((MoC)newValue);
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
			case ForsydePackage.PROCESS_CONSTRUCTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ForsydePackage.PROCESS_CONSTRUCTOR__MOC:
				setMoc(MOC_EDEFAULT);
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
			case ForsydePackage.PROCESS_CONSTRUCTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ForsydePackage.PROCESS_CONSTRUCTOR__MOC:
				return moc != MOC_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //ProcessConstructorImpl
