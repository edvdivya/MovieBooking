package com.cg.moviesforyou.dao;

import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.moviesforyou.dto.Theatre;

@Repository("theatreDao")
public class TheatreDaoImpl implements TheatreDao {

	@PersistenceContext
	EntityManager manager;
	public static int flag = 0;

	@Transactional
	public Theatre save(Theatre theatre) {
		manager.persist(theatre);
		return theatre;
	}

	public List<Theatre> findAll() {
		Query query = manager.createQuery("FROM Theatre");
		List<Theatre> theatreList = query.getResultList();

		if (theatreList.isEmpty()) {
			System.out.println("No theatres in the database.");
			return null;
		} else {
			return theatreList;
		}
	}

	public Theatre find(Integer theatreId) {
		Theatre theatre = manager.find(Theatre.class, theatreId);
		if (theatre == null) {
			System.out.println("Theatre not found!!");
			return null;
		} else {
			return theatre;
		}
	}

	@Transactional
	public Theatre remove(Integer theatreId) {
		Theatre theatre = manager.find(Theatre.class, theatreId);
		flag = 1;
		System.out.println("Theatre has been removed");
		return theatre;
	}
}