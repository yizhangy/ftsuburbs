
package co.nz.forwardthinking.suburb.business.converter;

import co.nz.forwardthinking.suburb.business.dto.AucklandDistrict;
import co.nz.forwardthinking.suburb.business.dto.SuburbBaseInfoDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbCustomizedInfoDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbDwellingDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbFamilyDto;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbBaseInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbCustomizedInfoEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbDwellingEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.SuburbFamilyEntity;
import co.nz.forwardthinking.suburb.util.StringValueUtil;

public class SuburbConverter {
	
	public static SuburbCustomizedInfoEntity convertToEntity(SuburbCustomizedInfoDto dto) {
		SuburbCustomizedInfoEntity entity = new SuburbCustomizedInfoEntity();
		return updateEntity(entity, dto);
	}
	
	public static SuburbBaseInfoEntity convertToEntity(SuburbBaseInfoDto dto) {
		SuburbBaseInfoEntity entity = new SuburbBaseInfoEntity();
		entity.setAreaCode(dto.getAreaCode());
		entity.setAreaName(dto.getAreaName());
		entity.setBoundaries(dto.getBoundaries());
		entity.setWardCode(dto.getWardCode());
		entity.setWardDescription(dto.getWardDescription());
		entity.setLocalBoardCode(dto.getLocalBoardCode());
		entity.setLocalBoardDescription(dto.getLocalBoardDescription());
		entity.setTerritorialAuthorityCode(dto.getTerritorialAuthorityCode());
		entity.setTerritorialAuthorityDescription(dto.getTerritorialAuthorityDescription());
		entity.setRegionalCouncilCode(dto.getRegionalCouncilCode());
		entity.setRegionalCouncilDescription(dto.getRegionalCouncilDescription());
		return entity;
	}
	
	public static SuburbBaseInfoDto convertToBaseInfoDto(SuburbBaseInfoEntity entity) {
		SuburbBaseInfoDto dto = new SuburbBaseInfoDto();
		dto.setAreaCode(entity.getAreaCode());
		dto.setAreaName(entity.getAreaName());
		dto.setBoundaries(entity.getBoundaries());
		dto.setWardCode(entity.getWardCode());
		dto.setWardDescription(entity.getWardDescription());
		dto.setLocalBoardCode(entity.getLocalBoardCode());
		dto.setLocalBoardDescription(entity.getLocalBoardDescription());
		dto.setTerritorialAuthorityCode(entity.getTerritorialAuthorityCode());
		dto.setTerritorialAuthorityDescription(entity.getTerritorialAuthorityDescription());
		dto.setRegionalCouncilCode(entity.getRegionalCouncilCode());
		dto.setRegionalCouncilDescription(entity.getRegionalCouncilDescription());
		return dto;
	}
	
	public static SuburbCustomizedInfoEntity updateEntity(SuburbCustomizedInfoEntity entity, SuburbCustomizedInfoDto dto) {
		entity.setAreaCode(dto.getAreaCode());
		entity.setDistrict(dto.getDistrict());
		entity.setEducation(dto.getEducation());
		entity.setGeography(dto.getGeography());
		entity.setHistory(dto.getHistory());
		entity.setName(dto.getName());
		entity.setPeople(dto.getPeople());
		entity.setSports(dto.getSports());
		entity.setSummary(dto.getSummary());
		entity.setImages(dto.getImages());
		entity.setBackgroundImage(dto.getBackgroundImage());
		entity.setNews(dto.getNews());
		
		entity.setHealth(dto.getHealth());
		entity.setSafety(dto.getSafety());
		entity.setTransportation(dto.getTransportation());
		entity.setShopping(dto.getShopping());
		entity.setEntertainment(dto.getEntertainment());
		entity.setLeisure(dto.getLeisure());
		entity.setRestaurants(dto.getRestaurants());
		entity.setEvents(dto.getEvents());
		entity.setLibrary(dto.getLibrary());
		entity.setAverageHouseRent(dto.getAverageHouseRent());
		entity.setAverageHousePrice(dto.getAverageHousePrice());
		return entity;
	}
	
	public static SuburbCustomizedInfoDto convertToDto(SuburbCustomizedInfoEntity entity) {
		SuburbCustomizedInfoDto dto = new SuburbCustomizedInfoDto();
		dto.setId(entity.getId());
		String districtCode = entity.getDistrict();
		dto.setDistrict(districtCode);
		if (districtCode != null && AucklandDistrict.getDistrictByCode(districtCode) != null) {
			dto.setDistrictDisplayValue(AucklandDistrict.getDistrictByCode(districtCode).getValue());
		}
		dto.setAreaCode(entity.getAreaCode());
		dto.setEducation(entity.getEducation());
		dto.setGeography(entity.getGeography());
		dto.setHistory(entity.getHistory());
		dto.setName(entity.getName());
		dto.setPeople(entity.getPeople());
		dto.setSports(entity.getSports());
		dto.setSummary(entity.getSummary());
		dto.setImages(entity.getImages());
		dto.setBackgroundImage(entity.getBackgroundImage());
		dto.setNews(entity.getNews());
		
		dto.setHealth(entity.getHealth());
		dto.setSafety(entity.getSafety());
		dto.setTransportation(entity.getTransportation());
		dto.setShopping(entity.getShopping());
		dto.setEntertainment(entity.getEntertainment());
		dto.setLeisure(entity.getLeisure());
		dto.setRestaurants(entity.getRestaurants());
		dto.setEvents(entity.getEvents());
		dto.setLibrary(entity.getLibrary());
		dto.setAverageHouseRent(entity.getAverageHouseRent());
		dto.setAverageHousePrice(entity.getAverageHousePrice());
		return dto;
	}
	
	public static SuburbDwellingDto convertToDto(SuburbDwellingEntity entity) {
		SuburbDwellingDto dwelling = new SuburbDwellingDto();
		dwelling.setId(entity.getId());
		dwelling.setAreaCode(entity.getAreaCode());
		dwelling.setPrivateOccupiedHouse(entity.getPrivateOccupiedHouse());
		dwelling.setPrivateOccupiedFlatsUnitsApartments(entity.getPrivateOccupiedFlatsUnitsApartments());
		dwelling.setPrivateOccupiedOthers(entity.getPrivateOccupiedOthers());
		dwelling.setPrivateOccupiedUndefined(entity.getPrivateOccupiedUndefined());
		dwelling.setPrivateOccupiedTotal(entity.getPrivateOccupiedTotal());
		dwelling.setTotalDwellingPrivateOccupied(entity.getTotalDwellingPrivateOccupied());
		dwelling.setTotalDwellingNonPrivateOccupied(entity.getTotalDwellingNonPrivateOccupied());
		dwelling.setTotalOccupied(entity.getTotalOccupied());
		dwelling.setPrivateHeatElectricity(entity.getPrivateHeatElectricity());
		dwelling.setPrivateHeatMainsGas(entity.getPrivateHeatMainsGas());
		dwelling.setPrivateHeatBottledGas(entity.getPrivateHeatBottledGas());
		dwelling.setPrivateHeatWood(entity.getPrivateHeatWood());
		dwelling.setPrivateHeatCoal(entity.getPrivateHeatCoal());
		dwelling.setPrivateHeatSolarPower(entity.getPrivateHeatSolarPower());
		dwelling.setPrivateHeatNoFuel(entity.getPrivateHeatNoFuel());
		dwelling.setPrivateHeatOtherFuel(entity.getPrivateHeatOtherFuel());
		return dwelling;
	}
	
	public static SuburbFamilyDto convertToDto(SuburbFamilyEntity entity) {
		SuburbFamilyDto family = new SuburbFamilyDto();
		family.setId(entity.getId());
		family.setAreaCode(entity.getAreaCode());
		family.setTotalOccupiedPrivateDwellings(entity.getTotalOccupiedPrivateDwellings());
		family.setTotalFamilyWithoutChildren(entity.getTotalFamilyWithoutChildren());
		family.setTotalFamilyWithChildren(entity.getTotalFamilyWithChildren());
		family.setTotalSingleFamilyWithChildren(entity.getTotalSingleFamilyWithChildren());
		family.setTotalFamilyIncome20000Less(entity.getTotalFamilyIncome20000Less());
		family.setTotalFamilyIncome2000130000(entity.getTotalFamilyIncome2000130000());
		family.setTotalFamilyIncome3000150000(entity.getTotalFamilyIncome3000150000());
		family.setTotalFamilyIncome5000170000(entity.getTotalFamilyIncome5000170000());
		family.setTotalFamilyIncome7000100000(entity.getTotalFamilyIncome7000100000());
		family.setTotalFamilyIncome100000More(entity.getTotalFamilyIncome100000More());
		family.setTotalFamilyMedianIncome(StringValueUtil.formatMoney(entity.getTotalFamilyMedianIncome()));
		return family;
	}

}

