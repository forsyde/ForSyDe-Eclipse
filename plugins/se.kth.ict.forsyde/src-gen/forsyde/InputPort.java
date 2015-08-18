/**
 */
package forsyde;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forsyde.InputPort#getBoundPort <em>Bound Port</em>}</li>
 * </ul>
 *
 * @see forsyde.ForsydePackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Bound Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Port</em>' reference.
	 * @see #setBoundPort(InputPort)
	 * @see forsyde.ForsydePackage#getInputPort_BoundPort()
	 * @model
	 * @generated
	 */
	InputPort getBoundPort();

	/**
	 * Sets the value of the '{@link forsyde.InputPort#getBoundPort <em>Bound Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Port</em>' reference.
	 * @see #getBoundPort()
	 * @generated
	 */
	void setBoundPort(InputPort value);

} // InputPort
