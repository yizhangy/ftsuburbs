
package co.nz.forwardthinking.suburb.business.service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.inject.Inject;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import co.nz.forwardthinking.suburb.app.config.AppConfig;
import co.nz.forwardthinking.suburb.app.config.AppVersion;
import co.nz.forwardthinking.suburb.business.dto.SuburbBaseInfoDto;
import co.nz.forwardthinking.suburb.business.dto.SuburbCustomizedInfoDto;
import co.nz.forwardthinking.suburb.persistence.mongo.entity.VersionEntity;
import co.nz.forwardthinking.suburb.persistence.mongo.repository.VersionRepositoryService;

public class UpdateServiceImpl implements UpdateService {
	
	@Inject
	private SuburbService suburbService;
	
	@Inject
	private VersionRepositoryService versionRepositoryService;

	@Override
	public void update() {
		if(this.isUpdatable()) {
			AppVersion appVersion = AppConfig.getInstance().getVersion();

			if (appVersion.getMajor() == 1 && appVersion.getMinor() == 0 && appVersion.getServicePack() == 0) {
				try {
					importDataForVersion_1_0_0();
				} catch (IOException e) {
					throw new IllegalStateException("Update version 1.0.0 data fail: " + e);
				}
				VersionEntity version_1_0_0 = this.creatVersionEntity(appVersion);
				versionRepositoryService.saveCurrentVersion(version_1_0_0);
				return;
			}
			
			//Next updating
		
		}
	}
	
	private VersionEntity creatVersionEntity(AppVersion appVersion) {
		VersionEntity versionEntity = new VersionEntity();
		versionEntity.setMajor(appVersion.getMajor());
		versionEntity.setMinor(appVersion.getMinor());
		versionEntity.setServicePack(appVersion.getServicePack());
		return versionEntity;
	}
	
	@Override
	public boolean isUpdatable() {
		AppVersion appVersion = AppConfig.getInstance().getVersion();
		VersionEntity dbVersion =  versionRepositoryService.getCurrentVersion();

		if(dbVersion == null) {
			return true;
		}
		if(appVersion.getMajor() > dbVersion.getMajor()) {
			return true;
		}
		if(appVersion.getMinor() > dbVersion.getMajor()) {
			return true;
		}
		if(appVersion.getServicePack() > dbVersion.getServicePack()) {
			return true;
		}

		return false;
	}

	private void importDataForVersion_1_0_0() throws IOException {
		// Import Basic Auckland Suburb Data
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("auckland-region-details.csv").getFile());
		Reader in = new FileReader(file);

		Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
		for (CSVRecord record : records) {
			
			String areaCode = record.get("Area_Code");
			String areaDescription = record.get("Area_Unit_Description");
			String wardCode = record.get("Ward_Code");
			String wardDescription = record.get("Ward_Description");
			String localBoardCode = record.get("Local_Board_Code");
			String localBoardDescription = record.get("Local_Board_Description");
			String territorialCode = record.get("Territorial_Code");
			String territorialAuthorityDescription = record.get("Territorial_Authority_Description");
			String regionalCouncilCode = record.get("Regional_Council_Code");
			String regionalCouncilDescription = record.get("Regional_Council_Description");
			String boundaries = record.get("Boundaries");
			
			SuburbBaseInfoDto suburbBaseInfoDto = new SuburbBaseInfoDto();
			suburbBaseInfoDto.setAreaCode(areaCode);
			suburbBaseInfoDto.setAreaName(areaDescription);
			suburbBaseInfoDto.setWardCode(wardCode);
			suburbBaseInfoDto.setWardDescription(wardDescription);
			suburbBaseInfoDto.setLocalBoardCode(localBoardCode);
			suburbBaseInfoDto.setLocalBoardDescription(localBoardDescription);
			suburbBaseInfoDto.setRegionalCouncilCode(regionalCouncilCode);
			suburbBaseInfoDto.setRegionalCouncilDescription(regionalCouncilDescription);
			suburbBaseInfoDto.setTerritorialAuthorityCode(territorialCode);
			suburbBaseInfoDto.setTerritorialAuthorityDescription(territorialAuthorityDescription);
			suburbBaseInfoDto.setBoundaries(boundaries);
			
			suburbService.createSuburbBaseInfo(suburbBaseInfoDto);
		}
		
		in.close();
		
		// Customized Data
		// Area_Code,Area_Unit_Description
		classLoader = getClass().getClassLoader();
		file = new File(classLoader.getResource("auckland-area-code.csv").getFile());
		in = new FileReader(file);
		
		records = CSVFormat.EXCEL.withHeader().parse(in);
		for (CSVRecord record : records) {
			SuburbCustomizedInfoDto customized = new SuburbCustomizedInfoDto();
		
			String areaCode = record.get("Area_Code");
			String areaDescription = record.get("Area_Unit_Description");
			
			customized.setAreaCode(areaCode);
			customized.setName(areaDescription);
			
			suburbService.createSuburb(customized);
		}
		in.close();
	
	}
}

