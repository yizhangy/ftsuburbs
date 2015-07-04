
package co.nz.forwardthinking.suburb.persistence.mongo.entity;

import org.mongodb.morphia.annotations.Entity;

@Entity(value = "ft_version", noClassnameStored = false)
public class VersionEntity extends BaseEntity{

	private static final long serialVersionUID = -6415617637827620561L;
	
	private int major;
	private int minor;
	private int servicePack;
	private boolean current;
	
	public VersionEntity() {
	}

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

	public int getServicePack() {
		return servicePack;
	}

	public void setServicePack(int servicePack) {
		this.servicePack = servicePack;
	}

	@Override
	public String toString() {
		String currentVersion = this.current ? "CURRENT" : "";
		return major + "." + minor + "." + servicePack + currentVersion;
	}

}

