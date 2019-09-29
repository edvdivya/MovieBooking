package com.cg.movies.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.movies.dto.Admin;
import com.cg.movies.dto.Movie;
import com.cg.movies.dto.Show;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.UserException;
@Repository("admindao")
public class AdminDaoImpl implements AdminDao {
	
	@PersistenceContext
	EntityManager manager;
	public static int flag = 0;


	public Admin save(Admin admin) {

		Query query = manager.createQuery("FROM Admin");

		@SuppressWarnings("unchecked")
		List<Admin> adminList = query.getResultList();

		if (adminList.isEmpty()) {
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
			manager.persist(admin);
			tran.commit();
			System.out.println("Admin has been added successfully");
			return admin;
		}
		System.out.println("Admin already exists in database");
		return null;
	}

	public List<Admin> findAll() {
		
		Query query = manager.createQuery("FROM Admin");

		@SuppressWarnings("unchecked")
		List<Admin> adminList = query.getResultList();

		if (adminList.isEmpty()) {
			System.out.println("No admins in the database.");
			return null;
		} else {
			return adminList;
		}
	}

	public Admin find(Integer adminId) {

		
		Admin admin = manager.find(Admin.class, adminId);

		if (admin == null) {
			System.out.println("Admin not found!!");
			return null;
		} else {
			return admin;
		}
	}

	public Admin remove(Integer adminId) {
		
		Admin admin = manager.find(Admin.class, adminId);
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		flag = 1;
		tran.commit();
		System.out.println("Admin has been removed");
		return admin;

	}

	public boolean addShowToTheatre(Integer showId, Integer theatreId) {

		
		Theatre theatre = manager.find(Theatre.class, theatreId);
		Show show = manager.find(Show.class, showId);
		EntityTransaction tran = manager.getTransaction();

		if (theatre == null || show == null) {
			System.out.println("Theatre not found!!");
			return false;
		} else {
			tran.begin();
			show.setTheatre(theatre);
			tran.commit();
			return true;
		}
	}

	public boolean addMovieToTheatre(Integer movieId, Integer showId, Integer theatreId) {
		
		EntityTransaction tran = manager.getTransaction();

		Theatre theatre = manager.find(Theatre.class, theatreId);
		Show show = manager.find(Show.class, showId);
		Movie movie = manager.find(Movie.class, movieId);

		if (theatre == null || show == null) {
			System.out.println("Theatre/Show not found!!");
			return false;
		} else {
			tran.begin();
			show.setMovie(movie);
			theatre.getMovieList().add(movie);
			movie.getTheatre().add(theatre);
			tran.commit();
			return true;
		}
	}

	public Admin validateAdminLogin(String userName, String userPass) throws UserException {
		
		Query query = manager.createQuery("FROM Admin WHERE adminName = :first AND adminPassword = :second");
		query.setParameter("first", userName);
		query.setParameter("second", userPass);
		
		@SuppressWarnings("unchecked")
		List<Admin> adminList = query.getResultList();

		if (adminList.isEmpty()) {
			throw new UserException("Admin Doesn't exist");
		}
		return adminList.get(0);

	}

	@Override
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		Query query = manager.createQuery("From Movie where showStatus = :first");
		query.setParameter("first",0);
		List<Movie> movieList=query.getResultList();
		return movieList;
	}
	@Override
	public List<String> getTheatreByMovieId(Integer movieId) {
		// TODO Auto-generated method stub
		
		Movie movie = manager.find(Movie.class, movieId);
		if (movie != null) {
			List<Theatre> theatresList = movie.getTheatre();
			List<String> nameIdList = new ArrayList<String>();
			theatresList.forEach(theatre -> {
				nameIdList.add(theatre.getTheatreId() + " " + theatre.getTheatreName());
			});
			return nameIdList;
		}

		return null;

	}
	@Override
	public Date getReleaseDate(Integer movieID) {
		// TODO Auto-generated method stub
		Movie movie = manager.find(Movie.class, movieID);
		if (movie == null) {
			System.out.println("Movie not found!!");
			return null;
		} else {
			return movie.getMovieReleaseDate();
		}
	}

	@Override
	public Boolean setShowStatus(Integer movieID) {
		// TODO Auto-generated method stub
		Movie movie = manager.find(Movie.class,movieID);
		manager.getTransaction().begin();
		movie.setShowStatus(1);

		manager.getTransaction().commit();

	return true;
		
	}

}