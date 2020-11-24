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
	 * Este metodo inicializa un ArrayList llamado apostador
	 */
	public SuperAstroDao() {
		sAstro = new ArrayList<Superastro>();
		opArchivo = new OperacionArchivo();
	}

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
}
