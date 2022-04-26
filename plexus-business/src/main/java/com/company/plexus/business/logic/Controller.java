package com.company.plexus.business.logic;

import org.apache.camel.Exchange;
import org.mapstruct.factory.Mappers;

import com.company.plexus.business.mappers.*;
import com.company.plexus.business.daoImpl.ServiceDaoImpl;
import com.company.plexus.business.entity.*;
import com.company.plexus.utils.*;

import java.util.List;

public class Controller {
	ServiceDaoImpl serviceDaoImpl;
	
	public void createService(Service service, Exchange exchange) {
		ServiceEntity pEntity = Mappers.getMapper(ServiceMapper.class).serviceToEntity(service);
		serviceDaoImpl.create(pEntity, exchange);
	}
	
	public void updateService(Service newService, Exchange exchange) {
		ServiceEntity newServiceEntity = Mappers.getMapper(ServiceMapper.class).serviceToEntity(newService);
		serviceDaoImpl.update(newServiceEntity, exchange);
	}
	
	public void deleteService(String actionId, Exchange exchange) {
		serviceDaoImpl.delete("PROCEDURE", actionId, exchange);
	}
	
	public Service[] selectServiceByAdminUnity(String admin_unity, Exchange exchange) {
		List<ServiceEntity> list = serviceDaoImpl.selectByAdminLevel(admin_unity, exchange);
		Service[] serviceArray = new Service[list.size()];
		for (int i = 0; i < list.size(); i++) {
			serviceArray[i] = Mappers.getMapper(ServiceMapper.class).entityToService(list.get(i));
		}
		return serviceArray;
	}
	
	public Service[] selectServiceByAdminLevel(String level, Exchange exchange) {
		List<ServiceEntity> list = serviceDaoImpl.selectByAdminLevel(level, exchange);
		Service[] serviceArray = new Service[list.size()];
		for (int i = 0; i < list.size(); i++) {
			serviceArray[i] = Mappers.getMapper(ServiceMapper.class).entityToService(list.get(i));
		}
		return serviceArray;
	}
}