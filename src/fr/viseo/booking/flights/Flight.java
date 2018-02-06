package fr.viseo.booking.flights;

import java.util.Date;
import java.util.List;

import fr.viseo.booking.Booking;

public class Flight implements IFlight {
	
	private Date departureDate;
	private Date arrivalDate;
	
	private GenericFlight genericFlight;
	
	private List<FlightBooking> bookingList;

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

	public GenericFlight getGenericFlight() {
		return genericFlight;
	}

	public void setGenericFlight(GenericFlight genericFlight) {
		this.genericFlight = genericFlight;
	}

	public List<FlightBooking> getBookingList() {
		return bookingList;
	}

	public void setBookingList(List<FlightBooking> flightBooking) {
		this.bookingList = flightBooking;
	}

	@Override
	public void openBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBooking() {
		// TODO Auto-generated method stub
		
	}

	

}
