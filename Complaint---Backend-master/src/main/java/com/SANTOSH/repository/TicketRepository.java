package com.vikram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vikram.entity.Customer;
import com.vikram.entity.Engineer;
import com.vikram.entity.Ticket;

@CrossOrigin
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	

	List<Ticket> findByCustomer(Customer customer);
	List<Ticket> findByZipcode(String zipcode);
	List<Ticket> findByEngineer(Engineer engineer);
}
