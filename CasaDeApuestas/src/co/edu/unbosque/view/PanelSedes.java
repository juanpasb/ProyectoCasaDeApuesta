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

public class PanelSedes extends JFrame {

	private JPanel panel;

	public PanelSedes() {

	}
/**
 * Este emtodo sirve pa instanciar el panel cuando hay unaSede
 */
	public void unaSede() {
		
		String a;

		setSize(500, 500);
		setTitle("Creaci�n de los par�metros de una sede");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		JLabel numEmpleados = new JLabel("Ingrese el n�mero de empleados de la sede");
		numEmpleados.setBounds(20, 150, 280, 30);
		panel.add(numEmpleados);

		JLabel sedes = new JLabel("Elija la ubicaci�n (localidad) de la sede");
		sedes.setBounds(20, 250, 280, 30);
		panel.add(sedes);

		JTextField numEmpleadosT = new JTextField();
		numEmpleadosT.setBounds(300, 150, 100, 30);
		panel.add(numEmpleadosT);

		String[] localidades = { "Antonio Nari�o", "Barrios Unidos", "Bosa", "Chapinero", "Ciudad Bolivar", "Engativa",
				"Fontib�n", "Kennedy", "La Candelaria", "Los Martires", "Puente Aranda", "Rafael Uribe Uribe",
				"San Cristobal", "Santa Fe", "Suba", "Sumapaz", "Teusaquillo", "Tunjuelito", "Usaqu�n", "Usme" };

		JComboBox lista = new JComboBox(localidades);
		lista.setBounds(290, 250, 180, 30);
		panel.add(lista);
		
		a = lista.getSelectedItem().toString();

		JButton crear = new JButton("Crear");
		crear.setBounds(205, 420, 100, 30);
		panel.add(crear);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelDatos pd = new PanelDatos();
				pd.setVisible(true);

			}

		};

		crear.addActionListener(listener);	
		
		ImageIcon imagen = new ImageIcon("sedesWall.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 500, 500);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);

	}
	/**
	 * Este emtodo sirve pa instanciar el panel cuando hay dosSede
	 */
	public void dosSedes() {
		
		String a,b;

		setSize(500, 500);
		setTitle("Creaci�n de los par�metros de dos sedes");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		JLabel numEmpleados = new JLabel("Ingrese el n�mero de empleados de la sede 1");
		numEmpleados.setBounds(20, 100, 300, 30);
		panel.add(numEmpleados);

		JLabel sedes = new JLabel("Elija la ubicaci�n (localidad) de la sede 1");
		sedes.setBounds(20, 150, 280, 30);
		panel.add(sedes);

		JLabel numEmpleados2 = new JLabel("Ingrese el n�mero de empleados de la sede 2");
		numEmpleados2.setBounds(20, 250, 300, 30);
		panel.add(numEmpleados2);

		JLabel sedes2 = new JLabel("Elija la ubicaci�n (localidad) de la sede 2");
		sedes2.setBounds(20, 300, 280, 30);
		panel.add(sedes2);

		JTextField numEmpleadosT = new JTextField();
		numEmpleadosT.setBounds(310, 100, 100, 30);
		panel.add(numEmpleadosT);

		JTextField numEmpleadosT2 = new JTextField();
		numEmpleadosT2.setBounds(310, 250, 100, 30);
		panel.add(numEmpleadosT2);

		String[] localidades = { "Antonio Nari�o", "Barrios Unidos", "Bosa", "Chapinero", "Ciudad Bolivar", "Engativ�",
				"Fontib�n", "Kennedy", "La Candelaria", "Los M�rtires", "Puente Aranda", "Rafael Uribe Uribe",
				"San Crist�bal", "Santa Fe", "Suba", "Sumapaz", "Teusaquillo", "Tunjuelito", "Usaqu�n", "Usme" };

		JComboBox lista = new JComboBox(localidades);
		lista.setBounds(290, 150, 180, 30);
		panel.add(lista);
		
		a = lista.getSelectedItem().toString();

		JComboBox lista2 = new JComboBox(localidades);
		lista2.setBounds(290, 300, 180, 30);
		panel.add(lista2);
		
		b = lista.getSelectedItem().toString();


		JButton crear = new JButton("Crear");
		crear.setBounds(205, 420, 100, 30);
		panel.add(crear);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelDatos pd = new PanelDatos();
				pd.setVisible(true);
			}

		};

		crear.addActionListener(listener);
		
		
		ImageIcon imagen = new ImageIcon("sedesWall.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 500, 500);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);
	}
	/**
	 * Este emtodo sirve pa instanciar el panel cuando hay tresSedea
	 */
	public void tresSedes() {
		
		String a,b,c;

		setSize(700, 700);
		setTitle("Creaci�n de los par�metros de tres sedes");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		JLabel numEmpleados = new JLabel("Ingrese el n�mero de empleados de la sede 1");
		numEmpleados.setBounds(20, 80, 300, 30);
		panel.add(numEmpleados);

		JLabel sedes = new JLabel("Elija la ubicaci�n (localidad) de la sede 1");
		sedes.setBounds(20, 120, 280, 30);
		panel.add(sedes);

		JLabel numEmpleados2 = new JLabel("Ingrese el n�mero de empleados de la sede 2");
		numEmpleados2.setBounds(20, 280, 300, 30);
		panel.add(numEmpleados2);

		JLabel sedes2 = new JLabel("Elija la ubicaci�n (localidad) de la sede 2");
		sedes2.setBounds(20, 320, 280, 30);
		panel.add(sedes2);

		JLabel numEmpleados3 = new JLabel("Ingrese el n�mero de empleados de la sede 3");
		numEmpleados3.setBounds(20, 430, 300, 30);
		panel.add(numEmpleados3);

		JLabel sedes3 = new JLabel("Elija la ubicaci�n (localidad) de la sede 3");
		sedes3.setBounds(20, 470, 280, 30);
		panel.add(sedes3);

		JTextField numEmpleadosT = new JTextField();
		numEmpleadosT.setBounds(310, 80, 100, 30);
		panel.add(numEmpleadosT);

		JTextField numEmpleadosT2 = new JTextField();
		numEmpleadosT2.setBounds(310, 280, 100, 30);
		panel.add(numEmpleadosT2);

		JTextField numEmpleadosT3 = new JTextField();
		numEmpleadosT3.setBounds(310, 430, 100, 30);
		panel.add(numEmpleadosT3);

		String[] localidades = { "Antonio Nari�o", "Barrios Unidos", "Bosa", "Chapinero", "Ciudad Bolivar", "Engativ�",
				"Fontib�n", "Kennedy", "La Candelaria", "Los M�rtires", "Puente Aranda", "Rafael Uribe Uribe",
				"San Crist�bal", "Santa Fe", "Suba", "Sumapaz", "Teusaquillo", "Tunjuelito", "Usaqu�n", "Usme" };

		JComboBox lista = new JComboBox(localidades);
		lista.setBounds(290, 120, 180, 30);
		panel.add(lista);
		
		a = lista.getSelectedItem().toString();

		JComboBox lista2 = new JComboBox(localidades);
		lista2.setBounds(290, 320, 180, 30);
		panel.add(lista2);
		
		b = lista.getSelectedItem().toString();

		JComboBox lista3 = new JComboBox(localidades);
		lista3.setBounds(290, 470, 180, 30);
		panel.add(lista3);
		
		c = lista.getSelectedItem().toString();

		JButton crear = new JButton("Crear");
		crear.setBounds(305, 620, 100, 30);
		panel.add(crear);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelDatos pd = new PanelDatos();
				pd.setVisible(true);
			}

		};

		crear.addActionListener(listener);
		
		ImageIcon imagen = new ImageIcon("sedesWall.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 700, 700);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);
	}
	/**
	 * Este emtodo sirve pa instanciar el panel cuando hay cuatroSedes
	 */
	public void cuatroSedes() {
		
		String a,b,c,d;

		setSize(1000, 700);
		setTitle("Creaci�n de los par�metros de cuatro sedes");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		JLabel numEmpleados = new JLabel("Ingrese el n�mero de empleados de la sede 1");
		numEmpleados.setBounds(20, 80, 300, 30);
		panel.add(numEmpleados);

		JLabel sedes = new JLabel("Elija la ubicaci�n (localidad) de la sede 1");
		sedes.setBounds(20, 120, 280, 30);
		panel.add(sedes);

		JLabel numEmpleados2 = new JLabel("Ingrese el n�mero de empleados de la sede 2");
		numEmpleados2.setBounds(20, 280, 300, 30);
		panel.add(numEmpleados2);

		JLabel sedes2 = new JLabel("Elija la ubicaci�n (localidad) de la sede 2");
		sedes2.setBounds(20, 320, 280, 30);
		panel.add(sedes2);

		JLabel numEmpleados3 = new JLabel("Ingrese el n�mero de empleados de la sede 3");
		numEmpleados3.setBounds(20, 430, 300, 30);
		panel.add(numEmpleados3);

		JLabel sedes3 = new JLabel("Elija la ubicaci�n (localidad) de la sede 3");
		sedes3.setBounds(20, 470, 280, 30);
		panel.add(sedes3);

		JLabel numEmpleados4 = new JLabel("Ingrese el n�mero de empleados de la sede 4");
		numEmpleados4.setBounds(520, 280, 300, 30);
		panel.add(numEmpleados4);

		JLabel sedes4 = new JLabel("Elija la ubicaci�n (localidad) de la sede 4");
		sedes4.setBounds(520, 320, 280, 30);
		panel.add(sedes4);

		JTextField numEmpleadosT = new JTextField();
		numEmpleadosT.setBounds(310, 80, 100, 30);
		panel.add(numEmpleadosT);

		JTextField numEmpleadosT2 = new JTextField();
		numEmpleadosT2.setBounds(310, 280, 100, 30);
		panel.add(numEmpleadosT2);

		JTextField numEmpleadosT3 = new JTextField();
		numEmpleadosT3.setBounds(310, 430, 100, 30);
		panel.add(numEmpleadosT3);

		JTextField numEmpleadosT4 = new JTextField();
		numEmpleadosT4.setBounds(810, 280, 100, 30);
		panel.add(numEmpleadosT4);

		String[] localidades = { "Antonio Nari�o", "Barrios Unidos", "Bosa", "Chapinero", "Ciudad Bolivar", "Engativ�",
				"Fontib�n", "Kennedy", "La Candelaria", "Los M�rtires", "Puente Aranda", "Rafael Uribe Uribe",
				"San Crist�bal", "Santa Fe", "Suba", "Sumapaz", "Teusaquillo", "Tunjuelito", "Usaqu�n", "Usme" };

		JComboBox lista = new JComboBox(localidades);
		lista.setBounds(290, 120, 180, 30);
		panel.add(lista);
		
		a = lista.getSelectedItem().toString();

		JComboBox lista2 = new JComboBox(localidades);
		lista2.setBounds(290, 320, 180, 30);
		panel.add(lista2);
		
		b = lista.getSelectedItem().toString();

		JComboBox lista3 = new JComboBox(localidades);
		lista3.setBounds(290, 470, 180, 30);
		panel.add(lista3);
		
		c = lista.getSelectedItem().toString();

		JComboBox lista4 = new JComboBox(localidades);
		lista4.setBounds(780, 320, 180, 30);
		panel.add(lista4);
		
		d = lista.getSelectedItem().toString();

		JButton crear = new JButton("Crear");
		crear.setBounds(450, 620, 100, 30);
		panel.add(crear);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelDatos pd = new PanelDatos();
				pd.setVisible(true);
			}

		};

		crear.addActionListener(listener);
		
		ImageIcon imagen = new ImageIcon("sedesWall.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 1000, 700);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);
	}
	/**
	 * Este emtodo sirve pa instanciar el panel cuando hay cincoSedes
	 */
	public void cincoSedes() {
		
		String a,b,c,d,e;

		setSize(1000, 700);
		setTitle("Creaci�n de los par�metros de cinco sedes");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		JLabel numEmpleados = new JLabel("Ingrese el n�mero de empleados de la sede 1");
		numEmpleados.setBounds(20, 80, 300, 30);
		panel.add(numEmpleados);

		JLabel sedes = new JLabel("Elija la ubicaci�n (localidad) de la sede 1");
		sedes.setBounds(20, 120, 280, 30);
		panel.add(sedes);

		JLabel numEmpleados2 = new JLabel("Ingrese el n�mero de empleados de la sede 2");
		numEmpleados2.setBounds(20, 280, 300, 30);
		panel.add(numEmpleados2);

		JLabel sedes2 = new JLabel("Elija la ubicaci�n (localidad) de la sede 2");
		sedes2.setBounds(20, 320, 280, 30);
		panel.add(sedes2);

		JLabel numEmpleados3 = new JLabel("Ingrese el n�mero de empleados de la sede 3");
		numEmpleados3.setBounds(20, 430, 300, 30);
		panel.add(numEmpleados3);

		JLabel sedes3 = new JLabel("Elija la ubicaci�n (localidad) de la sede 3");
		sedes3.setBounds(20, 470, 280, 30);
		panel.add(sedes3);

		JLabel numEmpleados4 = new JLabel("Ingrese el n�mero de empleados de la sede 4");
		numEmpleados4.setBounds(520, 80, 300, 30);
		panel.add(numEmpleados4);

		JLabel sedes4 = new JLabel("Elija la ubicaci�n (localidad) de la sede 4");
		sedes4.setBounds(520, 120, 280, 30);
		panel.add(sedes4);

		JLabel numEmpleados5 = new JLabel("Ingrese el n�mero de empleados de la sede 5");
		numEmpleados5.setBounds(520, 280, 300, 30);
		panel.add(numEmpleados5);

		JLabel sedes5 = new JLabel("Elija la ubicaci�n (localidad) de la sede 5");
		sedes5.setBounds(520, 320, 280, 30);
		panel.add(sedes5);

		JTextField numEmpleadosT = new JTextField();
		numEmpleadosT.setBounds(310, 80, 100, 30);
		panel.add(numEmpleadosT);

		JTextField numEmpleadosT2 = new JTextField();
		numEmpleadosT2.setBounds(310, 280, 100, 30);
		panel.add(numEmpleadosT2);

		JTextField numEmpleadosT3 = new JTextField();
		numEmpleadosT3.setBounds(310, 430, 100, 30);
		panel.add(numEmpleadosT3);

		JTextField numEmpleadosT4 = new JTextField();
		numEmpleadosT4.setBounds(810, 80, 100, 30);
		panel.add(numEmpleadosT4);

		JTextField numEmpleadosT5 = new JTextField();
		numEmpleadosT5.setBounds(810, 280, 100, 30);
		panel.add(numEmpleadosT5);

		String[] localidades = { "Antonio Nari�o", "Barrios Unidos", "Bosa", "Chapinero", "Ciudad Bolivar", "Engativ�",
				"Fontib�n", "Kennedy", "La Candelaria", "Los M�rtires", "Puente Aranda", "Rafael Uribe Uribe",
				"San Crist�bal", "Santa Fe", "Suba", "Sumapaz", "Teusaquillo", "Tunjuelito", "Usaqu�n", "Usme" };

		JComboBox lista = new JComboBox(localidades);
		lista.setBounds(290, 120, 180, 30);
		panel.add(lista);
		
		a = lista.getSelectedItem().toString();

		JComboBox lista2 = new JComboBox(localidades);
		lista2.setBounds(290, 320, 180, 30);
		panel.add(lista2);
		
		b = lista.getSelectedItem().toString();

		JComboBox lista3 = new JComboBox(localidades);
		lista3.setBounds(290, 470, 180, 30);
		panel.add(lista3);
		
		c = lista.getSelectedItem().toString();

		JComboBox lista4 = new JComboBox(localidades);
		lista4.setBounds(780, 120, 180, 30);
		panel.add(lista4);
		
		d = lista.getSelectedItem().toString();

		JComboBox lista5 = new JComboBox(localidades);
		lista5.setBounds(780, 320, 180, 30);
		panel.add(lista5);

		e = lista.getSelectedItem().toString();
		
		JButton crear = new JButton("Crear");
		crear.setBounds(450, 620, 100, 30);
		panel.add(crear);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelDatos pd = new PanelDatos();
				pd.setVisible(true);
			}

		};
		
		crear.addActionListener(listener);
		
		
		ImageIcon imagen = new ImageIcon("sedesWall.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 1000, 500);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH)));
		panel.add(etiqueta);
	}
	/**
	 * Este emtodo sirve pa instanciar el panel cuando hay seisSede
	 */
	public void seisSedes() {
		
		String a,b,c,d,e,f;
		

		setSize(1000, 700);
		setTitle("Creaci�n de los par�metros de seis sedes");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		JLabel numEmpleados = new JLabel("Ingrese el n�mero de empleados de la sede 1");
		numEmpleados.setBounds(20, 80, 300, 30);
		panel.add(numEmpleados);

		JLabel sedes = new JLabel("Elija la ubicaci�n (localidad) de la sede 1");
		sedes.setBounds(20, 120, 280, 30);
		panel.add(sedes);

		JLabel numEmpleados2 = new JLabel("Ingrese el n�mero de empleados de la sede 2");
		numEmpleados2.setBounds(20, 280, 300, 30);
		panel.add(numEmpleados2);

		JLabel sedes2 = new JLabel("Elija la ubicaci�n (localidad) de la sede 2");
		sedes2.setBounds(20, 320, 280, 30);
		panel.add(sedes2);

		JLabel numEmpleados3 = new JLabel("Ingrese el n�mero de empleados de la sede 3");
		numEmpleados3.setBounds(20, 430, 300, 30);
		panel.add(numEmpleados3);

		JLabel sedes3 = new JLabel("Elija la ubicaci�n (localidad) de la sede 3");
		sedes3.setBounds(20, 470, 280, 30);
		panel.add(sedes3);

		JLabel numEmpleados4 = new JLabel("Ingrese el n�mero de empleados de la sede 4");
		numEmpleados4.setBounds(520, 80, 300, 30);
		panel.add(numEmpleados4);

		JLabel sedes4 = new JLabel("Elija la ubicaci�n (localidad) de la sede 4");
		sedes4.setBounds(520, 120, 280, 30);
		panel.add(sedes4);

		JLabel numEmpleados5 = new JLabel("Ingrese el n�mero de empleados de la sede 5");
		numEmpleados5.setBounds(520, 280, 300, 30);
		panel.add(numEmpleados5);

		JLabel sedes5 = new JLabel("Elija la ubicaci�n (localidad) de la sede 5");
		sedes5.setBounds(520, 320, 280, 30);
		panel.add(sedes5);

		JLabel numEmpleados6 = new JLabel("Ingrese el n�mero de empleados de la sede 6");
		numEmpleados6.setBounds(520, 430, 300, 30);
		panel.add(numEmpleados6);

		JLabel sedes6 = new JLabel("Elija la ubicaci�n (localidad) de la sede 6");
		sedes6.setBounds(520, 470, 280, 30);
		panel.add(sedes6);

		JTextField numEmpleadosT = new JTextField();
		numEmpleadosT.setBounds(310, 80, 100, 30);
		panel.add(numEmpleadosT);

		JTextField numEmpleadosT2 = new JTextField();
		numEmpleadosT2.setBounds(310, 280, 100, 30);
		panel.add(numEmpleadosT2);

		JTextField numEmpleadosT3 = new JTextField();
		numEmpleadosT3.setBounds(310, 430, 100, 30);
		panel.add(numEmpleadosT3);

		JTextField numEmpleadosT4 = new JTextField();
		numEmpleadosT4.setBounds(810, 80, 100, 30);
		panel.add(numEmpleadosT4);

		JTextField numEmpleadosT5 = new JTextField();
		numEmpleadosT5.setBounds(810, 280, 100, 30);
		panel.add(numEmpleadosT5);

		JTextField numEmpleadosT6 = new JTextField();
		numEmpleadosT6.setBounds(810, 430, 100, 30);
		panel.add(numEmpleadosT6);

		String[] localidades = { "Antonio Nari�o", "Barrios Unidos", "Bosa", "Chapinero", "Ciudad Bolivar", "Engativ�",
				"Fontib�n", "Kennedy", "La Candelaria", "Los M�rtires", "Puente Aranda", "Rafael Uribe Uribe",
				"San Crist�bal", "Santa Fe", "Suba", "Sumapaz", "Teusaquillo", "Tunjuelito", "Usaqu�n", "Usme" };

		JComboBox lista = new JComboBox(localidades);
		lista.setBounds(290, 120, 180, 30);
		panel.add(lista);
		
			a = lista.getSelectedItem().toString();
	
			
		JComboBox lista2 = new JComboBox(localidades);
		lista2.setBounds(290, 320, 180, 30);
		panel.add(lista2);
		
		b = lista2.getSelectedItem().toString();


		JComboBox lista3 = new JComboBox(localidades);
		lista3.setBounds(290, 470, 180, 30);
		panel.add(lista3);
		
		c = lista2.getSelectedItem().toString();


		JComboBox lista4 = new JComboBox(localidades);
		lista4.setBounds(780, 120, 180, 30);
		panel.add(lista4);
		
		d = lista2.getSelectedItem().toString();


		JComboBox lista5 = new JComboBox(localidades);
		lista5.setBounds(780, 320, 180, 30);
		panel.add(lista5);
		
		e = lista2.getSelectedItem().toString();


		JComboBox lista6 = new JComboBox(localidades);
		lista6.setBounds(780, 470, 180, 30);
		panel.add(lista6);
		
		
		f = lista2.getSelectedItem().toString();


		JButton crear = new JButton("Crear");
		crear.setBounds(450, 620, 100, 30);
		panel.add(crear);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelDatos pd = new PanelDatos();
				pd.setVisible(true);
			}

		};
		
		crear.addActionListener(listener);
		
		ImageIcon imagen = new ImageIcon("sedesWall.jpg");
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(0, 0, 1000, 700);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH)));
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
	

}
