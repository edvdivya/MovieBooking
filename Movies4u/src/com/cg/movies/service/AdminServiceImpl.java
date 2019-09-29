package com.cg.movies.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movies.dao.AdminDao;
import com.cg.movies.dao.AdminDaoImpl;
import com.cg.movies.dto.Admin;
import com.cg.movies.dto.Movie;
import com.cg.movies.exception.UserException;

@Service("adminservice")
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao admindao;
	
	@Override
	public boolean addShowToTheatre(Integer showId, Integer theatreId) {
		return admindao.addShowToTheatre(showId, theatreId);
	}

	@Override
	public boolean addMovieToTheatre(Integer movieId, Integer showId, Integer theatreId) {
		return admindao.addMovieToTheatre(movieId, showId, theatreId);
	}

	@Override
	public Admin save(Admin admin) {
		return admindao.save(admin);
	}

	@Override
	public List<Admin> findAll() {
		return admindao.findAll();
	}

	@Override
	public Admin find(Integer adminId) {
		return admindao.find(adminId);
	}

	@Override
	public Admin remove(Integer adminId) {
		return admindao.remove(adminId);
	}
	
	public Admin validateAdminLogin(String userName, String userPass) throws UserException {
		return admindao.validateAdminLogin(userName, userPass);
	}

	@Override
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return admindao.getMovies();
	}

	@Override
	public List<String> getTheatreByMovieId(Integer movieId) {
		// TODO Auto-generated method stub
		return admindao.getTheatreByMovieId(movieId);
	}

	@Override
	public Date getReleaseDate(Integer movieId) {
		// TODO Auto-generated method stub
		return admindao.getReleaseDate(movieId);
	}

	@Override
	public Boolean setShowStatus(Integer movieID) {
		// TODO Auto-generated method stub
		return admindao.setShowStatus(movieID);
		
	}


}
