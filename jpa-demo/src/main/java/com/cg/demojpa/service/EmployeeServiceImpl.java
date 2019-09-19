package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dao.EmployeeDao;
import com.cg.demojpa.dao.EmployeeDaoImpl;
import com.cg.demojpa.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao = new EmployeeDaoImpl();
	
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	public List<Employee> findAll() {
		return dao.findAll();
	}

	public void remove(Integer empId) throws RuntimeException{
		try {
			dao.remove(empId);
		} catch (RuntimeException e) {
		    throw e;
		}
		
	}

	public List<Employee> filterSalaryByRange(double min, double max) {
		return dao.filterSalaryByRange(min, max);
	}

}
