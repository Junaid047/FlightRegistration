package com.junaid.flightRegistration.filghtRegistration.Controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.junaid.flightRegistration.filghtRegistration.Entities.Flight;
import com.junaid.flightRegistration.filghtRegistration.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate") 
	@DateTimeFormat(pattern="dd-MM-yyyy") Date departureDate, ModelMap model) {
		List<Flight> flights = flightRepo.findFlights(from,to,departureDate);
		model.addAttribute("flights", flights);
		return "displayFlights";
	}
}
