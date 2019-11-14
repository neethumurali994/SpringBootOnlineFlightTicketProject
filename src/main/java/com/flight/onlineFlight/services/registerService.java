package com.flight.onlineFlight.services;

import com.flight.onlineFlight.entity.passengerModel;

public interface registerService {

	public passengerModel addpassenger(passengerModel model);
	public passengerModel login(String username,String password);
	public passengerModel getPassengerByEmail(String email);
}