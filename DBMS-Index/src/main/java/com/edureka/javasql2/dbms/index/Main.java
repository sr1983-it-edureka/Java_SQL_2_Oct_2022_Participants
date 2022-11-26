package com.edureka.javasql2.dbms.index;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql2.hibernate.Employee;
import com.edureka.javasql2.hibernate.HibernateUtils;

public class Main {

	
	public static void main(String[] args) {
		
//		insertRecords();
		
		updateTotalMatches();
	}
	
	static void insertRecords() {
		
		ArrayList<String> countries = new ArrayList();
		countries.add("India");		
		countries.add("Sri Lanka");
		countries.add("South Africa");
		countries.add("New Zealand");
		countries.add("West Indies");
		countries.add("Pakistan");

		
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();
			
			Random random = new Random();
			
			for (int index = 1; index <= 250; index ++) {

				String firstName = "P - FN - " + index;
				String lastName = "P - LN - " + index;
				int age = 30 + index;

				int randomCountryIndex = random.nextInt(countries.size());
				String country = countries.get(randomCountryIndex);
				
				Player player = new Player(firstName, lastName, country, age);				
				session.save(player);
			}
						
			transaction.commit();			
		}catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();				
			}
		}finally {
			if (session != null) {
				session.close();				
			}
		}		
	}	
	
	
	static void updateTotalMatches() {
		
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();
			
			Random random = new Random();
			
			String query = "from player";
			
			List<Player> allPlayers 
				= session.createQuery(query, Player.class).list();			
			
			for (int index = 0; index < allPlayers.size(); index ++) {

				Player playerObj = allPlayers.get(index);
				
				int totalODIMatches = random.nextInt(500);
				playerObj.setTotalODIMatches(totalODIMatches);
				
				session.saveOrUpdate(playerObj);
			}
						
			transaction.commit();	
		}catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();				
			}
		}finally {
			if (session != null) {
				session.close();				
			}
		}		
	}		
}
