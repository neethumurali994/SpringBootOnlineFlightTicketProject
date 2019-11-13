package com.flight.onlineFlight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class flightmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public flightmodel() {
		super();
		}
	
	
	public flightmodel(int id, String flightname, String fromplace, String toplace, String departd, String returnd,
			int rate, String time, int seats) {
		super();
		this.id = id;
		this.flightname = flightname;
		this.fromplace = fromplace;
		this.toplace = toplace;
		this.departd = departd;
		this.returnd = returnd;
		this.rate = rate;
		this.time = time;
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "flightmodel [id=" + id + ", flightname=" + flightname + ", fromplace=" + fromplace + ", toplace="
				+ toplace + ", departd=" + departd + ", returnd=" + returnd + ", rate=" + rate + ", time=" + time + "]";
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
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
	public String getDepartd() {
		return departd;
	}
	public void setDepartd(String departd) {
		this.departd = departd;
	}
	public String getReturnd() {
		return returnd;
	}
	public void setReturnd(String returnd) {
		this.returnd = returnd;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	private String flightname;
	private String fromplace;
	private String toplace;
	private String departd;
	private String returnd;
	private int rate;
	private String time;
	private int seats;
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}
