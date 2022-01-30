package com.vikram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vikram.entity.Zipcode;

@CrossOrigin

public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {

}
