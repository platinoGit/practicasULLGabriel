package com.company.plexus.business.logic;

import org.apache.camel.Exchange;

import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.Procedure;
import java.util.ArrayList;

public class ProcedureLogic {
	//private dataBase;
	
	public Procedure selectProcedureByAdminUnity(AdminUnity administrativeUnity, Exchange exchange) {
		 String queryCondition = "resp_admin_uni = " + administrativeUnity.label;
		 ArrayList<String> fields = new ArrayList<String>();
		 ArrayList<String> matchings = new ArrayList<String>();
		 fields.add("resp_admin_uni");
		 matchings.add(administrativeUnity.label);
		return dataBase.select(fields, matchings, exchange);
	}
	
	public Procedure selectProcedureByDepartment(Department department, Exchange exchange) {
		return dataBase.selectProcedureByDepartment(department, exchange);
	}
	
	public Procedure selectProcedureByByAdminLevel(String level, Exchange exchange) {
		return dataBase.selectProcedureByByAdminLevel(level, exchange);
	}
}
