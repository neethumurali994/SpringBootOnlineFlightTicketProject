package com.flight.onlineFlight.services;

import java.util.List;

import com.flight.onlineFlight.entity.flightmodel;


public interface flightservice {
	List<flightmodel> getAllFlightsByDepartd(String date,String place,String to);
	List<flightmodel> getflights();
	flightmodel addflight(flightmodel flight);
	flightmodel getflightBooked(int id);
	flightmodel updateFlightSeats(flightmodel flight);
}
