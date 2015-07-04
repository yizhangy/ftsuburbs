
package co.nz.forwardthinking.suburb.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class IndexActionBean extends BaseActionBean {
	
	@DefaultHandler
	public Resolution view() throws IllegalAccessException {
		return new ForwardResolution(this.getViewPage());
	}
}