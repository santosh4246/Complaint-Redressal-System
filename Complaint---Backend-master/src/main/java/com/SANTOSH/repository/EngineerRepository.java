package com.vikram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.entity.Engineer;
import com.vikram.entity.User;

public interface EngineerRepository extends JpaRepository<Engineer, Long>{

	List<Engineer> findByUser(User user);
	List<Engineer> findByZipcode(String zipcode);
}
