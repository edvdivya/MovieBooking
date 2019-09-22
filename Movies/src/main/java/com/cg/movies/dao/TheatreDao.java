package com.cg.movies.dao;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.movies.dto.Movie;
import com.cg.movies.dto.Screen;
import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
public interface TheatreDao {


		
	    public Theatre saveTheatre(Theatre theatre);
	    public List<Theatre> getTheatres(Integer cityPincode);
	    
	    public Theatre removeTheatre(Integer theatreId);
	    
	}


