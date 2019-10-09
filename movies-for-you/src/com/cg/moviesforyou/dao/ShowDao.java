package com.cg.moviesforyou.dao;

import java.util.List;

import com.cg.moviesforyou.dto.Show;

public interface ShowDao {
	
	public Show save(Show show);
	public List<Show> findAll();
	public Show find(Integer showId);
	public Show remove(Integer showId);
	public Show addMovieToShow(Integer movieId);
	
}
