package com.cg.moviesforyou.dao;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.moviesforyou.dto.Admin;
import com.cg.moviesforyou.dto.Booking;
import com.cg.moviesforyou.dto.Customer;
import com.cg.moviesforyou.dto.Movie;
import com.cg.moviesforyou.dto.Show;
import com.cg.moviesforyou.dto.Theatre;
import com.cg.moviesforyou.exception.UserException;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager manager;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
	
	@Transactional
	public Customer addCustomer(Customer customer) {
		Query query = manager.createQuery("From Customer where customerName = :first or contactNumber = :second");
		query.setParameter("first", customer.getCustomerName());
		query.setParameter("second", customer.getContactNumber());
		List<Customer> customerList = query.getResultList();
		if (customerList.isEmpty()) {
			manager.persist(customer);
			return customer;
		}
		System.out.println("Phone number or the username is already Registered");
		System.out.println("Couldn't Register");
		return null;
	}

	public Customer validateCustomerLogin(String userName, String userPass) throws UserException {
		Query query = manager.createQuery("From Customer where customerName = :first");
		query.setParameter("first", userName);
		Customer customer;
		try {
			customer = (Customer) query.getSingleResult();
		} catch (Exception e) {
			
			throw new UserException();
		}
		
		if (customer != null) {
			if(customer.getCustomerPassword().compareTo(userPass) == 0)
				return customer;
		}
		return null;
	}

	public List<Movie> getMovies() {
		Date today = new Date();
		Query query = manager.createQuery("From Movie where showStatus = :first");
		query.setParameter("first",0);
		List<Movie> movieList = query.getResultList();
		return movieList;
	}

	public List<Show> getShows(Integer movieId, Integer theatreId) {
		Theatre theatre = manager.find(Theatre.class, theatreId);
		if (theatre != null) {
			List<Show> showsList = theatre.getShowsList();
			List<Show> selectedShow = new ArrayList<Show>();
			for(Show showin : showsList) {
				if(showin.getMovie().getMovieId()==movieId) {
					selectedShow.add(showin);
				}
				
			}
			System.out.println("selected show"+selectedShow);
			
			return selectedShow;
		}
		else {
			System.out.println("theatre dn exist");
			System.out.println("show not exissts");
			return null;
		}
		
	}

	public BigInteger getUserId(String userName) {
		Query query = manager.createQuery("From Customer where customerName = :first");
		query.setParameter("first", userName);
		List<Customer> customer = query.getResultList();
		return customer.get(0).getCustomerId();
	}
	
	@Transactional
	public Boolean addBooking(Booking booking) throws Exception {
		manager.persist(booking);
		return true;
	}
	
	@Transactional
	public List<Booking> viewBookings(BigInteger userID) {
		Customer customer = manager.find(Customer.class, userID);
		if (customer != null) {
			List<Booking> bookingsList = customer.getBookings();
			List<String> bookingIds = new ArrayList<String>();
			bookingsList.forEach(booking -> {
				bookingIds.add(booking.getBookingId() + " : "
						+ sdf1.format(booking.getShow().getShowTime()) + " : "
								+ booking.getShow().getTheatre().getTheatreName() + " : "
								+ booking.getShow().getMovie().getMovieName());
			});
			return bookingsList;
		}
		return null;
	}
	public BigInteger getBookingId(BigInteger userId) {
		Customer customer = manager.find(Customer.class, userId);
		if (customer != null) {
			List<Booking> bookingsList = customer.getBookings();
			List<String> bookingIds = new ArrayList<String>();
			bookingsList.forEach(booking -> {
				bookingIds.add(booking.getBookingId() + " " + booking.getShow());
			});
			return bookingsList.get(bookingsList.size() - 1).getBookingId();
		}
		return null;
	}
	
	public Date getReleaseDate(Integer movieID) {
		Movie movie = manager.find(Movie.class, movieID);
		if (movie == null) {
			System.out.println("Movie not found!!");
			return null;
		} else {
			return movie.getMovieReleaseDate();
		}
	}
	
	public Integer getAvailableSeats(Integer showSelected) {
		Show show = manager.find(Show.class, showSelected);
		if (show == null) {
			System.out.println("Show not found!!");
			return null;
		} else {
			return show.getAvailableSeats();
		}

	}

	@Transactional
	public Boolean updateSeats(Integer showSelected, Integer availableSeats, Integer bookedSeats) {		
		Show show = manager.find(Show.class, showSelected);
		show.setAvailableSeats(availableSeats - bookedSeats);
//		  show.setBookedSeats(bookedSeats);
		return true;
	}
	
	public List<Theatre> getTheatreByMovieId(Integer movieId) {
		Movie movie = manager.find(Movie.class, movieId);
		if (movie != null) {
			List<Theatre> theatresList = movie.getTheatre();
			System.out.println("theatres"+theatresList);
			List<String> nameIdList = new ArrayList<String>();
			theatresList.forEach(theatre -> {
				nameIdList.add(theatre.getTheatreId() + " " + theatre.getTheatreName());
			});
			return theatresList;
		}
		return null;
	}
	
	public List<Customer> findAll() {
		Query query = manager.createQuery("FROM Customer");
		List<Customer> customerList = query.getResultList();

		if (customerList.isEmpty()) {
			System.out.println("No admins in the database.");
			return null;
		} else {
			return customerList;
		}
	}

	@Transactional
	public Boolean cancelBooking(BigInteger bookingid) {
		Booking booking = manager.find(Booking.class, bookingid);
		booking.setFlag(1);
		return true;
	}
}
