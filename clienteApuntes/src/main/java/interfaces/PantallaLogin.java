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
import javax.swing.JLabel;

public class PantallaLogin extends JPanel {
	private Ventana ventana;
	private JTextField usuario1;
	private JTextField usuario2;
	private JTextField nombre;
	private JPasswordField password1;
	private JPasswordField password2;

	public PantallaLogin(Ventana v) {
		this.ventana = v;
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

		usuario1 = new JTextField();
		usuario1.setBounds(79, 214, 96, 19);
		add(usuario1);
		usuario1.setColumns(10);

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

		usuario2 = new JTextField();
		usuario2.setColumns(10);
		usuario2.setBounds(488, 259, 96, 19);
		add(usuario2);

		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(488, 203, 96, 19);
		add(nombre);

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

		password1 = new JPasswordField();
		password1.setBounds(79, 301, 101, 22);
		add(password1);

		password2 = new JPasswordField();
		password2.setBounds(488, 322, 101, 22);
		add(password2);
	}

	private static class __Tmp {
		private static void __tmp() {
			javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
