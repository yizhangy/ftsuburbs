package co.nz.forwardthinking.suburb.persistence.mongo.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity(value = "ft_suburbDwelling", noClassnameStored = false)
@Indexes({ @Index(value = "areaCode", unique = true) })
public class SuburbDwellingEntity extends BaseEntity {

	private static final long serialVersionUID = 5967261584702236369L;

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

	@Override
	public String toString() {
		return "SuburbDwellingEntity [areaCode=" + areaCode
				+ ", privateOccupiedHouse=" + privateOccupiedHouse
				+ ", privateOccupiedFlatsUnitsApartments="
				+ privateOccupiedFlatsUnitsApartments
				+ ", privateOccupiedOthers=" + privateOccupiedOthers
				+ ", privateOccupiedUndefined=" + privateOccupiedUndefined
				+ ", privateOccupiedTotal=" + privateOccupiedTotal
				+ ", totalDwellingPrivateOccupied="
				+ totalDwellingPrivateOccupied
				+ ", totalDwellingNonPrivateOccupied="
				+ totalDwellingNonPrivateOccupied + ", totalOccupied="
				+ totalOccupied + ", privateHeatElectricity="
				+ privateHeatElectricity + ", privateHeatMainsGas="
				+ privateHeatMainsGas + ", privateHeatBottledGas="
				+ privateHeatBottledGas + ", privateHeatWood="
				+ privateHeatWood + ", privateHeatCoal=" + privateHeatCoal
				+ ", privateHeatSolarPower=" + privateHeatSolarPower
				+ ", privateHeatNoFuel=" + privateHeatNoFuel
				+ ", privateHeatOtherFuel=" + privateHeatOtherFuel + "]";
	}

}
