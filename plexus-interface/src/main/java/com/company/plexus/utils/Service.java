package com.company.plexus.utils;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
		"id",
		"code",
		"name",
		"specific_name",
		"department",
		"resp_admin_uni",
		"route",
		"start_of_procedure",
		"ambit",
		"admin_level",
		"sia_code",
		"sia_update_date",
		"release_date",
		"last_modification_date",
		"family",
		"start_date",
		"finish_date",
		"remarks"
})

public class Service {
	protected String id;
	protected int code;
	protected String name;
	protected String specific_name;
	protected String department;
	protected String resp_admin_uni;
	protected String route;
	protected String start_of_procedure;
	protected String ambit;
	protected String admin_level;
	protected String sia_code;
	protected String sia_update_date;
	protected String release_date;
	protected String last_modification_date;
	protected String family;
	protected String start_date;
	protected String finish_date;
	protected String remarks;
	
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
	public String getFamily() {
		return family;
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
	public void setFamily(String family) {
		this.family = family;
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
