package com.webapp.entity;

public class Reservation extends AbstractEntity{
	private boolean checkedIn;
	private long numberOfBages;
	
	private Passenger passenger;
	
	private Flight flight;
	
	public boolean isCheckedIn() {
		return checkedIn;
	}

	public long getNumberOfBages() {
		return numberOfBages;
	}

	public void setNumberOfBages(long numberOfBages) {
		this.numberOfBages = numberOfBages;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	

}
