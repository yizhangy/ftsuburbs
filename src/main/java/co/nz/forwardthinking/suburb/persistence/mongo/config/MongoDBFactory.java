
package co.nz.forwardthinking.suburb.persistence.mongo.config;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import co.nz.forwardthinking.suburb.app.config.AppConfig;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.BaseEntity;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

public class MongoDBFactory {
	
	private static final MongoDBFactory INSTANCE = new MongoDBFactory();
	
	private Datastore datastore;

	public static MongoDBFactory instance() {
		return INSTANCE;
	}

	public Datastore getDatastore() {
		try {
			
			if (datastore != null) {
				return datastore;
			}
			
			MongoDBConfig mongoDBConfig = AppConfig.getInstance().getMongoDBConfig();

			MongoClient mongoClient = new MongoClient(mongoDBConfig.getHostname(), mongoDBConfig.getPort());
			mongoClient.setWriteConcern(WriteConcern.SAFE);

			DB db = mongoClient.getDB(mongoDBConfig.getDbName());

			if (mongoDBConfig.isRequireAuth()) {
				boolean success = db.authenticate(mongoDBConfig.getUsername(), mongoDBConfig.getPassword().toCharArray());
				if (!success) {
					throw new RuntimeException("DB access authentication failed.");
				}
			}

			datastore = new Morphia().mapPackage(BaseEntity.class.getPackage().getName()).createDatastore(mongoClient, mongoDBConfig.getDbName());

			datastore.ensureIndexes();
			return datastore;

		} catch (Exception e) {
			throw new RuntimeException("Error initializing MongoDB", e);
		}
	}
}
