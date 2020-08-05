package com.junaid.flightRegistration.filghtRegistration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junaid.flightRegistration.filghtRegistration.Entities.Flight;
import com.junaid.flightRegistration.filghtRegistration.Entities.Passenger;
import com.junaid.flightRegistration.filghtRegistration.Entities.Reservation;
import com.junaid.flightRegistration.filghtRegistration.Entities.ReservationRequest;
import com.junaid.flightRegistration.filghtRegistration.repos.FlightRepository;
import com.junaid.flightRegistration.filghtRegistration.repos.PassengerRepository;
import com.junaid.flightRegistration.filghtRegistration.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Autowired
	ReservationRepository reservationRepo;

	@Override
	public Reservation bookFlight(ReservationRequest resRequest) {

		int flightId = resRequest.getFlightId();
		Flight flight = flightRepo.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(resRequest.getPassengerFirstName());
		passenger.setLastName(resRequest.getPassengerLastName());
		passenger.setEmail(resRequest.getPassengerEmail());
		passenger.setPhone(resRequest.getPassengerPhone());
		Passenger savedPassenger = passengerRepo.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setPassenger(savedPassenger);
		reservation.setFlight(flight);
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepo.save(reservation);
		return savedReservation;
	}
}
