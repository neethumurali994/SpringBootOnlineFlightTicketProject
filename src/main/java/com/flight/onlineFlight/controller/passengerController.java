package com.flight.onlineFlight.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.onlineFlight.entity.bookingconfirm;
import com.flight.onlineFlight.entity.passengerModel;
import com.flight.onlineFlight.services.bookingFlightService;
import com.flight.onlineFlight.services.registerService;


@RestController
@RequestMapping("passenger")
public class passengerController {
	@Autowired
	private registerService reg;
	@Autowired
	private bookingFlightService bookserv;

	@CrossOrigin
	@PostMapping(path = "/add")
	public String addregister(@RequestBody passengerModel passenger) {
		System.out.println("java"+passenger.getFullname());
		passengerModel person=reg.addpassenger(passenger);
		//securityService.autoLogin(passenger.getUsername(),passenger.getPassword());
		return "Hi    "+person.getFullname()+"You are Successfully Registered";
	}
	
	@CrossOrigin
	@GetMapping("/login")
	public @ResponseBody passengerModel login(@RequestParam String username,@RequestParam String pass)
	{
		
		return reg.login(username, pass);
		
	}
	
	@CrossOrigin
	@PostMapping(path = "/addbooking")
	public String addbooking(@RequestBody bookingconfirm book) {
		
		bookingconfirm b=	bookserv.addbookingdet(book);
		return"Booking is Confirmed";
	}
	@CrossOrigin
	@GetMapping("/getbyemail")
	public @ResponseBody passengerModel getPassengerByEmail(@RequestParam String email)
	{
		passengerModel passenger=reg.getPassengerByEmail(email);
		return passenger;
	}
	
	}
	

