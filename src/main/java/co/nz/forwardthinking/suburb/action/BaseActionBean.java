
package co.nz.forwardthinking.suburb.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public class BaseActionBean implements ActionBean{
	
	private final static String VIEW_PATH = "/WEB-INF/jsp/";
	private final static String VIEW_SUFFIX = ".jsp";
	private final static String ACTION_BEAN = "ActionBean";

	private ActionBeanContext context;
	

	protected String getViewPage() throws IllegalAccessException {
		String className = this.getClass().getSimpleName();
		return BaseActionBean.VIEW_PATH + getViewName(className) + BaseActionBean.VIEW_SUFFIX;
	}
	protected String getViewPage(String className) throws IllegalAccessException {
		return BaseActionBean.VIEW_PATH + getViewName(className) + BaseActionBean.VIEW_SUFFIX;
	}
	
	private String getViewName(String className) throws IllegalAccessException{
		if (!className.endsWith("ActionBean")) {
			throw new IllegalAccessException("View Mapping Error");
		}
		return className.substring(0, (className.length() - BaseActionBean.ACTION_BEAN.length()));
	}

	@Override
	public ActionBeanContext getContext() {
		return this.context;
	}

	@Override
	public void setContext(ActionBeanContext context) {
		this.context = context;
	}
}

