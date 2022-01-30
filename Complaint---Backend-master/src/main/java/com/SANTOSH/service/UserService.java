package com.vikram.service;

import java.util.List;

import com.vikram.dto.UserDto;
import com.vikram.entity.Customer;
import com.vikram.entity.Engineer;
import com.vikram.entity.Manager;
import com.vikram.entity.User;

public interface UserService {

	String addCustomer(Customer customer);

	String addEngineer(Engineer engineer);

	String addManager(Manager manager);
	
	List<Customer> getAllCustomers();

	List<String> getZipcodes();

	List<Engineer> getAllEngineers();

	List<Manager> getAllManagers();

	Customer getCustomerById(long id);

	

	Engineer getEngineerById(long id);

	Manager getManagerById(long id);

	String deleteCustomer(Long id);

	User loginCheck(UserDto userDto);

	Customer findCustomerByUserId(Long id);

	Engineer findEngineerByUserId(Long id);

	Manager findManagerByUserId(Long id);

	List<Engineer> getEngineersByZipcode(String zipcode);
}
