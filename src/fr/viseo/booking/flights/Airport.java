package fr.viseo.booking.flights;

import java.util.List;

import fr.viseo.booking.geography.City;

public class Airport {

	private String name;
	
	private List<City> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	

	
}
