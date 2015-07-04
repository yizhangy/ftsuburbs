package co.nz.forwardthinking.suburb.persistence.mongo.repository;

import javax.inject.Inject;

import org.apache.commons.lang.Validate;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;

import co.nz.forwardthinking.suburb.persistence.mongo.config.MongoDBConnectionService;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.BaseEntity;

public abstract class AbstractRepository implements GenericRepository {

	@Inject
	private MongoDBConnectionService mongoDBConnectionService;

	protected Datastore getMongoDatastore() {
		return mongoDBConnectionService.getDatastore();
	}

	protected String getCurrentMongoDBName() {
		return getMongoDatastore().getDB().getName();
	}

	@Override
	public <E extends BaseEntity> E persist(E entity) {
		Validate.notNull(entity);
		getMongoDatastore().save(entity);
		return entity;
	}

	@Override
	public <E extends BaseEntity> E update(E entity) {
		Validate.notNull(entity);
		Validate.notNull(entity.getId());

		getMongoDatastore().save(entity);
		return entity;
	}

	@Override
	public <E extends BaseEntity> long count(Class<E> clazz) {
		if (clazz == null) {
			return 0;
		}
		return getMongoDatastore().find(clazz).countAll();
	}

	@Override
	public <E extends BaseEntity> E get(Class<E> clazz, final ObjectId id) {
		if ((clazz == null) || (id == null)) {
			return null;
		}
		return getMongoDatastore().find(clazz).field("entityId").equal(id)
				.get();
	}

}
