package com.vikram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.entity.Feedback;
import com.vikram.entity.Ticket;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

	
	List<Feedback> findByTicket(Ticket ticket);
	
}
