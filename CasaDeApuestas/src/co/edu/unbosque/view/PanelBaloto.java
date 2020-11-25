package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBaloto extends JFrame {

	private JPanel panel;
	private JButton boton;
	private JComboBox signoslista, cifra1, cifra2, cifra3, cifra4, cifra5, cifra6;

	public PanelBaloto() {

		setSize(700, 700);
		setTitle("BALOTO");
		setLocationRelativeTo(null);
		setResizable(false);

		iniciarComponentes();
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

		JLabel signo = new JLabel("Elija el primer dígito");
		signo.setBounds(20, 50, 230, 30);
		panel.add(signo);

		JLabel primer = new JLabel("Elija el segundo dígito");
		primer.setBounds(20, 150, 230, 30);
		panel.add(primer);

		JLabel segundo = new JLabel("Elija el tercer dígito");
		segundo.setBounds(20, 250, 230, 30);
		panel.add(segundo);

		JLabel tercero = new JLabel("Elija el cuarto dígito");
		tercero.setBounds(20, 350, 230, 30);
		panel.add(tercero);

		JLabel cuarto = new JLabel("Elija el quinto dígito");
		cuarto.setBounds(20, 450, 230, 30);
		panel.add(cuarto);
		
		JLabel quinto = new JLabel("Elija el sexto dígito");
		quinto.setBounds(20, 550, 230, 30);
		panel.add(quinto);

	}

	public void botonSuerte() {

		JButton boton = new JButton("Prueba tu Suerte");
		boton.setBounds(225, 600, 170, 30);
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

		String[] cifras = { "1", "2", "3", "4", "5", "6", "7", "8", "9","10","11","12","13","14","15","16","17","18","19",
				"20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45"};

		cifra1 = new JComboBox(cifras);
		cifra1.setBounds(200, 50, 50, 30);
		panel.add(cifra1);

		cifra2 = new JComboBox(cifras);
		cifra2.setBounds(200, 150, 50, 30);
		panel.add(cifra2);

		cifra3 = new JComboBox(cifras);
		cifra3.setBounds(200, 250, 50, 30);
		panel.add(cifra3);

		cifra4 = new JComboBox(cifras);
		cifra4.setBounds(200, 350, 50, 30);
		panel.add(cifra4);
		
		cifra5 = new JComboBox(cifras);
		cifra5.setBounds(200, 450, 50, 30);
		panel.add(cifra5);
		
		cifra6 = new JComboBox(cifras);
		cifra6.setBounds(200, 550, 50, 30);
		panel.add(cifra6);
	}

}
