package com.hbn.learning;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee( "Ansh", "male", 99000);
		
		
		
		
		Session session = HibernateConfig.getSessionFactory() .openSession();

		Transaction transaction = session.beginTransaction();
		
		//  jab sare record database se lana ho to ye query chalate hai
		

//		Query query = session.createQuery("from empp", Employee.class);
//		List list = query.list();
//		System.out.println(list);
		
		
		// jar perticular kisi number se kise number ke record chahiye to ye method
		
		
//		Query query = session.createQuery("from empp", Employee.class);
//		query.setFirstResult(2);
//		query.setMaxResults(4);
//		List list = query.list();
//		System.out.println(list);
		
		
		
		
		
		//  kisi bhi data ko upadte karne ke liye ye query chlayenge
		
//		MutationQuery query = session.createMutationQuery("update empp set name = :n, salary = :s where id = :i");
//		
//		query.setParameter("n","vinod" );
//		query.setParameter("s", 4567437);
//		query.setParameter("i","5" );
//		query .executeUpdate();
//		 transaction.commit();
//		
//		
//		Query query1 = session.createQuery("from empp", Employee.class);
//	   List list = query1.list();
//	  System.out.println(list);
		
		
		
		
	//  kisi record ko delete karne ke liye ye query chalayenge	
		
		
		
//		MutationQuery query = session.createMutationQuery("delete from empp where id = :i");
//		query.setParameter("i",6 );
//		query .executeUpdate();
//		 transaction.commit();
//		
//		
//		Query query1 = session.createQuery("from empp", Employee.class);
//	   List list = query1.list();
//	  System.out.println(list);
		
		
		
		
		
		//   sari data ka sum karne ke liye ye query chalayenge
		
//		Query query1 = session.createQuery("SELECT SUM(salary) from empp");
//		  System.out.println(query1.list());
		
		
		
		
		
		Query query1 = session.createQuery("SELECT max(name) from empp");
		  System.out.println(query1.list());
	  
	 
	
	
		
		
		
		

	}

}