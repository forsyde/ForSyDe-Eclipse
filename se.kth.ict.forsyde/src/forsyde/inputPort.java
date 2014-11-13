/**
 */
package forsyde;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forsyde.inputPort#getBoundProcess <em>Bound Process</em>}</li>
 *   <li>{@link forsyde.inputPort#getBoundPort <em>Bound Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see forsyde.ForsydePackage#getinputPort()
 * @model
 * @generated
 */
public interface inputPort extends Port {

	/**
	 * Returns the value of the '<em><b>Bound Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Process</em>' reference.
	 * @see #setBoundProcess(forsyde.Process)
	 * @see forsyde.ForsydePackage#getinputPort_BoundProcess()
	 * @model
	 * @generated
	 */
	forsyde.Process getBoundProcess();

	/**
	 * Sets the value of the '{@link forsyde.inputPort#getBoundProcess <em>Bound Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Process</em>' reference.
	 * @see #getBoundProcess()
	 * @generated
	 */
	void setBoundProcess(forsyde.Process value);

	/**
	 * Returns the value of the '<em><b>Bound Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Port</em>' reference.
	 * @see #setBoundPort(inputPort)
	 * @see forsyde.ForsydePackage#getinputPort_BoundPort()
	 * @model
	 * @generated
	 */
	inputPort getBoundPort();

	/**
	 * Sets the value of the '{@link forsyde.inputPort#getBoundPort <em>Bound Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Port</em>' reference.
	 * @see #getBoundPort()
	 * @generated
	 */
	void setBoundPort(inputPort value);
} // inputPort
