package com.cg.movies.service;

import com.cg.movies.dao.CustomerDao;
import com.cg.movies.dao.CustomerDaoImpl;
import com.cg.movies.dto.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao = new CustomerDaoImpl(); 
	
	public Customer signIn(Integer customerId, String password) {
		
		return customerDao.signIn(customerId, password);
	}

}
