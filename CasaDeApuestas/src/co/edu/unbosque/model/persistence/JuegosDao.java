package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Juegos;

public class JuegosDao {
	private ArrayList<Juegos> juego;
	private OperacionArchivo opArchivo;

	public void agregarJuego(String nombre, String tipo, int presupuesto, File juegos) {

        Juegos nuevoJuego = new Juegos(nombre, tipo , presupuesto);
        juego.add(nuevoJuego);
        opArchivo.escribirEnArchivo3(juego, juegos);
    }

}
