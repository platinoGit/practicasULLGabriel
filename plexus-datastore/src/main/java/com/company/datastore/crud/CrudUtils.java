package com.company.datastore.crud;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.plexus.utils.Procedure;
import com.company.plexus.utils.Service;

import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Exchange;

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
	
	public <T> ArrayList<T> select(Class classType, ArrayList<String> fields, ArrayList<String> matching, String table, Exchange exchange) {
		String queryString = "SELECT * FROM" + table;
		if (fields.size() > 0) {
			queryString += "WHERE " + fields.get(0) + "=" + matching.get(0);
		}
		for (int i = 1; i < fields.size(); i++) {
			queryString += "AND " + fields.get(i) + "=" + matching.get(i);
		}
		queryString += ";";
		Query<T> query = session.createQuery(queryString, classType);
		return new ArrayList<T>(query.list());
	}
	
	public <T> void create(T object, Exchange exchange) {
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
	}
	
	public <T> void update(String Id, T newObject, Exchange exchange) {
		session.beginTransaction();
		session.saveOrUpdate(newObject);
		session.getTransaction().commit();
	}
	
	public <T> void delete(String table, String Id, Exchange exchange) {
		session.beginTransaction();
		Query query = session.createQuery("DELETE FROM :table WHERE ID=:id")
				.setParameter("table", table)
				.setParameter("id", Id);
		session.getTransaction().commit();
	}
}
