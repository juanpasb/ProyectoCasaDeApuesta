package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import co.edu.unbosque.model.Apostadores;
import co.edu.unbosque.model.CasaDeApuestas;
import co.edu.unbosque.model.Juegos;
import co.edu.unbosque.model.SedesCasaDeApuestas;

public class OperacionArchivo {
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;

	public OperacionArchivo() {

	}
/**
 * Este metodo permite escribir en el archivo Dat
 *  <b>pre</b> Tiene que existir el archivo Dat <br>
 * <b>post</b> Se agregaran al archivo Dat<br>
 * @param apostador Es el arraylist donde se almacenan los datos del apostador ingresado
 * @param apostadores Es el archivo donde se van a guardar los datos ingresados 
 */
	public void escribirEnArchivo(ArrayList<Apostadores> apostador, File apostadores) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(apostadores));
			salida.writeObject(apostador);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * Este metodo permite leer el archivo Dat
 *  <b>pre</b> Tiene que existir el archivo Dat <br>
 * <b>post</b> Se agregaran al archivo Dat<br> 
 * @param apostadores Es el archivo donde se van a guardar los datos ingresados
 * @return apostador
 */
	public ArrayList<Apostadores> leerArchivo(File apostadores) {
		ArrayList<Apostadores> apostador = new ArrayList<Apostadores>();
		if (apostadores.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(apostadores));
				apostador = (ArrayList<Apostadores>) entrada.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return apostador;
	}
	/**
	 *Este metodo permite escribir en el archivo Dat
	 * <b>pre</b> Tiene que existir el archivo Dat <br>
	 * <b>post</b> Se agregaran al archivo Dat<br> 
	 * @param CasaDeApuestas Es el arraylist donde se almacenan los datos de la casa de apuestas ingresado
	 * @param config Es el archivo donde se van a guardar los datos ingresados 
	 */
	public void escribirEnArchivo1(ArrayList<CasaDeApuestas> CasaDeApuestas, File config) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(config));
			salida.writeObject(CasaDeApuestas);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * Este metodo permite leer el archivo Dat
 *  <b>pre</b> Tiene que existir el archivo Dat <br>
 * <b>post</b> Se agregaran al archivo Dat<br>
 * @param config Es el archivo donde se van a guardar los datos ingresados 
 * @return CasaApuestas
 */
	public ArrayList<CasaDeApuestas> leerArchivo1(File config) {
		 ArrayList<CasaDeApuestas> casaApuestas = new ArrayList<CasaDeApuestas>();
		if (config.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(config));
				casaApuestas = (ArrayList<CasaDeApuestas>) entrada.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return casaApuestas;
	}
	/**
	 * Este metodo permite escribir en el archivo Dat
	 * <b>pre</b> Tiene que existir el archivo Dat <br>
	 * <b>post</b> Se agregaran al archivo Dat<br> 
	 * @param CasaDeApuestas  Es el arraylist donde se almacenan los datos de la casa de apuestas ingresado
	 * @param sedes Es el archivo donde se van a guardar los datos ingresados 
	 */
	public void escribirEnArchivo2(ArrayList<SedesCasaDeApuestas> CasaDeApuestas, File sedes) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(sedes));
			salida.writeObject(CasaDeApuestas);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * Este metodo permite leer el archivo Dat
 *  <b>pre</b> Tiene que existir el archivo Dat <br>
 * <b>post</b> Se agregaran al archivo Dat<br>
 * @param sedes Es el archivo donde se van a guardar los datos ingresados 
 * @return SedesApuestas
 */
	public ArrayList<SedesCasaDeApuestas> leerArchivo2(File sedes) {
		ArrayList<SedesCasaDeApuestas> sedesApuestas = new ArrayList<SedesCasaDeApuestas>();
		if (sedes.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(sedes));
				sedesApuestas = (ArrayList<SedesCasaDeApuestas>) entrada.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sedesApuestas;
	}
	/**
	 *Este metodo permite escribir en el archivo Dat
	 * <b>pre</b> Tiene que existir el archivo Dat <br>
	 * <b>post</b> Se agregaran al archivo Dat<br> 
	 * @param Juegos  Es el arraylist donde se almacenan los datos del juego ingresado
	 * @param juegos Es el archivo donde se van a guardar los datos ingresados 
	 */
	public void escribirEnArchivo3(ArrayList<Juegos> Juegos, File juegos) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(juegos));
			salida.writeObject(Juegos);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * Este metodo permite leer el archivo Dat
 *  <b>pre</b> Tiene que existir el archivo Dat <br>
 * <b>post</b> Se agregaran al archivo Dat<br>
 * @param juegos Es el archivo donde se van a guardar los datos ingresados 
 * @return juegos1
 */
	public ArrayList<Juegos> leerArchivo3(File juegos) {
		ArrayList<Juegos> juegos1 = new ArrayList<Juegos>();
		if (juegos.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(juegos));
				juegos1 = (ArrayList<Juegos>) entrada.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return juegos1;
	}

	/**
	 *Este metodo permite añadir el texto al archivo .dat 
	 * @param path
	 * @param toApped
	 */
	public static void addText(String path, String toApped) {

		try {
			PrintWriter writer = new PrintWriter(new FileWriter(path));
			writer.append(toApped);
			writer.close();
		} catch (Exception e) {
			System.out.println("Error a�adiendo al fichero " + e.getMessage());
		}
	}
/**
 * Devuelve entrada
 * @return entrada
 */
	public ObjectInputStream getEntrada() {
		return entrada;
	}
/**
 * Modifica entrada
 * @param entrada
 */
	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}
/**
 * Devuelve salida
 * @return salida
 */
	public ObjectOutputStream getSalida() {
		return salida;
	}
/**
 * Modifica salida
 * @param salida
 */
	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}
}