package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee( "Ansh", "male", 99000);

//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//
//		Transaction transaction = session.beginTransaction();
//
//		session.persist(emp);
//		transaction.commit();
		
		
		
		//or
		
		
		
		
		Session session = HibernateConfig.getSessionFactory() .openSession();

		Transaction transaction = session.beginTransaction();

	
		transaction.commit();

	}

}
