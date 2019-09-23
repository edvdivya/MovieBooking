package com.cg.movies.dao;

import java.util.List;

import com.cg.movies.dto.Admin;

public interface AdminDao {
	
	public Admin save(Admin admin);
	public List<Admin> findAll();
	public Admin find(Integer adminId);
	public Admin remove(Integer adminId);
	
	public boolean addShowToTheatre(Integer showId, Integer theatreId);
	public boolean addMovieToTheatre(Integer movieId, Integer showId, Integer theatreId);
}
