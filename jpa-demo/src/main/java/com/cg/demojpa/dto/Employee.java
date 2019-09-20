package com.cg.demojpa.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@Temporal(TemporalType.DATE)
	@Column(name="date_of_joining")
	private Date dateOfJoining;
	
	@Embedded
	private Address empAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Project empProject;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private Department department;
	
	/************Constructors*****************/
	public Employee() {
	
	}

	public Employee(Integer empId, String empName, Double empSalary, Date dateOfJoining, Address empAddress,
			Project empProject, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dateOfJoining = dateOfJoining;
		this.empAddress = empAddress;
		this.empProject = empProject;
		this.department = department;
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
	
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public Address getEmpAddress() {
		return empAddress;
	}
	
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
	public Project getEmpProject() {
		return empProject;
	}
	
	public void setEmpProject(Project empProject) {
		this.empProject = empProject;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", dateOfJoining="
				+ dateOfJoining + "]";
	}
	
	
}
