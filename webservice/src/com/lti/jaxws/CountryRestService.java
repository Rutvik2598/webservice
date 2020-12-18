package com.lti.jaxws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lti.bean.Country;
import com.lti.services.CountryService;

@Path("/countries")
public class CountryRestService {
	
	CountryService countryService = new CountryService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getCountries() {
		List<Country> listOfCountries;
		listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id")int id) {
		return countryService.getCountry(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(Country country) {
		return countryService.addCountry(country);
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCountry(@PathParam("id") int id) {
		countryService.deleteCountry(id);
	}
	
	@PUT
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void updateCountry(Country country) {
		countryService.updateCountry(country);
	}
	
}
