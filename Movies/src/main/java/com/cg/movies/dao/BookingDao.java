package com.cg.movies.dao;

import com.cg.movies.dto.Booking;

public interface BookingDao {
	
	public Booking addBooking(Booking booking);
	public Booking cancelBooking(Booking booking);
}
