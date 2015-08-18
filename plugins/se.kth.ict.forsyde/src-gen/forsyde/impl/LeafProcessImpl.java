/**
 */
package forsyde.impl;

import forsyde.ConstructorArgument;
import forsyde.ForsydePackage;
import forsyde.LeafProcess;
import forsyde.ProcessConstructor;

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
 * An implementation of the model object '<em><b>Leaf Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link forsyde.impl.LeafProcessImpl#getProcessConstructor <em>Process Constructor</em>}</li>
 *   <li>{@link forsyde.impl.LeafProcessImpl#getConstructorArguments <em>Constructor Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeafProcessImpl extends ProcessImpl implements LeafProcess {
	/**
	 * The cached value of the '{@link #getProcessConstructor() <em>Process Constructor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessConstructor()
	 * @generated
	 * @ordered
	 */
	protected ProcessConstructor processConstructor;

	/**
	 * The cached value of the '{@link #getConstructorArguments() <em>Constructor Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstructorArgument> constructorArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForsydePackage.Literals.LEAF_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessConstructor getProcessConstructor() {
		return processConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessConstructor(ProcessConstructor newProcessConstructor, NotificationChain msgs) {
		ProcessConstructor oldProcessConstructor = processConstructor;
		processConstructor = newProcessConstructor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR, oldProcessConstructor, newProcessConstructor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessConstructor(ProcessConstructor newProcessConstructor) {
		if (newProcessConstructor != processConstructor) {
			NotificationChain msgs = null;
			if (processConstructor != null)
				msgs = ((InternalEObject)processConstructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR, null, msgs);
			if (newProcessConstructor != null)
				msgs = ((InternalEObject)newProcessConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR, null, msgs);
			msgs = basicSetProcessConstructor(newProcessConstructor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR, newProcessConstructor, newProcessConstructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstructorArgument> getConstructorArguments() {
		if (constructorArguments == null) {
			constructorArguments = new EObjectContainmentEList<ConstructorArgument>(ConstructorArgument.class, this, ForsydePackage.LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS);
		}
		return constructorArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR:
				return basicSetProcessConstructor(null, msgs);
			case ForsydePackage.LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS:
				return ((InternalEList<?>)getConstructorArguments()).basicRemove(otherEnd, msgs);
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
			case ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR:
				return getProcessConstructor();
			case ForsydePackage.LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS:
				return getConstructorArguments();
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
			case ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR:
				setProcessConstructor((ProcessConstructor)newValue);
				return;
			case ForsydePackage.LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS:
				getConstructorArguments().clear();
				getConstructorArguments().addAll((Collection<? extends ConstructorArgument>)newValue);
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
			case ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR:
				setProcessConstructor((ProcessConstructor)null);
				return;
			case ForsydePackage.LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS:
				getConstructorArguments().clear();
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
			case ForsydePackage.LEAF_PROCESS__PROCESS_CONSTRUCTOR:
				return processConstructor != null;
			case ForsydePackage.LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS:
				return constructorArguments != null && !constructorArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LeafProcessImpl
