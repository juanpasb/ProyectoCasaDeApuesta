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

public class PanelReportes2 extends JFrame {

	private JPanel contentPane;

	public PanelReportes2() {
		setTitle("Reportes.exe");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\X_jdg\\git\\ProyectoCasaDeApuesta\\CasaDeApuestas\\src\\imgbin-casino-roulette-dSR8hGvak9gpe5b2Ds53Xy4bU_t.jpg"));
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApuestas = new JLabel("Detalle de apuestas realizadas:");
		lblApuestas.setForeground(Color.WHITE);
		lblApuestas.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblApuestas.setBounds(24, 31, 329, 39);
		contentPane.add(lblApuestas);
		
		JList listApuestas = new JList();
		listApuestas.setBounds(34, 80, 529, 138);
		contentPane.add(listApuestas);
		
		JButton btnLista3 = new JButton("OBTENER");
		btnLista3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel apuestas = new DefaultListModel();
				apuestas.addElement(""); /* Añadir archivo ordenado como: Detalle de apuestas realizadas por cliente y sede por fecha discriminada por día y/o por
				mes y/o por año.*/
			}
		});
		btnLista3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnLista3.setBounds(260, 228, 107, 29);
		contentPane.add(btnLista3);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 25));
		lblTotal.setBounds(260, 259, 107, 39);
		contentPane.add(lblTotal);
		
		JList listTotal = new JList();
		listTotal.setBounds(34, 308, 529, 138);
		contentPane.add(listTotal);
		
		JButton btnLista4 = new JButton("OBTENER");
		btnLista4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			DefaultListModel total = new DefaultListModel();
			total.addElement(""); /* Añadir archivo ordenado como: Total, de apuestas por sede, y tipo de juego por fecha discriminada por día y/o por mes
			y/o por año.*/
			}
		});
		btnLista4.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnLista4.setBounds(260, 456, 107, 29);
		contentPane.add(btnLista4);
		
		JButton btnSig = new JButton("SIGUIENTE");
		btnSig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//setVisible(False) & PanelReportes2 setVisible(true);
				}
		});
		btnSig.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 15));
		btnSig.setBounds(448, 517, 115, 29);
		contentPane.add(btnSig);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\X_jdg\\git\\ProyectoCasaDeApuesta\\CasaDeApuestas\\src\\32636f5ae775005bad7ae94503c93422.jpg"));
		lblFondo.setBounds(10, 10, 576, 552);
		contentPane.add(lblFondo);
	}

}
