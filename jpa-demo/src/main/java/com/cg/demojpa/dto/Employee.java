package com.cg.demojpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jpa_employee")
public class Employee {
	
	@Id
	@Column(name="emp_id") // Name of column containing empId in table
	private Integer empId;
	@Column(name="emp_name") // Name of column containing empName in table
	private String empName;
	@Column(name="emp_salary") // Name of column containing empSalary in table
	private Double empSalary;
	
	
	/************Constructors*****************/
	public Employee() {
	
	}
	public Employee(Integer empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}


	
	
	
	
	/************Getters and Setters*****************/
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
