package com.cg.demojpa.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "jpa_department")
public class Department {
	
	@Id
	@Column(name="department_id")
	private Integer departmentId;
	@Column(name="department_name")
	private String departmentName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	
	private List<Employee> employeeList;
	
	

	public Department() {
		super();
	}

	public Department(Integer departmentId, String departmentName, List<Employee> employeeList) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employeeList = employeeList;
	}

	
	
	
	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employeeList="
				+ employeeList + "]";
	}

	
}
