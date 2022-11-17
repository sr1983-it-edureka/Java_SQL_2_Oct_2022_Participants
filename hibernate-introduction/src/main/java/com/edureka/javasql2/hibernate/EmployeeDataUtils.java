package com.edureka.javasql2.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmployeeDataUtils {

	public static void main(String[] args) {
		
//		createEmployees();
//		retrieveEmployees();
//		updateEmployee();
		deleteEmployee();
	}
	
	
	static void createEmployees() {
		
		
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();
			
			for (int index = 1; index <= 10; index ++) {
				
				Employee employee = new Employee(
					"FN -" + index , "LN - " + index, 20 + index, "employee" + index + "@gmail.com");
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

	static void retrieveEmployees() {
		
	
		Transaction transaction = null;
		Session session = null;
		try {
			
			session = HibernateUtils.createSession();
			
			transaction = session.beginTransaction();
			
			String hqlSelect = "from jEmployee";
			
			List<Employee> employees = session.createQuery(hqlSelect, Employee.class).list();
			for (Employee  employee : employees) {
				employee.display();
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
			Employee empObj = session.get(Employee.class, id);
			
			empObj.setFirstName("Krishna");
			empObj.setLastName("Kumar");
			
			session.saveOrUpdate(empObj);
			
			
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

			Long id = 4L;
			Employee empObj = session.get(Employee.class, id);
						
			session.delete(empObj);			
			
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
