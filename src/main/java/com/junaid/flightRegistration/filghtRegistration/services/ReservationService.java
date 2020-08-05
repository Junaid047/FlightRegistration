package com.junaid.flightRegistration.filghtRegistration.services;

import com.junaid.flightRegistration.filghtRegistration.Entities.Reservation;
import com.junaid.flightRegistration.filghtRegistration.Entities.ReservationRequest;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest reservation);
}
