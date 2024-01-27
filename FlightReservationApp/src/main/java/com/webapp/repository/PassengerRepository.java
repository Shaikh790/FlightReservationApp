package com.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long>{
	

}
