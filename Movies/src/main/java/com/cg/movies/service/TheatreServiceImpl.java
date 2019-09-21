package com.cg.movies.service;
import com.cg.movies.dao.*;
import com.cg.movies.dto.Customer;
import com.cg.movies.dto.Movie;

import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class TheatreServiceImpl implements TheatreService {
		
	    private TheatreDao dao = new TheatreDaoImpl();

	

		    @Override
		    public Boolean addTheatre(Theatre theatre) throws Exception {
		        if(Validate.validate_theatre(theatre)) {
		        	return dao.addTheatre(theatre);
		        }
		        return false;
		            
		    }

			@Override
		
			  public Boolean addMovie(Movie movie) throws Exception {
			        if(Validate.validate_movie(movie)) {
			        	return dao.addMovie(movie);
			        }
			        return false;
			            
			    }


			@Override
			public Boolean addShow(Show show) throws Exception {
				if(Validate.validate_show(show)) {
					return dao.addShow(show);
				}
				return null;
			}


			@Override
			public Customer addCustomer(Customer customer) throws UserException {
				// TODO Auto-generated method stub
				if(Validate.validate_customer(customer)) {
					return dao.addCustomer();
				}
				return null;
			}

			@Override
			public Boolean validateCustomer(String userName, String userPass) {
				// TODO Auto-generated method stub
				return dao.validateCustomer(userName,userPass);
			}

			@Override
			public void deleteMovie(Integer movieId, Integer theatreId) {
				// TODO Auto-generated method stub
				
			}

	
			
		}



	

