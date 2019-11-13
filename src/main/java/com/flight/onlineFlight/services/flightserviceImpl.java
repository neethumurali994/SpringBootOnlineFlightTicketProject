package com.flight.onlineFlight.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.onlineFlight.dao.flightRepository;
import com.flight.onlineFlight.entity.flightmodel;
@Service
public class flightserviceImpl implements flightservice{
	@Autowired
	private flightRepository repo;
	@Override
	public List<flightmodel> getAllFlightsByDepartd(String date, String place, String to) {
	
		return repo.findByFromplaceAndDepartdAndToplace(place, date, to);
	}
	@Override
	public List<flightmodel> getflights() {
		// TODO Auto-generated method stub
		
		System.out.println("heloo"+repo.findAll());
		return repo.findAll();
	}
	@Override
	public flightmodel addflight(flightmodel flight) {
		return repo.save(flight);
		
	}
	@Override
	public flightmodel getflightBooked(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	@Override
	public flightmodel updateFlightSeats(flightmodel flight) {
		return repo.save(flight);
		
	}
	

}
