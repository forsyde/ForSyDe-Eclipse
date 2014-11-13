/**
 */
package forsyde.util;

import forsyde.CompositeProcess;
import forsyde.ConstructorArgument;
import forsyde.ForsydePackage;
import forsyde.LeafProcess;
import forsyde.Port;
import forsyde.ProcessConstructor;
import forsyde.ProcessNetwork;
import forsyde.Signal;
import forsyde.inputPort;
import forsyde.outputPort;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see forsyde.ForsydePackage
 * @generated
 */
public class ForsydeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ForsydePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForsydeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ForsydePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForsydeSwitch<Adapter> modelSwitch =
		new ForsydeSwitch<Adapter>() {
			@Override
			public Adapter caseProcessNetwork(ProcessNetwork object) {
				return createProcessNetworkAdapter();
			}
			@Override
			public Adapter caseProcess(forsyde.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseLeafProcess(LeafProcess object) {
				return createLeafProcessAdapter();
			}
			@Override
			public Adapter caseCompositeProcess(CompositeProcess object) {
				return createCompositeProcessAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseinputPort(inputPort object) {
				return createinputPortAdapter();
			}
			@Override
			public Adapter caseoutputPort(outputPort object) {
				return createoutputPortAdapter();
			}
			@Override
			public Adapter caseProcessConstructor(ProcessConstructor object) {
				return createProcessConstructorAdapter();
			}
			@Override
			public Adapter caseConstructorArgument(ConstructorArgument object) {
				return createConstructorArgumentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link forsyde.ProcessNetwork <em>Process Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.ProcessNetwork
	 * @generated
	 */
	public Adapter createProcessNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.LeafProcess <em>Leaf Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.LeafProcess
	 * @generated
	 */
	public Adapter createLeafProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.CompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.CompositeProcess
	 * @generated
	 */
	public Adapter createCompositeProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.inputPort <em>input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.inputPort
	 * @generated
	 */
	public Adapter createinputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.outputPort <em>output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.outputPort
	 * @generated
	 */
	public Adapter createoutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.ProcessConstructor <em>Process Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.ProcessConstructor
	 * @generated
	 */
	public Adapter createProcessConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link forsyde.ConstructorArgument <em>Constructor Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see forsyde.ConstructorArgument
	 * @generated
	 */
	public Adapter createConstructorArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ForsydeAdapterFactory
