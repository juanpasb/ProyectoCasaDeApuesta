package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelGraficos extends JFrame {

	private JPanel contentPane;

	public PanelGraficos() {
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("imgbin-casino-roulette-dSR8hGvak9gpe5b2Ds53Xy4bU_t.jpg"));
		setTitle("Cuadro De Mando.exe");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVentas = new JLabel("Histórico de ventas:");
		lblVentas.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblVentas.setBounds(10, 10, 217, 36);
		contentPane.add(lblVentas);
		
		JList listVentas = new JList();
		listVentas.setBounds(20, 56, 544, 124);
		contentPane.add(listVentas);
		
		JButton btnLista1 = new JButton("MOSTRAR");
		btnLista1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel ventas = new DefaultListModel();
				ventas.addElement(""); // Aï¿½adir archivo ordenado como: Histï¿½rico de ventas de los ï¿½ltimos 5 dï¿½as por sede.
			}
		});
		btnLista1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnLista1.setBounds(236, 190, 132, 26);
		contentPane.add(btnLista1);
		
		JLabel lblTopSedes = new JLabel("Top 5 (Sedes)");
		lblTopSedes.setForeground(Color.WHITE);
		lblTopSedes.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblTopSedes.setBounds(56, 220, 154, 46);
		contentPane.add(lblTopSedes);
		
		JList listTopSedes = new JList();
		listTopSedes.setBounds(56, 276, 154, 220);
		contentPane.add(listTopSedes);
		
		JButton btnTopSedes = new JButton("MOSTRAR");
		btnTopSedes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel topSedes = new DefaultListModel();
				topSedes.addElement(""); // Aï¿½adir archivo ordenado como: Top 5 de las sedes con mayores ventas realizadas
			}
		});
		btnTopSedes.setFont(new Font("Microsoft YaHei", Font.BOLD, 10));
		btnTopSedes.setBounds(81, 506, 110, 26);
		contentPane.add(btnTopSedes);
		
		JLabel lblTopClientes = new JLabel("Top 5 (Clientes)");
		lblTopClientes.setForeground(Color.WHITE);
		lblTopClientes.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblTopClientes.setBounds(236, 226, 169, 35);
		contentPane.add(lblTopClientes);
		
		JList listTopC = new JList();
		listTopC.setBounds(236, 276, 154, 220);
		contentPane.add(listTopC);
		
		JButton btnTopC = new JButton("MOSTRAR");
		btnTopC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel topClientes = new DefaultListModel();
				topClientes.addElement(""); // Aï¿½adir archivo ordenado como: Top 5 de los clientes con mayores apuestas ganadas
			}
		});
		btnTopC.setFont(new Font("Microsoft YaHei", Font.BOLD, 10));
		btnTopC.setBounds(258, 506, 110, 26);
		contentPane.add(btnTopC);
		
		JLabel lblTopAp = new JLabel("Top 3 (Apuestas)");
		lblTopAp.setForeground(Color.WHITE);
		lblTopAp.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblTopAp.setBounds(415, 226, 149, 35);
		contentPane.add(lblTopAp);
		
		JList listTopAp = new JList();
		listTopAp.setBounds(415, 276, 149, 220);
		contentPane.add(listTopAp);
		
		JButton btnTopAp = new JButton("MOSTRAR");
		btnTopAp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel topAp = new DefaultListModel();
				topAp.addElement(""); // Aï¿½adir archivo ordenado como: Top 3 de los tipos de apuesta con mayores ganadores
			}
		});
		btnTopAp.setFont(new Font("Microsoft YaHei", Font.BOLD, 10));
		btnTopAp.setBounds(436, 506, 117, 26);
		contentPane.add(btnTopAp);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("fondo-casino-tarjetas-doradas-brillantes_1017-23677.jpg"));
		lblFondo.setBounds(10, 10, 566, 543);
		contentPane.add(lblFondo);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
				}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 10));
		btnNewButton.setBounds(491, 542, 85, 21);
		contentPane.add(btnNewButton);
		
	}
}