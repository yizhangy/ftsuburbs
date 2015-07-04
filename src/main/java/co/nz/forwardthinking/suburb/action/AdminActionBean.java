
package co.nz.forwardthinking.suburb.action;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import co.nz.forwardthinking.suburb.app.config.AppConfig;
import co.nz.forwardthinking.suburb.business.dto.AucklandDistrict;
import co.nz.forwardthinking.suburb.business.dto.SuburbCustomizedInfoDto;
import co.nz.forwardthinking.suburb.business.service.SuburbService;
import co.nz.forwardthinking.suburb.business.service.UpdateService;
import net.sourceforge.stripes.action.Before;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;

public class AdminActionBean extends BaseActionBean {
	
	private SuburbCustomizedInfoDto suburb;
	private String suburbAreaCode;
	private ActionBeanStatus status;
	
	private Map<Integer, String> suburbAreaMap;

	@Inject
	private SuburbService suburbService;
	
	@Inject
	private UpdateService updateService;
	
	@Before(on = {"view", "search", "save", "populateDefaultData"})
	public void init() {
		this.status = null;
		Object authenticationAttr = this.getContext().getRequest().getSession().getAttribute(LoginActionBean.LOGGEDIN_SESSION_ID);
		boolean isValid = authenticationAttr != null ? (boolean) authenticationAttr : false;
		if(!isValid) {
			throw new IllegalStateException("Please login");
		}
	}
	
	@DefaultHandler
	public Resolution view() throws IllegalAccessException {
		return new ForwardResolution(this.getViewPage());
	}
	
	public Resolution search() throws IllegalAccessException {
		this.suburb = this.suburbService.getSuburbCustomizedInfo(suburbAreaCode);
		if(this.suburb == null) {
			this.suburb = new SuburbCustomizedInfoDto();
			this.suburb.setAreaCode(this.suburbAreaCode);
		}
		return new ForwardResolution(this.getViewPage());
	}
	
	public Resolution populateDefaultData() throws IllegalAccessException {
		updateService.update();
		return new ForwardResolution(this.getViewPage());
	}

	public Resolution logout() {
		this.getContext().getRequest().getSession().setAttribute(LoginActionBean.LOGGEDIN_SESSION_ID, false);
		return new RedirectResolution(LoginActionBean.class);
	}
	
	public Resolution save() throws IllegalAccessException {
		if(this.suburb==null || this.suburb.getAreaCode() == null) {
			this.status = new ActionBeanStatus(Status.MISSING_AREA_CODE, "Please search a suburb before updating");
			return new ForwardResolution(this.getViewPage());
		}
		if(this.isSuburbSaved()) {
			suburb = suburbService.updateSuburb(this.suburb);
		}else {
			throw new IllegalStateException("do not support to create a new suburb");
		}
		return new ForwardResolution(this.getViewPage());
	}
	
	private boolean isSuburbSaved() {
		return this.suburbService.getSuburbCustomizedInfo(this.suburb.getAreaCode()) != null;
	}
	
	public Map<Integer, String> getSuburbAreaMap() {
		if (suburbAreaMap == null) {
			suburbAreaMap = this.suburbService.getSuburbs();
		}
		return suburbAreaMap;
	}
	public Map<String, String> getDistricts() {
		Map<String, String> districtMap = new HashMap<>();
		AucklandDistrict[] districts = AucklandDistrict.values();
		for (int i=0; i< districts.length; i++) {
			AucklandDistrict dis = districts[i];
			districtMap.put(dis.getCode(), dis.getValue());
		}
		return districtMap;
	}
	
	public boolean isUpdatable() {
		return updateService.isUpdatable();
	}
	
	public String getAppVersion() {
		return AppConfig.getInstance().getVersion().toString();
	}

	public SuburbCustomizedInfoDto getSuburb() {
		return suburb;
	}
	
	public ActionBeanStatus getStatus() {
		return this.status;
	}

	public void setSuburb(SuburbCustomizedInfoDto suburb) {
		this.suburb = suburb;
	}

	public String getSuburbAreaCode() {
		return suburbAreaCode;
	}
	public void setSuburbAreaCode(String suburbAreaCode) {
		this.suburbAreaCode = suburbAreaCode;
	}
}

