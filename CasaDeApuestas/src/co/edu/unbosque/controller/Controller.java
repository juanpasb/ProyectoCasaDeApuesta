package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.ApostadorDao;
import co.edu.unbosque.model.persistence.BalotoDao;
import co.edu.unbosque.model.persistence.CasaDeApuestasDao;
import co.edu.unbosque.model.persistence.JuegosDao;
import co.edu.unbosque.model.persistence.OperacionArchivo;
import co.edu.unbosque.model.persistence.SedesCasaApuestasDao;
import co.edu.unbosque.model.persistence.SuperAstroDao;
import co.edu.unbosque.view.PanelBienvenida;
import co.edu.unbosque.view.PanelCreacionCasa;
import co.edu.unbosque.view.PanelSedes;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	private ApostadorDao apostadorDao;
	private BalotoDao balotoDao;
	private CasaDeApuestasDao casaDeApuestasDao;
	private JuegosDao juegosDao;
	private OperacionArchivo operacionArchivo;
	private SedesCasaApuestasDao sedesCasaApuestaDao;
	private SuperAstroDao superAstroDao;
	private PanelBienvenida panelBienvenida;
	private PanelCreacionCasa pCasa;
	private PanelSedes panelSedes;
	private View view;

	private File apostadores = new File("Data/apostadores.dat");
	private File apuestasbaloto = new File("Data/apuestas-baloto.dat");
	private File apuestasmarcadores = new File("Data/apuestas-marcadores.dat");
	private File apuestassuperastro = new File("Data/apuestas-superastro.dat");
	private File juegos = new File("Data/juegos.dat");
	private File config = new File("Data/config.properties");
	private File sedes = new File("Data/sedes.dat");

	private View gui;

	public Controller() throws ParseException {

		apostadorDao = new ApostadorDao();
		balotoDao = new BalotoDao();
		casaDeApuestasDao = new CasaDeApuestasDao();
		juegosDao = new JuegosDao();
		operacionArchivo = new OperacionArchivo();
		sedesCasaApuestaDao = new SedesCasaApuestasDao();
		superAstroDao = new SuperAstroDao();
		panelBienvenida = new PanelBienvenida();
		pCasa = new PanelCreacionCasa();
		panelSedes = new PanelSedes();

		gui = new View();

		apostadorDao.setApostador(operacionArchivo.leerArchivo(apostadores));
		// balotoDao
		casaDeApuestasDao.setCasaDeApuestas(operacionArchivo.leerArchivo1(config));
		juegosDao.setJuego(operacionArchivo.leerArchivo3(juegos));
		sedesCasaApuestaDao.setSedesCasaApuesta(operacionArchivo.leerArchivo2(sedes));
		// superAstro
	}

	public void actionListener(ActionListener escuchador) {
		panelBienvenida.boton.addActionListener(escuchador);
		pCasa.getBoton().addActionListener(escuchador);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (panelBienvenida.boton == e.getSource()) {
//			panelCreacionCasa.getPanel().setVisible(true);
//			panelBienvenida.setVisible(false);
		}
		if (e.getActionCommand().equals("Añadir")) {
			if (!pCasa.getNombreCasa().getText().equals("") && !pCasa.getPresupuestoTotal().getText().equals("")) {
				String nombre = pCasa.getNombreCasa().getText().toUpperCase();
				String numSedes = pCasa.getPresupuestoTotal().getSelectedText();
				int presupuesto = Integer.parseInt(pCasa.getPresupuestoTotal().getText());

				casaDeApuestasDao.agregarCasaDeApuestas(nombre, numSedes, presupuesto, config);
				JOptionPane.showMessageDialog(null, "Se agrego correctamente la casa de apuestas", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
			}

		}

	}

}
