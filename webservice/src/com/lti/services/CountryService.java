package com.lti.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lti.bean.Country;

public class CountryService {
	
	static HashMap<Integer, Country> hm  = getCountryId();
	
	public CountryService() {
		
		if(hm == null) {
			hm = new HashMap<>();
			
			Country c1 = new Country(1, "India");
			Country c2 = new Country(2, "USA");
			Country c3 = new Country(3, "UK");
			Country c4 = new Country(4, "Canada");
			Country c5 = new Country(5, "Australia");
			Country c6 = new Country(6, "Norway");
			Country c7 = new Country(7, "Switzerland");
			Country c8 = new Country(7, "Srilanka");
			Country c9 = new Country(7, "Japan");
			
			hm.put(1, c1);
			hm.put(2, c2);
			hm.put(3, c3);
			hm.put(4, c4);
			hm.put(5, c5);
			hm.put(6, c6);
			hm.put(7, c7);
			hm.put(8, c8);
			hm.put(9, c9);
		}
		
	}
	
	public List getAllCountries() {
		List countries = new ArrayList(hm.values());
		return countries;
	}
	
	public Country getCountry(int id ) {
		Country country = hm.get(id);
		return country;
	}
	
	public Country addCountry(Country country) {
		country.setId(hm.size()+1);
		hm.put(country.getId(), country);
		return country;
	}
	
	public void deleteCountry(int id) {
		hm.remove(id);
	}
	
	public void updateCountry(Country country) {
		hm.put(country.getId(), country);
	}
	
	public static HashMap<Integer, Country> getCountryId(){
		return hm;
	}
	
}
