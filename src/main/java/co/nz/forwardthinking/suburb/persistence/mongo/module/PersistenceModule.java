
package co.nz.forwardthinking.suburb.persistence.mongo.module;

import com.google.inject.Scopes;

import co.nz.forwardthinking.suburb.persistence.mongo.config.MongoDBConnectionService;
import co.nz.forwardthinking.suburb.persistence.mongo.config.MongoDBConnectionServiceImpl;

public class PersistenceModule extends RepositoryModule {

	@Override
	protected void configure() {
		super.configure();
		bind(MongoDBConnectionService.class).to(MongoDBConnectionServiceImpl.class).in(Scopes.SINGLETON);
	}

}

