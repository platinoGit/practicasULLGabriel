package com.company.plexus.utils;

import javax.xml.bind.annotation.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
		"id",
		"name",
		"specific_name",
		"department",
		"resp_admin_uni",
		"route",
		"start_of_procedure",
		"action_type",
		"ambit",
		"admin_level",
		"sia_code",
		"sia_update_date",
		"release_date",
		"last_modification_date",
		"start_date",
		"finish_date",
		"remarks"
})

@Entity
@Table(name="SERVICE")
public class Service {
	protected int id;
	//protected int code;
	protected String name;
	protected String specific_name;
	protected Department department;
	protected AdminUnity resp_admin_uni;
	protected String route;
	protected ProcedureStart start_of_procedure;
	private String action_type;
	protected Ambit ambit;
	protected AdminLevel admin_level;
	protected String sia_code;
	protected String sia_update_date;
	protected String release_date;
	protected String last_modification_date;
	protected String start_date;
	protected String finish_date;
	protected String remarks;
	
	@Id
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
	public Department getDepartment() {
		return department;
	}
	public AdminUnity getResp_admin_uni() {
		return resp_admin_uni;
	}
	public String getRoute() {
		return route;
	}
	public String getAction_type() {
		return action_type;
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
	public void setId(int id) {
		this.id = id;
	}
//	public void setCode(int code) {
//		this.code = code;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAction_type(String action_type) {
		this.action_type = action_type;
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
	public void setStart_of_procedure(ProcedureStart start_of_procedure) {
		this.start_of_procedure = start_of_procedure;
	}
	public void setAmbit(Ambit ambit) {
		this.ambit = ambit;
	}
	public void setAdmin_level(AdminLevel admin_level) {
		this.admin_level = admin_level;
	}
	
	public void setDepartment(String department) {
		try {
			for (Department single_department : Department.values()) {
				if (single_department.label == department) {
					this.department = single_department;							
				} else {
					throw new Exception("Departmento no valido");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void setResp_admin_uni(String resp_admin_uni) {
		try {
			for (AdminUnity single_resp_admin_uni : AdminUnity.values()) {
				if (single_resp_admin_uni.label == resp_admin_uni) {
					this.resp_admin_uni = single_resp_admin_uni;							
				} else {
					throw new Exception("Unidad administrativa no valida");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public void setStart_of_procedure(String start_of_procedure) {
		try {
			for (ProcedureStart single_start_of_procedure : ProcedureStart.values()) {
				if (single_start_of_procedure.name() == start_of_procedure) {
					this.start_of_procedure = single_start_of_procedure;							
				} else {
					throw new Exception("Comiezo de procedimiento no valido");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void setAmbit(String ambit) {
		try {
			for (Ambit single_ambit : Ambit.values()) {
				if (single_ambit.name() == ambit) {
					this.ambit = single_ambit;					
				} else {
					throw new Exception("Ambito no valida");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void setAdmin_level(String admin_level) {
		try {
			for (AdminLevel single_admin_level: AdminLevel.values()) {
				if (single_admin_level.label == admin_level) {
					this.admin_level = single_admin_level;					
				} else {
					throw new Exception("Ambito no valida");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
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
