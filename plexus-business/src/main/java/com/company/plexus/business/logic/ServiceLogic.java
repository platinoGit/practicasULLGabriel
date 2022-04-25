package com.company.plexus.business.logic;

import org.apache.camel.Exchange;

import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.Service;
import java.util.ArrayList;
import java.util.Arrays;

//import java.lang.reflect.*;

import javax.jws.WebParam;

public class ServiceLogic {
	
	private Controller controller;
	
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
	
	public void createService(Service procedure, Exchange exchange) {
 		getController().createService(procedure, exchange);
	}
	
	public void updateService(String procedureId, Service newService, Exchange exchange) {
		getController().updateService(newService, exchange);
	}
	
	public void deleteService(String procedureId, Exchange exchange) {
		getController().deleteService(procedureId, exchange);
	}
	
	public Controller getController() {
		return this.controller;
	}
	
//	private Service convertObjectToService(Object[] object) {
//		Service service = new Service();
//		service.setId((String) object[0]);
//		service.setCode((int) object[1]);
//		service.setName((String) object[2]);
//		service.setSpecific_name((String) object[3]);
//		service.setDepartment((String) object[4]);
//		service.setResp_admin_uni((String) object[5]);
//		service.setRoute((String) object[6]);
//		service.setStart_of_procedure((String) object[7]);
//		service.setAmbit((String) object[8]);
//		service.setAdmin_level((String) object[9]);
//		service.setSia_code((String) object[10]);
//		service.setSia_update_date((String) object[11]);
//		service.setRelease_date((String) object[12]);
//		service.setLast_modification_date((String) object[13]);
//		service.setStart_date((String) object[14]);
//		service.setFinish_date((String) object[15]);
//		service.setRemarks((String) object[16]);
//		procedure.setFamily((String) object[17]);
//		
//		return procedure;
//	}
//	
//	private Service[] convertObjectArrayToServiceArray(ArrayList<Object[]> objects) {
//		ArrayList<Service> proceduresResultArray = new ArrayList<Service>();
//		for (Object[] procedure : objects) {
//			 Service newService = convertObjectToService(procedure);
//			 proceduresResultArray.add(newService);
//		}
//		return proceduresResultArray.toArray(new Service[0]);
//	}
}
