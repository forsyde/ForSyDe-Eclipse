/**
 */
package forsyde;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forsyde.Signal#getName <em>Name</em>}</li>
 *   <li>{@link forsyde.Signal#getMoc <em>Moc</em>}</li>
 *   <li>{@link forsyde.Signal#getDataType <em>Data Type</em>}</li>
 *   <li>{@link forsyde.Signal#getSourceProcess <em>Source Process</em>}</li>
 *   <li>{@link forsyde.Signal#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link forsyde.Signal#getTargetProcess <em>Target Process</em>}</li>
 *   <li>{@link forsyde.Signal#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @see forsyde.ForsydePackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see forsyde.ForsydePackage#getSignal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forsyde.Signal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Moc</b></em>' attribute.
	 * The literals are from the enumeration {@link forsyde.MoC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moc</em>' attribute.
	 * @see forsyde.MoC
	 * @see #setMoc(MoC)
	 * @see forsyde.ForsydePackage#getSignal_Moc()
	 * @model
	 * @generated
	 */
	MoC getMoc();

	/**
	 * Sets the value of the '{@link forsyde.Signal#getMoc <em>Moc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moc</em>' attribute.
	 * @see forsyde.MoC
	 * @see #getMoc()
	 * @generated
	 */
	void setMoc(MoC value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see forsyde.ForsydePackage#getSignal_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link forsyde.Signal#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Source Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Process</em>' reference.
	 * @see #setSourceProcess(forsyde.Process)
	 * @see forsyde.ForsydePackage#getSignal_SourceProcess()
	 * @model required="true"
	 * @generated
	 */
	forsyde.Process getSourceProcess();

	/**
	 * Sets the value of the '{@link forsyde.Signal#getSourceProcess <em>Source Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Process</em>' reference.
	 * @see #getSourceProcess()
	 * @generated
	 */
	void setSourceProcess(forsyde.Process value);

	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(OutputPort)
	 * @see forsyde.ForsydePackage#getSignal_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	OutputPort getSourcePort();

	/**
	 * Sets the value of the '{@link forsyde.Signal#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Target Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Process</em>' reference.
	 * @see #setTargetProcess(forsyde.Process)
	 * @see forsyde.ForsydePackage#getSignal_TargetProcess()
	 * @model required="true"
	 * @generated
	 */
	forsyde.Process getTargetProcess();

	/**
	 * Sets the value of the '{@link forsyde.Signal#getTargetProcess <em>Target Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Process</em>' reference.
	 * @see #getTargetProcess()
	 * @generated
	 */
	void setTargetProcess(forsyde.Process value);

	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port</em>' reference.
	 * @see #setTargetPort(InputPort)
	 * @see forsyde.ForsydePackage#getSignal_TargetPort()
	 * @model required="true"
	 * @generated
	 */
	InputPort getTargetPort();

	/**
	 * Sets the value of the '{@link forsyde.Signal#getTargetPort <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' reference.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(InputPort value);

} // Signal
