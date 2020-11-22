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

	public ArrayList<Apostadores> leerArchivo1(File config) {
		ArrayList<Apostadores> casaApuestas = new ArrayList<Apostadores>();
		if (config.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(config));
				casaApuestas = (ArrayList<Apostadores>) entrada.readObject();
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


	public static void addText(String path, String toApped) {

		try {
			PrintWriter writer = new PrintWriter(new FileWriter(path));
			writer.append(toApped);
			writer.close();
		} catch (Exception e) {
			System.out.println("Error a�adiendo al fichero " + e.getMessage());
		}
	}

}

//
