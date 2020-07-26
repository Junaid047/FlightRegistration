package com.junaid.flightRegistration.filghtRegistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junaid.flightRegistration.filghtRegistration.Entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
