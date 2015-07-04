
package co.nz.forwardthinking.suburb.persistence.mongo.module;

import co.nz.forwardthinking.suburb.persistence.mongo.repository.SuburbRepositoryService;
import co.nz.forwardthinking.suburb.persistence.mongo.repository.SuburbRepositoryServiceImpl;
import co.nz.forwardthinking.suburb.persistence.mongo.repository.VersionRepositoryService;
import co.nz.forwardthinking.suburb.persistence.mongo.repository.VersionRepositoryServiceImpl;

import com.google.inject.AbstractModule;

public class RepositoryModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(SuburbRepositoryService.class).to(SuburbRepositoryServiceImpl.class);
		bind(VersionRepositoryService.class).to(VersionRepositoryServiceImpl.class);
	}
}

