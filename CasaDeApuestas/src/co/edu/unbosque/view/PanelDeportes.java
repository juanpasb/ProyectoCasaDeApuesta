package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDeportes extends JFrame {

	private JPanel contentPane;

	public PanelDeportes() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("PRON\u00D3STICO DE JUEGO");
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblTitulo.setBounds(138, 10, 256, 63);
		contentPane.add(lblTitulo);
		
		JButton btnNewButton = new JButton("BUSCAR EQUIPO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(191, 96, 149, 43);
		contentPane.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(10, 191, 526, 187);
		contentPane.add(list);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalir.setBounds(451, 491, 85, 21);
		contentPane.add(btnSalir);
	}
}
