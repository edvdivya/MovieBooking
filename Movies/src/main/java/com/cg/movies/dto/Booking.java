package com.cg.movies.dto;

import java.util.ArrayList;

public class Booking {
	private static Integer bookingId = 0;
	private ArrayList<Seat> seatsBooked;

	public Booking() {
		Booking.bookingId++;
	}
	
	
	public ArrayList<Seat> getSeatsBooked() {
		return seatsBooked;
	}

	@Override
	public String toString() {
		return "Booking [seatsBooked=" + seatsBooked + "]";
	}


	public void setSeatsBooked(ArrayList<Seat> seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	
}
