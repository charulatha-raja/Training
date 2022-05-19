package com.example.demo.entity;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trip_history_2001")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripHistory
{

	@Id
	@Column(name = "trip_id")
	
	private int tripId;
	
	@Column(name = "trip_date_time")
	
	private LocalDateTime tripDateTime;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "amount")
	private double amount;
	
}
