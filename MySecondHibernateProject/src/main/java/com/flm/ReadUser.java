package com.flm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadUser {

	public static void main(String[] args) {

		SessionFactory sessionFactory1 = HibernateUtils.buildSessionFactoryObject();

		SessionFactory sessionFactory2 = HibernateUtils.buildSessionFactoryObject();

		System.out.println(sessionFactory1+"==="+sessionFactory2);
		
		// S-3 : session object - to persist in db
		Session session = sessionFactory1.openSession();
		System.out.println("session created !!");
		
//		User user = session.get(User.class, 144);
//		User user = session.load(User.class, 144);
//		System.out.println(user);


	}

}
