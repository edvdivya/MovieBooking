package com.cg.movies.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Show {

	private Integer showId;
    private Date show_date;
    private Date show_timings;
    private Integer availableSeats;
    private Integer bookedSeats;
    private Movie movie;
    private Theatre theatre;
    
	public Show(Integer showId, Date show_date, Date show_timings, Integer availableSeats, Integer bookedSeats,
			Movie movie, Theatre theatre) {
		super();
		this.showId = showId;
		this.show_date = show_date;
		this.show_timings = show_timings;
		this.availableSeats = availableSeats;
		this.bookedSeats = bookedSeats;
		this.movie = movie;
		this.theatre = theatre;
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

	public Integer getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(Integer bookedSeats) {
		this.bookedSeats = bookedSeats;
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
 

   
}

    