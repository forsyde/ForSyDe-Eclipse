/**
 */
package forsyde.provider;

import forsyde.util.ForsydeAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForsydeItemProviderAdapterFactory extends ForsydeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForsydeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.system} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected systemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.system}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createsystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new systemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.ProcessNetwork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessNetworkItemProvider processNetworkItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.ProcessNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessNetworkAdapter() {
		if (processNetworkItemProvider == null) {
			processNetworkItemProvider = new ProcessNetworkItemProvider(this);
		}

		return processNetworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.LeafProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafProcessItemProvider leafProcessItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.LeafProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeafProcessAdapter() {
		if (leafProcessItemProvider == null) {
			leafProcessItemProvider = new LeafProcessItemProvider(this);
		}

		return leafProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.CompositeProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeProcessItemProvider compositeProcessItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.CompositeProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeProcessAdapter() {
		if (compositeProcessItemProvider == null) {
			compositeProcessItemProvider = new CompositeProcessItemProvider(this);
		}

		return compositeProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.Signal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalItemProvider signalItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalAdapter() {
		if (signalItemProvider == null) {
			signalItemProvider = new SignalItemProvider(this);
		}

		return signalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.inputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected inputPortItemProvider inputPortItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.inputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createinputPortAdapter() {
		if (inputPortItemProvider == null) {
			inputPortItemProvider = new inputPortItemProvider(this);
		}

		return inputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.outputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected outputPortItemProvider outputPortItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.outputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createoutputPortAdapter() {
		if (outputPortItemProvider == null) {
			outputPortItemProvider = new outputPortItemProvider(this);
		}

		return outputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.ProcessConstructor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessConstructorItemProvider processConstructorItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.ProcessConstructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessConstructorAdapter() {
		if (processConstructorItemProvider == null) {
			processConstructorItemProvider = new ProcessConstructorItemProvider(this);
		}

		return processConstructorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link forsyde.ConstructorArgument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorArgumentItemProvider constructorArgumentItemProvider;

	/**
	 * This creates an adapter for a {@link forsyde.ConstructorArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstructorArgumentAdapter() {
		if (constructorArgumentItemProvider == null) {
			constructorArgumentItemProvider = new ConstructorArgumentItemProvider(this);
		}

		return constructorArgumentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (processNetworkItemProvider != null) processNetworkItemProvider.dispose();
		if (leafProcessItemProvider != null) leafProcessItemProvider.dispose();
		if (compositeProcessItemProvider != null) compositeProcessItemProvider.dispose();
		if (signalItemProvider != null) signalItemProvider.dispose();
		if (inputPortItemProvider != null) inputPortItemProvider.dispose();
		if (outputPortItemProvider != null) outputPortItemProvider.dispose();
		if (processConstructorItemProvider != null) processConstructorItemProvider.dispose();
		if (constructorArgumentItemProvider != null) constructorArgumentItemProvider.dispose();
	}

}
