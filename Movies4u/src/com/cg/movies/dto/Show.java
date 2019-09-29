package com.cg.movies.dto;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="movie_show")
public class Show {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="show_id")
	private Integer showId;
	@Column(name="show_date")
    private Date show_date;
	@Column(name="show_timings")
    private Date show_timings;
	@Column(name="available_seats")
    private Integer availableSeats;
	@Column(name="blocked_seats")
    private Integer blockedSeats;
	@ManyToOne
	@JoinColumn(name = "movie_id")
    private Movie movie;
	@ManyToOne
	@JoinColumn(name = "theatre_id")
    private Theatre theatre;
	@OneToMany(mappedBy = "show")
	private List<Booking> bookings;
	
	
	public Show() {
		
		// TODO Auto-generated constructor stub
	}


	public Show(Integer showId, Date show_date, Date show_timings, Integer availableSeats, Integer blockedSeats,
			Movie movie, Theatre theatre, List<Booking> bookings) {
		super();
		this.showId = showId;
		this.show_date = show_date;
		this.show_timings = show_timings;
		this.availableSeats = availableSeats;
		this.blockedSeats = blockedSeats;
		this.movie = movie;
		this.theatre = theatre;
		this.bookings = bookings;
	}


	public Integer getShowId() {
		return showId;
	}


	public void setShowId(Integer showId) {
		this.showId = showId;
	}


	public Date getShow_date() {
		return show_date;
	}


	public void setShow_date(Date show_date) {
		this.show_date = show_date;
	}


	public Date getShow_timings() {
		return show_timings;
	}


	public void setShow_timings(Date show_timings) {
		this.show_timings = show_timings;
	}


	public Integer getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}


	public Integer getBlockedSeats() {
		return blockedSeats;
	}


	public void setBlockedSeats(Integer blockedSeats) {
		this.blockedSeats = blockedSeats;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	public Theatre getTheatre() {
		return theatre;
	}


	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}


	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	
	



	
   
}

    