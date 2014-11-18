/**
 */
package forsyde;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>system</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forsyde.system#getProcessNetworks <em>Process Networks</em>}</li>
 * </ul>
 * </p>
 *
 * @see forsyde.ForsydePackage#getsystem()
 * @model
 * @generated
 */
public interface system extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Networks</b></em>' containment reference list.
	 * The list contents are of type {@link forsyde.ProcessNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Networks</em>' containment reference list.
	 * @see forsyde.ForsydePackage#getsystem_ProcessNetworks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessNetwork> getProcessNetworks();

} // system
