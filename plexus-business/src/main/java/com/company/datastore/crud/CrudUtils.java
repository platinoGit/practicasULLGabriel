package com.company.datastore.crud;

//import org.hibernate.Session;
//import org.hibernate.query.Query;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

import org.qlrm.mapper.JpaResultMapper;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import java.util.ArrayList;
import org.apache.camel.Exchange;

import com.company.plexus.business.entity.ServiceEntity;

public class CrudUtils {
	private EntityManager entityManager;
	
	public CrudUtils() {
		entityManager = Persistence.createEntityManagerFactory("entityManager").createEntityManager();
	}
	
	@Override
	protected void finalize() {
		entityManager.close();
	}
	
	public <T> ArrayList<ServiceEntity> selectServiceByAdminLevel(String admin_level, Exchange exchange) {
		JpaResultMapper jpaResultMapper = new JpaResultMapper();
		javax.persistence.Query q = entityManager.createQuery("SELECT * FROM SERVICE WHERE ADMIN_LEVEL=:admin_level");
		q.setParameter("ADMIN_UNITY", admin_level);
		return new ArrayList<ServiceEntity>(jpaResultMapper.list(q, ServiceEntity.class));
	}
	
	public <T> void create(T object, Exchange exchange) {
		entityManager.getTransaction().begin();
		entityManager.persist(object);
		entityManager.flush();
	}
	
	public <T> void update(T newObject, Exchange exchange) {
		entityManager.getTransaction().begin();
		entityManager.merge(newObject);
		entityManager.flush();
	}
	
	public <T> void delete(String table, String id, Exchange exchange) {
		
		javax.persistence.Query q = entityManager.createQuery("Delete from " + table + " where id = :id");
		q.setParameter("id", id);
		entityManager.flush();
	}
}


















//
//public <T> ArrayList<T> select(Class classType, String admin_unity, String table, Exchange exchange) {
////	String queryString = "SELECT * FROM" + table;
////	if (fields.size() > 0) {
////		queryString += "WHERE " + fields.get(0) + "=" + matching.get(0);
////	}
////	for (int i = 1; i < fields.size(); i++) {
////		queryString += "AND " + fields.get(i) + "=" + matching.get(i);
////	}
////	queryString += ";";
//	javax.persistence.Query q = entityManager.createQuery("SELECT * FROM "+ table +"WHERE ADMIN_UNITY=:admin_unity", classType);
//	q.setParameter("ADMIN_UNITY", admin_unity);
//	return new ArrayList<T>(q.getResultList());
//}
