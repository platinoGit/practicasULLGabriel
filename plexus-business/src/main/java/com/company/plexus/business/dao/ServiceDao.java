package com.company.plexus.business.dao;

import java.util.ArrayList;

import org.apache.camel.Exchange;

import com.company.plexus.business.entity.ServiceEntity;

public interface ServiceDao extends GenericDao {
	public ArrayList<ServiceEntity> selectByAdminUnity(String admin_unity, Exchange exchange);
	public ArrayList<ServiceEntity> selectByAdminLevel(String level, Exchange exchange);
}
