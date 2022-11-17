package com.edureka.javasql2.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 
public class HibernateUtils {

	static Session createSession() {
		
		StandardServiceRegistry registry = 
				new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources sources = new MetadataSources(registry);
		
		Metadata metadata = sources.getMetadataBuilder().build();
		
		
		SessionFactory sessionFactory = 
			metadata.getSessionFactoryBuilder().build();
		
		Session session = sessionFactory.openSession();
		
		return session;
	}
}
