
package co.nz.forwardthinking.suburb.persistence.mongo.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity(value = "ft_suburbCustomizedInfo", noClassnameStored = false)
@Indexes({@Index(value="areaCode", unique = true)})
public class SuburbCustomizedInfoEntity extends BaseEntity{
	private static final long serialVersionUID = 5289844321034290478L;

	private String areaCode;
	private String name;
	private String district;
	private String summary;
	private String geography;
	private String history;
	private String sports;
	private String education;
	private String people;
	private String images;
	private String backgroundImage;
	private String news;
	
	private String health;
	private String safety;
	private String transportation;
	private String shopping;
	private String entertainment;
	private String leisure;
	private String restaurants;
	private String events;
	private String library;
	private String averageHouseRent;
	private String averageHousePrice;
	
	public SuburbCustomizedInfoEntity() {}
	
	public String getAreaCode() {
		return areaCode;
	}
	public String getName() {
		return name;
	}
	public String getSummary() {
		return summary;
	}
	public String getGeography() {
		return geography;
	}
	public String getHistory() {
		return history;
	}
	public String getSports() {
		return sports;
	}
	public String getEducation() {
		return education;
	}
	public String getPeople() {
		return people;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setGeography(String geography) {
		this.geography = geography;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public String getHealth() {
		return health;
	}

	public String getSafety() {
		return safety;
	}

	public String getTransportation() {
		return transportation;
	}

	public String getShopping() {
		return shopping;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public String getLeisure() {
		return leisure;
	}

	public String getRestaurants() {
		return restaurants;
	}

	public String getEvents() {
		return events;
	}

	public String getLibrary() {
		return library;
	}

	public String getAverageHouseRent() {
		return averageHouseRent;
	}

	public String getAverageHousePrice() {
		return averageHousePrice;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public void setSafety(String safety) {
		this.safety = safety;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	public void setShopping(String shopping) {
		this.shopping = shopping;
	}

	public void setEntertainment(String entertainment) {
		this.entertainment = entertainment;
	}

	public void setLeisure(String leisure) {
		this.leisure = leisure;
	}

	public void setRestaurants(String restaurants) {
		this.restaurants = restaurants;
	}

	public void setEvents(String events) {
		this.events = events;
	}

	public void setLibrary(String library) {
		this.library = library;
	}

	public void setAverageHouseRent(String averageHouseRent) {
		this.averageHouseRent = averageHouseRent;
	}

	public void setAverageHousePrice(String averageHousePrice) {
		this.averageHousePrice = averageHousePrice;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return this.areaCode + this.name;
	}

}

