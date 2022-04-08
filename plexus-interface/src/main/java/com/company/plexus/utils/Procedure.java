package com.company.plexus.utils;

public class Procedure extends Service{
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
}
