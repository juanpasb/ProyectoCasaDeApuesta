package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Baloto;


public class BalotoDao {
	private ArrayList<Baloto> baloto;
	private OperacionArchivo opArchivo;
	/**
	 * Este metodo inicializa un ArrayList llamado apostador
	 */
	public BalotoDao() {
		 baloto = new ArrayList<Baloto>();
	        opArchivo = new OperacionArchivo();
	}
	
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

}
