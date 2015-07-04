
package co.nz.forwardthinking.suburb.business.service;

import java.util.Map;

import co.nz.forwardthinking.suburb.business.dto.Suburb;
import co.nz.forwardthinking.suburb.business.dto.SuburbBaseInfoDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbCustomizedInfoDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbDwellingDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbFamilyDto;

public interface SuburbService {
	
     SuburbCustomizedInfoDto getSuburbCustomizedInfo(String suburbAreaCode);
	
     SuburbCustomizedInfoDto updateSuburb(SuburbCustomizedInfoDto dto);
	
     SuburbCustomizedInfoDto createSuburb(SuburbCustomizedInfoDto dto);
     
     Map<Integer, String> getSuburbs();
     
     SuburbBaseInfoDto createSuburbBaseInfo(SuburbBaseInfoDto dto);
     
     Suburb getSuburb(String areaCode);
     
     SuburbBaseInfoDto getSuburbBaseInfo(String areaCode);
     
     SuburbDwellingDto getSuburbDwelling(String areaCode);
     
     SuburbFamilyDto getSuburbFamily(String areaCode);
}

