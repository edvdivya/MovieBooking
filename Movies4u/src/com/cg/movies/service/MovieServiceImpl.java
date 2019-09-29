package com.cg.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movies.dao.MovieDao;

import com.cg.movies.dto.Movie;
@Service("movieservice")
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieDao moviedao;
	
	@Override
	public Movie save(Movie novie) {
		
		return moviedao.save(novie);
	}

	@Override
	public List<Movie> findAll() {
		
		return moviedao.findAll();
	}

	@Override
	public Movie find(Integer movieId) {
		
		return moviedao.find(movieId);
	}

	@Override
	public Movie remove(Integer movieId) {
		
		return moviedao.remove(movieId);
	}

	
}
