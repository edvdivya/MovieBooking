package com.cg.movies.service;

import com.cg.movies.dao.*;
import com.cg.movies.dto.Customer;
import com.cg.movies.exception.UserException;

public class CustomerServiceImpl implements CustomerService {
		
	CustomerDao dao=new CustomerDaoImpl();
	@Override
	public Customer addCustomer(Customer customer) throws UserException {
		// TODO Auto-generated method stub
		if(Validate.validate_customer(customer)) {
			return dao.addCustomer(customer);
		}
		return null;
	}

	@Override
	public Boolean validateCustomer(String userName, String userPass) throws UserException {
		// TODO Auto-generated method stub
		return dao.validateCustomer(userName,userPass);
	}

}
