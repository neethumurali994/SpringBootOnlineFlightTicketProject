package com.flight.onlineFlight.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.onlineFlight.dao.bookingRepository;
import com.flight.onlineFlight.entity.bookingconfirm;

@Service
public class bookingFlightImpl implements bookingFlightService{
	@Autowired
    private bookingRepository bookrepo;

	@Override
	public bookingconfirm addbookingdet(bookingconfirm book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);
	}

	
	

}
