
package co.nz.forwardthinking.suburb.business.dto;

public enum AucklandDistrict {
	
	CITY("auckland.district.city" , "Auckland City"),
	NORTHSHORE("auckland.district.northShore", "North Shore"),
	WAITAKERE("auckland.district.waitakere", "Waitakere City"),
	RODNEY("auckland.district.rodney", "Rodney"),
	MANUKAU("auckland.district.manukau", "Manukau City"),
	FRANKLIN("auckland.district.franklin", "Franklin"),
	HAURAKI("auckland.district.hauraki", "Hauraki Gulf Islands"),
	PAPAKURA("auckland.district.papakura", "Papakura"),
	WAIHEKE("auckland.district.waiheke", "Waiheke Island");
	
	private String code;
	private String value;
	
	private AucklandDistrict(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
	
	public static AucklandDistrict getDistrictByCode(String code) {
		AucklandDistrict[] districts = AucklandDistrict.values();
		for(int i = 0; i < districts.length; i++) {
			if(districts[i].code.equals(code)) {
				return districts[i];
			}
		}
		return null;
	}

}

