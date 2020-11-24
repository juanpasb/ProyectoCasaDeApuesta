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
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelReportes extends JFrame {

	private JPanel contentPane;

	public PanelReportes() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\X_jdg\\git\\ProyectoCasaDeApuesta\\CasaDeApuestas\\src\\imgbin-casino-roulette-dSR8hGvak9gpe5b2Ds53Xy4bU_t.jpg"));
		setTitle("Reportes.exe");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientes = new JLabel("Listado de clientes:");
		lblClientes.setForeground(Color.WHITE);
		lblClientes.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblClientes.setBounds(24, 24, 197, 43);
		contentPane.add(lblClientes);
		
		JList listClientes = new JList();
		listClientes.setBounds(34, 77, 522, 133);
		contentPane.add(listClientes);
		
		JButton btnLista1 = new JButton("OBTENER");
		btnLista1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			DefaultListModel clientes = new DefaultListModel();
			clientes.addElement(""); //Añadir archivo ordenado como: Listado de clientes por sede por fecha discriminada por día y/o por mes y/o por año.
			}
		});
		btnLista1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnLista1.setBounds(251, 220, 107, 29);
		contentPane.add(btnLista1);
		
		JLabel lblTotalAp = new JLabel("Valor total de apuestas:");
		lblTotalAp.setForeground(Color.WHITE);
		lblTotalAp.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblTotalAp.setBounds(24, 259, 245, 35);
		contentPane.add(lblTotalAp);
		
		JList listTotalAp = new JList();
		listTotalAp.setBounds(24, 304, 532, 133);
		contentPane.add(listTotalAp);
		
		JButton btnLista2 = new JButton("OBTENER");
		btnLista2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			DefaultListModel totalAp = new DefaultListModel ();
			totalAp.addElement(""); /*Añadir archivo ordenado como: Valor total de apuestas por cliente por fecha discriminada por día y/o por mes y/o por
			año.*/
			}
		});
		btnLista2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnLista2.setBounds(251, 447, 107, 29);
		contentPane.add(btnLista2);
		
		JButton btnSig = new JButton("SIGUIENTE");
		btnSig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//setVisible(False) & PanelReportes2 setVisible(true);
			}
		});
		btnSig.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 15));
		btnSig.setBounds(430, 512, 126, 29);
		contentPane.add(btnSig);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\X_jdg\\git\\ProyectoCasaDeApuesta\\CasaDeApuestas\\src\\32636f5ae775005bad7ae94503c93422.jpg"));
		lblFondo.setBounds(10, 10, 566, 543);
		contentPane.add(lblFondo);
	}
}
