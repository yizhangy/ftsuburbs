
package co.nz.forwardthinking.suburb.resource;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

public abstract class BaseResource {

	@Context
	private SecurityContext securityContext;

	@Context
	private HttpServletRequest request;
	
	protected String getJsonParams(String jsonData, String key) {
		JSONObject jsonObject = new JSONObject(jsonData);
		if (jsonObject.has(key)) {
			String rowValue = jsonObject.getString(key);
			return rowValue != null ? rowValue.trim() : rowValue;
		}
		return "";
	}
	
	protected JSONObject getJsonObject(String jsonData, String key) {
		JSONObject jsonObject = new JSONObject(jsonData);
		return jsonObject.getJSONObject(key);
	}
	
	protected String getRequiredJsonParams(JSONObject jsonObject, String key) {
		String rawValue = jsonObject.getString(key);
		if (StringUtils.isBlank(rawValue)) {
			throw new IllegalArgumentException(String.format("'%s' is required field", key));
		}
		return rawValue.trim();
	}

	protected String getRequiredJsonParams(String jsonData, String key) {
		String rawValue = this.getJsonParams(jsonData, key);
		if (StringUtils.isBlank(rawValue)) {
			throw new IllegalArgumentException(String.format("'%s' is required field", key));
		}
		return rawValue.trim();
	}

	protected SecurityContext getSecurityContext() {
		return securityContext;
	}

	protected HttpServletRequest getRequest() {
		return request;
	}
}

