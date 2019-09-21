package com.cg.movies.dto;

import java.math.BigInteger;

public class Booking {

	private BigInteger bookingId;
	private Show show;
	private Customer customer;
	private Integer seatsBooked;
	private Integer totalCost;
	private String payment;
	
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}


	public Booking(BigInteger bookingId, Show show, Customer customer, Integer seatsBooked, Integer totalCost,
			String payment) {
		super();
		this.bookingId = bookingId;
		this.show = show;
		this.customer = customer;
		this.seatsBooked = seatsBooked;
		this.totalCost = totalCost;
		this.payment = payment;
	}


	public BigInteger getBookingId() {
		return bookingId;
	}


	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}


	public Show getShow() {
		return show;
	}


	public void setShow(Show show) {
		this.show = show;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Integer getSeatsBooked() {
		return seatsBooked;
	}


	public void setSeatsBooked(Integer seatsBooked) {
		this.seatsBooked = seatsBooked;
	}


	public Integer getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}


	public String getPayment() {
		return payment;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}
	

}
