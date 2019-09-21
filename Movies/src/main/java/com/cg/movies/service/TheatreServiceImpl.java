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
		    public Map<Integer, String> getCities() {
		        return dao.getCities();
		    }

		    @Override
		    public Map<Integer, Theatre> getTheatres() throws Exception {
		        return dao.getTheatres();
		    }
		    public Map<Integer, Theatre> getTheatres(int option) throws Exception {
		        return dao.getTheatres(option);
		    }

		    @Override
		    public Boolean addTheatre(Theatre theatre) throws Exception {
		        if(Validate.validate_theatre(theatre)) {
		        	return dao.addTheatre(theatre);
		        }
		        return false;
		            
		    }

		    @Override
		    public List<Theatre> getTheatres(Integer cityPincode) throws Exception {
		        if(Validate.validate_Ids(cityPincode)){
		           return dao.getTheatres(cityPincode);
		        }
		        return null;
		    }

		    @Override
		    public Theatre searchTheatre(Integer theatreId) throws Exception {
		        if(Validate.validate_Ids(theatreId)){
		            return dao.searchTheatre(theatreId);
		        }
		        return null;
		    }

		    @Override
		    public Theatre deleteTheatre(Integer theatreId) throws UserException {
		        if(Validate.validate_Ids(theatreId)){
		            return dao.deleteTheatre(theatreId);
		        }
		        return null;
		    }

		    @Override
		    public Set<Movie> getMovies(Integer cityPincode) throws UserException {
		        if(Validate.validate_Ids(cityPincode)){
		            return dao.getMovies(cityPincode);
		        }
		        return null;
		    }



		    @Override
		    public Show deleteShow(Integer theatreId, Integer screenId, Integer showId) throws Exception {
		        // TODO Auto-generated method stub
		        if((Validate.validate_Ids(theatreId)&&(Validate.validate_Ids(screenId)))) {

		           return  dao.deleteShow(theatreId, screenId, showId);
		        }
		        return null;
		    }



		    @Override
		    public Show updateShow(Integer theatreId,Integer screenId, Show show) throws Exception {
		        // TODO Auto-generated method stub
		        if(Validate.validate_Ids(theatreId)) {
		           return dao.updateShow(theatreId,screenId,show);
		        }
		        return null;
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
			public void deleteMovie(int nextInt) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Customer addCustomer(Customer customer) throws UserException {
				// TODO Auto-generated method stub
				if(Validate.validate_customer(customer)) {
					return dao.addCustomer();
				}
				return null;
			}

	
			
		}



	

