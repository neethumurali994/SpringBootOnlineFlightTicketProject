package com.flight.onlineFlight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.onlineFlight.entity.flightmodel;

import com.flight.onlineFlight.services.flightservice;

@RestController
@RequestMapping("admin")
public class adminController {
	@Autowired
	private flightservice flightserv;
	@CrossOrigin
	@PostMapping("/addflight")
	public String addflight(@RequestBody flightmodel flight) {
		System.out.println("java"+flight.getFlightname());
		flightmodel fl=flightserv.addflight(flight);
		
		return "Flight "+fl.getFlightname()+" details successfully Registered";
	}
}
