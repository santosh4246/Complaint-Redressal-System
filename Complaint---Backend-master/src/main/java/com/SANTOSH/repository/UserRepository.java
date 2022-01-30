package com.vikram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByEmail(String email);
}
