package com.edureka.javasql2.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToOneDemo {

	public static void main(String[] args) {
		
		createEmployeeAndAddress();
		
	}
	
	static void createEmployeeAndAddress() {
		
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();
			
			Employee punith = new Employee("Punith", "Punith", 22, "punith@gmail.com");
			Address punithAddress = new Address("Indra Nagar", "Bangalore", "Karnataka", 
					"India", 560080);
			
			punith.setAddress(punithAddress);
			
			session.save(punith);
			
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
