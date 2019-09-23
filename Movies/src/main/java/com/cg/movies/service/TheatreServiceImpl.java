package com.cg.movies.service;

import java.util.List;

import com.cg.movies.dao.TheatreDao;
import com.cg.movies.dao.TheatreDaoImpl;
import com.cg.movies.dto.Theatre;

public class TheatreServiceImpl implements TheatreService {
	
	TheatreDao dao = new TheatreDaoImpl();
	
	
	public Theatre save(Theatre theatre) {
		
		return dao.save(theatre);
	}

	
	public List<Theatre> findAll() {
		
		return dao.findAll();
	}

	
	public Theatre find(Integer theatreId) {
		
		return dao.find(theatreId);
	}

	
	public Theatre remove(Integer theatreId) {
		
		return dao.remove(theatreId);
	}

	 
	
}