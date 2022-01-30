package com.vikram.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.entity.Manager;
import com.vikram.entity.User;

public interface ManagerRepository extends JpaRepository<Manager, Long>{

	List<Manager> findByUser(User user);
}
