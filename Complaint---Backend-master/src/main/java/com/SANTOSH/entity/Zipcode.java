package com.vikram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "zipcodes")
@Getter
@Setter
public class Zipcode {

	@Id
	private Long id;
	
	@Column
	private String zipcode;
}
