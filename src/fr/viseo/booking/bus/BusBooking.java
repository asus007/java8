package fr.viseo.booking.bus;

import fr.viseo.booking.Booking;

public class BusBooking extends Booking {

	private BusTravel busTravel;

	public BusTravel getBusTravel() {
		return busTravel;
	}

	public void setBusTravel(BusTravel busTravel) {
		this.busTravel = busTravel;
	}

	
}
