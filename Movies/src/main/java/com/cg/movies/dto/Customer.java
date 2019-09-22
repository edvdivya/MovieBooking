package com.cg.movies.dto;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigInteger;
import java.util.List;
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name="user_id")
	private BigInteger customerId;
	@Column(name="username")
	private String customerName;
	@Column(name="password")
	private String customerPassword;
	@Column(name="phone_number")
	private String contactNumber;
	
	
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
