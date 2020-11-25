package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelJuegos extends JFrame {

	private JPanel contentPane;
	private JTextField tFNombre;
	private JTextField tFPresupuesto;

	public PanelJuegos() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre del juego:");
		lblNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblNombre.setBounds(10, 35, 200, 44);
		contentPane.add(lblNombre);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(209, 52, 221, 19);
		contentPane.add(tFNombre);
		tFNombre.setColumns(10);
		
		JComboBox cBxTipo = new JComboBox();
		cBxTipo.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		cBxTipo.setBounds(220, 226, 282, 38);
		contentPane.add(cBxTipo);
		
		
		cBxTipo.addItem("Chance");
		cBxTipo.addItem("Loteria");
		cBxTipo.addItem("Deportivo");
		
		
		JLabel lblPresupuesto = new JLabel("Presupuesto asignado para el juego:");
		lblPresupuesto.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblPresupuesto.setBounds(10, 356, 379, 38);
		contentPane.add(lblPresupuesto);
		
		tFPresupuesto = new JTextField();
		tFPresupuesto.setBounds(387, 370, 115, 19);
		contentPane.add(tFPresupuesto);
		tFPresupuesto.setColumns(10);
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCrear.setBounds(10, 482, 85, 21);
		contentPane.add(btnCrear);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalir.setBounds(441, 482, 85, 21);
		contentPane.add(btnSalir);
		
		JLabel lblTipo = new JLabel("Seleccione tipo de juego:");
		lblTipo.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblTipo.setBounds(10, 232, 200, 30);
		contentPane.add(lblTipo);
		
		
				
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
