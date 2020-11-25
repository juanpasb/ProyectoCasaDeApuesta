package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelDatos extends JFrame {

	private JPanel contentPane;
	private JTextField tFNombre;
	private JTextField tFCc;
	private JTextField tFSede;
	private JTextField tFDireccion;
	private JLabel lblCel;
	private JTextField tFCel;
	
	public PanelDatos() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre completo:");
		lblNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblNombre.setOpaque(true);
		lblNombre.setBackground(Color.ORANGE);
		lblNombre.setBounds(10, 56, 207, 30);
		contentPane.add(lblNombre);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(227, 56, 207, 30);
		contentPane.add(tFNombre);
		tFNombre.setColumns(10);
		
		JLabel lblCc = new JLabel("Cédula:");
		lblCc.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblCc.setOpaque(true);
		lblCc.setBackground(Color.ORANGE);
		lblCc.setBounds(128, 99, 89, 30);
		contentPane.add(lblCc);
		
		tFCc = new JTextField();
		tFCc.setBounds(227, 99, 207, 30);
		contentPane.add(tFCc);
		tFCc.setColumns(10);
		
		JLabel lblSede = new JLabel("Sede actual:");
		lblSede.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblSede.setOpaque(true);
		lblSede.setBackground(Color.ORANGE);
		lblSede.setBounds(84, 149, 133, 30);
		contentPane.add(lblSede);
		
		tFSede = new JTextField();
		tFSede.setBounds(227, 149, 207, 30);
		contentPane.add(tFSede);
		tFSede.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblDireccion.setOpaque(true);
		lblDireccion.setBackground(Color.ORANGE);
		lblDireccion.setBounds(106, 205, 111, 30);
		contentPane.add(lblDireccion);
		
		tFDireccion = new JTextField();
		tFDireccion.setBounds(227, 205, 207, 30);
		contentPane.add(tFDireccion);
		tFDireccion.setColumns(10);
		
		lblCel = new JLabel("Celular:");
		lblCel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblCel.setOpaque(true);
		lblCel.setBackground(Color.ORANGE);
		lblCel.setBounds(128, 252, 89, 30);
		contentPane.add(lblCel);
		
		tFCel = new JTextField();
		tFCel.setBounds(227, 252, 207, 30);
		contentPane.add(tFCel);
		tFCel.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.setBounds(33, 417, 85, 21);
		contentPane.add(btnCreate);
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelJuegos pj = new PanelJuegos();
				pj.setVisible(true);

			}

		};

		btnCreate.addActionListener(listener);	
		
		JButton btnRead = new JButton("READ");
		btnRead.setBounds(154, 417, 85, 21);
		contentPane.add(btnRead);
		
		JButton btnUptdate = new JButton("UPDATE");
		btnUptdate.setBounds(270, 417, 85, 21);
		contentPane.add(btnUptdate);
		
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(390, 417, 85, 21);
		contentPane.add(btnDelete);
		
		ImageIcon imagen = new ImageIcon("Fondo2.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 550, 550);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(550, 550, Image.SCALE_SMOOTH)));
		contentPane.add(etiqueta);
		
	}

	public JTextField gettFNombre() {
		return tFNombre;
	}

	public void settFNombre(JTextField tFNombre) {
		this.tFNombre = tFNombre;
	}

	public JTextField gettFCc() {
		return tFCc;
	}

	public void settFCc(JTextField tFCc) {
		this.tFCc = tFCc;
	}

	public JTextField gettFSede() {
		return tFSede;
	}

	public void settFSede(JTextField tFSede) {
		this.tFSede = tFSede;
	}

	public JTextField gettFDireccion() {
		return tFDireccion;
	}

	public void settFDireccion(JTextField tFDireccion) {
		this.tFDireccion = tFDireccion;
	}

	public JLabel getLblCel() {
		return lblCel;
	}

	public void setLblCel(JLabel lblCel) {
		this.lblCel = lblCel;
	}

	public JTextField gettFCel() {
		return tFCel;
	}

	public void settFCel(JTextField tFCel) {
		this.tFCel = tFCel;
	}

}
