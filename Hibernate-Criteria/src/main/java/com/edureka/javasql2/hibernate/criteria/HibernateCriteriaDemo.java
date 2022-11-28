package com.edureka.javasql2.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.edureka.javasql2.hibernate.HibernateUtils;

public class HibernateCriteriaDemo {

	public static void main(String[] args) {
		
		/*
		 * select * from employee
		 * where sal > 10000 and (deptno = 10 || mgr_id = 100)
		 */
		
		Session session = null;
		
		try {
			session = HibernateUtils.createSession();

			
//			demo1(session);
//			demo2(session);
//			demo3(session);
//			demo4(session);
//			demo5(session);
			demo6(session);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if (session != null) {
				session.close();
			}
		}
		
		
	}
	
	static void demo1(Session session) {
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		List<Employee> employees = cr.list();
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	static void demo2(Session session) {
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		cr.add(Restrictions.eq("salary", 80000));
		
		List<Employee> employees = cr.list();
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	
	static void demo3(Session session) {
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		cr.add(Restrictions.like("name", "J%"));
		
		List<Employee> employees = cr.list();
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	static void demo4(Session session) {
		
		Criteria cr 
			= session.createCriteria(Employee.class);
		
		cr.add(Restrictions.between("salary", 
			80000, 120000));
		
		List<Employee> employees = cr.list();
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	
	static void demo5(Session session) {
		
		// where (job == ? AND salary > ?)
		Criteria cr 
			= session.createCriteria(Employee.class);

		Criterion jobCriterion 
			= Restrictions.eq("job", "MANAGER");
		
		Criterion salaryCriterion 
			= Restrictions.ge("salary", 160000);
		
		LogicalExpression andExpression 
			= Restrictions.and(jobCriterion, salaryCriterion);
		
		cr.add(andExpression);
		
		List<Employee> employees = cr.list();
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
	
	
	static void demo6(Session session) {
		
		// where (job == ? AND salary > ?)
		Criteria cr 
			= session.createCriteria(Employee.class);

		Criterion jobCriterion 
			= Restrictions.eq("job", "CLERK");
		
		Criterion salaryCriterion 
			= Restrictions.eq("salary", 80000);
		
		LogicalExpression andExpression 
			= Restrictions.and(jobCriterion, salaryCriterion);
		
		cr.add(andExpression);
		
		Order empNameDescOrder = Order.desc("name");
		cr.addOrder(empNameDescOrder);
		
		List<Employee> employees = cr.list();
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}	
}
