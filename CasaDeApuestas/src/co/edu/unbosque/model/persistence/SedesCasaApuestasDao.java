package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.SedesCasaDeApuestas;

public class SedesCasaApuestasDao {
	private ArrayList<SedesCasaDeApuestas> sedesCasaApuesta;
	private OperacionArchivo opArchivo;
	
	/**
	 * Este metodo permite agregar una nueva sedes de apuestas
	 * <b>pre</b> LLenar todos los campos del objeto <br>
	 * <b>post</b>  Se modificara la informacion al al ArrayList <br> 
	 * @param ubicacion Es la ubicacion de la casa de apuestas
	 * @param numEmpleados Es el numero de empleados
	 * @param sedes es el archivo donde se va a guardar
	 */
	public void agregarSedesApuestas(String ubicacion, String numEmpleados, File sedes) {

		SedesCasaDeApuestas nuevaCasaApuestas = new SedesCasaDeApuestas(ubicacion, numEmpleados);
		sedesCasaApuesta.add(nuevaCasaApuestas);
        opArchivo.escribirEnArchivo2(sedesCasaApuesta, sedes);
    }
/**
 * Devuelve sedesCasaApuesta
 * @return sedesCasaApuesta
 */
	public ArrayList<SedesCasaDeApuestas> getSedesCasaApuesta() {
		return sedesCasaApuesta;
	}
/**
 * Modifica sedesCasaApuesta
 * @param sedesCasaApuesta
 */
	public void setSedesCasaApuesta(ArrayList<SedesCasaDeApuestas> sedesCasaApuesta) {
		this.sedesCasaApuesta = sedesCasaApuesta;
	}
/**
 * Devuelve opArchivo
 * @return opArchivo 
 */
	public OperacionArchivo getOpArchivo() {
		return opArchivo;
	}
/**
 * Modifica opArchivo
 * @param opArchivo
 */
	public void setOpArchivo(OperacionArchivo opArchivo) {
		this.opArchivo = opArchivo;
	}
	
}
