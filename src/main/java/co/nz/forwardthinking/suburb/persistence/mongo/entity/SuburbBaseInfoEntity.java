package co.nz.forwardthinking.suburb.persistence.mongo.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity(value = "ft_suburbBaseInfo", noClassnameStored = false)
@Indexes({ @Index(value = "areaCode", unique = true) })
public class SuburbBaseInfoEntity extends BaseEntity {

	private static final long serialVersionUID = 6452361843498839078L;

	private String areaCode;
	private String areaName;
	private String wardCode;
	private String wardDescription;
	private String localBoardCode;
	private String localBoardDescription;
	private String territorialAuthorityCode;
	private String territorialAuthorityDescription;
	private String regionalCouncilCode;
	private String regionalCouncilDescription;
	private String boundaries;

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getWardCode() {
		return wardCode;
	}

	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}

	public String getWardDescription() {
		return wardDescription;
	}

	public void setWardDescription(String wardDescription) {
		this.wardDescription = wardDescription;
	}

	public String getLocalBoardCode() {
		return localBoardCode;
	}

	public void setLocalBoardCode(String localBoardCode) {
		this.localBoardCode = localBoardCode;
	}

	public String getLocalBoardDescription() {
		return localBoardDescription;
	}

	public void setLocalBoardDescription(String localBoardDescription) {
		this.localBoardDescription = localBoardDescription;
	}

	public String getTerritorialAuthorityCode() {
		return territorialAuthorityCode;
	}

	public void setTerritorialAuthorityCode(String territorialAuthorityCode) {
		this.territorialAuthorityCode = territorialAuthorityCode;
	}

	public String getTerritorialAuthorityDescription() {
		return territorialAuthorityDescription;
	}

	public void setTerritorialAuthorityDescription(
			String territorialAuthorityDescription) {
		this.territorialAuthorityDescription = territorialAuthorityDescription;
	}

	public String getRegionalCouncilCode() {
		return regionalCouncilCode;
	}

	public void setRegionalCouncilCode(String regionalCouncilCode) {
		this.regionalCouncilCode = regionalCouncilCode;
	}

	public String getRegionalCouncilDescription() {
		return regionalCouncilDescription;
	}

	public void setRegionalCouncilDescription(String regionalCouncilDescription) {
		this.regionalCouncilDescription = regionalCouncilDescription;
	}

	public String getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(String boundaries) {
		this.boundaries = boundaries;
	}

	@Override
	public String toString() {
		return "SuburbBaseInfoEntity [areaCode=" + areaCode + ", areaName="
				+ areaName + ", wardCode=" + wardCode + ", wardDescription="
				+ wardDescription + ", localBoardCode=" + localBoardCode
				+ ", localBoardDescription=" + localBoardDescription
				+ ", territorialAuthorityCode=" + territorialAuthorityCode
				+ ", territorialAuthorityDescription="
				+ territorialAuthorityDescription + ", regionalCouncilCode="
				+ regionalCouncilCode + ", regionalCouncilDescription="
				+ regionalCouncilDescription + "]";
	}

}
