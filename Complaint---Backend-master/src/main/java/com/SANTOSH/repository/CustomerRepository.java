package com.vikram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.entity.Customer;
import com.vikram.entity.User;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByUser(User user);

}
