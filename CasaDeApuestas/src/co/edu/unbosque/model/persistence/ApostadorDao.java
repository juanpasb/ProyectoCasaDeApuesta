package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Apostadores;


public class ApostadorDao {
	private ArrayList<Apostadores> apostador;
	private OperacionArchivo opArchivo;
	/**
	 * Este metodo inicializa un ArrayList llamado apostador
	 */
	public ApostadorDao() {
		 apostador = new ArrayList<Apostadores>();
	        opArchivo = new OperacionArchivo();
	}
	/**
	 * Este metodo sirve para agregar un apostador
	 * <b>pre</b> LLenar todos los campos del objeto <br>
	 * <b>post</b>  Se añadira la informacion al al ArrayList <br>
	 * @param nombre Es el nombre del apostador
	 * @param cedula es la cedula del apostador
	 * @param sede es la sede de la casa de apuestas
	 * @param celular es el celular del celular
	 * @param apostadores Es el archivo donde se va a guardar
	 */
	public void agregarApostador(String nombre, String cedula, String sede, String celular, File apostadores) {

        Apostadores nuevoApostador = new Apostadores(nombre, cedula, sede ,celular);
        apostador.add(nuevoApostador);
        opArchivo.escribirEnArchivo(apostador, apostadores);
    }
	/**
	 * Devuelve apostador
	 * @return apostador
	 */
	public ArrayList<Apostadores> getApostador() {
		return apostador;
	}
	/**
	 * Modifica apostador
	 * @param apostador
	 */
	public void setApostador(ArrayList<Apostadores> apostador) {
		this.apostador = apostador;
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
