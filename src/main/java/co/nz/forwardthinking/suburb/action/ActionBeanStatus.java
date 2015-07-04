
package co.nz.forwardthinking.suburb.action;

public class ActionBeanStatus {
	
	private Status code;
	private String message;
	
	public ActionBeanStatus(Status code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public Status getCode() {
		return this.code;
	}
	
	public String getMessage() {
		return this.message;
	}
}

