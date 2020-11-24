package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Juegos;
//l

public class JuegosDao {
	private ArrayList<Juegos> juego;
	private OperacionArchivo opArchivo;
	
/**
 * Este metodo permite agregar un nuevo juego 
 * <b>pre</b> LLenar todos los campos del objeto <br>
 * <b>post</b>  Se agregara la informacion al al ArrayList <br> 
 * @param nombre es el nombre del apostador
 * @param tipo es el tipo de juego que se selecciono
 * @param presupuesto es el presupuesto que ingresa el cliente
 * @param juegos es el archivo donde se va a guardar la informacion
 */
	public void agregarJuego(String nombre, String tipo, int presupuesto, File juegos) {

        Juegos nuevoJuego = new Juegos(nombre, tipo , presupuesto);
        juego.add(nuevoJuego);
        opArchivo.escribirEnArchivo3(juego, juegos);
    }
/**
 * Devuelve juego
 * @return juego
 */
	public ArrayList<Juegos> getJuego() {
		return juego;
	}
/**
 * Modifica juego
 * @param juego
 */
	public void setJuego(ArrayList<Juegos> juego) {
		this.juego = juego;
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
