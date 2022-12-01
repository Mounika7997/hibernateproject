package com.flm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveUserApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.buildSessionFactoryObject();

		// S-3 : session object - to persist in db
		Session session = sessionFactory.openSession();

		System.out.println("session created !!");
		User u1 = new User();
		u1.setName("Siva");
		u1.setMarks(97);
		session.beginTransaction();

		session.save(u1);

		session.getTransaction().commit();

		System.out.println("Saved!!");

	}

}
