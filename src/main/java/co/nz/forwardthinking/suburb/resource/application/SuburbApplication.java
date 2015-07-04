
package co.nz.forwardthinking.suburb.resource.application;

import javax.inject.Inject;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import co.nz.forwardthinking.suburb.web.guice.module.WebModule;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.google.inject.Guice;

public class SuburbApplication extends ResourceConfig {

	private static final String REST_RESOURCES_PACKAGES_SCAN = "co.nz.forwardthinking.suburb.resource";

	@Inject
	public SuburbApplication(ServiceLocator serviceLocator) {
		// Rest resources package scan
		packages(REST_RESOURCES_PACKAGES_SCAN);

		register(RolesAllowedDynamicFeature.class);
		register(MultiPartFeature.class);
		register(JacksonJaxbJsonProvider.class);

		// Guice integration
		GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
		GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
		guiceBridge.bridgeGuiceInjector(Guice.createInjector(new WebModule()));
	}
}

