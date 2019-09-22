package com.cg.movies.dao;

import com.cg.movies.dto.Customer;
import com.cg.movies.exception.UserException;

public interface CustomerDao {

	public Customer addCustomer(Customer customer);
	public Boolean validateCustomer(String userName, String userPass) throws UserException;
}
