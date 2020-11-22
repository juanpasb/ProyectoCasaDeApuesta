package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Juegos;
//l

public class JuegosDao {
	private ArrayList<Juegos> juego;
	private OperacionArchivo opArchivo;

	public void agregarJuego(String nombre, String tipo, int presupuesto, File juegos) {

        Juegos nuevoJuego = new Juegos(nombre, tipo , presupuesto);
        juego.add(nuevoJuego);
        opArchivo.escribirEnArchivo3(juego, juegos);
    }

	public ArrayList<Juegos> getJuego() {
		return juego;
	}

	public void setJuego(ArrayList<Juegos> juego) {
		this.juego = juego;
	}

	public OperacionArchivo getOpArchivo() {
		return opArchivo;
	}

	public void setOpArchivo(OperacionArchivo opArchivo) {
		this.opArchivo = opArchivo;
	}

}
