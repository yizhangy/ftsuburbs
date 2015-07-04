
package co.nz.forwardthinking.suburb.web.guice.module;

import co.nz.forwardthinking.suburb.business.module.BusinessModule;
import co.nz.forwardthinking.suburb.persistence.mongo.module.PersistenceModule;

import com.google.inject.servlet.ServletModule;

public class WebModule extends ServletModule {

	@Override
	protected void configureServlets() {
		install(new PersistenceModule());
		install(new BusinessModule());
	}
}

