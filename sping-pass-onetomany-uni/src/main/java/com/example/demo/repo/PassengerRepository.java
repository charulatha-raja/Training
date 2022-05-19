package com.example.demo.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>
{

	
List<Passenger> findByPassengerName(String srchName);
List<Passenger> fndByTripHistoryTripDateTime(LocalDateTime time);
}
