
package co.nz.forwardthinking.suburb.business.module;

import com.google.inject.AbstractModule;

import co.nz.forwardthinking.suburb.business.service.LoginService;
import co.nz.forwardthinking.suburb.business.service.LoginServiceImpl;
import co.nz.forwardthinking.suburb.business.service.SuburbService;
import co.nz.forwardthinking.suburb.business.service.SuburbServiceImpl;
import co.nz.forwardthinking.suburb.business.service.UpdateService;
import co.nz.forwardthinking.suburb.business.service.UpdateServiceImpl;

public class BusinessModule extends AbstractModule {

	@Override
	protected void configure() {
		//Service
		bind(SuburbService.class).to(SuburbServiceImpl.class);
		bind(LoginService.class).to(LoginServiceImpl.class);
		bind(UpdateService.class).to(UpdateServiceImpl.class);
	}
}
