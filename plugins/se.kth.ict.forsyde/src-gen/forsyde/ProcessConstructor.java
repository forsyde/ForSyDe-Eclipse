/**
 */
package forsyde;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link forsyde.ProcessConstructor#getName <em>Name</em>}</li>
 *   <li>{@link forsyde.ProcessConstructor#getMoc <em>Moc</em>}</li>
 * </ul>
 *
 * @see forsyde.ForsydePackage#getProcessConstructor()
 * @model
 * @generated
 */
public interface ProcessConstructor extends EObject {
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
	 * @see forsyde.ForsydePackage#getProcessConstructor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forsyde.ProcessConstructor#getName <em>Name</em>}' attribute.
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
	 * @see forsyde.ForsydePackage#getProcessConstructor_Moc()
	 * @model
	 * @generated
	 */
	MoC getMoc();

	/**
	 * Sets the value of the '{@link forsyde.ProcessConstructor#getMoc <em>Moc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moc</em>' attribute.
	 * @see forsyde.MoC
	 * @see #getMoc()
	 * @generated
	 */
	void setMoc(MoC value);

} // ProcessConstructor
