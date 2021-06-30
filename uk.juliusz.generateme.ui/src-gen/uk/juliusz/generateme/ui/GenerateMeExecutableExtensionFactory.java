/*
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uk.juliusz.generateme.ui.internal.GeneratemeActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GenerateMeExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(GeneratemeActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		GeneratemeActivator activator = GeneratemeActivator.getInstance();
		return activator != null ? activator.getInjector(GeneratemeActivator.UK_JULIUSZ_GENERATEME_GENERATEME) : null;
	}

}