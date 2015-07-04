package co.nz.forwardthinking.suburb.persistence.mongo.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity(value = "ft_suburbFamily", noClassnameStored = false)
@Indexes({ @Index(value = "areaCode", unique = true) })
public class SuburbFamilyEntity extends BaseEntity {

	private static final long serialVersionUID = 2006765090186809084L;

	private String areaCode;
	private String totalOccupiedPrivateDwellings;
	private String totalFamilyWithoutChildren;
	private String totalFamilyWithChildren;
	private String totalSingleFamilyWithChildren;
	private String totalFamilyIncome20000Less;
	private String totalFamilyIncome2000130000;
	private String totalFamilyIncome3000150000;
	private String totalFamilyIncome5000170000;
	private String totalFamilyIncome7000100000;
	private String totalFamilyIncome100000More;
	private String totalFamilyMedianIncome;

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getTotalOccupiedPrivateDwellings() {
		return totalOccupiedPrivateDwellings;
	}

	public void setTotalOccupiedPrivateDwellings(
			String totalOccupiedPrivateDwellings) {
		this.totalOccupiedPrivateDwellings = totalOccupiedPrivateDwellings;
	}

	public String getTotalFamilyWithoutChildren() {
		return totalFamilyWithoutChildren;
	}

	public void setTotalFamilyWithoutChildren(String totalFamilyWithoutChildren) {
		this.totalFamilyWithoutChildren = totalFamilyWithoutChildren;
	}

	public String getTotalFamilyWithChildren() {
		return totalFamilyWithChildren;
	}

	public void setTotalFamilyWithChildren(String totalFamilyWithChildren) {
		this.totalFamilyWithChildren = totalFamilyWithChildren;
	}

	public String getTotalSingleFamilyWithChildren() {
		return totalSingleFamilyWithChildren;
	}

	public void setTotalSingleFamilyWithChildren(
			String totalSingleFamilyWithChildren) {
		this.totalSingleFamilyWithChildren = totalSingleFamilyWithChildren;
	}

	public String getTotalFamilyIncome20000Less() {
		return totalFamilyIncome20000Less;
	}

	public void setTotalFamilyIncome20000Less(String totalFamilyIncome20000Less) {
		this.totalFamilyIncome20000Less = totalFamilyIncome20000Less;
	}

	public String getTotalFamilyIncome2000130000() {
		return totalFamilyIncome2000130000;
	}

	public void setTotalFamilyIncome2000130000(
			String totalFamilyIncome2000130000) {
		this.totalFamilyIncome2000130000 = totalFamilyIncome2000130000;
	}

	public String getTotalFamilyIncome3000150000() {
		return totalFamilyIncome3000150000;
	}

	public void setTotalFamilyIncome3000150000(
			String totalFamilyIncome3000150000) {
		this.totalFamilyIncome3000150000 = totalFamilyIncome3000150000;
	}

	public String getTotalFamilyIncome5000170000() {
		return totalFamilyIncome5000170000;
	}

	public void setTotalFamilyIncome5000170000(
			String totalFamilyIncome5000170000) {
		this.totalFamilyIncome5000170000 = totalFamilyIncome5000170000;
	}

	public String getTotalFamilyIncome7000100000() {
		return totalFamilyIncome7000100000;
	}

	public void setTotalFamilyIncome7000100000(
			String totalFamilyIncome7000100000) {
		this.totalFamilyIncome7000100000 = totalFamilyIncome7000100000;
	}

	public String getTotalFamilyIncome100000More() {
		return totalFamilyIncome100000More;
	}

	public void setTotalFamilyIncome100000More(
			String totalFamilyIncome100000More) {
		this.totalFamilyIncome100000More = totalFamilyIncome100000More;
	}

	public String getTotalFamilyMedianIncome() {
		return totalFamilyMedianIncome;
	}

	@Override
	public String toString() {
		return "SuburbFamilyEntity [areaCode=" + areaCode
				+ ", totalOccupiedPrivateDwellings="
				+ totalOccupiedPrivateDwellings
				+ ", totalFamilyWithoutChildren=" + totalFamilyWithoutChildren
				+ ", totalFamilyWithChildren=" + totalFamilyWithChildren
				+ ", totalSingleFamilyWithChildren="
				+ totalSingleFamilyWithChildren
				+ ", totalFamilyIncome20000Less=" + totalFamilyIncome20000Less
				+ ", totalFamilyIncome2000130000="
				+ totalFamilyIncome2000130000
				+ ", totalFamilyIncome3000150000="
				+ totalFamilyIncome3000150000
				+ ", totalFamilyIncome5000170000="
				+ totalFamilyIncome5000170000
				+ ", totalFamilyIncome7000100000="
				+ totalFamilyIncome7000100000
				+ ", totalFamilyIncome100000More="
				+ totalFamilyIncome100000More + ", totalFamilyMedianIncome="
				+ totalFamilyMedianIncome + "]";
	}

	public void setTotalFamilyMedianIncome(String totalFamilyMedianIncome) {
		this.totalFamilyMedianIncome = totalFamilyMedianIncome;
	}


}
