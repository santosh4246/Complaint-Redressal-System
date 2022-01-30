package com.vikram.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String comments;
	
	@ManyToOne
	private Ticket ticket;
	
	@CreationTimestamp
	private LocalDate createdOn;
	
	@Column
	private boolean isCustomer;
	
//	updated by USER/ENGINEER's Name
	@Column
	private String updatedBy;
	


}
