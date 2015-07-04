
package co.nz.forwardthinking.suburb.persistence.mongo.repository;

import org.apache.commons.lang3.Validate;
import org.mongodb.morphia.query.Query;

import co.nz.forwardthinking.suburb.persistence.mongo.entity.VersionEntity;

public class VersionRepositoryServiceImpl extends AbstractRepository implements VersionRepositoryService {

	@Override
	public VersionEntity getCurrentVersion() {
		Query<VersionEntity> query = getMongoDatastore().find(VersionEntity.class);
		query.field("current").equal(true);
		return query.get();
	}

	@Override
	public VersionEntity saveCurrentVersion(VersionEntity entity) {
		Validate.notNull(entity);
		VersionEntity versionEntity = this.getCurrentVersion();
		if(versionEntity != null) {
			versionEntity.setCurrent(false);
			this.updateVersion(versionEntity);
		}
		entity.setCurrent(true);
		return this.persist(entity);
	}

	@Override
	public VersionEntity updateVersion(VersionEntity entity) {
		Validate.notNull(entity);
		getMongoDatastore().merge(entity);
		return entity;
	}

}

