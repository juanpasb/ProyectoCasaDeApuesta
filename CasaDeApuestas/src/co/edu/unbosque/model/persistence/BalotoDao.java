package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Baloto;


public class BalotoDao {
	private ArrayList<Baloto> baloto;
	private OperacionArchivo opArchivo;
	/**
	 * Este metodo inicializa un ArrayList llamado Baloto
	 */
	public BalotoDao() {
		 baloto = new ArrayList<Baloto>();
	        opArchivo = new OperacionArchivo();
	}
	/**
	 * Este metodo sirve para saber si el usuario acerto
	 * <b>pre</b> LLenar todos los campos del objeto <br>
	 * <b>post</b>  Se verificara si el usuario gano <br>
	 * @param numero es el numero que ingresa el ususario
	 * @return re
	 */
	public boolean baloto(String numero) {
		boolean re = false;
		int numero1;
		String numeroFinal = "";
		 
		numero1 = (int)(10000 * Math.random());
		 
		numeroFinal = "" + numero1;
		 
		for(int i = numeroFinal.length(); i < 4; i++){
		    numeroFinal = "0" + numeroFinal;
		}
	if(numeroFinal == numero) {
		re = true;
	}
	return re;
		
	}
	/**
	 * Devuelve
	 * @return
	 */
	public ArrayList<Baloto> getBaloto() {
		return baloto;
	}
	/**
	 * Modifica
	 * @param baloto
	 */
	public void setBaloto(ArrayList<Baloto> baloto) {
		this.baloto = baloto;
	}
	/**
	 * Devuelve
	 * @return
	 */
	public OperacionArchivo getOpArchivo() {
		return opArchivo;
	}
	/**
	 * Modifica
	 * @param opArchivo
	 */
	public void setOpArchivo(OperacionArchivo opArchivo) {
		this.opArchivo = opArchivo;
	}

}
