package com.cg.movies.dto;

import java.math.BigInteger;
import java.util.List;

public class Customer {

	private BigInteger customerId;
	private String customerName;
	private String customerPassword;
	private String contactNumber;
	
	private List<Booking> bookings;
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", contactNumber=" + contactNumber + "]";
	}

	public BigInteger getCustomerId() {
		return customerId;
	}

	public void setCustomerId(BigInteger customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}


	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
