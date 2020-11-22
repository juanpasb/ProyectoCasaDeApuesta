package co.edu.unbosque.model.persistence;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Apostadores;


public class ApostadorDao {
	private ArrayList<Apostadores> apostador;
	private OperacionArchivo opArchivo;
	
	public ApostadorDao() {
		 apostador = new ArrayList<Apostadores>();
	        opArchivo = new OperacionArchivo();
	}
	public void agregarApostador(String nombre, String cedula, String sede, String celular, File apostadores) {

        Apostadores nuevoApostador = new Apostadores(nombre, cedula, sede ,celular);
        apostador.add(nuevoApostador);
        opArchivo.escribirEnArchivo(apostador, apostadores);
    }

}
