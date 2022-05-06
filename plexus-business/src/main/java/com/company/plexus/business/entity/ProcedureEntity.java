package com.company.plexus.business.entity;

import com.company.plexus.business.entity.ServiceEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import com.company.plexus.utils.AdminLevel;
import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Ambit;
import com.company.plexus.utils.Department;

import com.company.plexus.utils.ProcedureStart;
import com.company.plexus.utils.ProcedureType;

// include Mapper

public class ProcedureEntity {
	
//	private String id;
//	private int id;
//	private String name;
//	private String specific_name;
//	private Department department;
//	private AdminUnity resp_admin_uni;
//	private String route;
//	private ProcedureStart start_of_procedure;
//	private Ambit ambit;
//	private AdminLevel admin_level;
//	private String sia_code;
//	private String sia_update_date;
//	private String release_date;
//	private String last_modification_date;
//	private String start_date;
//	private String finish_date;
//	private String remarks;
//	private ProcedureType procedure_type;
//	private String family;
	@Id
	private int id;
	public String getDepartment() {
		return department;
	}

	public String getResp_admin_uni() {
		return resp_admin_uni;
	}

	public String getRoute() {
		return route;
	}

	public String getStart_of_procedure() {
		return start_of_procedure;
	}

	public String getAmbit() {
		return ambit;
	}

	public String getAdmin_level() {
		return admin_level;
	}

	public String getProcedure_type() {
		return procedure_type;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setResp_admin_uni(String resp_admin_uni) {
		this.resp_admin_uni = resp_admin_uni;
	}

	public void setStart_of_procedure(String start_of_procedure) {
		this.start_of_procedure = start_of_procedure;
	}

	public void setAmbit(String ambit) {
		this.ambit = ambit;
	}

	public void setAdmin_level(String admin_level) {
		this.admin_level = admin_level;
	}

	public void setProcedure_type(String procedure_type) {
		this.procedure_type = procedure_type;
	}
	private String name;
	private String specific_name;
	private String department;
	private String resp_admin_uni;
	private String route;
	private String start_of_procedure;
	private String ambit;
	private String admin_level;
	private String sia_code;
	private String sia_update_date;
	private String release_date;
	private String last_modification_date;
	private String start_date;
	private String finish_date;
	private String remarks;
	private String procedure_type;
	private String family;
	
//	public int hashCode() {
//		return id.hashCode();
//	}
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object obj) {
		ProcedureEntity newProcedureEntity = (ProcedureEntity)obj;
		return newProcedureEntity.getId() == this.getId();
	}
	
	public int getId() {
		return id;
	}
//	public int getCode() {
//		return code;
//	}
	public String getName() {
		return name;
	}
	public String getSpecific_name() {
		return specific_name;
	}
//	public Department getDepartment() {
//		return department;
//	}
//	public AdminUnity getResp_admin_uni() {
//		return resp_admin_uni;
//	}
//	public String getRoute() {
//		return route;
//	}
//	public ProcedureStart getStart_of_procedure() {
//		return start_of_procedure;
//	}
//	public Ambit getAmbit() {
//		return ambit;
//	}
//	public AdminLevel getAdmin_level() {
//		return admin_level;
//	}
	public String getSia_code() {
		return sia_code;
	}
	public String getSia_update_date() {
		return sia_update_date;
	}
	public String getRelease_date() {
		return release_date;
	}
	public String getLast_modification_date() {
		return last_modification_date;
	}
	public String getStart_date() {
		return start_date;
	}
	public String getFinish_date() {
		return finish_date;
	}
	public String getRemarks() {
		return remarks;
	}
//	public ProcedureType getProcedure_type() {
//		return procedure_type;
//	}
	public String getFamily() {
		return family;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public void setCode(int code) {
//		this.code = code;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpecific_name(String specific_name) {
		this.specific_name = specific_name;
	}
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//	public void setResp_admin_uni(AdminUnity resp_admin_uni) {
//		this.resp_admin_uni = resp_admin_uni;
//	}
	public void setRoute(String route) {
		this.route = route;
	}
//	public void setStart_of_procedure(ProcedureStart start_of_procedure) {
//		this.start_of_procedure = start_of_procedure;
//	}
//	public void setAmbit(Ambit ambit) {
//		this.ambit = ambit;
//	}
//	public void setAdmin_level(AdminLevel admin_level) {
//		this.admin_level = admin_level;
//	}
	public void setSia_code(String sia_code) {
		this.sia_code = sia_code;
	}
	public void setSia_update_date(String sia_update_date) {
		this.sia_update_date = sia_update_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public void setLast_modification_date(String last_modification_date) {
		this.last_modification_date = last_modification_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public void setFinish_date(String finish_date) {
		this.finish_date = finish_date;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
//	public void setProcedure_type(ProcedureType procedure_type) {
//		this.procedure_type = procedure_type;
//	}
	public void setFamily(String family) {
		this.family = family;
	}
}
