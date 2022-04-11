package com.company.plexus.business.logic;

import org.apache.camel.Exchange;

import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.Procedure;
import java.util.ArrayList;
import java.util.Arrays;

//import java.lang.reflect.*;

import javax.jws.WebParam;

public class ProcedureLogic {
	//private dataBase;
	
	public Procedure selectProcedureByAdminUnity(AdminUnity administrativeUnity, Exchange exchange) {
		 ArrayList<String> fields = new ArrayList<String>(Arrays.asList("resp_admin_uni"));
		 ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(administrativeUnity.label));
		return dataBase.select(fields, matchings, exchange);
	}
	
	public Procedure selectProcedureByDepartment(Department department, Exchange exchange) {
		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("department"));
		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(department.label));
		return dataBase.select(fields, matchings, exchange);
	}
	
	public Procedure selectProcedureByByAdminLevel(String level, Exchange exchange) {
		ArrayList<String> fields = new ArrayList<String>(Arrays.asList("admin_level"));
		ArrayList<String> matchings = new ArrayList<String>(Arrays.asList(level));
		return dataBase.select(fields, matchings, exchange);
	}
	
	public void createProcedure(Procedure procedure, Exchange exchange) {
		database.create(procedure, exchange);
	}
	
	public void updateProcedure(String procedureId, Procedure newProcedure, Exchange exchange) {
		database.update(procedureId, newProcedure, exchange);
	}
	
	public void deleteProcedure(String procedureId, Procedure newProcedure, Exchange exchange) {
		database.delete(procedureId, exchange);
	}
}
