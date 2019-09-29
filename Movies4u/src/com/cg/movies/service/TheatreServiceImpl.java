package com.cg.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.movies.dao.*;
import com.cg.movies.dto.Theatre;
@Service("theatreservice")
public class TheatreServiceImpl implements TheatreService {
	@Autowired
	TheatreDao theatredao;
	
	@Override
	public Theatre save(Theatre theatre) {	
		return theatredao.save(theatre);
	}

	@Override
	public List<Theatre> findAll() {
		return theatredao.findAll();
	}

	@Override
	public Theatre find(Integer theatreId) {
		return theatredao.find(theatreId);
	}

	@Override
	public Theatre remove(Integer theatreId) {
		return theatredao.remove(theatreId);
	}

	 
	
}