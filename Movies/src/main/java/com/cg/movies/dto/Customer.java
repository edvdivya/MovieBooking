package com.cg.movies.dto;

public class Customer {

	private Integer userId;
	private String userName;
	private String userpass;
	private String contactNumber;
	
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", userName=" + userName + ", userpass=" + userpass + ", contactNumber="
				+ contactNumber + "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
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
