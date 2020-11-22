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
	private JButton boton;
	private PanelCreacionCasa pcasa;

	public PanelBienvenida() {

		setSize(500, 500);
		setTitle("Bienvenido al programa de creación de casa de apuestas");
		setLocationRelativeTo(null);
		setResizable(false);

		putPanel();
		putImage();
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void putPanel() {

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		botonEmpezar();
	}

	public void botonEmpezar() {

		JButton boton = new JButton("Empezar");
		boton.setBounds(205, 420, 100, 30);
		panel.add(boton);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				pcasa = new PanelCreacionCasa();

			}

		};

		boton.addActionListener(listener);
	}

	public void putImage() {

		ImageIcon imagen = new ImageIcon("logoApuestas.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 500, 500);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);

	}

}
