package com.cg.movies.dao;
import com.cg.movies.dto.Theatre;
import com.cg.movies.exception.MyException;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class TheatreDaoImpl implements TheatreDao{
		public static int flag=0;
		EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("Theatre");
		@Transactional
		public Theatre saveTheatre(Theatre theatre) {

			EntityManager em = entityFactory.createEntityManager();
			
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
		public List<Theatre> getTheatres(Integer cityPincode) { {
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
		
}

		

	