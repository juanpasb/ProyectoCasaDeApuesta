package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PanelInfo extends JFrame {

	private JPanel contentPane;
/**
 * Este metodo inicializa el panel info
 */
	public PanelInfo() {
		
		setTitle("help.exe");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PanelInfo.class.getResource("/ProyectoFinalApuestas/src/imgbin-casino-roulette-dSR8hGvak9gpe5b2Ds53Xy4bU_t.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblTítulo = new JLabel("HELP");
		lblTítulo.setFont(new Font("Microsoft YaHei", Font.BOLD | Font.ITALIC, 25));
		lblTítulo.setBounds(98, 51, 78, 49);
		contentPane.add(lblTítulo);
		
		JLabel lblInfo = new JLabel("La Casa de Apuestas \"_____\" \n\nmaneja apuestas en superastro, \n\nchance y pron\u00F3sticos \n\nfutbol\u00EDsticos.");
		lblInfo.setVerticalAlignment(SwingConstants.TOP);
		lblInfo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		lblInfo.setForeground(new Color(0, 0, 0));
		lblInfo.setBounds(30, 135, 218, 307);
		contentPane.add(lblInfo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("/ProyectoFinalApuestas/src/UEBlogo.png"));
		lblFondo.setBounds(10, 10, 266, 543);
		contentPane.add(lblFondo);
	}
/**
 * Devuelve contentPane
 * @Return contentPane
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

	
}
