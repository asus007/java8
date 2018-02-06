package fr.viseo.booking.flights;

import java.util.Date;

public class Stop {

	private Airport airport;

	private Date departureDate;

	private Date arrivalDate;

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
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


}
