package com.company.plexus.business.daoImpl;

import org.qlrm.mapper.JpaResultMapper;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import org.apache.camel.Exchange;
import com.company.plexus.business.entity.ServiceEntity;
import com.company.plexus.business.dao.ServiceDao;

public class ServiceDaoImpl extends GenericDaoImpl implements ServiceDao {
	private EntityManager entityManager;
	
	public ServiceDaoImpl() {
		super();
	}
	
	@Override
	public ArrayList<ServiceEntity> selectByAdminUnity(String admin_unity, Exchange exchange) {
		JpaResultMapper jpaResultMapper = new JpaResultMapper();
		javax.persistence.Query q = entityManager.createQuery("SELECT * FROM SERVICE WHERE ADMIN_UNITY=:admin_unity");
		q.setParameter("RESP_ADMIN_UNITY", admin_unity);
		return new ArrayList<ServiceEntity>(jpaResultMapper.list(q, ServiceEntity.class));
	}
	
	@Override
	public ArrayList<ServiceEntity> selectByAdminLevel(String admin_level, Exchange exchange) {
		JpaResultMapper jpaResultMapper = new JpaResultMapper();
		javax.persistence.Query q = entityManager.createQuery("SELECT * FROM SERVICE WHERE ADMIN_LEVEL=:admin_level");
		q.setParameter("ADMIN_LEVEL", admin_level);
		return new ArrayList<ServiceEntity>(jpaResultMapper.list(q, ServiceEntity.class));
	}
	
}
