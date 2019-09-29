package com.cg.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movies.dao.*;
import com.cg.movies.dto.Show;
@Service("showservice")
public class ShowServiceImpl implements ShowService{
	@Autowired
	ShowDao showdao;
	
	@Override
	public Show save(Show show) {
		
		return showdao.save(show);
	}

	@Override
	public List<Show> findAll() {
		
		return showdao.findAll();
	}

	@Override
	public Show find(Integer showId) {
		
		return showdao.find(showId);
	}

	@Override
	public Show remove(Integer showId) {
		
		return showdao.remove(showId);
	}
	 
}
