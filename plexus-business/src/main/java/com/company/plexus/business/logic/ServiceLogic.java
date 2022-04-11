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
	//private dataBase;
	
	public Service selectServiceByAdminUnity(AdminUnity administrativeUnity, Exchange exchange) {
		 ArrayList<String> fields = new ArrayList<String>(Arrays.asList("resp_admin_uni"));
		 ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(administrativeUnity.label));
		return dataBase.select(fields, matchings, exchange);
	}
	
	public Service selectServiceByDepartment(Department department, Exchange exchange) {
		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("department"));
		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(department.label));
		return dataBase.select(fields, matchings, exchange);
	}
	
	public Service selectServiceByByAdminLevel(String level, Exchange exchange) {
		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("admin_level"));
		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(level));
		return dataBase.select(fields, matchings, exchange);
	}
	
	public void createService(Service service, Exchange exchange) {
		database.create(service, exchange);
	}
	
	public void updateService(String serviceId, Service newService, Exchange exchange) {
		database.update(serviceId, newService, exchange);
	}
	
	public void deleteService(String serviceId, Exchange exchange) {
		database.delete(serviceId, exchange);
	}
}
