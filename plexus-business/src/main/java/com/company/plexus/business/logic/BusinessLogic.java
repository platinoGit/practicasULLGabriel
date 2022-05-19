package com.company.plexus.business.logic;

import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.Procedure;
import com.company.plexus.utils.Service;

import org.apache.camel.Exchange;

public class BusinessLogic {

	private ServiceLogic serviceLogic;
	
	public BusinessLogic() {
		serviceLogic = new ServiceLogic();
	}
	//private ProcedureLogic procedure;
	
//	public Service[] selectServiceByAdminUnity(AdminUnity administrativeUnity, Exchange exchange) {
//		return getService().selectServiceByAdminUnity(administrativeUnity, exchange);
//	}
//	
//	public Service[] selectServiceByDeparment(Department department, Exchange exchange) {
//		return getService().selectServiceByDepartment(department, exchange);
//	}
	
//	public Service[] selectServiceByByAdminLevel(String level, Exchange exchange) {
//		return getService().selectServiceByByAdminLevel(level, exchange);
//	}
//	
//	public Procedure[] selectProcedureByAdminUnity(AdminUnity administrativeUnity, Exchange exchange) {
//		return getProcedure().selectProcedureByAdminUnity(administrativeUnity, exchange);
//	}
//	
//	public Procedure[] selectProcedureByDepartment(Department department, Exchange exchange) {
//		return getProcedure().selectProcedureByDepartment(department, exchange);
//	}
//	
//	public Procedure[] selectProcedureByByAdminLevel(String level, Exchange exchange) {
//		return getProcedure().selectProcedureByByAdminLevel(level, exchange);
//	}
//	
//	public void createProcedure(Procedure procedure, Exchange exchange) {
//		getProcedure().createProcedure(procedure, exchange);
//	}
//	
//	public void updateProcedure(String procedureId, Procedure newProcedure, Exchange exchange) {
//		getProcedure().updateProcedure(procedureId, newProcedure, exchange);
//	}
//	
//	public void deleteProcedure(String procedureId, Exchange exchange) {
//		getProcedure().deleteProcedure(procedureId, exchange);
//	}
	
	public Boolean createService(Service service, Exchange exchange) {
		return getService().createService(service, exchange);
	}
	
	public Boolean updateService(Service newService, Exchange exchange) {
		return getService().updateService(newService, exchange);
	}
	
	public void deleteService(String table, int serviceId, Exchange exchange) {
		getService().deleteService(table, serviceId, exchange);
	}
	
	public ServiceLogic getService() {
		return serviceLogic;
	}
//
//	public ProcedureLogic getProcedure() {
//		return procedure;
//	}
}
