package co.edu.unbosque.model;

public class Juegos {

	private String nombre;
	private String tipo;
	private int presupuesto;
	
	public Juegos(String nombre, String tipo, int presupuesto) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.presupuesto = presupuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	
	
}
