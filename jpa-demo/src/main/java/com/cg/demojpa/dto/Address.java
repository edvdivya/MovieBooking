package com.cg.demojpa.dto;

import javax.persistence.*;

@Embeddable
public class Address {
	
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="pincode")
	private Integer pincode;
	
	
	public Address() {
		super();
	}


	public Address(String city, String state, Integer pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
}
