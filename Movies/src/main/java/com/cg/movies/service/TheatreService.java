package com.cg.movies.service;
import java.util.List;

import java.util.Map;
import java.util.Set;

import com.cg.movies.dto.Customer;
import com.cg.movies.dto.Movie;

import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.UserException;
public interface TheatreService {

	    public Boolean addTheatre(Theatre theatre) throws Exception;
	    public Boolean addShow(Show show) throws Exception;
		public Boolean addMovie(Movie movie) throws Exception;
		public void deleteMovie(Integer movieId, Integer theatreId );
		public Customer addCustomer(Customer customer) throws UserException;
		public Boolean validateCustomer(String userName, String userPass);
	
		

	}


