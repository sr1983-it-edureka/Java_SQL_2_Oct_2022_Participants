package com.edureka.javasql2.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToOneDemo {

	public static void main(String[] args) {
		
//		insertEmployees();
//		queryEmployees();	
//		updateEmployee();
		deleteEmployee();
	}
	
	static void insertEmployees() {
		
		
		Address address1 = new Address("Indra Nagar", "Bangalore", "Karnataka", 
				"India", 560080);
		Address address2 = new Address("Ashok Nagar", "Chennai", "TamilNadu", 
				"India", 600023);
		Address address3 = new Address("Thane", "Mumbai", "Maharastra", 
				"India", 123456);
		Address address4 = new Address("Ashoka Park", "Delhi", "Delhi", 
				"India", 110010);
				

		ArrayList<Address> addresses = new ArrayList<>();
		addresses.add(address1);		
		addresses.add(address2);
		addresses.add(address3);
		addresses.add(address4);
		
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();
			
			Random random = new Random();
			
			for (int index = 1; index <= 25; index ++) {

				String firstName = "E - FN - " + index;
				String lastName = "E - LN - " + index;
				int age = 30 + index;
				String email = "employee" + index + "@gmail.com";
				
				Employee employee = new Employee(firstName, lastName, age, email);
				
				//[0, 1, 2, 3]
				int randomIndex = random.nextInt(addresses.size());
				Address address = addresses.get(randomIndex);				
				employee.setAddress(address);
				
				session.save(employee);
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
	
	
	static void queryEmployees() {
				
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();

			String selectQuery = "from jEmployee";
			
			List<Employee> employees 
				= session.createQuery(selectQuery, Employee.class).list();
			
			for (int index = 0; index < employees.size(); index ++) {

				Employee employee = employees.get(index);
				Address address = employee.getAddress();	
				
				System.out.println(employee);
				System.out.println(address);
				System.out.println();
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
	

	static void updateEmployee() {
				
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();

			Long id = 7L;
			Employee employeeObj = session.get(Employee.class, id);
			
			employeeObj.setFirstName("Rajesh");
			employeeObj.setEmailId("rajesh@gmail.com");
			employeeObj.setAge(20);
			
			Address addressObj = employeeObj.getAddress();
			addressObj.setCity("Pune");
			
			session.saveOrUpdate(employeeObj);
						
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
	
	
	static void deleteEmployee() {
				
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();

			Long id = 8L;
			Employee employeeObj = session.get(Employee.class, id);
			session.delete(employeeObj);
									
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
