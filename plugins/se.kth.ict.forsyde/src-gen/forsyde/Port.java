/**
 */
package forsyde;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forsyde.Port#getName <em>Name</em>}</li>
 *   <li>{@link forsyde.Port#getMoc <em>Moc</em>}</li>
 *   <li>{@link forsyde.Port#getDataType <em>Data Type</em>}</li>
 *   <li>{@link forsyde.Port#getBoundProcess <em>Bound Process</em>}</li>
 * </ul>
 *
 * @see forsyde.ForsydePackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EObject {
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
	 * @see forsyde.ForsydePackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forsyde.Port#getName <em>Name</em>}' attribute.
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
	 * @see forsyde.ForsydePackage#getPort_Moc()
	 * @model
	 * @generated
	 */
	MoC getMoc();

	/**
	 * Sets the value of the '{@link forsyde.Port#getMoc <em>Moc</em>}' attribute.
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
	 * @see forsyde.ForsydePackage#getPort_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link forsyde.Port#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

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
	 * @see forsyde.ForsydePackage#getPort_BoundProcess()
	 * @model
	 * @generated
	 */
	forsyde.Process getBoundProcess();

	/**
	 * Sets the value of the '{@link forsyde.Port#getBoundProcess <em>Bound Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Process</em>' reference.
	 * @see #getBoundProcess()
	 * @generated
	 */
	void setBoundProcess(forsyde.Process value);

} // Port
