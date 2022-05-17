package com.example.demo.ifaces.bidirection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bidirectional.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
