package com.cg.movies.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.cg.movies.dto.Customer;
import com.cg.movies.exception.UserException;

public class CustomerDaoImpl implements CustomerDao {

	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("Movies");
	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		EntityManager em=entityFactory.createEntityManager();
		Query query = em.createQuery("From Customer where customerName = :first or contactNumber = :second");
		query.setParameter("first",customer.getCustomerName());
		query.setParameter("second",customer.getContactNumber());
		List<Customer> customerList=query.getResultList();
		if(customerList.isEmpty()) {
			//save customer
			EntityTransaction tran=em.getTransaction();
			tran.begin();
			em.persist(customer);
			tran.commit();
			System.out.println("You've been Succesfully Registered");
			return customer;
		}
		System.out.println("Phone number or the username is already Registered");
		System.out.println("Couldn't Register");
		return null;
	}

	@Override
	public Boolean validateCustomer(String userName, String userPass) throws UserException {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		Query query = em.createQuery("From Customer where customerName = :first and customerPassword = :second");
		query.setParameter("first", userName);
		query.setParameter("second", userPass);
		List<Customer> customerList=query.getResultList();
		if(customerList.isEmpty()) {
			return false;
		}
		return true;			

	}

}
