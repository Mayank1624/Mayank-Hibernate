package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee( "Mukul", "male", 79000);
	
		
		Session session = HibernateConfig.getSessionFactory() .openSession();

		Transaction transaction = session.beginTransaction();

//		session.persist(emp);
//		transaction.commit();
		
		
//		Employee employee = session.find(Employee.class, 5);
//		System.out.println(employee);
		
		
		
//		session.load(emp, 1);
//		System.out.println(emp);
		
		
		
//		Employee employee = session.find(Employee.class, 35);
//	System.out.println(employee);
		
		
//		session.load(emp, 35);
//		System.out.println(emp);
		
		
		
		// find aur load me differenceagar hum find se vo data mangenge jo databas me nhi hai jaise 23 id nhi hai agar hum id ki jagah 23 rakhte hai to ye null vapas karega aur load error dega dono me yhi difference hai
		

	}

}

