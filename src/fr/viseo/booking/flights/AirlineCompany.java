package fr.viseo.booking.flights;

import java.util.List;

import fr.viseo.booking.OperatorTour;

public class AirlineCompany extends OperatorTour{
	
	private List<Flight> flights;
	
	private GenericFlight genericFlight;

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public GenericFlight getGenericFlight() {
		return genericFlight;
	}

	public void setGenericFlight(GenericFlight genericFlight) {
		this.genericFlight = genericFlight;
	}
	
	
	
}
