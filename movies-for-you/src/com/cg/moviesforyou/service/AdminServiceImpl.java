package com.cg.moviesforyou.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.moviesforyou.dao.AdminDao;
import com.cg.moviesforyou.dto.Admin;
import com.cg.moviesforyou.dto.Movie;
import com.cg.moviesforyou.exception.UserException;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;

	public boolean addShowToTheatre(Integer showId, Integer theatreId) {
		return adminDao.addShowToTheatre(showId, theatreId);
	}

	public boolean addMovieToTheatre(Integer movieId, Integer showId, Integer theatreId) {
		return adminDao.addMovieToTheatre(movieId, showId, theatreId);
	}

	public Admin save(Admin admin) {
		return adminDao.save(admin);
	}

	public List<Admin> findAll() {
		return adminDao.findAll();
	}

	public Admin find(Integer adminId) {
		return adminDao.find(adminId);
	}

	public Admin remove(Integer adminId) {
		return adminDao.remove(adminId);
	}

	public Admin validateAdminLogin(String userName, String userPass) throws UserException {
		return adminDao.validateAdminLogin(userName, userPass);
	}

	public List<Movie> getMovies() {
		return adminDao.getMovies();
	}

	public List<String> getTheatreByMovieId(Integer movieId) {
		return adminDao.getTheatreByMovieId(movieId);
	}

	public Date getReleaseDate(Integer movieId) {
		return adminDao.getReleaseDate(movieId);
	}

	public Boolean setShowStatus(Integer movieID) {
		return adminDao.setShowStatus(movieID);

	}
}
