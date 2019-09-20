package com.cg.demojpa.dto;

import javax.persistence.*;

@Entity
@Table(name="jpa_project")
@Embeddable public class Project {
	
	@Id
	@Column(name="project_id")
	private Integer projectId;
	@Column(name="project_name")
	private String projectName;
	@Column(name="project_cost")
	private double projectCost;
	
	
	
	public Project(Integer projectId, String projectName, double projectCost) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
	}
	
	public Project() {
		super();
		
	}


	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public double getProjectCost() {
		return projectCost;
	}
	
	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}
}
