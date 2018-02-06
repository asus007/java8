package fr.viseo.booking.flights;

import fr.viseo.booking.Booking;

public class FlightBooking extends Booking{

	private Flight flight;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}
