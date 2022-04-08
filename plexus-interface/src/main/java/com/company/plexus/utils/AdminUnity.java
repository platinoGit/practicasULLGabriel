package com.company.plexus.utils;

public enum AdminUnity {
	CONSEJERIA_EDUCACION("Consejería de Educación, Universidades, Cultura y Deportes"),
	CONSEJERIA_AGRICULTURA("Consejería de Agricultura, Ganadería y Pesca");
	
	public final String label;
	
	private AdminUnity(String label) {
		this.label = label;
	}
}