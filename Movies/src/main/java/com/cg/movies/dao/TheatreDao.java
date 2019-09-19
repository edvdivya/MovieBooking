package com.cg.movies.dao;
import java.util.Date;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.movies.dto.Movie;

import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.MyException;
public interface TheatreDao {


		public Map<Integer,String> getCities();
	    public Map<Integer, Theatre> getTheatres() throws Exception;
	    public Boolean addTheatre(Theatre theatre) throws Exception;
	    public List<Theatre> getTheatres(Integer cityPincode);
	    public Theatre searchTheatre(Integer theatreId);
	    public Theatre deleteTheatre(Integer theatreId);
	    public Set<Movie> getMovies(Integer cityPincode);
	    
	    public Show addShow(Integer theatreId, Integer screenId, Show show);
	    public Show deleteShow(Integer theatreId,Integer screenId,Integer showId);
	    public Show updateShow(Integer theatreId,Integer screenId,Show show);
	    public Show searchShow(Integer theatreId,Integer showId);

		public Map<Integer, Theatre> getTheatres(int option) throws Exception;
		public Boolean addMovie(Movie movie) throws Exception;
		public Boolean addScreen(int i, int j,int theatreid) throws MyException;
		public Boolean addShow(Show show) throws Exception;
		public Boolean deleteMovie(Integer theatreid) throws Exception;
		
	}


