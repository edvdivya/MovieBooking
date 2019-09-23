package com.cg.movies.service;

import java.util.List;

import com.cg.movies.dao.ShowDao;
import com.cg.movies.dao.ShowDaoImpl;
import com.cg.movies.dto.Show;

public class ShowServiceImpl implements ShowService{

	ShowDao dao = new ShowDaoImpl();
	
	public Show save(Show show) {
		
		return dao.save(show);
	}

	public List<Show> findAll() {
		
		return dao.findAll();
	}

	public Show find(Integer showId) {
		
		return dao.find(showId);
	}

	public Show remove(Integer showId) {
		
		return dao.remove(showId);
	}
	 
}
