package com.company.plexus.business.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.mapstruct.factory.Mappers;

import java.io.Serializable;

import javax.persistence.Column;

import com.company.plexus.business.mappers.ServiceMapper;

import com.company.plexus.utils.AdminLevel;
import com.company.plexus.utils.AdminUnity;
import com.company.plexus.utils.Ambit;
import com.company.plexus.utils.Department;
import com.company.plexus.utils.Service;

import jdk.internal.module.ModuleLoaderMap.Mapper;

import com.company.plexus.utils.ProcedureStart;

// include Mapper
@Entity
@Table(name="PROCEDURES")
public class ServiceEntity implements Serializable {
	
	protected String id;
	protected int code;
	protected String name;
	protected String specific_name;
	protected Department department;
	protected AdminUnity resp_admin_uni;
	protected String route;
	protected ProcedureStart start_of_procedure;
	protected Ambit ambit;
	protected AdminLevel admin_level;
	protected String sia_code;
	protected String sia_update_date;
	protected String release_date;
	protected String last_modification_date;
	protected String start_date;
	protected String finish_date;
	protected String remarks;
	
	public int hashCode() {
		return id.hashCode();
	}
	
	public boolean equals(Object obj) {
		ServiceEntity newServiceEntity = (ServiceEntity)obj;
		return newServiceEntity.getId().equals(this.getId());
	}
	
	public String getId() {
		return id;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getSpecific_name() {
		return specific_name;
	}

	public Department getDepartment() {
		return department;
	}

	public AdminUnity getResp_admin_uni() {
		return resp_admin_uni;
	}

	public String getRoute() {
		return route;
	}

	public ProcedureStart getStart_of_procedure() {
		return start_of_procedure;
	}

	public Ambit getAmbit() {
		return ambit;
	}

	public AdminLevel getAdmin_level() {
		return admin_level;
	}

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

	public void setId(String id) {
		this.id = id;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecific_name(String specific_name) {
		this.specific_name = specific_name;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setResp_admin_uni(AdminUnity resp_admin_uni) {
		this.resp_admin_uni = resp_admin_uni;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public void setStart_of_procedure(ProcedureStart start_of_procedure) {
		this.start_of_procedure = start_of_procedure;
	}

	public void setAmbit(Ambit ambit) {
		this.ambit = ambit;
	}

	public void setAdmin_level(AdminLevel admin_level) {
		this.admin_level = admin_level;
	}

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
	
}
