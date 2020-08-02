package com.junaid.flightRegistration.filghtRegistration.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.junaid.flightRegistration.filghtRegistration.Entities.Flight;
import com.junaid.flightRegistration.filghtRegistration.Entities.ReservationRequest;
import com.junaid.flightRegistration.filghtRegistration.repos.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping("/showReservations")
	public String showAllReservations(@RequestParam("flightId") int flightId, ModelMap model)	{
		Flight flight = flightRepo.findById(flightId).get();
		model.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String showAllReservations(ReservationRequest request)	{
		return "completeReservation";
	}
}
