package com.flightapp.flightservice.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.flightservice.entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, BigInteger> {
	
}
