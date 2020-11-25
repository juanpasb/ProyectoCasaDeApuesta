package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PanelInfo extends JFrame {

	private JPanel contentPane;

	public PanelInfo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("APUESTAS POSIBLES:");
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblTitulo.setBounds(145, 10, 231, 28);
		contentPane.add(lblTitulo);
		
		JLabel lblPremios = new JLabel("PREMIOS:");
		lblPremios.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblPremios.setBounds(220, 244, 105, 42);
		contentPane.add(lblPremios);
		
		JTextArea tAPremios = new JTextArea();
		tAPremios.setBounds(10, 285, 516, 179);
		contentPane.add(tAPremios);
		
		JTextArea tAApuestas = new JTextArea();
		tAApuestas.setBounds(10, 48, 516, 186);
		contentPane.add(tAApuestas);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(441, 482, 85, 21);
		contentPane.add(btnSalir);
		
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}
	
}
