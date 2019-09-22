package com.cg.movies.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="booking")
public class Booking {
	@Id
	@Column(name="booking_id")
	private BigInteger bookingId;
	@Column(name="seats_booked")
	private Integer seatsBooked;
	@Column(name="total_cost")
	private Integer totalCost;
	@Column(name="payment")
	private String payment;
	@ManyToOne
	@JoinColumn(name = "show_id")
	private Show show;
	@ManyToOne
	@JoinColumn(name="user_id")
	private Customer customer;
	
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
