package fr.viseo.booking;

import java.util.Date;
import java.util.List;

import fr.viseo.booking.flights.Flight;

public abstract class Booking {
	
	protected String number;
	
	protected Date date;
	
	protected Customer customer;
	
	protected Passenger passenger;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void cancel() {
		
	}
	
	public void confirm() {
		
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}


}
