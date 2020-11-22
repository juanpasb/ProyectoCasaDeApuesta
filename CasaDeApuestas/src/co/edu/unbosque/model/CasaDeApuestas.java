package co.edu.unbosque.model;

public class CasaDeApuestas {
	
	private String  nombreCasaApuestas;
	private String numSedes;
	private int presupuestoTotalPremios;
	
	
	public CasaDeApuestas(String nombreCasaApuestas, String numSedes, int presupuestoTotalPremios) {
		this.nombreCasaApuestas = nombreCasaApuestas;
		this.numSedes = numSedes;
		this.presupuestoTotalPremios = presupuestoTotalPremios;
	}


	public String getNombreCasaApuestas() {
		return nombreCasaApuestas;
	}


	public void setNombreCasaApuestas(String nombreCasaApuestas) {
		this.nombreCasaApuestas = nombreCasaApuestas;
	}


	public String getNumSedes() {
		return numSedes;
	}


	public void setNumSedes(String numSedes) {
		this.numSedes = numSedes;
	}


	public int getPresupuestoTotalPremios() {
		return presupuestoTotalPremios;
	}


	public void setPresupuestoTotalPremios(int presupuestoTotalPremios) {
		this.presupuestoTotalPremios = presupuestoTotalPremios;
	}
	
	

}
