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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDatos extends JFrame {

	private JPanel contentPane;
	private JTextField tFName;
	private JTextField tFCC;
	private JTextField tFSede;
	private JTextField tFDirección;
	private JTextField tFCel;
	
	/**
	 * Este metodo sirve para inicializar el panel datos
	 */
	public PanelDatos() {
		
		setTitle("Gestiondeapostadores.exe");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PanelDatos.class.getResource("/ProyectoFinalApuestas/src/imgbin-casino-roulette-dSR8hGvak9gpe5b2Ds53Xy4bU_t.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblTítulo = new JLabel("\u00A1BIENVENIDO APOSTADOR!");
		lblTítulo.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 25));
		lblTítulo.setForeground(Color.WHITE);
		lblTítulo.setBounds(118, 84, 367, 39);
		contentPane.add(lblTítulo);
		
		JLabel lblName = new JLabel("Nombre completo:");
		lblName.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(30, 180, 197, 39);
		contentPane.add(lblName);
		
		JLabel lblCC = new JLabel("C\u00E9dula:");
		lblCC.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblCC.setForeground(Color.WHITE);
		lblCC.setBounds(145, 229, 82, 28);
		contentPane.add(lblCC);
		
		JLabel lblSede = new JLabel("Sede actual:");
		lblSede.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblSede.setForeground(Color.WHITE);
		lblSede.setBounds(97, 267, 130, 39);
		contentPane.add(lblSede);
		
		JLabel lblDirección = new JLabel("Direcci\u00F3n:");
		lblDirección.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblDirección.setForeground(Color.WHITE);
		lblDirección.setBounds(118, 316, 109, 39);
		contentPane.add(lblDirección);
		
		JLabel lblNewLabel = new JLabel("Celular:");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(145, 365, 82, 28);
		contentPane.add(lblNewLabel);
		
		tFName = new JTextField();
		tFName.setBounds(237, 194, 96, 19);
		contentPane.add(tFName);
		tFName.setColumns(10);
		
		tFCC = new JTextField();
		tFCC.setBounds(237, 238, 96, 19);
		contentPane.add(tFCC);
		tFCC.setColumns(10);
		
		tFSede = new JTextField();
		tFSede.setBounds(237, 281, 96, 19);
		contentPane.add(tFSede);
		tFSede.setColumns(10);
		
		tFDirección = new JTextField();
		tFDirección.setBounds(237, 330, 96, 19);
		contentPane.add(tFDirección);
		tFDirección.setColumns(10);
		
		tFCel = new JTextField();
		tFCel.setBounds(237, 374, 96, 19);
		contentPane.add(tFCel);
		tFCel.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		btnCreate.setForeground(Color.BLACK);
		btnCreate.setBounds(10, 416, 125, 37);
		contentPane.add(btnCreate);
		
		JButton btnRead = new JButton("READ");
		btnRead.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		btnRead.setBounds(140, 415, 103, 38);
		contentPane.add(btnRead);
		
		JButton btnUpdate = new JButton("UPTADE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUpdate.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		btnUpdate.setBounds(247, 416, 115, 37);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		btnDelete.setBounds(366, 416, 110, 37);
		contentPane.add(btnDelete);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("/ProyectoFinalApuestas/src/Fondo1.jpg"));
		lblFondo.setBounds(10, 10, 466, 437);
		contentPane.add(lblFondo);
		
	}
/**
 * Devuelve contentPane
 * @return contentPane
 */
	public JPanel getContentPane() {
		return contentPane;
	}
/**
 * Modifica contentPane
 * @param contentPane
 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}
/**
 * Devuelve tFName
 * @return tFName
 */
	public JTextField gettFName() {
		return tFName;
	}
/**
 * Modifica tFName
 * @param tFName
 */
	public void settFName(JTextField tFName) {
		this.tFName = tFName;
	}
/**
 * Devuelve tFCC
 * @return tFCC
 */
	public JTextField gettFCC() {
		return tFCC;
	}
/**
 * Modifica tFCC
 * @param tFCC
 */
	public void settFCC(JTextField tFCC) {
		this.tFCC = tFCC;
	}
/**
 * Devuelve tFSede
 * @return tFSede
 */
	public JTextField gettFSede() {
		return tFSede;
	}
/**
 * Modifica tFSede
 * @param tFSede
 */
	public void settFSede(JTextField tFSede) {
		this.tFSede = tFSede;
	}
/**
 * Devuelve tFDirección
 * @return tFDirección
 */
	public JTextField gettFDirección() {
		return tFDirección;
	}
/**
 * Modifica tFDirección
 * @param tFDirección
 */
	public void settFDirección(JTextField tFDirección) {
		this.tFDirección = tFDirección;
	}
/**
 * Devuelve tFCel
 * @return tFCel
 */
	public JTextField gettFCel() {
		return tFCel;
	}
/**
 * Modifica tFCel 
 * @param tFCel
 */
	public void settFCel(JTextField tFCel) {
		this.tFCel = tFCel;
	}
	
	
}