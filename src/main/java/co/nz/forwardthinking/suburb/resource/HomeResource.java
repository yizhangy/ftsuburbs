
package co.nz.forwardthinking.suburb.resource;

import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.nz.forwardthinking.suburb.business.dto.SuburbCustomizedInfoDto;
import co.nz.forwardthinking.suburb.business.service.SuburbService;

@Path("/home")
public class HomeResource extends BaseResource {
	
	private static final String PARAM_ID = "id";
	
	private SuburbService suburbService;
	
	@Inject
	public HomeResource(SuburbService suburbService) {
		this.suburbService = suburbService;
	}
	
	@GET
	@Path("/suburbs")
	@Produces({ MediaType.APPLICATION_JSON })
	public Map<Integer, String> getSuburbs(){
		return suburbService.getSuburbs();
	}
	
	@GET
	@Path("/suburb/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public SuburbCustomizedInfoDto getSuburb(@PathParam(PARAM_ID)String areaCode){
		return suburbService.getSuburbCustomizedInfo(areaCode);
	}

}

