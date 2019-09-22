package com.cg.movies.dao;
import java.util.Date;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.movies.dto.Customer;
import com.cg.movies.dto.Movie;

import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.MyException;
import com.cg.movies.exception.UserException;

public interface TheatreDao {

	    public Boolean addTheatre(Theatre theatre) throws Exception;
	    public Boolean addMovie(Movie movie) throws Exception;
		public Boolean addShow(Show show) throws Exception;
		public Boolean deleteMovie(Integer theatreid) throws Exception;
		
		
		
	}


