package com.edureka.javasql2.hibernate.inheritance.type1;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edureka.javasql2.hibernate.HibernateUtils;

public class Type1InheritanceDemo {

	public static void main(String[] args) {
		
		insertRecords();
	}
	
	static void insertRecords() {
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();			
			transaction = session.beginTransaction();
			
			Person deepak = new Person("Deepak", 40);
			session.save(deepak);
			
			Person vasanth = new Person("Vasanth", 33);
			session.save(vasanth);
			
			Person meena = new Person("Meena", 35);
			session.save(meena);
			
			Student rahul = new Student("Rahul", 17, "Computer Science", 12345);
			session.save(rahul);
			
			Student deepika = new Student("Deepika", 17, "IT", 23456);
			session.save(deepika);
			
			Professor vidhya = new Professor("Vidhya", 45, "FULL-TIME", "10 AM till 4 PM");
			session.save(vidhya);
			
			Professor kaushik = new Professor("Kaushik", 44, "PART-TIME", "11 AM till 2 PM");
			session.save(kaushik);			
			
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
