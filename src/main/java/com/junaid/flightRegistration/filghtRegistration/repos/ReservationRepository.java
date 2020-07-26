package com.junaid.flightRegistration.filghtRegistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junaid.flightRegistration.filghtRegistration.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
