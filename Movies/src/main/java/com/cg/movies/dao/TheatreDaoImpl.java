package com.cg.movies.dao;


import com.cg.movies.dto.*;
import com.cg.movies.exception.*;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;



public class TheatreDaoImpl implements TheatreDao{

	public static int flag=0;
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("Movies");
	@Transactional
	public Theatre saveTheatre(Theatre theatre) {

		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("From Theatre");
		List<Theatre> theatreList=query.getResultList();
		if(theatreList.isEmpty()) {
			
			EntityTransaction tran=em.getTransaction();
			tran.begin();
			em.persist(theatre);
			tran.commit();
			System.out.println("Theatre has been added successfully");
			return theatre;
		}
		System.out.println("Theatre already exists in database");
		return null;
	}
	public List<Theatre> getTheatres(Integer cityPincode) { 
		EntityManager em=entityFactory.createEntityManager();
		Query query = em.createQuery("From Theatre where cityPincode = :pincode");
		query.setParameter("pincode",cityPincode);
		List<Theatre> theatreList=query.getResultList();
		return theatreList;
	}
	
	public Theatre removeTheatre(Integer theatreId) {
		EntityManager em = entityFactory.createEntityManager();
		Theatre theatre=em.find(Theatre.class, theatreId);
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		flag=1;
		tran.commit();
		System.out.println("Theatre has been removed");
		return theatre;
	}
	@Override
	public Boolean addTheatre(Theatre theatre) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean addMovie(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean addShow(Show show) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean deleteMovie(Integer theatreid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}




