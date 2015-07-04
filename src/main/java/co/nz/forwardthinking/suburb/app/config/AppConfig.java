package co.nz.forwardthinking.suburb.app.config;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import co.nz.forwardthinking.suburb.persistence.mongo.config.MongoDBConfig;


public class AppConfig {

	private static final String CONFIG_FILE = "suburb.properties";

	private static Configuration config;

	private static AppConfig instance = new AppConfig();

	static {
		try {
			config = new PropertiesConfiguration(CONFIG_FILE);
		} catch (ConfigurationException e) {
			throw new IllegalStateException(e);
		}
	}

	public static AppConfig getInstance() {
		return instance;
	}

	public MongoDBConfig getMongoDBConfig() {
			String hostname = config.getString("db.mongo.hostname");
			int port = Integer.parseInt(config.getString("db.mongo.port"));
			String dbName = config.getString("db.mongo.dbname");
			String username = config.getString("db.mongo.username");
			String password = config.getString("db.mongo.password");
			return new MongoDBConfig(hostname, port, username, password, dbName);

	}

	public String getUsername() {
		return config.getString("admin.username");
	}

	public String getPassword() {
		return config.getString("admin.password");
	}
	
	public AppVersion getVersion() {
		int major = Integer.valueOf(config.getString("app.version.major"));
		int minor = Integer.valueOf(config.getString("app.version.minor"));
		int servicePack = Integer.valueOf(config.getString("app.version.servicepack"));
		return new AppVersion(major, minor, servicePack);
	}
}
