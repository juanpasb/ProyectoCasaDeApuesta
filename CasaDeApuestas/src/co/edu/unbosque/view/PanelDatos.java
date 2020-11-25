package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre completo:");
		lblNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblNombre.setBounds(10, 44, 207, 34);
		contentPane.add(lblNombre);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(227, 56, 207, 19);
		contentPane.add(tFNombre);
		tFNombre.setColumns(10);
		
		JLabel lblCc = new JLabel("Cédula:");
		lblCc.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblCc.setBounds(128, 87, 89, 34);
		contentPane.add(lblCc);
		
		tFCc = new JTextField();
		tFCc.setBounds(227, 99, 207, 19);
		contentPane.add(tFCc);
		tFCc.setColumns(10);
		
		JLabel lblSede = new JLabel("Sede actual:");
		lblSede.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblSede.setBounds(84, 131, 133, 46);
		contentPane.add(lblSede);
		
		tFSede = new JTextField();
		tFSede.setBounds(227, 149, 207, 19);
		contentPane.add(tFSede);
		tFSede.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblDireccion.setBounds(106, 187, 111, 46);
		contentPane.add(lblDireccion);
		
		tFDireccion = new JTextField();
		tFDireccion.setBounds(227, 205, 207, 19);
		contentPane.add(tFDireccion);
		tFDireccion.setColumns(10);
		
		lblCel = new JLabel("Celular:");
		lblCel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblCel.setBounds(128, 243, 89, 28);
		contentPane.add(lblCel);
		
		tFCel = new JTextField();
		tFCel.setBounds(227, 252, 207, 19);
		contentPane.add(tFCel);
		tFCel.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.setBounds(33, 417, 85, 21);
		contentPane.add(btnCreate);
		
		JButton btnRead = new JButton("READ");
		btnRead.setBounds(154, 417, 85, 21);
		contentPane.add(btnRead);
		
		JButton btnUptdate = new JButton("UPDATE");
		btnUptdate.setBounds(270, 417, 85, 21);
		contentPane.add(btnUptdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(390, 417, 85, 21);
		contentPane.add(btnDelete);
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
