package com.flm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateUser {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.buildSessionFactoryObject();

		// S-3 : session object - to persist in db
		if(sessionFactory != null) {
		Session session = sessionFactory.openSession();
		System.out.println("session created !!");
		session.beginTransaction();
		User user = session.load(User.class, 1);
		user.setName("Welcome");
		session.update(user);
		session.getTransaction().commit();
		}
		else {
			System.out.println("SF is null");
		}

	}

	
}
