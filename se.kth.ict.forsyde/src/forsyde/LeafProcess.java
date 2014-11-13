/**
 */
package forsyde;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forsyde.LeafProcess#getPorts <em>Ports</em>}</li>
 *   <li>{@link forsyde.LeafProcess#getProcessConstructor <em>Process Constructor</em>}</li>
 *   <li>{@link forsyde.LeafProcess#getConstructorArguments <em>Constructor Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see forsyde.ForsydePackage#getLeafProcess()
 * @model
 * @generated
 */
public interface LeafProcess extends forsyde.Process {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link forsyde.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see forsyde.ForsydePackage#getLeafProcess_Ports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Process Constructor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Constructor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Constructor</em>' containment reference.
	 * @see #setProcessConstructor(ProcessConstructor)
	 * @see forsyde.ForsydePackage#getLeafProcess_ProcessConstructor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProcessConstructor getProcessConstructor();

	/**
	 * Sets the value of the '{@link forsyde.LeafProcess#getProcessConstructor <em>Process Constructor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Constructor</em>' containment reference.
	 * @see #getProcessConstructor()
	 * @generated
	 */
	void setProcessConstructor(ProcessConstructor value);

	/**
	 * Returns the value of the '<em><b>Constructor Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link forsyde.ConstructorArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Arguments</em>' containment reference list.
	 * @see forsyde.ForsydePackage#getLeafProcess_ConstructorArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstructorArgument> getConstructorArguments();

} // LeafProcess
