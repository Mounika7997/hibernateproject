package com.flm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteUser {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.buildSessionFactoryObject();

		// S-3 : session object - to persist in db
		Session session = sessionFactory.openSession();
		System.out.println("session created !!");
		session.beginTransaction();
		session.delete(new User(144,"Fayaz",99.99));
		session.getTransaction().commit();

	}

}
