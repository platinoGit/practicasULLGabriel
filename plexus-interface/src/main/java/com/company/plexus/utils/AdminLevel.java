package com.company.plexus.utils;

public enum AdminLevel {
	NIVEL_1("Nivel 1: Información"),
	NIVEL_2("Nivel 2: Descarga formularios"),
	NIVEL_3("Nivel 3: Descarga y envío electrónico de formularios"),
	NIVEL_4("Nivel 4: Tramitación electrónica completa");
	
	public final String label;
	
	private AdminLevel(String label) {
		this.label = label;
	}
}
