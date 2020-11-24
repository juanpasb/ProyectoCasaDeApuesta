package co.edu.unbosque.model;

public class Apostadores {

	private String nombre;
	private String cedula;
	private String sede;
	private String celular;
	
	public Apostadores(String nombre, String cedula, String sede, String celular) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.sede = sede;
		this.celular = celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
}
