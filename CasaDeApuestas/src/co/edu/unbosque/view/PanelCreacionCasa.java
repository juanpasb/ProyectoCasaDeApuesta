package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCreacionCasa extends JFrame {

	private JPanel panel;
	private JLabel nombre;
	private JTextField nombreCasa, presupuestoTotal;
	private JButton boton;
	private JComboBox lista;
	private PanelSedes psedes;
/**
 * Este metodo sirve para instanciar el panel CreacionCasa
 */
	public PanelCreacionCasa() {

		setSize(500, 500);
		setTitle("Creación de los parámetros iniciales de la casa");
		setLocationRelativeTo(null);
		setResizable(false);

		iniciarComponentes();
		putImage();
//se cambio de true
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
/**
 * Este metodo sirve para iniciar los componentes del panel
 */
	public void iniciarComponentes() {

		putPanel();
		putLabels();
		putButtons();
		putTextFields();
		putComboBox();
	}
/**
 * Este metodo sirve para colocar el contenido en el panel
 */
	public void putPanel() {

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

	}
/**
 * Este metodo sirve para colocar la estiquetas en el panel
 */
	public void putLabels() {

		JLabel nombre = new JLabel("Ingrese el nombre de la casa");
		nombre.setBounds(20, 50, 230, 30);
		panel.add(nombre);

		JLabel sedes = new JLabel("Elija el número de sedes");
		sedes.setBounds(20, 150, 230, 30);
		panel.add(sedes);

		JLabel presupuesto = new JLabel("Ingrese el presupuesto total disponible");
		presupuesto.setBounds(20, 300, 270, 30);
		panel.add(presupuesto);

	}
	/**
	 * Este metodo sirve para colocar los cuadors de texto en el panel
	 */
	public void putTextFields() {

		JTextField nombreCasa = new JTextField();
		nombreCasa.setBounds(230, 50, 200, 30);
		panel.add(nombreCasa);

		JTextField presupuestoTotal = new JTextField();
		presupuestoTotal.setBounds(280, 300, 170, 30);
		panel.add(presupuestoTotal);

	}
	/**
	 * Este metodo sirve para colocar el boton en el panel
	 */
	public void putButtons() {
		
		PanelSedes psedes = new PanelSedes();

		JButton boton = new JButton("Crear");
		boton.setBounds(205, 420, 100, 30);
		panel.add(boton);

		JLabel saludo = new JLabel();
		saludo.setBounds(50, 200, 300, 40);
		panel.add(saludo);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				if(lista.getSelectedItem().equals("1")) {
					
					psedes.unaSede();

				} else if (lista.getSelectedItem().equals("2")) {
					
					psedes.dosSedes();
					
				} else if (lista.getSelectedItem().equals("3")) {
					
					psedes.tresSedes();
					
				} else if (lista.getSelectedItem().equals("4")) {
					
					psedes.cuatroSedes();
					
				} else if (lista.getSelectedItem().equals("5")) {
					
					psedes.cincoSedes();
					
				} else if (lista.getSelectedItem().equals("6")) {
					
					psedes.seisSedes();
				}
			}

		};

		boton.addActionListener(listener);

	}
	/**
	 * Este metodo sirve para agregar el JComboBox en el panel
	 */
	public void putComboBox() {

		String[] sedes = { "1", "2", "3", "4", "5", "6" };

		lista = new JComboBox(sedes);
		lista.setBounds(200, 150, 100, 30);
		panel.add(lista);
	}
	/**
	 * Este metodo sirve para colocar la imagen en el panel
	 */
	public void putImage() {

		ImageIcon imagen = new ImageIcon("casaWall.jpeg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 500, 500);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);

	}
/**
 * Devuelve panel
 * @return panel
 */
	public JPanel getPanel() {
		return panel;
	}
/**
 * Modifica panel
 * @param panel
 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
/**
 * Devuelve nombre
 * @return nombre
 */
	public JLabel getNombre() {
		return nombre;
	}
/**
 * Modifica nombre
 * @param nombre
 */
	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}
/**
 * Devuelve nombreCasa
 * @return nombreCasa
 */
	public JTextField getNombreCasa() {
		return nombreCasa;
	}
/**
 * Modifica nombreCasa
 * @param nombreCasa
 */
	public void setNombreCasa(JTextField nombreCasa) {
		this.nombreCasa = nombreCasa;
	}
/**
 * Devuelve presupuestoTotal
 * @return  presupuestoTotal
 */
	public JTextField getPresupuestoTotal() {
		return presupuestoTotal;
	}
/**
 * Modifica presupuestoTotal
 * @param presupuestoTotal
 */
	public void setPresupuestoTotal(JTextField presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}
/**
 * Devuelve boton
 * @return boton
 */
	public JButton getBoton() {
		return boton;
	}
/**
 * Modifica boton
 * @param boton
 */
	public void setBoton(JButton boton) {
		this.boton = boton;
	}
/**
 * Devuelve lista
 * @return lista
 */
	public JComboBox getLista() {
		return lista;
	}
/**
 * Modifica lista
 * @param lista
 */
	public void setLista(JComboBox lista) {
		this.lista = lista;
	}
/**
 * Devuelve psedes
 * @return psedes
 */
	public PanelSedes getPsedes() {
		return psedes;
	}
/**
 * Modifica psedes
 * @param psedes
 */
	public void setPsedes(PanelSedes psedes) {
		this.psedes = psedes;
	}
	

}
