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

	private JPanel cBXTipo;
	private JTextField tFJuego;
	private JTextField tFPresup;

	public PanelJuegos() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		cBXTipo = new JPanel();
		cBXTipo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cBXTipo);
		cBXTipo.setLayout(null);
		
		JLabel lblJuego = new JLabel("Nombre del juego:");
		lblJuego.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblJuego.setBounds(10, 40, 209, 28);
		cBXTipo.add(lblJuego);
		
		tFJuego = new JTextField();
		tFJuego.setBounds(229, 49, 228, 19);
		cBXTipo.add(tFJuego);
		tFJuego.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		comboBox.setBounds(10, 134, 282, 28);
		cBXTipo.add(comboBox);
		
		comboBox.addItem("Chance");
		comboBox.addItem("Chance");
		comboBox.addItem("Chance");
		
		comboBox.setSelectedItem("Seleccione el tipo de juego");
		
		JLabel lblPresup = new JLabel("Presupuesto asignado para el juego:");
		lblPresup.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblPresup.setBounds(10, 330, 383, 36);
		cBXTipo.add(lblPresup);
		
		tFPresup = new JTextField();
		tFPresup.setBounds(388, 343, 96, 19);
		cBXTipo.add(tFPresup);
		tFPresup.setColumns(10);
		
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJugar.setBounds(229, 416, 85, 21);
		cBXTipo.add(btnJugar);
		
	}

	public JPanel getcBXTipo() {
		return cBXTipo;
	}

	public void setcBXTipo(JPanel cBXTipo) {
		this.cBXTipo = cBXTipo;
	}

	public JTextField gettFJuego() {
		return tFJuego;
	}

	public void settFJuego(JTextField tFJuego) {
		this.tFJuego = tFJuego;
	}

	public JTextField gettFPresup() {
		return tFPresup;
	}

	public void settFPresup(JTextField tFPresup) {
		this.tFPresup = tFPresup;
	}
	
}
