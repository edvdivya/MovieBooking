package com.cg.movies.ui;

import java.util.Scanner;

import com.cg.movies.dto.Customer;
import com.cg.movies.service.CustomerService;
import com.cg.movies.service.CustomerServiceImpl;

public class CustomerUi {
	
	CustomerService customerService = new CustomerServiceImpl();	
	
	public Customer registerCustomer(Scanner scanner) {
		
		System.out.println("Enter Your UserId as Integer:");
		Integer customerId = scanner.nextInt();
		System.out.println("Enter your contact");
		String customerName = scanner.next();
		System.out.println("Enter the password");
		String password = scanner.next();
		System.out.println("Confirm password");
		String confirmPassword = scanner.next();
		
		
		if(password.intern() == confirmPassword.intern()) {
			Customer customer = new Customer();
			customer.setCustomerId(customerId);
			customer.setCustomerName(customerName);
			customer.setPassword(confirmPassword);
			return customer;
		}
		
		
		
		return null;
		
	}
	
	public Customer signIn(Integer customerId, String password) {
		return customerService.signIn(customerId, password);
	}
}
