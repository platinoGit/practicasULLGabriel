package com.company.plexus.utils;

public enum Department {
	INDUSTRIA("Dirección General de Industria"),
	GENERAL("Secretaría General Técnica"),
	PESCA("Dirección General de Pesca"),
	TURISTICA("Dirección General de Infraestructura Turística"),
	EDUCATIVA("Dirección General de Centros, Infraestructura y Promoción Educativa"),
	TRABAJO("Dirección General de Trabajo"),
	EMPLEO("Servicio Canario de Empleo (SCE)"),
	SALUD("Servicio Canario de la Salud (SCS)"),
	AGENCIA_TRIBUTARIA("Agencia Tributaria Canaria"),
	TESORO("Dirección General del Tesoro y Política Financiera"),
	TRANSPORTE("Dirección General de Transportes"),
	AGRICULTURA("Dirección General de Agricultura"),
	ENERGIA("Dirección General de Energía"),
	INMIGRACION("Dirección General de Derechos Sociales e Inmigración"),
	GANADERIA("Dirección General de Ganadería"),
	EMIGRACION("Dirección General de Emigración"),
	TECNICA("Secretaría General Técnica"),
	ADMIN_PUBLIC("Viceconsejería de Administraciones Publicas y Transparencia"),
	PROMOCION("Dirección General de Promoción económica"),
	PATRIMONIO("Dirección General de Patrimonio y Contratación"),
	CULTURAL("Dirección General de Patrimonio Cultural"),
	AGROALIMENTARIA("Instituto Canario de Calidad Agroalimentaria (ICCA)"),
	INFANCIA("Dirección General de Protección a la Infancia y la Familia"),
	JUVENTUD("Dirección General de Juventud"),
	COMERCIO("Dirección General de Comercio y Consumo"),
	VIVIENDA("Instituto Canario de Vivienda"),
	MEDIO_AMBIENTE("Dirección General  Lucha contra el cambio climático y Medio ambiente");
	
	public final String label;
	
	private Department(String label) {
		this.label = label;
	}
}
