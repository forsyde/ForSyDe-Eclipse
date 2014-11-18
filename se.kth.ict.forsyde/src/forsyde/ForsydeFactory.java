/**
 */
package forsyde;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see forsyde.ForsydePackage
 * @generated
 */
public interface ForsydeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForsydeFactory eINSTANCE = forsyde.impl.ForsydeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>system</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>system</em>'.
	 * @generated
	 */
	system createsystem();

	/**
	 * Returns a new object of class '<em>Process Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Network</em>'.
	 * @generated
	 */
	ProcessNetwork createProcessNetwork();

	/**
	 * Returns a new object of class '<em>Leaf Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Process</em>'.
	 * @generated
	 */
	LeafProcess createLeafProcess();

	/**
	 * Returns a new object of class '<em>Composite Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Process</em>'.
	 * @generated
	 */
	CompositeProcess createCompositeProcess();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>input Port</em>'.
	 * @generated
	 */
	inputPort createinputPort();

	/**
	 * Returns a new object of class '<em>output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>output Port</em>'.
	 * @generated
	 */
	outputPort createoutputPort();

	/**
	 * Returns a new object of class '<em>Process Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Constructor</em>'.
	 * @generated
	 */
	ProcessConstructor createProcessConstructor();

	/**
	 * Returns a new object of class '<em>Constructor Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Argument</em>'.
	 * @generated
	 */
	ConstructorArgument createConstructorArgument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ForsydePackage getForsydePackage();

} //ForsydeFactory
