package co.nz.forwardthinking.suburb.business.dto;

public class SuburbDwellingDto {
	private String id;
	private String areaCode;
	private String privateOccupiedHouse;
	private String privateOccupiedFlatsUnitsApartments;
	private String privateOccupiedOthers;
	private String privateOccupiedUndefined;
	private String privateOccupiedTotal;
	private String totalDwellingPrivateOccupied;
	private String totalDwellingNonPrivateOccupied;
	private String totalOccupied;
	private String privateHeatElectricity;
	private String privateHeatMainsGas;
	private String privateHeatBottledGas;
	private String privateHeatWood;
	private String privateHeatCoal;
	private String privateHeatSolarPower;
	private String privateHeatNoFuel;
	private String privateHeatOtherFuel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPrivateOccupiedHouse() {
		return privateOccupiedHouse;
	}

	public void setPrivateOccupiedHouse(String privateOccupiedHouse) {
		this.privateOccupiedHouse = privateOccupiedHouse;
	}

	public String getPrivateOccupiedFlatsUnitsApartments() {
		return privateOccupiedFlatsUnitsApartments;
	}

	public void setPrivateOccupiedFlatsUnitsApartments(
			String privateOccupiedFlatsUnitsApartments) {
		this.privateOccupiedFlatsUnitsApartments = privateOccupiedFlatsUnitsApartments;
	}

	public String getPrivateOccupiedOthers() {
		return privateOccupiedOthers;
	}

	public void setPrivateOccupiedOthers(String privateOccupiedOthers) {
		this.privateOccupiedOthers = privateOccupiedOthers;
	}

	public String getPrivateOccupiedUndefined() {
		return privateOccupiedUndefined;
	}

	public void setPrivateOccupiedUndefined(String privateOccupiedUndefined) {
		this.privateOccupiedUndefined = privateOccupiedUndefined;
	}

	public String getPrivateOccupiedTotal() {
		return privateOccupiedTotal;
	}

	public void setPrivateOccupiedTotal(String privateOccupiedTotal) {
		this.privateOccupiedTotal = privateOccupiedTotal;
	}

	public String getTotalDwellingPrivateOccupied() {
		return totalDwellingPrivateOccupied;
	}

	public void setTotalDwellingPrivateOccupied(
			String totalDwellingPrivateOccupied) {
		this.totalDwellingPrivateOccupied = totalDwellingPrivateOccupied;
	}

	public String getTotalDwellingNonPrivateOccupied() {
		return totalDwellingNonPrivateOccupied;
	}

	public void setTotalDwellingNonPrivateOccupied(
			String totalDwellingNonPrivateOccupied) {
		this.totalDwellingNonPrivateOccupied = totalDwellingNonPrivateOccupied;
	}

	public String getTotalOccupied() {
		return totalOccupied;
	}

	public void setTotalOccupied(String totalOccupied) {
		this.totalOccupied = totalOccupied;
	}

	public String getPrivateHeatElectricity() {
		return privateHeatElectricity;
	}

	public void setPrivateHeatElectricity(String privateHeatElectricity) {
		this.privateHeatElectricity = privateHeatElectricity;
	}

	public String getPrivateHeatMainsGas() {
		return privateHeatMainsGas;
	}

	public void setPrivateHeatMainsGas(String privateHeatMainsGas) {
		this.privateHeatMainsGas = privateHeatMainsGas;
	}

	public String getPrivateHeatBottledGas() {
		return privateHeatBottledGas;
	}

	public void setPrivateHeatBottledGas(String privateHeatBottledGas) {
		this.privateHeatBottledGas = privateHeatBottledGas;
	}

	public String getPrivateHeatWood() {
		return privateHeatWood;
	}

	public void setPrivateHeatWood(String privateHeatWood) {
		this.privateHeatWood = privateHeatWood;
	}

	public String getPrivateHeatCoal() {
		return privateHeatCoal;
	}

	public void setPrivateHeatCoal(String privateHeatCoal) {
		this.privateHeatCoal = privateHeatCoal;
	}

	public String getPrivateHeatSolarPower() {
		return privateHeatSolarPower;
	}

	public void setPrivateHeatSolarPower(String privateHeatSolarPower) {
		this.privateHeatSolarPower = privateHeatSolarPower;
	}

	public String getPrivateHeatNoFuel() {
		return privateHeatNoFuel;
	}

	public void setPrivateHeatNoFuel(String privateHeatNoFuel) {
		this.privateHeatNoFuel = privateHeatNoFuel;
	}

	public String getPrivateHeatOtherFuel() {
		return privateHeatOtherFuel;
	}

	public void setPrivateHeatOtherFuel(String privateHeatOtherFuel) {
		this.privateHeatOtherFuel = privateHeatOtherFuel;
	}

	public String getPrivateDwellingsData() {
		StringBuilder builder = new StringBuilder();
        builder.append("['House', " + this.getPrivateOccupiedHouse() + "],");
        builder.append("['Flats/Units/Apartments', " + this.getPrivateOccupiedFlatsUnitsApartments() + "],");
        builder.append("['Others', " + this.getPrivateOccupiedOthers() + "],");
        builder.append("['Undefined', " + this.getPrivateOccupiedUndefined() + "]");
        
        return builder.toString();
	}
}
