package com.edureka.javasql2.hibernate.criteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employee")
@Entity(name = "employee")
public class Employee {

	@Id
	@Column(name = "empno")
	private Long id;
	
	@Column(name = "ename")	
	private String name;
		
	@Column(name = "job")	
	private String job;
	
	@Column(name = "mgr")		
	private Integer managerId;
	
	@Column(name = "sal")			
	private Integer salary;

	@Column(name = "deptno")				
	private Integer deptNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	public String toString() {
		return String.format("Emp ID %d, Name %s, Salary is %d", 
			id, name, salary);
	}
}
