package com.cg.movies.dao;

import com.cg.movies.dto.Customer;

public interface CustomerDao {

	Customer signIn(Integer customerId, String password);

}
