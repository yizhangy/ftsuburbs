package co.nz.forwardthinking.suburb.persistence.mongo.config;

import org.apache.commons.lang3.StringUtils;

public class MongoDBConfig {
	private String hostname;
	private int port;
	private String username;
	private String password;
	private String dbName;

	public MongoDBConfig(String hostname, int port, String username, String password, String dbName) {
		this.hostname = hostname;
		this.port = port;
		this.username = username;
		this.password = password;
		this.dbName = dbName;
	}

	public String getHostname() {
		return hostname;
	}

	public int getPort() {
		return port;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getDbName() {
		return dbName;
	}
	
	public boolean isRequireAuth() {
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			return false;
		}
		return true;
	}

}
