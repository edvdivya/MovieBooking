package com.cg.movies.service;

import com.cg.movies.dto.Customer;
import com.cg.movies.exception.UserException;

public interface CustomerService {

	public Customer addCustomer(Customer customer) throws UserException;
	public Boolean validateCustomer(String userName, String userPass) throws UserException;

}
