package com.junaid.flightRegistration.filghtRegistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junaid.flightRegistration.filghtRegistration.Entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
