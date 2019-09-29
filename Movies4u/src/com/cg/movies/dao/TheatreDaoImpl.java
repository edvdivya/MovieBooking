package com.cg.movies.dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.cg.movies.dto.Theatre;
@Repository("theatredao")
public class TheatreDaoImpl implements TheatreDao {

	public static int flag=0;
	@PersistenceContext
	EntityManager manager;
	
	
	public Theatre save(Theatre theatre) {
		
		EntityTransaction tran=manager.getTransaction();
			tran.begin();
			manager.persist(theatre);
			tran.commit();
			return theatre;
		}
		

	public List<Theatre> findAll() {
		Query query = manager.createQuery("FROM Theatre");
		
		@SuppressWarnings("unchecked")
		List<Theatre> theatreList=query.getResultList();
		if(theatreList.isEmpty()) {
			System.out.println("No theatres in the database.");
			return null;
		}
		else {
			return theatreList;
		}
	}

	public Theatre find(Integer theatreId) {
		
		Theatre theatre=manager.find(Theatre.class, theatreId);
		if(theatre == null) {
			System.out.println("Theatre not found!!");
			return null;
		}
		else {
			return theatre;
		}
	}

	public Theatre remove(Integer theatreId) {
		
		Theatre theatre=manager.find(Theatre.class, theatreId);
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		flag=1;
		tran.commit();
		System.out.println("Theatre has been removed");
		return theatre;
		
	}
	
}