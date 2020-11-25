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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDatos extends JFrame {

	private JPanel contentPane;
	private JTextField tFNombre;
	private JTextField tFCc;
	private JTextField tFSede;
	private JTextField tFDir;
	private JTextField tFCel;

	public PanelDatos() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("\u00A1BIENVENIDO APOSTADOR!");
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 25));
		lblTitulo.setBounds(64, 10, 384, 73);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblNombre.setBounds(41, 93, 96, 35);
		contentPane.add(lblNombre);
		
		tFNombre = new JTextField();
		tFNombre.setBounds(147, 105, 301, 19);
		contentPane.add(tFNombre);
		tFNombre.setColumns(10);
		
		JLabel lblCC = new JLabel("C\u00E9dula:");
		lblCC.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblCC.setBounds(57, 140, 96, 28);
		contentPane.add(lblCC);
		
		tFCc = new JTextField();
		tFCc.setBounds(147, 149, 301, 19);
		contentPane.add(tFCc);
		tFCc.setColumns(10);
		
		JLabel lblSede = new JLabel("Sede actual:");
		lblSede.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblSede.setBounds(10, 178, 129, 28);
		contentPane.add(lblSede);
		
		tFSede = new JTextField();
		tFSede.setBounds(147, 187, 301, 19);
		contentPane.add(tFSede);
		tFSede.setColumns(10);
		
		JLabel lblDir = new JLabel("Direcci\u00F3n:");
		lblDir.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblDir.setBounds(36, 218, 117, 35);
		contentPane.add(lblDir);
		
		tFDir = new JTextField();
		tFDir.setBounds(147, 230, 301, 19);
		contentPane.add(tFDir);
		tFDir.setColumns(10);
		
		JLabel lblCel = new JLabel("Celular:");
		lblCel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblCel.setBounds(48, 263, 89, 35);
		contentPane.add(lblCel);
		
		tFCel = new JTextField();
		tFCel.setBounds(147, 275, 301, 19);
		contentPane.add(tFCel);
		tFCel.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCreate.setBounds(37, 482, 85, 21);
		contentPane.add(btnCreate);
		
		JButton btnRead = new JButton("READ");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRead.setBounds(169, 482, 85, 21);
		contentPane.add(btnRead);
		
		JButton btnUptdate = new JButton("UPTDATE");
		btnUptdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUptdate.setBounds(289, 482, 85, 21);
		contentPane.add(btnUptdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDelete.setBounds(408, 482, 85, 21);
		contentPane.add(btnDelete);
	
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
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

	public JTextField gettFDir() {
		return tFDir;
	}

	public void settFDir(JTextField tFDir) {
		this.tFDir = tFDir;
	}

	public JTextField gettFCel() {
		return tFCel;
	}

	public void settFCel(JTextField tFCel) {
		this.tFCel = tFCel;
	}
	
}
