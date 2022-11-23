package com.edureka.javasql2.hibernate.inheritance.type1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "professor")
@DiscriminatorValue(value = "PROFESSOR")
public class Professor extends Person{

	@Column(name = "job_type")
	private String jobType;
	
	@Column(name = "work_timings")
	private String workTimings;

	public Professor() {}
	
	public Professor(String name, int age, String jobType, String workTimings) {
		
		super(name, age);
		
		this.jobType = jobType;
		this.workTimings = workTimings;
	}
	
	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getWorkTimings() {
		return workTimings;
	}

	public void setWorkTimings(String workTimings) {
		this.workTimings = workTimings;
	}
}
