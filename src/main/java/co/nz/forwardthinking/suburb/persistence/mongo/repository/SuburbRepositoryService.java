
package co.nz.forwardthinking.suburb.persistence.mongo.repository;

import java.util.List;

import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbBaseInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbCustomizedInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbDwellingEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbFamilyEntity;

public interface SuburbRepositoryService {
	
	SuburbCustomizedInfoEntity getSuburbCustomizedInfoEntity(String suburbAreaCode);
	
	SuburbBaseInfoEntity getSuburbBaseInfoEntity(String areaCode);
	
	List<SuburbCustomizedInfoEntity> getAllSuburbCustomizedInfo();
	
	SuburbCustomizedInfoEntity getSuburbCustomizedInfoEntityById(String id);
	
	SuburbCustomizedInfoEntity updateSuburbCustomizedInfo(SuburbCustomizedInfoEntity entity);
	
	SuburbCustomizedInfoEntity createSuburbCustomizedInfo(SuburbCustomizedInfoEntity entity);
	
	SuburbBaseInfoEntity createSuburbBaseInfo(SuburbBaseInfoEntity entity);
	
	SuburbDwellingEntity createSuburbDwelling(SuburbDwellingEntity entity);
	
	SuburbFamilyEntity createSuburbFamily(SuburbFamilyEntity entity);
	
	SuburbDwellingEntity getSuburbDwelling(String areaCode);
	
	SuburbFamilyEntity getSuburbFamily(String areaCode);
}

