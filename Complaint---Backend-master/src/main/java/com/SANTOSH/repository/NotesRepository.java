package com.vikram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vikram.entity.Notes;
import com.vikram.entity.Ticket;

@CrossOrigin
public interface NotesRepository extends JpaRepository<Notes, Long> {
	
	List<Notes> findByTicket(Ticket ticket);

}
