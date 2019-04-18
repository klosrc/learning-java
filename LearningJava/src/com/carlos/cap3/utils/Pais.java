package com.carlos.cap3.utils;

final public class Pais {
	
	private String nombre;
	private String continente;
	private String status;
	
	public Pais(String nombre, String continente, String status) {
		this.nombre = nombre;
		this.continente = continente;
		this.status = status;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getContinente() {
		return continente;
	}
	public String getStatus() {
		return status;
	}	
}
