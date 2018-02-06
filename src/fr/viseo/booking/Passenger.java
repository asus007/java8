package fr.viseo.booking;

import java.util.List;

public class Passenger {

	private String name;

	private String firstName;

	private Booking booking;

	private List<Luggage> luggageList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public List<Luggage> getLuggageList() {
		return luggageList;
	}

	public void setLuggageList(List<Luggage> luggageList) {
		this.luggageList = luggageList;
	}

}
