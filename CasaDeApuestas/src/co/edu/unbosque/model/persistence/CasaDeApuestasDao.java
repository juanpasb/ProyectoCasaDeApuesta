package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.CasaDeApuestas;

public class CasaDeApuestasDao {
	private ArrayList<CasaDeApuestas> CasaDeApuestas;
	private OperacionArchivo opArchivo;
	
	public CasaDeApuestasDao() {
		 CasaDeApuestas = new ArrayList<CasaDeApuestas>();
	        opArchivo = new OperacionArchivo();
	}
	public void agregarApostador(String nombreCasaApuestas, String numSedes, int presupuestoTotalPremios, File config) {

		CasaDeApuestas  nuevaCasa = new CasaDeApuestas(nombreCasaApuestas, numSedes, presupuestoTotalPremios);
		CasaDeApuestas.add(nuevaCasa);
        opArchivo.escribirEnArchivo1(CasaDeApuestas, config);
    }
	
	public boolean modificarCasa(String nombreCasaApuestas, String numSedes, int presupuestoTotalPremios, File config) throws IOException {

		for (int i = 0; i < CasaDeApuestas.size(); i++) {
			if (CasaDeApuestas.get(i).getNombreCasaApuestas().equals(nombreCasaApuestas)) {
				CasaDeApuestas.get(i).setNumSedes(numSedes);
				CasaDeApuestas.get(i).setPresupuestoTotalPremios(presupuestoTotalPremios);
				
			}
		}
		config.delete();
		config.createNewFile();
		opArchivo.escribirEnArchivo1(CasaDeApuestas, config);
		CasaDeApuestas nuevo = new CasaDeApuestas(nombreCasaApuestas, numSedes, presupuestoTotalPremios);

		opArchivo.escribirEnArchivo1(CasaDeApuestas, config);

		return true;
	}

}
