package com.flight.onlineFlight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.onlineFlight.entity.flightmodel;
import com.flight.onlineFlight.services.flightservice;

@RestController
@RequestMapping("flights")
public class flightController {
	@Autowired
	private flightservice flightserv;
	@CrossOrigin
	@GetMapping("/availableFlights")
	public @ResponseBody List<flightmodel> getFlightById(@RequestParam String departure,@RequestParam String fromplace,@RequestParam String toplace) {
		System.out.println("departure"+departure);
		System.out.println("date"+departure);
		
		return flightserv.getAllFlightsByDepartd(departure, fromplace,toplace);
	}
	@CrossOrigin
	@GetMapping("/findall")
	public @ResponseBody List<flightmodel> getFlights() {
		return flightserv.getflights();
	}
	@CrossOrigin
	@GetMapping("/findflightbyid")
	public @ResponseBody flightmodel getFlightById(@RequestParam int id) {
		return flightserv.getflightBooked(id);
	}
	@CrossOrigin
	@PutMapping("/updateSeat")
	public @ResponseBody flightmodel updateSeat(@RequestBody flightmodel flight,@RequestParam int id) {
		
	return flightserv.updateFlightSeats(flight);
	}
}
