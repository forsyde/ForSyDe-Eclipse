/**
 */
package forsyde;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forsyde.CompositeProcess#getPorts <em>Ports</em>}</li>
 *   <li>{@link forsyde.CompositeProcess#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see forsyde.ForsydePackage#getCompositeProcess()
 * @model
 * @generated
 */
public interface CompositeProcess extends forsyde.Process {
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
	 * @see forsyde.ForsydePackage#getCompositeProcess_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ProcessNetwork)
	 * @see forsyde.ForsydePackage#getCompositeProcess_Component()
	 * @model required="true"
	 * @generated
	 */
	ProcessNetwork getComponent();

	/**
	 * Sets the value of the '{@link forsyde.CompositeProcess#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ProcessNetwork value);

} // CompositeProcess
