package com.company.plexus.business.logic;

import org.apache.camel.Exchange;

import com.company.plexus.utils.Service;

//import java.lang.reflect.*;

public class ServiceLogic {
	
	private Controller controller;
	
	public ServiceLogic() {
		controller = new Controller();
	}

	public Service[] selectServiceByByAdminUnity(String admin_unity, Exchange exchange) {
		return getController().selectServiceByAdminUnity(admin_unity, exchange);
	}
	
//	public Service[] selectServiceByDepartment(Department department, Exchange exchange) {
//		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("department"));
//		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(department.label));
//		ArrayList<Object[]> objects = crud.select(Service.class, fields, matchings, "PROCEDURE", exchange);
//		
//		return objects.toArray(new Service[0]);
//	}
	
	public Service[] selectServiceByByAdminLevel(String level, Exchange exchange) {
		return getController().selectServiceByAdminLevel(level, exchange);
	}
	
	public Boolean createService(Service service, Exchange exchange) {
 		return getController().createService(service, exchange);
	}
	
	public Boolean updateService(Service newService, Exchange exchange) {
		return getController().updateService(newService, exchange);
	}
	
	public Boolean deleteService(String table, int serviceId, Exchange exchange) {
		return getController().deleteService(table, serviceId, exchange);
	}
	
	public Controller getController() {
		return this.controller;
	}
	
//	private Service[] convertObjectArrayToServiceArray(ArrayList<Object[]> objects) {
//		ArrayList<Service> proceduresResultArray = new ArrayList<Service>();
//		for (Object[] procedure : objects) {
//			 Service newService = convertObjectToService(procedure);
//			 proceduresResultArray.add(newService);
//		}
//		return proceduresResultArray.toArray(new Service[0]);
//	}
}
