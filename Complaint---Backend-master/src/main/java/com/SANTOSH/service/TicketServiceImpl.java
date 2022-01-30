package com.vikram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.entity.Customer;
import com.vikram.entity.Feedback;
import com.vikram.entity.Notes;
import com.vikram.entity.Ticket;
import com.vikram.repository.FeedbackRepository;
import com.vikram.repository.NotesRepository;
import com.vikram.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{
	
	
	private TicketRepository ticketRepository;
	private NotesRepository notesRepository;
	private FeedbackRepository feedbackRepository;
	@Autowired
	public TicketServiceImpl(TicketRepository ticketRepository,NotesRepository notesRepository, FeedbackRepository feedbackRepository) {
		this.feedbackRepository=feedbackRepository;
		this.ticketRepository = ticketRepository;
		this.notesRepository=notesRepository;
	}
	
	@Override
	public String save(Ticket ticket) {
		if(ticket.getStatus()==null) {
			ticket.setStatus("RAISED");
		}

		return ticketRepository.save(ticket).getId().toString();
		
		
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRepository.findAll();
	}

	@Override
	public List<Ticket> getTicketsByCustomerId(Long id) {
		Customer customer = new Customer();
		customer.setId(id);
		return ticketRepository.findByCustomer(customer);
	}

	@Override
	public Ticket getTicketById(Long id) {
		
		return ticketRepository.findById(id).get();
	}

	@Override
	public List<Notes> getNotesByTicketId(Long id) {
		
		Ticket ticket = ticketRepository.findById(id).get();
		
		return notesRepository.findByTicket(ticket);
		 
	}

	@Override
	public String saveNotes(Notes notes) {
		
		return notesRepository.save(notes).getTicket().getId().toString();
	}

	@Override
	public String saveFeedback(Feedback feedback) {
		
		return feedbackRepository.save(feedback).getTicket().getId().toString();
	}

	@Override
	public Feedback findFeedbackByTicket(Long id) {
		Ticket ticket = ticketRepository.findById(id).get();
		return feedbackRepository.findByTicket(ticket).get(0);
	}
	
	
	
	

}
