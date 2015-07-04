
package co.nz.forwardthinking.suburb.persistence.mongo.repository;

import co.nz.forwardthinking.suburb.persistence.mongo.entity.VersionEntity;

public interface VersionRepositoryService {
	VersionEntity getCurrentVersion();
	
	VersionEntity saveCurrentVersion(VersionEntity entity);
	
	VersionEntity updateVersion(VersionEntity entity);
}

