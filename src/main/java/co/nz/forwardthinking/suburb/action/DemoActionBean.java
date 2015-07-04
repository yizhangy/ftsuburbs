package co.nz.forwardthinking.suburb.action;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import co.nz.forwardthinking.suburb.business.dto.Suburb;
import co.nz.forwardthinking.suburb.business.service.SuburbService;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class DemoActionBean extends BaseActionBean {

	private Suburb suburb;

	@Inject
	private SuburbService suburbService;

	@DefaultHandler
	public Resolution view() throws IllegalAccessException {
		String areaCode = this.getContext().getRequest().getParameter("areaCode");
		if (StringUtils.isNotBlank(areaCode)) {
			suburb = suburbService.getSuburb(areaCode);
		}
		return new ForwardResolution(this.getViewPage());
	}

	public Suburb getSuburb() {
		return suburb;
	}

}
