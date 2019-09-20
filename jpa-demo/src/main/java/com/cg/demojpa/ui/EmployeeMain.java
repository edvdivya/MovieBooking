package com.cg.demojpa.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImpl();
		
		@SuppressWarnings("resource")
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = scr.nextInt();
		System.out.println("Enter Name: ");
		String name = scr.next();
		System.out.println("Enter Salary: ");
		double salary = scr.nextDouble();
		System.out.println("Enter Date of joining in yyyy/MM/DD format: ");
		String dateString = scr.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/DD");
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Enter city: ");
		String city = "Thaliva"; // scr.next();
		System.out.println("Enter State: ");
		String state = "South"; //scr.next();
		System.out.println("Enter Pincode: ");
		Integer pincode = 713205;//scr.nextInt();
		
		System.out.println("Enter Project ID: ");
		Integer projectId = 423129;//scr.nextInt();
		System.out.println("Enter Project Name: ");
		String projectName = "newProject"; //scr.next();
		System.out.println("Enter Project Cost: ");
		double projectCost = 4234124;//scr.nextInt();
		
		System.out.println("Enter Department ID: ");
		Integer departmentId = 123424; //scr.nextInt();
		System.out.println("Enter Department Name: ");
		String departmentName = "Therwer";//scr.next();
		
		Employee emp = new Employee();
		Address addr = new Address();
		Project proj = new Project();
		Department dep = new Department();
		
		dep.setDepartmentId(departmentId);
		dep.setDepartmentName(departmentName);
		
		proj.setProjectId(projectId);
		proj.setProjectName(projectName);
		proj.setProjectCost(projectCost);
		
		addr.setCity(city);
		addr.setState(state);
		addr.setPincode(pincode);
		
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(salary);
		emp.setDateOfJoining(date);
		emp.setEmpAddress(addr);
		emp.setEmpProject(proj);
		emp.setDepartment(dep);
	
		
		List <Employee> empList = service.findAll();
		
		for(Employee employee : empList) {
            employee.setDepartment(dep);
        }
		dep.setEmployeeList(empList);
		
		service.save(emp);
		
		
		
		
		for(Employee employee : empList) {
            System.out.println(employee);
        }
		
		empList = service.filterSalaryByRange(1000, 2000);
		
		for(Employee employee : empList) {
            System.out.println(employee);
        }
		
		/*
		 * System.out.println("Enter ID you want to remove: "); id = scr.nextInt();
		 * service.remove(id);
		 */
		
		/*
		 * List<Employee> empList = service.findAll();
		 * 
		 * for(Employee employee : empList) { System.out.println(employee); }
		 */
	}
}
