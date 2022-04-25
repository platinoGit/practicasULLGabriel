package com.company.plexus.utils;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

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
		"procedure_type",
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

public class Procedure extends Service implements Serializable {
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
	private ProcedureType procedure_type;
	private String family;

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public ProcedureType getProcedure_type() {
		return procedure_type;
	}

	public void setProcedure_type(ProcedureType procedure_type) {
		this.procedure_type = procedure_type;
	}

	public void setProcedure_type(String procedure_type) {
		try {
			for (ProcedureType single_procedure_type: ProcedureType.values()) {
				if (single_procedure_type.name() == procedure_type) {
					this.procedure_type = single_procedure_type;
				} else {
					throw new Exception("Ambito no valida");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
