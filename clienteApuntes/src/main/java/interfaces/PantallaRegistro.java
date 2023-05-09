package interfaces;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PantallaRegistro extends JPanel {
	private Ventana ventana;
	private JTextField txtNombre;
	private JTextField textField_1;
	private JTextField textContra;
	private JPasswordField contraseña;
	private JTextField txtTelfono;
	private JTextField txtEmail;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtCiudad;

	public PantallaRegistro(Ventana v) {
		this.ventana = v;
		setLayout(null);
		
		JButton botonRegis = new JButton("Registrarce");
		botonRegis.setToolTipText("Pínchame pa registrarce");
		botonRegis.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		botonRegis.setBackground(new Color(255, 255, 255));
		botonRegis.setBounds(185, 355, 119, 43);
		add(botonRegis);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setFont(new Font("Bradley Hand ITC", Font.BOLD, 13));
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBackground(new Color(204, 153, 255));
		txtNombre.setBounds(35, 72, 98, 35);
		add(txtNombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(35, 123, 98, 19);
		add(textField_1);
		
		textContra = new JTextField();
		textContra.setText("Contraseña");
		textContra.setHorizontalAlignment(SwingConstants.CENTER);
		textContra.setFont(new Font("Bradley Hand ITC", Font.BOLD, 13));
		textContra.setEditable(false);
		textContra.setColumns(10);
		textContra.setBackground(new Color(204, 153, 255));
		textContra.setBounds(429, 72, 98, 35);
		add(textContra);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(429, 123, 98, 19);
		add(contraseña);
		
		txtTelfono = new JTextField();
		txtTelfono.setText("Teléfono");
		txtTelfono.setHorizontalAlignment(SwingConstants.CENTER);
		txtTelfono.setFont(new Font("Bradley Hand ITC", Font.BOLD, 13));
		txtTelfono.setEditable(false);
		txtTelfono.setColumns(10);
		txtTelfono.setBackground(new Color(204, 153, 255));
		txtTelfono.setBounds(166, 72, 98, 35);
		add(txtTelfono);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setFont(new Font("Bradley Hand ITC", Font.BOLD, 13));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBackground(new Color(204, 153, 255));
		txtEmail.setBounds(298, 72, 98, 35);
		add(txtEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(166, 123, 98, 19);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(298, 123, 98, 19);
		add(textField_4);
		
		txtCiudad = new JTextField();
		txtCiudad.setText("Ciudad");
		txtCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCiudad.setFont(new Font("Bradley Hand ITC", Font.BOLD, 13));
		txtCiudad.setEditable(false);
		txtCiudad.setColumns(10);
		txtCiudad.setBackground(new Color(204, 153, 255));
		txtCiudad.setBounds(556, 72, 98, 35);
		add(txtCiudad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecciona", "Pamplona", "Málaga", "Madrid", "Vigo"}));
		comboBox.setBounds(556, 122, 98, 21);
		add(comboBox);
	}
}
