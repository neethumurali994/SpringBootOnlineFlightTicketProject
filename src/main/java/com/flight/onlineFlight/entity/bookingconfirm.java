package com.flight.onlineFlight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class bookingconfirm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingid;
	public int getBookingid() {
		return bookingid;
	}
	public bookingconfirm(int bookingid, String name, String fromplace, String toplace, int seats, String dated,
			String flightname, int amount) {
		super();
		this.bookingid = bookingid;
		this.name = name;
		this.fromplace = fromplace;
		this.toplace = toplace;
		this.seats = seats;
		this.dated = dated;
		this.flightname = flightname;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "bookingconfirm [bookingid=" + bookingid + ", name=" + name + ", fromplace=" + fromplace + ", toplace="
				+ toplace + ", seats=" + seats + ", dated=" + dated + ", flightname=" + flightname + ", amount="
				+ amount + "]";
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFromplace() {
		return fromplace;
	}
	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}
	public String getToplace() {
		return toplace;
	}
	public void setToplace(String toplace) {
		this.toplace = toplace;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getDated() {
		return dated;
	}
	public void setDated(String dated) {
		this.dated = dated;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	private String name;
	private String fromplace;
	private String toplace;
	private int seats;
	private String dated;
	private String flightname;
	private int amount;
	
	
	
}
