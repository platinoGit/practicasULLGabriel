package com.company.plexus.business.dao;


import java.util.ArrayList;
import org.apache.camel.Exchange;

import com.company.plexus.business.entity.ServiceEntity;

public interface GenericDao {
	public <T> boolean create(T object, Exchange exchange) throws Exception;
	public <T> void update(T newObject, Exchange exchange);
	public <T> void delete(String table, String Id, Exchange exchange);
}
