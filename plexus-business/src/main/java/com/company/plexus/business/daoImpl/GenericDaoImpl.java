package com.company.plexus.business.daoImpl;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.company.plexus.business.dao.GenericDao;

public class GenericDaoImpl implements GenericDao {
	
	EntityManager entityManager;
	
	public GenericDaoImpl() {
		entityManager = Persistence.createEntityManagerFactory("entityManager").createEntityManager();
	}
	@Override
	public <T> void create(T object, Exchange exchange) {
		entityManager.getTransaction().begin();
		entityManager.persist(object);
		entityManager.flush();
	}
	
	@Override
	public <T> void update(T newObject, Exchange exchange) {
		entityManager.getTransaction().begin();
		entityManager.merge(newObject);
		entityManager.flush();
	}
	
	@Override
	public <T> void delete(String table, String id, Exchange exchange) {
		javax.persistence.Query q = entityManager.createQuery("Delete from " + table + " where id = :id");
		q.setParameter("id", id);
		entityManager.flush();
	}
}
