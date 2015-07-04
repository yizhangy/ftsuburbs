
package co.nz.forwardthinking.suburb.action;

import javax.inject.Inject;

import co.nz.forwardthinking.suburb.business.service.LoginService;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;

public class LoginActionBean extends BaseActionBean{
	
	private String username;
	private String password;
	
	public static String LOGGEDIN_SESSION_ID = "loginSession";
	
	@Inject
	private LoginService loginService;
	
	@DefaultHandler
	public Resolution view() throws IllegalAccessException {
		return new ForwardResolution(this.getViewPage());
	}
	
	public Resolution login() throws IllegalAccessException {
		boolean isValidUser = loginService.isValidUser(username, password);
		if(isValidUser) {
			this.getContext().getRequest().getSession().setAttribute(LOGGEDIN_SESSION_ID, true);
			return new RedirectResolution(AdminActionBean.class);
		}else {
			return new ForwardResolution(this.getViewPage());
		}
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

