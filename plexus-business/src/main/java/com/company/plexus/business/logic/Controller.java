package com.company.plexus.business.logic;

import org.apache.camel.Exchange;
import org.mapstruct.factory.Mappers;
import org.springframework.transaction.annotation.Transactional;

import com.company.plexus.business.mappers.*;
import com.company.plexus.business.daoImpl.ServiceDaoImpl;
import com.company.plexus.business.entity.*;
import com.company.plexus.utils.*;

import java.util.List;

public class Controller {
	private ServiceDaoImpl serviceDaoImpl;
	
	@Transactional
	public Boolean createService(Service service, Exchange exchange) {
		try {
			ServiceEntity pEntity = Mappers.getMapper(ServiceMapper.class).serviceToEntity(service);
			serviceDaoImpl.create(pEntity, exchange);
			return true;
		} catch (Exception e) {
			System.out.print(e);
			return false;
		}
	}
	
	@Transactional
	public Boolean updateService(Service newService, Exchange exchange) {
		try {
			ServiceEntity newServiceEntity = Mappers.getMapper(ServiceMapper.class).serviceToEntity(newService);
			serviceDaoImpl.update(newServiceEntity, exchange);			
			return true;
		} catch (Exception e) {
			System.out.print(e);
			return false;
		}
	}
	
	@Transactional
	public Boolean deleteService(String table, int actionId, Exchange exchange) {
		try {
			serviceDaoImpl.delete("SERVICES", actionId, exchange);
			return true;
		} catch (Exception e) {
			System.out.print(e);
			return false;
		}
	}
	
	@Transactional
	public Service[] selectServiceByAdminUnity(String admin_unity, Exchange exchange) {
		List<ServiceEntity> list = serviceDaoImpl.selectByAdminUnity(admin_unity, exchange);
		Service[] serviceArray = new Service[list.size()];
		for (int i = 0; i < list.size(); i++) {
			serviceArray[i] = Mappers.getMapper(ServiceMapper.class).entityToService(list.get(i));
			System.out.println(serviceArray[i].getId());
		}
		return serviceArray;
	}
	
	@Transactional
	public Service[] selectServiceByAdminLevel(String level, Exchange exchange) {
		List<ServiceEntity> list = serviceDaoImpl.selectByAdminLevel(level, exchange);
		Service[] serviceArray = new Service[list.size()];
		for (int i = 0; i < list.size(); i++) {
			serviceArray[i] = Mappers.getMapper(ServiceMapper.class).entityToService(list.get(i));
		}
		return serviceArray;
	}
	
	public void setServiceDaoImpl(ServiceDaoImpl inputServiceDaoImpl) {
		serviceDaoImpl = inputServiceDaoImpl;
	}
}
