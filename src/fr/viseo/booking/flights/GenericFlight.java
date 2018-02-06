package fr.viseo.booking.flights;

import java.util.Date;
import java.util.List;

public class GenericFlight{
	
	private String number;
	
	private Date departureDate;
	
	private Date arrivalDate;

	private Date startValidityPeriod;
	
	private Date endValidityPeriod;
	
	private Airport departureAirport;
	
	private Airport arrivalAirport;
	
	private List<Stop> stopList;
	
	private List<Flight> flightList;
	
	public int getDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getStartValidityPeriod() {
		return startValidityPeriod;
	}

	public void setStartValidityPeriod(Date startValidityPeriod) {
		this.startValidityPeriod = startValidityPeriod;
	}

	public Date getEndValidityPeriod() {
		return endValidityPeriod;
	}

	public void setEndValidityPeriod(Date endValidityPeriod) {
		this.endValidityPeriod = endValidityPeriod;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public List<Stop> getStopList() {
		return stopList;
	}

	public void setStopList(List<Stop> stopList) {
		this.stopList = stopList;
	}

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}
	
	
}
