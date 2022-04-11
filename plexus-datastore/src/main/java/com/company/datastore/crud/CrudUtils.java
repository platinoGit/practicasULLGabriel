package com.company.datastore.crud;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudUtils {
	private Session session;
	public CrudUtils () {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}
	@Override
	protected void finalize() {
		session.close();
	}
}
