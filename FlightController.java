package com.flightbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.entity.Flight;
import com.flightbooking.service.FlightServices;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "http://localhost:3000")
public class FlightController {
	 @Autowired
	    private FlightServices flightService;

	    @GetMapping
	    public List<Flight> getAllFlights() {
	        return flightService.getAllFlights();
	    }

	    @GetMapping("/{id}")
	    public Flight getFlightById(@PathVariable Long id) {
	        return flightService.getFlightById(id);
	    }

	    @PostMapping
	    public Flight createFlight(@RequestBody Flight flight) {
	        return flightService.saveFlight(flight);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteFlight(@PathVariable Long id) {
	        flightService.deleteFlight(id);
	    }
	

}
