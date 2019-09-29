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

import com.cg.movies.dto.Show;
@Repository("showdao")
public class ShowDaoImpl implements ShowDao {
	public static int flag = 0;
	@PersistenceContext
	EntityManager manager;
	

	@Transactional
	public Show save(Show show) {

		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		manager.persist(show);
		tran.commit();
		return show;

	}

	public List<Show> findAll() {
		Query query = manager.createQuery("FROM Show");

		@SuppressWarnings("unchecked")
		List<Show> showList = query.getResultList();

		if (showList.isEmpty()) {
			System.out.println("No Shows in the database.");
			return null;
		} else {
			return showList;
		}
	}

	public Show find(Integer showId) {

		Show show = manager.find(Show.class, showId);

		if (show == null) {
			System.out.println("Show not found!!");
			return null;
		} else {
			return show;
		}
	}

	public Show remove(Integer showId) {
		Show show = manager.find(Show.class, showId);
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		flag = 1;
		tran.commit();
		System.out.println("Show has been removed");
		return show;

	}

	@Override
	public Show addMovieToShow(Integer movieId) {
		// TODO Auto-generated method stub
		return null;
	}

}
