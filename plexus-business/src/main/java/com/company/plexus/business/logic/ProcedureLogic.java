//package com.company.plexus.business.logic;
//
//import org.apache.camel.Exchange;
//
//import com.company.plexus.business.logic.Controller;
//import com.company.plexus.utils.AdminUnity;
//import com.company.plexus.utils.Department;
//import com.company.plexus.utils.Procedure;
//import java.util.ArrayList;
//import java.util.Arrays;
//import com.company.datastore.crud.CrudUtils;
//
//public class ProcedureLogic {
//	private Controller controller;
//	
//	public Procedure[] selectProcedureByAdminUnity(AdminUnity administrativeUnity, Exchange exchange) {
//		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("resp_admin_uni"));
//		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(administrativeUnity.label));
//		ArrayList<Procedure> objects = crud.select(Procedure.class, fields, matchings, "PROCEDURE", exchange);
//		 
//		return objects.toArray(new Procedure[0]);
//	}
//	
//	public Procedure[] selectProcedureByDepartment(Department department, Exchange exchange) {
//		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("department"));
//		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(department.label));
//		ArrayList<Object[]> objects = crud.select(Procedure.class, fields, matchings, "PROCEDURE", exchange);
//		
//		return objects.toArray(new Procedure[0]);
//	}
//	
//	public Procedure[] selectProcedureByByAdminLevel(String level, Exchange exchange) {
////		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("admin_level"));
////		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(level));
////		ArrayList<Object[]> objects = crud.select(Procedure.class, fields, matchings, "PROCEDURE", exchange);
////		return objects.toArray(new Procedure[0]);
//		return getController().selectProcedureByAdminLevel(level, exchange);
//	}
//	
//	public void createProcedure(Procedure procedure, Exchange exchange) {
// 		getController().createProcedure(procedure, exchange);
//	}
//	
//	public void updateProcedure(String procedureId, Procedure newProcedure, Exchange exchange) {
//		getController().updateProcedure(newProcedure, exchange);
//	}
//	
//	public void deleteProcedure(String procedureId, Exchange exchange) {
//		getController().deleteAction("PROCEDURE", procedureId, exchange);
//	}
//	
//	public Controller getController() {
//		return this.controller;
//	}
	
//	private Procedure convertObjectToProcedure(Object[] object) {
//		Procedure procedure = new Procedure();
//		procedure.setId((String) object[0]);
//		procedure.setCode((int) object[1]);
//		procedure.setName((String) object[2]);
//		procedure.setSpecific_name((String) object[3]);
//		procedure.setDepartment((String) object[4]);
//		procedure.setResp_admin_uni((String) object[5]);
//		procedure.setRoute((String) object[6]);
//		procedure.setStart_of_procedure((String) object[7]);
//		procedure.setAmbit((String) object[8]);
//		procedure.setAdmin_level((String) object[9]);
//		procedure.setSia_code((String) object[10]);
//		procedure.setSia_update_date((String) object[11]);
//		procedure.setRelease_date((String) object[12]);
//		procedure.setLast_modification_date((String) object[13]);
//		procedure.setStart_date((String) object[14]);
//		procedure.setFinish_date((String) object[15]);
//		procedure.setRemarks((String) object[16]);
//		procedure.setProcedure_type((String) object[17]);
//		procedure.setFamily((String) object[18]);
//		
//		return procedure;
//	}
	
//	private Procedure[] convertObjectArrayToProcedureArray(ArrayList<Object[]> objects) {
//		ArrayList<Procedure> proceduresResultArray = new ArrayList<Procedure>();
//		for (Object[] procedure : objects) {
//			 Procedure newProcedure = convertObjectToProcedure(procedure);
//			 proceduresResultArray.add(newProcedure);
//		}
//		return proceduresResultArray.toArray(new Procedure[0]);
//	}
//	
//	private Object[] convertProcedureToObject(Procedure procedure) {
//		Object[] procedureObject = {
//				procedure.getId(),
//				procedure.getCode(),
//				procedure.getName(),
//				procedure.getSpecific_name(),
//				procedure.getDepartment(),
//				procedure.getResp_admin_uni(),
//				procedure.getRoute(),
//				procedure.getStart_of_procedure(),
//				procedure.getAmbit(),
//				procedure.getAdmin_level(),
//				procedure.getSia_code(),
//				procedure.getSia_update_date(),
//				procedure.getRelease_date(),
//				procedure.getLast_modification_date(),
//				procedure.getStart_date(),
//				procedure.getFinish_date(),
//				procedure.getRemarks(),
//				procedure.getProcedure_type(),
//				procedure.getFamily()
//		};
//		return procedureObject;
//	}
//}
