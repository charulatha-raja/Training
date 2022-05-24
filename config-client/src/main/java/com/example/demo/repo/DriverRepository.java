package com.example.demo.repo;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer>
{

	 List<Driver> findByDriverName(String srchName);
	
	// List<Driver> findByFirstrName(String srchName);
	 
	 
	 List<Driver> findByMobileNumber(long mobileNumber);
	 
	 
	 @Query(value = "from Driver where rating=:srchValue")
	  List<Driver> searchByRating(@Param("srchValue") double rating);
	 
	 
	 @Query(value = "update Driver set rating=:updatedRating where driverId=:srchId")
	  @Modifying
	 @Transactional
	 
	 int modifyRating(@Param("srchId") int driverId, @Param("updatedRating") double updatedRating);
}
