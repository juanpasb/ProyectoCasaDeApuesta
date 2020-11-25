package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
			putImage();
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

			JLabel primer = new JLabel("Elija el primer d�gito");
			primer.setBounds(20, 150, 230, 30);
			panel.add(primer);

			JLabel segundo = new JLabel("Elija el segundo d�gito");
			segundo.setBounds(20, 250, 230, 30);
			panel.add(segundo);

			JLabel tercero = new JLabel("Elija el tercer d�gito");
			tercero.setBounds(20, 350, 230, 30);
			panel.add(tercero);

			JLabel cuarto = new JLabel("Elija el cuarto d�gito");
			cuarto.setBounds(20, 450, 230, 30);
			panel.add(cuarto);

		}

		public void botonSuerte() {

			JButton boton = new JButton("Prueba tu Suerte");
			boton.setBounds(220, 520, 170, 30);
			panel.add(boton);

			ActionListener listener = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					PanelReportes pR = new PanelReportes();

					JOptionPane.showMessageDialog(null, "Apuesta realizada, ¡ Buena suerte !");
					pR.setVisible(true);
				}

			};

			boton.addActionListener(listener);
		}

		public void putComboBox() {

			String[] signos = { "Acuario", "Piscis", "Aries", "Tauro", "G�minis", "C�ncer", "Leo", "Virgo", "Libra",
					"Escorpio", "Sagitario", "Capricornio" };

			signoslista = new JComboBox(signos);
			signoslista.setBounds(200, 50, 100, 30);
			panel.add(signoslista);

			String[] cifras = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

			cifra1 = new JComboBox(cifras);
			cifra1.setBounds(200, 150, 80, 30);
			panel.add(cifra1);

			cifra2 = new JComboBox(cifras);
			cifra2.setBounds(200, 250, 80, 30);
			panel.add(cifra2);

			cifra3 = new JComboBox(cifras);
			cifra3.setBounds(200, 350, 80, 30);
			panel.add(cifra3);

			cifra4 = new JComboBox(cifras);
			cifra4.setBounds(200, 450, 80, 30);
			panel.add(cifra4);
		}
		
		public void putImage() {

			ImageIcon imagen = new ImageIcon("casaWall.jpeg");
			JLabel etiqueta = new JLabel();
			etiqueta.setBounds(0, 0, 600, 600);
			etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
			panel.add(etiqueta);

		}

	}