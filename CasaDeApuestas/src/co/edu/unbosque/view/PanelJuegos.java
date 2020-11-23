package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelJuegos extends JFrame {

	private JPanel contentPane;
	private JTextField tFGame;
	private JTextField tFPresup;
	private JComboBox combo;
	
	public PanelJuegos() {
		setResizable(false);
		setTitle("Gestiondejuegos.exe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblGame = new JLabel("Nombre del juego:");
		lblGame.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblGame.setForeground(Color.BLACK);
		lblGame.setBounds(42, 106, 198, 28);
		contentPane.add(lblGame);
		
		tFGame = new JTextField();
		tFGame.setBounds(251, 115, 96, 19);
		contentPane.add(tFGame);
		tFGame.setColumns(10);
		
		JComboBox cBxGameType = new JComboBox();
		cBxGameType.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		cBxGameType.setEditable(true);
		cBxGameType.setBounds(42, 160, 325, 28);
		contentPane.add(cBxGameType);
		
		cBxGameType.addItem("Chance");
		cBxGameType.addItem("Lotería");
		cBxGameType.addItem("Deportivo");
		cBxGameType.setSelectedItem("Seleccione el tipo de juego:");
	
		JLabel lblPresup = new JLabel("Presupuesto asignado para el juego:");
		lblPresup.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblPresup.setForeground(Color.WHITE);
		lblPresup.setBounds(20, 372, 386, 34);
		contentPane.add(lblPresup);
		
		tFPresup = new JTextField();
		tFPresup.setBounds(388, 384, 84, 19);
		contentPane.add(tFPresup);
		tFPresup.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cBxGameType.getSelectedItem();			}
		});
		
		btnCreate.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		btnCreate.setBounds(197, 434, 118, 28);
		contentPane.add(btnCreate);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\X_jdg\\Downloads\\ProyectoCasaDeApuesta-b2ee5028194e1214967abe2a9742ea44c1ca3d4b\\CasaDeApuestas\\Data\\Fondo2.jpg"));
		lblFondo.setBounds(10, 10, 476, 452);
		contentPane.add(lblFondo);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField gettFGame() {
		return tFGame;
	}

	public void settFGame(JTextField tFGame) {
		this.tFGame = tFGame;
	}

	public JTextField gettFPresup() {
		return tFPresup;
	}

	public void settFPresup(JTextField tFPresup) {
		this.tFPresup = tFPresup;
	}

	public JComboBox getCombo() {
		return combo;
	}

	public void setCombo(JComboBox combo) {
		this.combo = combo;
	}
	
}
