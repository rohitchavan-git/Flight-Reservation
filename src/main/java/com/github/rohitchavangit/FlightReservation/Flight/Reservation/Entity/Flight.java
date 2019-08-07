package com.github.rohitchavangit.FlightReservation.Flight.Reservation.Entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Flight  extends AbstractEntity  {

	
	private String flightNumber;
	private String operatingAitline;
	private String departureCity;
	private String arrivalCity;
	@Temporal(TemporalType.DATE)
	private Date dataOfDeparture;
	private Timestamp estimatedDepartureCity;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAitline() {
		return operatingAitline;
	}
	public void setOperatingAitline(String operatingAitline) {
		this.operatingAitline = operatingAitline;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDataOfDeparture() {
		return dataOfDeparture;
	}
	public void setDataOfDeparture(Date dataOfDeparture) {
		this.dataOfDeparture = dataOfDeparture;
	}
	public Timestamp getEstimatedDepartureCity() {
		return estimatedDepartureCity;
	}
	public void setEstimatedDepartureCity(Timestamp estimatedDepartureCity) {
		this.estimatedDepartureCity = estimatedDepartureCity;
	}
}
