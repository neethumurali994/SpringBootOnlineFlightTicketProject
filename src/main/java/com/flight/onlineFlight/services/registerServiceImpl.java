package com.flight.onlineFlight.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.onlineFlight.dao.registerRepository;
import com.flight.onlineFlight.entity.passengerModel;
@Service
public class registerServiceImpl implements registerService {
	@Autowired
	private registerRepository regrepo;
	@Override
	public passengerModel addpassenger(passengerModel passnger) {
	passengerModel passt =	regrepo.save(passnger);
		return passt;
	}
	public passengerModel login(String username,String password)
	{
		passengerModel pass =	regrepo.findByUsernameAndPass(username, password);
		return pass;
	}
 
}
