
package co.nz.forwardthinking.suburb.persistence.mongo.config;

import org.mongodb.morphia.Datastore;

public class MongoDBConnectionServiceImpl implements MongoDBConnectionService {

	@Override
	public Datastore getDatastore() {
		return MongoDBFactory.instance().getDatastore();
	}

}

