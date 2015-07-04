
package co.nz.forwardthinking.suburb.business.service;

import co.nz.forwardthinking.suburb.app.config.AppConfig;

public class LoginServiceImpl implements LoginService{
	
	@Override
	public boolean isValidUser(String name, String password) {
		return name.equals(AppConfig.getInstance().getUsername()) &&
		password.equals(AppConfig.getInstance().getPassword());
	}

}

