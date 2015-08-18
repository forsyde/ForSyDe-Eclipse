/**
 */
package forsyde;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see forsyde.ForsydeFactory
 * @model kind="package"
 * @generated
 */
public interface ForsydePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forsyde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://forsyde.ict.kth.se/core/forsyde";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.kth.ict.forsyde.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForsydePackage eINSTANCE = forsyde.impl.ForsydePackageImpl.init();

	/**
	 * The meta object id for the '{@link forsyde.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.SystemImpl
	 * @see forsyde.impl.ForsydePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Process Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROCESS_NETWORKS = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.ProcessNetworkImpl <em>Process Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.ProcessNetworkImpl
	 * @see forsyde.impl.ForsydePackageImpl#getProcessNetwork()
	 * @generated
	 */
	int PROCESS_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NETWORK__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NETWORK__PROCESSES = 2;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NETWORK__SIGNALS = 3;

	/**
	 * The number of structural features of the '<em>Process Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Process Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.ProcessImpl
	 * @see forsyde.impl.ForsydePackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PORTS = 1;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.LeafProcessImpl <em>Leaf Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.LeafProcessImpl
	 * @see forsyde.impl.ForsydePackageImpl#getLeafProcess()
	 * @generated
	 */
	int LEAF_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PROCESS__PORTS = PROCESS__PORTS;

	/**
	 * The feature id for the '<em><b>Process Constructor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PROCESS__PROCESS_CONSTRUCTOR = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constructor Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leaf Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Leaf Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_PROCESS_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.CompositeProcessImpl <em>Composite Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.CompositeProcessImpl
	 * @see forsyde.impl.ForsydePackageImpl#getCompositeProcess()
	 * @generated
	 */
	int COMPOSITE_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__PORTS = PROCESS__PORTS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COMPONENT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.SignalImpl
	 * @see forsyde.impl.ForsydePackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Moc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__MOC = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Source Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SOURCE_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SOURCE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Target Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TARGET_PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TARGET_PORT = 6;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.PortImpl
	 * @see forsyde.impl.ForsydePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Moc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MOC = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Bound Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BOUND_PROCESS = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.InputPortImpl
	 * @see forsyde.impl.ForsydePackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Moc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__MOC = PORT__MOC;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DATA_TYPE = PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Bound Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__BOUND_PROCESS = PORT__BOUND_PROCESS;

	/**
	 * The feature id for the '<em><b>Bound Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__BOUND_PORT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.OutputPortImpl
	 * @see forsyde.impl.ForsydePackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Moc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__MOC = PORT__MOC;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DATA_TYPE = PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Bound Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__BOUND_PROCESS = PORT__BOUND_PROCESS;

	/**
	 * The feature id for the '<em><b>Bound Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__BOUND_PORT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.ProcessConstructorImpl <em>Process Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.ProcessConstructorImpl
	 * @see forsyde.impl.ForsydePackageImpl#getProcessConstructor()
	 * @generated
	 */
	int PROCESS_CONSTRUCTOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRUCTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Moc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRUCTOR__MOC = 1;

	/**
	 * The number of structural features of the '<em>Process Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRUCTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Process Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRUCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forsyde.impl.ConstructorArgumentImpl <em>Constructor Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.impl.ConstructorArgumentImpl
	 * @see forsyde.impl.ForsydePackageImpl#getConstructorArgument()
	 * @generated
	 */
	int CONSTRUCTOR_ARGUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARGUMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARGUMENT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Constructor Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constructor Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forsyde.MoC <em>Mo C</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forsyde.MoC
	 * @see forsyde.impl.ForsydePackageImpl#getMoC()
	 * @generated
	 */
	int MO_C = 11;


	/**
	 * Returns the meta object for class '{@link forsyde.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see forsyde.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link forsyde.System#getProcessNetworks <em>Process Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Networks</em>'.
	 * @see forsyde.System#getProcessNetworks()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ProcessNetworks();

	/**
	 * Returns the meta object for class '{@link forsyde.ProcessNetwork <em>Process Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Network</em>'.
	 * @see forsyde.ProcessNetwork
	 * @generated
	 */
	EClass getProcessNetwork();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.ProcessNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forsyde.ProcessNetwork#getName()
	 * @see #getProcessNetwork()
	 * @generated
	 */
	EAttribute getProcessNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link forsyde.ProcessNetwork#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see forsyde.ProcessNetwork#getPorts()
	 * @see #getProcessNetwork()
	 * @generated
	 */
	EReference getProcessNetwork_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link forsyde.ProcessNetwork#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see forsyde.ProcessNetwork#getProcesses()
	 * @see #getProcessNetwork()
	 * @generated
	 */
	EReference getProcessNetwork_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link forsyde.ProcessNetwork#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see forsyde.ProcessNetwork#getSignals()
	 * @see #getProcessNetwork()
	 * @generated
	 */
	EReference getProcessNetwork_Signals();

	/**
	 * Returns the meta object for class '{@link forsyde.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see forsyde.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forsyde.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link forsyde.Process#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see forsyde.Process#getPorts()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Ports();

	/**
	 * Returns the meta object for class '{@link forsyde.LeafProcess <em>Leaf Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Process</em>'.
	 * @see forsyde.LeafProcess
	 * @generated
	 */
	EClass getLeafProcess();

	/**
	 * Returns the meta object for the containment reference '{@link forsyde.LeafProcess#getProcessConstructor <em>Process Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Constructor</em>'.
	 * @see forsyde.LeafProcess#getProcessConstructor()
	 * @see #getLeafProcess()
	 * @generated
	 */
	EReference getLeafProcess_ProcessConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link forsyde.LeafProcess#getConstructorArguments <em>Constructor Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructor Arguments</em>'.
	 * @see forsyde.LeafProcess#getConstructorArguments()
	 * @see #getLeafProcess()
	 * @generated
	 */
	EReference getLeafProcess_ConstructorArguments();

	/**
	 * Returns the meta object for class '{@link forsyde.CompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Process</em>'.
	 * @see forsyde.CompositeProcess
	 * @generated
	 */
	EClass getCompositeProcess();

	/**
	 * Returns the meta object for the reference '{@link forsyde.CompositeProcess#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see forsyde.CompositeProcess#getComponent()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_Component();

	/**
	 * Returns the meta object for class '{@link forsyde.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see forsyde.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forsyde.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.Signal#getMoc <em>Moc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moc</em>'.
	 * @see forsyde.Signal#getMoc()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Moc();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.Signal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see forsyde.Signal#getDataType()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_DataType();

	/**
	 * Returns the meta object for the reference '{@link forsyde.Signal#getSourceProcess <em>Source Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Process</em>'.
	 * @see forsyde.Signal#getSourceProcess()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_SourceProcess();

	/**
	 * Returns the meta object for the reference '{@link forsyde.Signal#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see forsyde.Signal#getSourcePort()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link forsyde.Signal#getTargetProcess <em>Target Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Process</em>'.
	 * @see forsyde.Signal#getTargetProcess()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_TargetProcess();

	/**
	 * Returns the meta object for the reference '{@link forsyde.Signal#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see forsyde.Signal#getTargetPort()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_TargetPort();

	/**
	 * Returns the meta object for class '{@link forsyde.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see forsyde.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forsyde.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.Port#getMoc <em>Moc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moc</em>'.
	 * @see forsyde.Port#getMoc()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Moc();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.Port#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see forsyde.Port#getDataType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_DataType();

	/**
	 * Returns the meta object for the reference '{@link forsyde.Port#getBoundProcess <em>Bound Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Process</em>'.
	 * @see forsyde.Port#getBoundProcess()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_BoundProcess();

	/**
	 * Returns the meta object for class '{@link forsyde.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see forsyde.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the reference '{@link forsyde.InputPort#getBoundPort <em>Bound Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Port</em>'.
	 * @see forsyde.InputPort#getBoundPort()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_BoundPort();

	/**
	 * Returns the meta object for class '{@link forsyde.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see forsyde.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the reference '{@link forsyde.OutputPort#getBoundPort <em>Bound Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Port</em>'.
	 * @see forsyde.OutputPort#getBoundPort()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_BoundPort();

	/**
	 * Returns the meta object for class '{@link forsyde.ProcessConstructor <em>Process Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Constructor</em>'.
	 * @see forsyde.ProcessConstructor
	 * @generated
	 */
	EClass getProcessConstructor();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.ProcessConstructor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forsyde.ProcessConstructor#getName()
	 * @see #getProcessConstructor()
	 * @generated
	 */
	EAttribute getProcessConstructor_Name();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.ProcessConstructor#getMoc <em>Moc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moc</em>'.
	 * @see forsyde.ProcessConstructor#getMoc()
	 * @see #getProcessConstructor()
	 * @generated
	 */
	EAttribute getProcessConstructor_Moc();

	/**
	 * Returns the meta object for class '{@link forsyde.ConstructorArgument <em>Constructor Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Argument</em>'.
	 * @see forsyde.ConstructorArgument
	 * @generated
	 */
	EClass getConstructorArgument();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.ConstructorArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forsyde.ConstructorArgument#getName()
	 * @see #getConstructorArgument()
	 * @generated
	 */
	EAttribute getConstructorArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.ConstructorArgument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see forsyde.ConstructorArgument#getType()
	 * @see #getConstructorArgument()
	 * @generated
	 */
	EAttribute getConstructorArgument_Type();

	/**
	 * Returns the meta object for the attribute '{@link forsyde.ConstructorArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see forsyde.ConstructorArgument#getValue()
	 * @see #getConstructorArgument()
	 * @generated
	 */
	EAttribute getConstructorArgument_Value();

	/**
	 * Returns the meta object for enum '{@link forsyde.MoC <em>Mo C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mo C</em>'.
	 * @see forsyde.MoC
	 * @generated
	 */
	EEnum getMoC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ForsydeFactory getForsydeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link forsyde.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.SystemImpl
		 * @see forsyde.impl.ForsydePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Process Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PROCESS_NETWORKS = eINSTANCE.getSystem_ProcessNetworks();

		/**
		 * The meta object literal for the '{@link forsyde.impl.ProcessNetworkImpl <em>Process Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.ProcessNetworkImpl
		 * @see forsyde.impl.ForsydePackageImpl#getProcessNetwork()
		 * @generated
		 */
		EClass PROCESS_NETWORK = eINSTANCE.getProcessNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_NETWORK__NAME = eINSTANCE.getProcessNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NETWORK__PORTS = eINSTANCE.getProcessNetwork_Ports();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NETWORK__PROCESSES = eINSTANCE.getProcessNetwork_Processes();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NETWORK__SIGNALS = eINSTANCE.getProcessNetwork_Signals();

		/**
		 * The meta object literal for the '{@link forsyde.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.ProcessImpl
		 * @see forsyde.impl.ForsydePackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PORTS = eINSTANCE.getProcess_Ports();

		/**
		 * The meta object literal for the '{@link forsyde.impl.LeafProcessImpl <em>Leaf Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.LeafProcessImpl
		 * @see forsyde.impl.ForsydePackageImpl#getLeafProcess()
		 * @generated
		 */
		EClass LEAF_PROCESS = eINSTANCE.getLeafProcess();

		/**
		 * The meta object literal for the '<em><b>Process Constructor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_PROCESS__PROCESS_CONSTRUCTOR = eINSTANCE.getLeafProcess_ProcessConstructor();

		/**
		 * The meta object literal for the '<em><b>Constructor Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_PROCESS__CONSTRUCTOR_ARGUMENTS = eINSTANCE.getLeafProcess_ConstructorArguments();

		/**
		 * The meta object literal for the '{@link forsyde.impl.CompositeProcessImpl <em>Composite Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.CompositeProcessImpl
		 * @see forsyde.impl.ForsydePackageImpl#getCompositeProcess()
		 * @generated
		 */
		EClass COMPOSITE_PROCESS = eINSTANCE.getCompositeProcess();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COMPONENT = eINSTANCE.getCompositeProcess_Component();

		/**
		 * The meta object literal for the '{@link forsyde.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.SignalImpl
		 * @see forsyde.impl.ForsydePackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '<em><b>Moc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__MOC = eINSTANCE.getSignal_Moc();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__DATA_TYPE = eINSTANCE.getSignal_DataType();

		/**
		 * The meta object literal for the '<em><b>Source Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SOURCE_PROCESS = eINSTANCE.getSignal_SourceProcess();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SOURCE_PORT = eINSTANCE.getSignal_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Target Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__TARGET_PROCESS = eINSTANCE.getSignal_TargetProcess();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__TARGET_PORT = eINSTANCE.getSignal_TargetPort();

		/**
		 * The meta object literal for the '{@link forsyde.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.PortImpl
		 * @see forsyde.impl.ForsydePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Moc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__MOC = eINSTANCE.getPort_Moc();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DATA_TYPE = eINSTANCE.getPort_DataType();

		/**
		 * The meta object literal for the '<em><b>Bound Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BOUND_PROCESS = eINSTANCE.getPort_BoundProcess();

		/**
		 * The meta object literal for the '{@link forsyde.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.InputPortImpl
		 * @see forsyde.impl.ForsydePackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Bound Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__BOUND_PORT = eINSTANCE.getInputPort_BoundPort();

		/**
		 * The meta object literal for the '{@link forsyde.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.OutputPortImpl
		 * @see forsyde.impl.ForsydePackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Bound Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__BOUND_PORT = eINSTANCE.getOutputPort_BoundPort();

		/**
		 * The meta object literal for the '{@link forsyde.impl.ProcessConstructorImpl <em>Process Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.ProcessConstructorImpl
		 * @see forsyde.impl.ForsydePackageImpl#getProcessConstructor()
		 * @generated
		 */
		EClass PROCESS_CONSTRUCTOR = eINSTANCE.getProcessConstructor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_CONSTRUCTOR__NAME = eINSTANCE.getProcessConstructor_Name();

		/**
		 * The meta object literal for the '<em><b>Moc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_CONSTRUCTOR__MOC = eINSTANCE.getProcessConstructor_Moc();

		/**
		 * The meta object literal for the '{@link forsyde.impl.ConstructorArgumentImpl <em>Constructor Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.impl.ConstructorArgumentImpl
		 * @see forsyde.impl.ForsydePackageImpl#getConstructorArgument()
		 * @generated
		 */
		EClass CONSTRUCTOR_ARGUMENT = eINSTANCE.getConstructorArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARGUMENT__NAME = eINSTANCE.getConstructorArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARGUMENT__TYPE = eINSTANCE.getConstructorArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_ARGUMENT__VALUE = eINSTANCE.getConstructorArgument_Value();

		/**
		 * The meta object literal for the '{@link forsyde.MoC <em>Mo C</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forsyde.MoC
		 * @see forsyde.impl.ForsydePackageImpl#getMoC()
		 * @generated
		 */
		EEnum MO_C = eINSTANCE.getMoC();

	}

} //ForsydePackage
