package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Superastro;

public class SuperAstroDao {
	private ArrayList<Superastro> sAstro;
//		String signo;
	String[] signo1 = { "ARIES", "TAURO", "GEMINIS", "LEO", "VIRGO", "LIBRA", "ESCORPIO", "SAGITARIO", "CAPRICORNIO",
			"ACUARIO", "PISCIS" };
	private OperacionArchivo opArchivo;

	/**
	 * Este metodo inicializa un ArrayList llamado superAstro
	 */
	public SuperAstroDao() {
		sAstro = new ArrayList<Superastro>();
		opArchivo = new OperacionArchivo();
	}

	/**
	 * Este metodo sirve para verificar si el ususario acerto el numero y el signo
	 * 
	 * @param numero Es el numero que ingresa el usuario
	 * @param signo  Es el signo que ingresa el usuario
	 * @return re
	 */
	public boolean superAstro(String numero, String signo) {
		boolean re = false;
		int numero1;
		String numeroFinal = "";

		numero1 = (int) (10000 * Math.random());

		numeroFinal = "" + numero1;

		for (int i = numeroFinal.length(); i < 4; i++) {
			numeroFinal = "0" + numeroFinal;
		}
		if (numeroFinal == numero) {
			for (int i = 0; i < signo1.length; i++) {
				if (signo1[i].equals(signo)) {
					re = true;
				}
			}

		}
		return re;
	}

	/**
	 *Devuelve sAstro
	 * @return sAstro
	 */
	public ArrayList<Superastro> getsAstro() {
		return sAstro;
	}

	/**
	 * Modifica sAstro
	 * @param sAstro
	 */
	public void setsAstro(ArrayList<Superastro> sAstro) {
		this.sAstro = sAstro;
	}

	/**
	 *Devuelve signo1
	 * @return signo1
	 */
	public String[] getSigno1() {
		return signo1;
	}

	/**
	 * Modifica signo1
	 * @param signo1
	 */
	public void setSigno1(String[] signo1) {
		this.signo1 = signo1;
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
