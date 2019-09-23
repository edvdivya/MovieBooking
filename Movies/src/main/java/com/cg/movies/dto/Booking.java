package com.cg.movies.dto;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "booking_id")
	private BigInteger bookingId;
	@Column(name = "seats_booked")
	private Integer seatsBooked;
	@Column(name = "total_cost")
	private Integer totalCost;
	@Column(name = "payment")
	private String payment;

	@ManyToOne
	@JoinColumn(name = "show_id")
	private Show show;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Customer customer;

	
	
	
	
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(BigInteger bookingId, Integer seatsBooked, Integer totalCost, String payment, Show show,
			Customer customer) {
		super();
		this.bookingId = bookingId;
		this.seatsBooked = seatsBooked;
		this.totalCost = totalCost;
		this.payment = payment;
		this.show = show;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", seatsBooked=" + seatsBooked + ", totalCost=" + totalCost
				+ ", payment=" + payment + "]";
	}

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
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
	
	
}
