package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JPasswordField;

public class PantallaLogin extends JPanel{
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	public PantallaLogin() {
		setBackground(new Color(135, 206, 250));
		setLayout(null);
		
		JButton botonLogin = new JButton("Login");
		botonLogin.setToolTipText("Pínchame para iniciar sesión");
		botonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonLogin.setBounds(69, 354, 119, 43);
		add(botonLogin);
		
		JTextArea txtrWenohDia = new JTextArea();
		txtrWenohDia.setEditable(false);
		txtrWenohDia.setForeground(Color.WHITE);
		txtrWenohDia.setBackground(Color.MAGENTA);
		txtrWenohDia.setText("wenoh dia");
		txtrWenohDia.setBounds(290, 35, 110, 22);
		add(txtrWenohDia);
		
		textField = new JTextField();
		textField.setBounds(79, 214, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JTextArea txtrPaHaseLogin = new JTextArea();
		txtrPaHaseLogin.setEditable(false);
		txtrPaHaseLogin.setText("pa hase login");
		txtrPaHaseLogin.setBounds(79, 108, 137, 22);
		add(txtrPaHaseLogin);
		
		JButton botonRegis = new JButton("Registrarce");
		botonRegis.setToolTipText("Pínchame pa registrarce");
		botonRegis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRegis.setBounds(488, 354, 119, 43);
		add(botonRegis);
		
		JTextArea txtrLaSombrita = new JTextArea();
		txtrLaSombrita.setEditable(false);
		txtrLaSombrita.setText("la sombrita");
		txtrLaSombrita.setBounds(504, 108, 137, 22);
		add(txtrLaSombrita);
		
		JTextArea txtrPaRegistrarceVe = new JTextArea();
		txtrPaRegistrarceVe.setEditable(false);
		txtrPaRegistrarceVe.setText("pa registrarce ve por la sombrita");
		txtrPaRegistrarceVe.setBounds(199, 67, 332, 22);
		add(txtrPaRegistrarceVe);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(488, 259, 96, 19);
		add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(488, 203, 96, 19);
		add(textField_4);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setEditable(false);
		txtpnNombre.setText("nombre");
		txtpnNombre.setBounds(489, 173, 67, 19);
		add(txtpnNombre);
		
		JTextPane txtpnUsuario = new JTextPane();
		txtpnUsuario.setEditable(false);
		txtpnUsuario.setText("usuario");
		txtpnUsuario.setBounds(79, 188, 77, 22);
		add(txtpnUsuario);
		
		JTextPane txtpnUsuario_1 = new JTextPane();
		txtpnUsuario_1.setEditable(false);
		txtpnUsuario_1.setText("usuario");
		txtpnUsuario_1.setBounds(488, 227, 77, 22);
		add(txtpnUsuario_1);
		
		JTextPane txtpnContrasea = new JTextPane();
		txtpnContrasea.setEditable(false);
		txtpnContrasea.setText("contraseña");
		txtpnContrasea.setBounds(78, 259, 110, 22);
		add(txtpnContrasea);
		
		JTextPane txtpnContrasea_1 = new JTextPane();
		txtpnContrasea_1.setEditable(false);
		txtpnContrasea_1.setText("contraseña");
		txtpnContrasea_1.setBounds(488, 290, 96, 22);
		add(txtpnContrasea_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 301, 101, 22);
		add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(488, 322, 101, 22);
		add(passwordField_1);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
