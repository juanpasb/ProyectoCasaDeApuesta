package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSuperastro extends JFrame {

		private JPanel panel;
		private JButton boton;
		private JComboBox signoslista, cifra1, cifra2, cifra3, cifra4;

		public PanelSuperastro() {

			setSize(600, 600);
			setTitle("SUPERASTRO");
			setLocationRelativeTo(null);
			setResizable(false);

			iniciarComponentes();
			// putImage();
			setVisible(false);

			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		public void iniciarComponentes() {

			putPanel();
			putLabels();
			botonSuerte();
			putComboBox();
		}

		public void putPanel() {

			panel = new JPanel();
			panel.setLayout(null);
			this.getContentPane().add(panel);

		}

		public void putLabels() {

			JLabel signo = new JLabel("Elija el signo zodiacal");
			signo.setBounds(20, 50, 230, 30);
			panel.add(signo);

			JLabel primer = new JLabel("Elija el primer dígito");
			primer.setBounds(20, 150, 230, 30);
			panel.add(primer);

			JLabel segundo = new JLabel("Elija el segundo dígito");
			segundo.setBounds(20, 250, 230, 30);
			panel.add(segundo);

			JLabel tercero = new JLabel("Elija el tercer dígito");
			tercero.setBounds(20, 350, 230, 30);
			panel.add(tercero);

			JLabel cuarto = new JLabel("Elija el cuarto dígito");
			cuarto.setBounds(20, 450, 230, 30);
			panel.add(cuarto);

		}

		public void botonSuerte() {

			JButton boton = new JButton("Prueba tu Suerte");
			boton.setBounds(205, 500, 170, 30);
			panel.add(boton);

			ActionListener listener = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// ...

				}

			};

			boton.addActionListener(listener);
		}

		public void putComboBox() {

			String[] signos = { "Acuario", "Piscis", "Aries", "Tauro", "Géminis", "Cáncer", "Leo", "Virgo", "Libra",
					"Escorpio", "Sagitario", "Capricornio" };

			signoslista = new JComboBox(signos);
			signoslista.setBounds(200, 50, 100, 30);
			panel.add(signoslista);

			String[] cifras = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

			cifra1 = new JComboBox(cifras);
			cifra1.setBounds(200, 150, 50, 30);
			panel.add(cifra1);

			cifra2 = new JComboBox(cifras);
			cifra2.setBounds(200, 250, 50, 30);
			panel.add(cifra2);

			cifra3 = new JComboBox(cifras);
			cifra3.setBounds(200, 350, 50, 30);
			panel.add(cifra3);

			cifra4 = new JComboBox(cifras);
			cifra4.setBounds(200, 450, 50, 30);
			panel.add(cifra4);
		}

	}