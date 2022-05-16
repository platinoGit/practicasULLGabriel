package com.company.plexus.business.daoImpl;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.company.plexus.business.dao.GenericDao;

public class GenericDaoImpl implements GenericDao {
	
	EntityManager entityManager;
	
	public GenericDaoImpl() {
		super();
		entityManager = Persistence.createEntityManagerFactory("dataSourceManager").createEntityManager();
	}
	
	@Override
	public <T> boolean create(T object, Exchange exchange) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(object);
			entityManager.flush();
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public <T> boolean update(T newObject, Exchange exchange) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(newObject);
			entityManager.flush();
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public <T> boolean delete(String table, int id, Exchange exchange) {
		try {
			javax.persistence.Query q = entityManager.createQuery("Delete from " + table + " where CODE = :id");
			q.setParameter("id", id);
			entityManager.flush();
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
}
