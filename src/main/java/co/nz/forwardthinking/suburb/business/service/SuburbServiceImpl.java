
package co.nz.forwardthinking.suburb.business.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.inject.Inject;

import co.nz.forwardthinking.suburb.business.comparator.AreaMapComparator;
import co.nz.forwardthinking.suburb.business.converter.SuburbConverter;
import co.nz.forwardthinking.suburb.business.dto.Suburb;
import co.nz.forwardthinking.suburb.business.dto.SuburbBaseInfoDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbCustomizedInfoDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbDwellingDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbFamilyDto;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbBaseInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbCustomizedInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbDwellingEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbFamilyEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.repository.SuburbRepositoryService;

public class SuburbServiceImpl implements SuburbService {
	
	private SuburbRepositoryService suburbRepositoryService;
	
	@Inject
	public SuburbServiceImpl(SuburbRepositoryService suburbRepositoryService) {
		this.suburbRepositoryService = suburbRepositoryService;
	}

	@Override
	public SuburbCustomizedInfoDto getSuburbCustomizedInfo(String suburbAreaCode) {
		SuburbCustomizedInfoEntity suburbEntity = suburbRepositoryService.getSuburbCustomizedInfoEntity(suburbAreaCode);
		return toDto(suburbEntity);
	}	

	@Override
	public SuburbBaseInfoDto getSuburbBaseInfo(String areaCode) {
		SuburbBaseInfoEntity baseInfoEntity = suburbRepositoryService.getSuburbBaseInfoEntity(areaCode);
		return toDto(baseInfoEntity);
	}
	

	@Override
	public SuburbDwellingDto getSuburbDwelling(String areaCode) {
		SuburbDwellingEntity dwellingEntity = suburbRepositoryService.getSuburbDwelling(areaCode);
		return toDto(dwellingEntity);
	}
	

	@Override
	public SuburbFamilyDto getSuburbFamily(String areaCode) {
		SuburbFamilyEntity familyEntity = suburbRepositoryService.getSuburbFamily(areaCode);
		return toDto(familyEntity);
	}


	@Override
	public SuburbCustomizedInfoDto updateSuburb(SuburbCustomizedInfoDto dto) {
		SuburbCustomizedInfoEntity entity =  this.suburbRepositoryService.getSuburbCustomizedInfoEntityById(dto.getId());
		SuburbCustomizedInfoEntity updatedEntity = SuburbConverter.updateEntity(entity, dto);
		return toDto( this.suburbRepositoryService.updateSuburbCustomizedInfo(updatedEntity));
	}

	@Override
	public SuburbCustomizedInfoDto createSuburb(SuburbCustomizedInfoDto dto) {
		SuburbCustomizedInfoEntity entity = SuburbConverter.convertToEntity(dto);
		return toDto( this.suburbRepositoryService.createSuburbCustomizedInfo(entity));
	}
	
	@Override
	public SuburbBaseInfoDto createSuburbBaseInfo(SuburbBaseInfoDto dto) {
		SuburbBaseInfoEntity entity = SuburbConverter.convertToEntity(dto);
		return toDto(this.suburbRepositoryService.createSuburbBaseInfo(entity));
	}
	
	private SuburbBaseInfoDto toDto(SuburbBaseInfoEntity entity) {
		return (entity != null) ? SuburbConverter.convertToBaseInfoDto(entity) : null;
	}

	private SuburbCustomizedInfoDto toDto(SuburbCustomizedInfoEntity suburbEntity) {
		return (suburbEntity != null) ? SuburbConverter.convertToDto( suburbEntity) : null;
	}
	
	private SuburbDwellingDto toDto(SuburbDwellingEntity dwellingEntity) {
		return (dwellingEntity != null) ? SuburbConverter.convertToDto(dwellingEntity) : null;
	}
	
	private SuburbFamilyDto toDto(SuburbFamilyEntity familyEntity) {
		return (familyEntity != null) ? SuburbConverter.convertToDto(familyEntity) : null;
	}

	@Override
	public Map<Integer, String> getSuburbs() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (SuburbCustomizedInfoEntity entity : suburbRepositoryService.getAllSuburbCustomizedInfo()) {
			map.put(Integer.valueOf( entity.getAreaCode()), entity.getName());
		}
		Map<Integer, String>  suburbAreaMap = Collections.unmodifiableMap(map);
		Map<Integer, String> sortedMap = new TreeMap<>(new AreaMapComparator(suburbAreaMap));
		sortedMap.putAll(suburbAreaMap);
		return sortedMap;
	}

	@Override
	public Suburb getSuburb(String areaCode) {
		SuburbCustomizedInfoDto customizedInfo = this.getSuburbCustomizedInfo(areaCode);
		SuburbBaseInfoDto baseInfo = this.getSuburbBaseInfo(areaCode);
		SuburbDwellingDto dwelling = this.getSuburbDwelling(areaCode);
		SuburbFamilyDto family = this.getSuburbFamily(areaCode);
		return new Suburb(areaCode, baseInfo, customizedInfo, dwelling, family);
	}



}

