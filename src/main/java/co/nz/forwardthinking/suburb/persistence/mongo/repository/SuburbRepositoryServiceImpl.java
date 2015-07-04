
package co.nz.forwardthinking.suburb.persistence.mongo.repository;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.bson.types.ObjectId;
import org.mongodb.morphia.query.Query;

import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbBaseInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbCustomizedInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbDwellingEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbFamilyEntity;

public class SuburbRepositoryServiceImpl extends AbstractRepository implements SuburbRepositoryService {

	@Override
	public SuburbCustomizedInfoEntity getSuburbCustomizedInfoEntity(String areaCode) {
		Query<SuburbCustomizedInfoEntity> query = getMongoDatastore().find(SuburbCustomizedInfoEntity.class);
		query.field("areaCode").equal(areaCode);
		return query.get();
	}
	

	@Override
	public SuburbBaseInfoEntity getSuburbBaseInfoEntity(String areaCode) {
		Query<SuburbBaseInfoEntity> query = getMongoDatastore().find(SuburbBaseInfoEntity.class);
		query.field("areaCode").equal(areaCode);
		return query.get();
	}

	@Override
	public SuburbCustomizedInfoEntity updateSuburbCustomizedInfo(SuburbCustomizedInfoEntity entity) {
		Validate.notNull(entity);
		getMongoDatastore().merge(entity);
		return entity;
	}

	@Override
	public SuburbCustomizedInfoEntity createSuburbCustomizedInfo(SuburbCustomizedInfoEntity entity) {
		Validate.notNull(entity);
		return this.persist(entity);
	}

	@Override
	public SuburbCustomizedInfoEntity getSuburbCustomizedInfoEntityById(String id) {
		Validate.notNull(id);
		Query<SuburbCustomizedInfoEntity> query = getMongoDatastore().find(SuburbCustomizedInfoEntity.class);
		query.field("entityId").equal(new ObjectId(id));
		return query.get();
	}

	@Override
	public SuburbBaseInfoEntity createSuburbBaseInfo(SuburbBaseInfoEntity entity) {
		Validate.notNull(entity);
		return this.persist(entity);
	}

	@Override
	public List<SuburbCustomizedInfoEntity> getAllSuburbCustomizedInfo() {
		Query<SuburbCustomizedInfoEntity> query = getMongoDatastore().find(SuburbCustomizedInfoEntity.class);
		return query.asList();
	}

	@Override
	public SuburbDwellingEntity createSuburbDwelling(SuburbDwellingEntity entity) {
		Validate.notNull(entity);
		return this.persist(entity);
	}

	@Override
	public SuburbFamilyEntity createSuburbFamily(SuburbFamilyEntity entity) {
		Validate.notNull(entity);
		return this.persist(entity);
	}

	@Override
	public SuburbDwellingEntity getSuburbDwelling(String areaCode) {
		Validate.notNull(areaCode);
		Query<SuburbDwellingEntity> query = getMongoDatastore().find(SuburbDwellingEntity.class);
		query.field("areaCode").equal(areaCode);
		return query.get();
	}

	@Override
	public SuburbFamilyEntity getSuburbFamily(String areaCode) {
		Validate.notNull(areaCode);
		Query<SuburbFamilyEntity> query = getMongoDatastore().find(SuburbFamilyEntity.class);
		query.field("areaCode").equal(areaCode);
		return query.get();	}

}

