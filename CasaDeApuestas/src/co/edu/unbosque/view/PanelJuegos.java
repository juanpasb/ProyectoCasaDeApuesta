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

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelJuegos extends JFrame {

	private JPanel contentPane;
	private JTextField tFNombre;
	private JTextField tFPresupuesto;
	private JComboBox cBxTipo;

	public PanelJuegos() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre del juego:");
		lblNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblNombre.setOpaque(true);
		lblNombre.setBackground(Color.ORANGE);
		lblNombre.setBounds(10, 52, 200, 30);
		contentPane.add(lblNombre);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(215, 52, 221, 30);
		contentPane.add(tFNombre);
		tFNombre.setColumns(10);
		
		cBxTipo = new JComboBox();
		cBxTipo.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		cBxTipo.setBounds(200, 226, 282, 38);
		contentPane.add(cBxTipo);
		
		
		cBxTipo.addItem("Superastro");
		cBxTipo.addItem("Baloto");
		cBxTipo.addItem("Deportivo");
		
		
		JLabel lblPresupuesto = new JLabel("Presupuesto asignado para el juego:");
		lblPresupuesto.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblPresupuesto.setOpaque(true);
		lblPresupuesto.setBackground(Color.ORANGE);
		lblPresupuesto.setBounds(10, 370, 379, 30);
		contentPane.add(lblPresupuesto);
		
		tFPresupuesto = new JTextField();
		tFPresupuesto.setBounds(395, 370, 115, 30);
		contentPane.add(tFPresupuesto);
		tFPresupuesto.setColumns(10);
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.addActionListener(new ActionListener() {
			PanelSuperastro psup = new PanelSuperastro();
			PanelBaloto pbal = new PanelBaloto();
			public void actionPerformed(ActionEvent arg0) {
				if(cBxTipo.getSelectedItem().equals("Superastro")) {
					
					psup.setVisible(true);
				}
				else if(cBxTipo.getSelectedItem().equals("Baloto")) {
					
					pbal.setVisible(true);
				}
			}
		});
		btnCrear.setBounds(120, 482, 85, 21);
		contentPane.add(btnCrear);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalir.setBounds(380, 482, 85, 21);
		contentPane.add(btnSalir);
		
		JLabel lblTipo = new JLabel("Tipo de juego:");
		lblTipo.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblTipo.setOpaque(true);
		lblTipo.setBackground(Color.ORANGE);
		lblTipo.setBounds(10, 232, 170, 30);
		contentPane.add(lblTipo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("Fondo1.jpg"));
		lblFondo.setBounds(10, 10, 566, 543);
		contentPane.add(lblFondo);
				
		ImageIcon imagen = new ImageIcon("Fondo1"
				+ ".jpg");
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

	public JTextField gettFPresupuesto() {
		return tFPresupuesto;
	}

	public void settFPresupuesto(JTextField tFPresupuesto) {
		this.tFPresupuesto = tFPresupuesto;
	}
}
