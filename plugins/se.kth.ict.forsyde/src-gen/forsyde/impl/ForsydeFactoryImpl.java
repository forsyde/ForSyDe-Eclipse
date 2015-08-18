/**
 */
package forsyde.impl;

import forsyde.CompositeProcess;
import forsyde.ConstructorArgument;
import forsyde.ForsydeFactory;
import forsyde.ForsydePackage;
import forsyde.InputPort;
import forsyde.LeafProcess;
import forsyde.MoC;
import forsyde.OutputPort;
import forsyde.ProcessConstructor;
import forsyde.ProcessNetwork;
import forsyde.Signal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForsydeFactoryImpl extends EFactoryImpl implements ForsydeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ForsydeFactory init() {
		try {
			ForsydeFactory theForsydeFactory = (ForsydeFactory)EPackage.Registry.INSTANCE.getEFactory(ForsydePackage.eNS_URI);
			if (theForsydeFactory != null) {
				return theForsydeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ForsydeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForsydeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ForsydePackage.SYSTEM: return createSystem();
			case ForsydePackage.PROCESS_NETWORK: return createProcessNetwork();
			case ForsydePackage.LEAF_PROCESS: return createLeafProcess();
			case ForsydePackage.COMPOSITE_PROCESS: return createCompositeProcess();
			case ForsydePackage.SIGNAL: return createSignal();
			case ForsydePackage.INPUT_PORT: return createInputPort();
			case ForsydePackage.OUTPUT_PORT: return createOutputPort();
			case ForsydePackage.PROCESS_CONSTRUCTOR: return createProcessConstructor();
			case ForsydePackage.CONSTRUCTOR_ARGUMENT: return createConstructorArgument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ForsydePackage.MO_C:
				return createMoCFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ForsydePackage.MO_C:
				return convertMoCToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forsyde.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessNetwork createProcessNetwork() {
		ProcessNetworkImpl processNetwork = new ProcessNetworkImpl();
		return processNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafProcess createLeafProcess() {
		LeafProcessImpl leafProcess = new LeafProcessImpl();
		return leafProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProcess createCompositeProcess() {
		CompositeProcessImpl compositeProcess = new CompositeProcessImpl();
		return compositeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessConstructor createProcessConstructor() {
		ProcessConstructorImpl processConstructor = new ProcessConstructorImpl();
		return processConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorArgument createConstructorArgument() {
		ConstructorArgumentImpl constructorArgument = new ConstructorArgumentImpl();
		return constructorArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoC createMoCFromString(EDataType eDataType, String initialValue) {
		MoC result = MoC.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoCToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForsydePackage getForsydePackage() {
		return (ForsydePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ForsydePackage getPackage() {
		return ForsydePackage.eINSTANCE;
	}

} //ForsydeFactoryImpl
