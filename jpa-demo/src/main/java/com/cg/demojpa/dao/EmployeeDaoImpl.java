package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("demojpa");

	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		EntityManager en = entityFactory.createEntityManager();
		EntityTransaction transaction = en.getTransaction();
		transaction.begin();
		en.persist(emp);
		en.flush();
		
		transaction.commit();
		return null;
	}

	public List<Employee> findAll() {
		EntityManager en = entityFactory.createEntityManager();
		Query query = en.createQuery("FROM Employee");
		List<Employee> employeeList = query.getResultList();
		return employeeList;
	}

	public void remove(Integer empId) {
		EntityManager en = entityFactory.createEntityManager();
		Employee empRemove = en.find(Employee.class, empId);
		EntityTransaction transaction = en.getTransaction();
		transaction.begin();
		en.remove(empRemove);
		transaction.commit();
		
	}

	public List<Employee> filterSalaryByRange(double min, double max) {
		
		EntityManager en = entityFactory.createEntityManager();
		Query query = en.createQuery("FROM Employee WHERE empSalary BETWEEN :first AND :second");
		query.setParameter("first", min);
		query.setParameter("second", max);
		List<Employee> employeeList = query.getResultList();
		return employeeList;
	}

}
