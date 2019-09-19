 package com.cg.movies.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Show {

	private Integer showId;
    private Integer movieId;
    private Integer theatreId;
    private Integer availableSeats;
    private Integer bookedSeats;
    private Date showDate;
    private Date showTimings;
    
    public Show(Integer showId,Integer movieId,Integer theatreId,Integer bookedSeats,Integer availableSeats,Date showDate,Date showTimings ) throws Exception {
        this.showId=showId;
        this.movieId = movieId;
        this.theatreId = theatreId;
        this.bookedSeats = bookedSeats;
        this.availableSeats = availableSeats;
        this.showDate = showDate;
        this.showTimings = showTimings;
    }
    public Show(Integer movieId,Integer theatreId,Integer bookedSeats,Integer availableSeats,Date showDate,Date showTimings ) throws Exception {
        this.movieId = movieId;
        this.theatreId = theatreId;
        this.bookedSeats = bookedSeats;
        this.availableSeats = availableSeats;
        this.showDate = showDate;
        this.showTimings = showTimings;
    }

    public Integer getShowId() {
        return showId;
    }

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
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

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public Date getShowTimings() {
		return showTimings;
	}

	public void setShowTimings(Date showTimings) {
		this.showTimings = showTimings;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", movieId=" + movieId + ", theatreId=" + theatreId + ", availableSeats="
				+ availableSeats + ", bookedSeats=" + bookedSeats + ", showDate=" + showDate + ", showTimings="
				+ showTimings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableSeats == null) ? 0 : availableSeats.hashCode());
		result = prime * result + ((bookedSeats == null) ? 0 : bookedSeats.hashCode());
		result = prime * result + ((movieId == null) ? 0 : movieId.hashCode());
		result = prime * result + ((showDate == null) ? 0 : showDate.hashCode());
		result = prime * result + ((showId == null) ? 0 : showId.hashCode());
		result = prime * result + ((showTimings == null) ? 0 : showTimings.hashCode());
		result = prime * result + ((theatreId == null) ? 0 : theatreId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Show other = (Show) obj;
		if (availableSeats == null) {
			if (other.availableSeats != null)
				return false;
		} else if (!availableSeats.equals(other.availableSeats))
			return false;
		if (bookedSeats == null) {
			if (other.bookedSeats != null)
				return false;
		} else if (!bookedSeats.equals(other.bookedSeats))
			return false;
		if (movieId == null) {
			if (other.movieId != null)
				return false;
		} else if (!movieId.equals(other.movieId))
			return false;
		if (showDate == null) {
			if (other.showDate != null)
				return false;
		} else if (!showDate.equals(other.showDate))
			return false;
		if (showId == null) {
			if (other.showId != null)
				return false;
		} else if (!showId.equals(other.showId))
			return false;
		if (showTimings == null) {
			if (other.showTimings != null)
				return false;
		} else if (!showTimings.equals(other.showTimings))
			return false;
		if (theatreId == null) {
			if (other.theatreId != null)
				return false;
		} else if (!theatreId.equals(other.theatreId))
			return false;
		return true;
	}
	
    
}

    