package com.cg.demojpa.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImpl();
		

		List<Employee> empList = service.findAll();
	
		for(Employee employee : empList) {
            System.out.println(employee);
        }
		
		empList = service.filterSalaryByRange(1000, 2000);
		
		for(Employee employee : empList) {
            System.out.println(employee);
        }
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = scr.nextInt();
		System.out.println("Enter Name: ");
		String name = scr.next();
		System.out.println("Enter Salary: ");
		double salary = scr.nextDouble();
		
		Employee emp = new Employee();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(salary);
		
		service.save(emp);
		
		System.out.println("Enter ID you want to remove: ");
		id = scr.nextInt();
		service.remove(id);
		
		/*
		 * List<Employee> empList = service.findAll();
		 * 
		 * for(Employee employee : empList) { System.out.println(employee); }
		 */
	}
}
