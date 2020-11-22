package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.SedesCasaDeApuestas;

public class SedesCasaApuestasDao {
	private ArrayList<SedesCasaDeApuestas> sedesCasaApuesta;
	private OperacionArchivo opArchivo;
	
	public void agregarApostador(String ubicacion, String numEmpleados, File sedes) {

		SedesCasaDeApuestas nuevaCasaApuestas = new SedesCasaDeApuestas(ubicacion, numEmpleados);
		sedesCasaApuesta.add(nuevaCasaApuestas);
        opArchivo.escribirEnArchivo2(sedesCasaApuesta, sedes);
    }
}
