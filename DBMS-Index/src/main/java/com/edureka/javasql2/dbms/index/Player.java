package com.edureka.javasql2.dbms.index;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "player")
@Entity (name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "player_id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name  = "lastname")
	private String lastName;
	
	
	private String country;
	
	private int age;
	
	@Column(name = "total_matches")
	private int totalODIMatches;
	
	public Player() {
		
	}
	
	public Player(String firstName, String lastName, String country,
			int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.age = age;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getTotalODIMatches() {
		return totalODIMatches;
	}


	public void setTotalODIMatches(int totalODIMatches) {
		this.totalODIMatches = totalODIMatches;
	}
	
}
