
package co.nz.forwardthinking.suburb.app.config;

public class AppVersion {
	
	private int major;
	private int minor;
	private int servicePack;

	public AppVersion(int major, int minor, int servicepack) {
		this.major = major;
		this.minor = minor;
		this.servicePack = servicepack;
	}

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getServicePack() {
		return servicePack;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public void setServicePack(int servicePack) {
		this.servicePack = servicePack;
	}
	
	@Override
	public String toString() {
		return this.major + "." + this.minor + "." + this.servicePack;
	}
}

