package com.cg.movies.service;
import java.util.List;

import java.util.Map;
import java.util.Set;

import com.cg.movies.dto.Movie;

import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
public interface TheatreService {


		public Map<Integer,String> getCities();
	    public Map<Integer, Theatre> getTheatres() throws Exception;
	    public Boolean addTheatre(Theatre theatre) throws Exception;
	    public List<Theatre> getTheatres(Integer cityPincode) throws Exception;
	    public Theatre searchTheatre(Integer theatreId) throws Exception;
	    public Theatre deleteTheatre(Integer theatreId) throws Exception;
	    public Set<Movie> getMovies(Integer cityPincode) throws Exception;
	    public Boolean addShow(Show show) throws Exception;
	    public Show deleteShow(Integer theatreId,Integer screenId,Integer showId) throws Exception;
	    public Show updateShow(Integer theatreId,Integer screenId,Show show) throws Exception;
		public Map<Integer, Theatre> getTheatres(int option) throws Exception;
		public Boolean addMovie(Movie movie) throws Exception;
		public void deleteMovie(int nextInt);
	
		

	}


