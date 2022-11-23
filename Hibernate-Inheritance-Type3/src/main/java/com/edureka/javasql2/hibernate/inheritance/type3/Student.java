package com.edureka.javasql2.hibernate.inheritance.type3;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Table(name = "student")
@Entity(name = "student")
@PrimaryKeyJoinColumn(name = "person_id")
public class Student extends Person{

	@Column(name = "course")
	private String course;
	
	@Column(name = "id_card_no")
	private int idCardNo;

	public Student() {}
	
	public Student(String name, int age, String course, int idCardNo) {
		
		super(name, age);
		
		this.course = course;
		this.idCardNo = idCardNo;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(int idCardNo) {
		this.idCardNo = idCardNo;
	}
}
