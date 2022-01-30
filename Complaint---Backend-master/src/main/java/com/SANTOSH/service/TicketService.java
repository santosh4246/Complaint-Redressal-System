package com.vikram.service;

import java.util.List;

import com.vikram.entity.Feedback;
import com.vikram.entity.Notes;
import com.vikram.entity.Ticket;

public interface TicketService {

	String save(Ticket ticket);

	List<Ticket> getAllTickets();

	List<Ticket> getTicketsByCustomerId(Long id);

	Ticket getTicketById(Long id);

	List<Notes> getNotesByTicketId(Long id);

	String saveNotes(Notes notes);
	
	String saveFeedback(Feedback feedback);
	
	Feedback findFeedbackByTicket(Long id);
	
} 
