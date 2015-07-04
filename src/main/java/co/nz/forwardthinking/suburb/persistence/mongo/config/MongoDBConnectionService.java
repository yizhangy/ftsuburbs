
package co.nz.forwardthinking.suburb.persistence.mongo.config;

import org.mongodb.morphia.Datastore;

public interface MongoDBConnectionService {
	Datastore getDatastore();
}

