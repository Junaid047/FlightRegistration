package com.junaid.flightRegistration.filghtRegistration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junaid.flightRegistration.filghtRegistration.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
