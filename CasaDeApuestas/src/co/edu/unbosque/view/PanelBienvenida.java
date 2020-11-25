package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBienvenida extends JFrame {

	private JPanel panel;
	public JButton boton;
	private PanelCreacionCasa pcasa;
	
/**
 * Este metodo sirve para inicializar el panel bienvenida
 */
	public PanelBienvenida() {

		setSize(500, 500);
		setTitle("Bienvenido al programa de creaci�n de casa de apuestas");
		setLocationRelativeTo(null);
		setResizable(false);

		putPanel();
		putImage();
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
/**
 * Este metodo agrega el contenido al panel
 */
	public void putPanel() {

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		botonEmpezar();
	}
/**
 * Este metodo sirve para asignarle un oyente al boton empezar
 */
	public void botonEmpezar() {
		
		JButton boton = new JButton("Empezar");
		boton.setBounds(205, 420, 100, 30);
		panel.add(boton);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pcasa = new PanelCreacionCasa();	
				pcasa.setVisible(true);
			}

		};

		boton.addActionListener(listener);
	}
/**
 * Este metodo agrega la imagen al panel
 */
	public void putImage() {

		ImageIcon imagen = new ImageIcon("logoApuestas.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 500, 500);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);

	}
/**
 * Devuelve panel
 * @return panel
 */
	public JPanel getPanel() {
		return panel;
	}
/**
 * Modifica panel
 * @param panel
 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
/**
 * Devuelve boton
 * @return boton
 */
	public JButton getBoton() {
		return boton;
	}
/**
 * Modifica boton
 * @param boton
 */
	public void setBoton(JButton boton) {
		this.boton = boton;
	}
/**
 * Devuelve pcasa
 * @return pcasa
 */
	public PanelCreacionCasa getPcasa() {
		return pcasa;
	}
/**
 * Modifica pcasa
 * @param pcasa
 */
	public void setPcasa(PanelCreacionCasa pcasa) {
		this.pcasa = pcasa;
	}

}
