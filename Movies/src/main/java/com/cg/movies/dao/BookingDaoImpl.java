package com.cg.movies.dao;

import java.util.ArrayList;
import java.util.ListIterator;

import com.cg.movies.dto.Booking;

public class BookingDaoImpl implements BookingDao {
	
	ArrayList<Booking> bookings = new ArrayList<Booking>();

	public Booking addBooking(Booking booking) {
		bookings.add(booking);
		return null;
	}

	public Booking cancelBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<Booking> showBookings() {
		ListIterator<Booking> ltr  = bookings.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		return bookings;
	}
	
}
