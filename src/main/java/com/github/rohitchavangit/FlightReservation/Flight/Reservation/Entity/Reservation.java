package com.github.rohitchavangit.FlightReservation.Flight.Reservation.Entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {
	
	private boolean checkedIn;
	private Long numberOfBags;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Passenger.class)
	private Passenger passenger;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Flight.class)
	private Flight flight;
	private Timestamp created;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Long getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(Long numberOfBags) {
		this.numberOfBags = numberOfBags;
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
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}

}
