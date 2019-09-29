package com.cg.movies.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movies.dao.*;
import com.cg.movies.dto.Booking;
import com.cg.movies.dto.Customer;
import com.cg.movies.dto.Movie;
import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.UserException;
@Service("customerservice")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerdao;
	@Override
	public Customer addCustomer(Customer customer) throws UserException {
		// TODO Auto-generated method stub
		if(Validate.validate_customer(customer)) {
			return customerdao.addCustomer(customer);
		}
		return null;
	}

	@Override
	public Boolean validateCustomer(String userName, String userPass) throws UserException {
		// TODO Auto-generated method stub
		return customerdao.validateCustomer(userName,userPass);
	}

	@Override
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return customerdao.getMovies();
	}

	@Override
	public List<String> getTheatreByMovieId(Integer movieId) {
		// TODO Auto-generated method stub
		return customerdao.getTheatreByMovieId(movieId);
	}

	@Override
	public List<String> getShows(Integer movieId, Integer theatreSelected) {
		// TODO Auto-generated method stub
		return customerdao.getShows(movieId,theatreSelected);
	}

	@Override
	public BigInteger getUserId(String userName) {
		// TODO Auto-generated method stub
		return customerdao.getUserId(userName);
	}

	@Override
	public Boolean addBooking(Booking booking) throws Exception {
		// TODO Auto-generated method stub
		if(Validate.validate_booking(booking)) {
			return customerdao.addBooking(booking);
		}
		return false;
	}

	@Override
	public List<String> viewBookings(BigInteger userID) {
		// TODO Auto-generated method stub
		return customerdao.viewBookings(userID);
	}

	@Override
	public Boolean cancelBooking(BigInteger bookingid) {
		// TODO Auto-generated method stub
		return customerdao.cancelBooking(bookingid);
	}

	@Override
	public BigInteger getBookingId(BigInteger userId) {
		// TODO Auto-generated method stub
		return customerdao.getBookingId(userId);
	}

	@Override
	public Date getReleaseDate(Integer movieId) {
		// TODO Auto-generated method stub
		return customerdao.getReleaseDate(movieId);
	}

	@Override
	public Integer getAvailableSeats(Integer showSelected) {
		// TODO Auto-generated method stub
		return customerdao.getAvailableSeats(showSelected);
	}

	@Override
	public Boolean updateSeats(Integer showSelected,Integer seatsAvailable,Integer bookedSeats) {
		// TODO Auto-generated method stub
		return customerdao.updateSeats(showSelected,seatsAvailable,bookedSeats);
		
	}

}
