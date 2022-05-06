package com.company.plexus.business.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import java.io.Serializable;

import javax.persistence.Column;

import com.company.plexus.utils.AdminLevel;
import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Ambit;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.ProcedureStart;

@Entity
@Table(name="SERVICES")
public class ServiceEntity {
	
	/**
	 * 
	 */

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SPECIFIC_NAME")
	private String specific_name;
	
	@Column(name="DEPARTMENT")
	private String department;
	
	@Column(name="RESP_ADMIN_UNITY")
	private String resp_admin_uni;
	
	@Column(name="ROUTE")
	private String route;
	
	@Column(name="ACTION_TYPE")
	private String action_type;
	
	@Column(name="START_OF_PROCEDURE")
	private String start_of_procedure;
	
	@Column(name="AMBIT")
	private String ambit;
	
	@Column(name="ADMIN_LEVEL")
	private String admin_level;
	
	@Column(name="SIA_CODE")
	private int sia_code;
	
	@Column(name="SIA_UPDATE_DATE")
	private String sia_update_date;
	
	@Column(name="RELEASE_DATE")
	private String release_date;
	
	@Column(name="LAST_MODIFICATION_DATE")
	private String last_modification_date;
	
	@Column(name="START_DATE")
	private String start_date;
	
	@Column(name="FINISH_DATE")
	private String finish_date;
	
	@Column(name="REMARKS")
	private String remarks;
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object obj) {
		ServiceEntity newServiceEntity = (ServiceEntity)obj;
		return newServiceEntity.getId() == this.getId();
	}
	
	public String getAction_type() {
		return action_type;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSpecific_name() {
		return specific_name;
	}

//	public Department getDepartment() {
//		return department;
//	}
//
//	public AdminUnity getResp_admin_uni() {
//		return resp_admin_uni;
//	}
//
//	public String getRoute() {
//		return route;
//	}
//
//	public ProcedureStart getStart_of_procedure() {
//		return start_of_procedure;
//	}
//
//	public Ambit getAmbit() {
//		return ambit;
//	}
//
//	public AdminLevel getAdmin_level() {
//		return admin_level;
//	}
//
//	public String getSia_code() {
//		return sia_code;
//	}
//
//	public String getSia_update_date() {
//		return sia_update_date;
//	}
//
//	public String getRelease_date() {
//		return release_date;
//	}
//
//	public String getLast_modification_date() {
//		return last_modification_date;
//	}
//
//	public String getStart_date() {
//		return start_date;
//	}
//
//	public String getFinish_date() {
//		return finish_date;
//	}
//
//	public String getRemarks() {
//		return remarks;
//	}

	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}

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

	public int getSia_code() {
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

	public void setId(int code) {
		this.id = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecific_name(String specific_name) {
		this.specific_name = specific_name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setResp_admin_uni(String resp_admin_uni) {
		this.resp_admin_uni = resp_admin_uni;
	}

	public void setRoute(String route) {
		this.route = route;
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

	public void setSia_code(int sia_code) {
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
}
