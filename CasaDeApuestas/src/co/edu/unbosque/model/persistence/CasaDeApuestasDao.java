package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.CasaDeApuestas;

public class CasaDeApuestasDao {
	private ArrayList<CasaDeApuestas> CasaDeApuestas;
	private OperacionArchivo opArchivo;
	
	/**
	 * Este metodo inicializa un ArrayList llamado CasaDeApuestas
	 */
	public CasaDeApuestasDao() {
		 CasaDeApuestas = new ArrayList<CasaDeApuestas>();
	        opArchivo = new OperacionArchivo();
	}
	/**
	 * Este metodo permite agregar una nueva casa de apuestas
	 * <b>pre</b> LLenar todos los campos del objeto <br>
	 * <b>post</b>  Se añadira la informacion al al ArrayList <br>
	 * @param nombreCasaApuestas 
	 * @param numSedes
	 * @param presupuestoTotalPremios
	 * @param config
	 */
	public void agregarCasaDeApuestas(String nombreCasaApuestas, String numSedes, int presupuestoTotalPremios, File config) {

		CasaDeApuestas  nuevaCasa = new CasaDeApuestas(nombreCasaApuestas, numSedes, presupuestoTotalPremios);
		CasaDeApuestas.add(nuevaCasa);
        opArchivo.escribirEnArchivo1(CasaDeApuestas, config);
    }
	/**
	 * Este metodo sirve para modificar una casa de apuestas
	 * <b>pre</b> LLenar todos los campos del objeto <br>
	 * <b>post</b>  Se modificara la informacion al al ArrayList <br> 
	 * @param nombreCasaApuestas es el nombre de lacasa de apuestas
	 * @param numSedes es el numero de sedes que tiene la casa
	 * @param presupuestoTotalPremios es el presupuestos que tiene esa casa de apuestas en premios
	 * @param config es el archivo donde se va a guardar
	 * @return True
	 * @throws IOException
	 */
	public boolean modificarCasa(String nombreCasaApuestas, String numSedes, int presupuestoTotalPremios, File config) throws IOException {

		for (int i = 0; i < CasaDeApuestas.size(); i++) {
			if (CasaDeApuestas.get(i).getNombreCasaApuestas().equals(nombreCasaApuestas)) {
				CasaDeApuestas.get(i).setNumSedes(numSedes);
				CasaDeApuestas.get(i).setPresupuestoTotalPremios(presupuestoTotalPremios);
				
			}
		}
		config.delete();
		config.createNewFile();
		opArchivo.escribirEnArchivo1(CasaDeApuestas, config);
		CasaDeApuestas nuevo = new CasaDeApuestas(nombreCasaApuestas, numSedes, presupuestoTotalPremios);

		opArchivo.escribirEnArchivo1(CasaDeApuestas, config);

		return true;
	}
	/**
	 * Devuelve casaDeApuestas
	 * @return casaDeApuestas
	 */
	public ArrayList<CasaDeApuestas> getCasaDeApuestas() {
		return CasaDeApuestas;
	}
	/**
	 * Modifica casaDeApuestas
	 * @param casaDeApuestas
	 */
	public void setCasaDeApuestas(ArrayList<CasaDeApuestas> casaDeApuestas) {
		CasaDeApuestas = casaDeApuestas;
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
