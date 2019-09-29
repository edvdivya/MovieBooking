package com.cg.movies.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.movies.dto.Movie;
@Repository("moviedao")
public class MovieDaoImpl implements MovieDao{

	public static int flag=0;
	@PersistenceContext
	EntityManager manager;
	
	
	@Transactional
	public Movie save(Movie movie) {
		
			EntityTransaction tran=manager.getTransaction();
			tran.begin();
			manager.persist(movie);
			movie.setFlag(0);
			tran.commit();
			return movie;
	}

	public List<Movie> findAll() {
		Query query = manager.createQuery("FROM Movie");
		@SuppressWarnings("unchecked")
		List<Movie> movieList=query.getResultList();
		if(movieList.isEmpty()) {
			System.out.println("No movies in the database.");
			return null;
		}
		else {
			return movieList;
		}
	}

	public Movie find(Integer movieId) {
		
		Movie movie=manager.find(Movie.class, movieId);
		if(movie == null) {
			System.out.println("Movie not found!!");
			return null;
		}
		else {
			return movie;
		}
	}

	public Movie remove(Integer movieId) {
		Movie movie=manager.find(Movie.class, movieId);
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		flag=1;
		tran.commit();
		System.out.println("Movie has been removed");
		return movie;
		
	}

}
