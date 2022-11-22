package com.edureka.javasql2.hibernate;

import java.sql.Array;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToManyDemo {

	public static void main(String[] args) {
		
		insertRecords();
	}
	
	static void insertRecords() {
		
		
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();
			
			ArrayList<Question> questions = createQAndA();
			
			for (Question question : questions) {
				session.save(question);				
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
	
	static ArrayList<Question> createQAndA() {
		
		ArrayList<Question> questions = new ArrayList();
		
		// 1
		{
			Question q1 = new Question("What is SQL?");
			
			Answer a1 = new Answer("SQL stands for Structured Query Language");
			Answer a2 = new Answer("SQL can be used to retrieve data from database");
			
			ArrayList<Answer> answers = new ArrayList();
			answers.add(a1); answers.add(a2);
			
			q1.setAnswers(answers);	
			
			questions.add(q1);
		}		
		
		// 2
		{
			Question q1 = new Question("What is Java?");
			
			Answer a1 = new Answer("Java is an OOP language");
			Answer a2 = new Answer("Java can also be used to develope mobile and web based applications");
			Answer a3 = new Answer("There is so much community support available for Java");
			
			
			ArrayList<Answer> answers = new ArrayList();
			answers.add(a1); answers.add(a2);answers.add(a3);
			
			q1.setAnswers(answers);	
			
			questions.add(q1);
			
		}
		
		
		// 3
		{
			Question q1 = new Question("What are the advantages of Microservices?");
			
			Answer a1 = new Answer("MS can be used to develop distributed applications");
			Answer a2 = new Answer("It is possible to convert Monolithic applications to MS based applications very easily");
			Answer a3 = new Answer("MS provides integration support for a long listing of patterns");
			Answer a4 = new Answer("Spring Boot and Microservvices integration is now possible.");
			
			
			ArrayList<Answer> answers = new ArrayList();
			answers.add(a1); answers.add(a2);answers.add(a3);
			answers.add(a4);
			
			q1.setAnswers(answers);	
			
			questions.add(q1);
			
		}	
		
		return questions;
	}
}
