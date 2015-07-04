package co.nz.forwardthinking.suburb.business.dto;

public class Suburb {

	private String areaCode;
	private SuburbBaseInfoDto baseInfo;
	private SuburbCustomizedInfoDto customizedInfo;
	private SuburbDwellingDto dwelling;
	private SuburbFamilyDto family;

	public Suburb(String areaCode, SuburbBaseInfoDto baseInfo, SuburbCustomizedInfoDto customizedInfo, SuburbDwellingDto dwelling, SuburbFamilyDto family) {
		this.areaCode = areaCode;
		this.baseInfo = baseInfo;
		this.customizedInfo = customizedInfo;
		this.dwelling = dwelling;
		this.family = family;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public SuburbBaseInfoDto getBaseInfo() {
		return baseInfo;
	}

	public SuburbCustomizedInfoDto getCustomizedInfo() {
		return customizedInfo;
	}

	public SuburbDwellingDto getDwelling() {
		return dwelling;
	}

	public SuburbFamilyDto getFamily() {
		return family;
	}
	
	

}
