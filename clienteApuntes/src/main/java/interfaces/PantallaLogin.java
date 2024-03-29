package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import auxiliares.interfaz.BotonAzul;
import clases.Cliente;
import exceptions.ClienteNoExisteException;
import exceptions.ContraseñaInvalidaException;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class PantallaLogin extends PanelMadre {
	private Ventana ventana;
	private JPasswordField campoContraseña;
	private JTextField txtPaRegistrarce;
	private JTextField txtNombre;
	private JTextField txtPaHaseLogin;
	private JTextField txtLaSombrita;
	private JTextField campoNombre;
	private JLabel labelImagen;

	public PantallaLogin(Ventana v) {
		this.ventana = v;
		setBackground(new Color(74, 146, 176));
		setLayout(null);

		JButton botonLogin = new JButton("Login");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = campoNombre.getText();
				String contraseña = new String(campoContraseña.getPassword());
				System.out.println(usuario + " : " + contraseña);
				try {
					ventana.clienteLogado = new Cliente(usuario, contraseña);
					JOptionPane.showMessageDialog(ventana, "Bienvenid@, " + ventana.clienteLogado.getNombre(),
							"Inicio de sesión exitoso", JOptionPane.INFORMATION_MESSAGE);
					// TODO : MANDAR A LA SIGUENTE PANTALLA
					ventana.cambiarAPantalla(PantallaListado.class);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Login fallido", JOptionPane.ERROR_MESSAGE);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClienteNoExisteException e1) {
					JOptionPane.showMessageDialog(ventana, "El cliente no existe", "Login fallido",
							JOptionPane.ERROR_MESSAGE);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ContraseñaInvalidaException e1) {
					JOptionPane.showMessageDialog(ventana, "La contraseña no existe", "Login fallido",
							JOptionPane.ERROR_MESSAGE);
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		botonLogin.setBackground(new Color(74, 146, 176));
		botonLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		botonLogin.setToolTipText("Pínchame para iniciar sesión");
		botonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonLogin.setBounds(491, 259, 119, 43);
		add(botonLogin);

		BotonAzul botonRegis=new BotonAzul("La sombrita");
		botonRegis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro.class);
			}
		});
		botonRegis.setToolTipText("Pínchame pa registrarce");
		botonRegis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRegis.setBounds(237, 107, 119, 43);
		add(botonRegis);

		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(502, 230, 98, 19);
		add(campoContraseña);

		txtPaRegistrarce = new JTextField();
		txtPaRegistrarce.setFont(new Font("Bradley Hand ITC", Font.BOLD, 17));
		txtPaRegistrarce.setBackground(new Color(204, 153, 255));
		txtPaRegistrarce.setHorizontalAlignment(SwingConstants.CENTER);
		txtPaRegistrarce.setEditable(false);
		txtPaRegistrarce.setText("pa registrarce ve por la sombrita");
		txtPaRegistrarce.setBounds(0, 0, 268, 59);
		add(txtPaRegistrarce);
		txtPaRegistrarce.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setFont(new Font("Bradley Hand ITC", Font.BOLD, 13));
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBackground(new Color(204, 153, 255));
		txtNombre.setBounds(502, 144, 98, 35);
		add(txtNombre);

		txtPaHaseLogin = new JTextField();
		txtPaHaseLogin.setText("pa hase login");
		txtPaHaseLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtPaHaseLogin.setFont(new Font("Bradley Hand ITC", Font.BOLD, 16));
		txtPaHaseLogin.setEditable(false);
		txtPaHaseLogin.setColumns(10);
		txtPaHaseLogin.setBackground(new Color(204, 153, 255));
		txtPaHaseLogin.setBounds(479, 80, 151, 35);
		add(txtPaHaseLogin);

		txtLaSombrita = new JTextField();
		txtLaSombrita.setText("la sombrita");
		txtLaSombrita.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaSombrita.setFont(new Font("Bradley Hand ITC", Font.BOLD, 16));
		txtLaSombrita.setEditable(false);
		txtLaSombrita.setColumns(10);
		txtLaSombrita.setBackground(new Color(204, 153, 255));
		txtLaSombrita.setBounds(66, 80, 151, 35);
		add(txtLaSombrita);

		campoNombre = new JTextField();
		campoNombre.setBounds(502, 189, 98, 19);
		add(campoNombre);
		campoNombre.setColumns(10);

		labelImagen = new JLabel("");
		// para escalar las imágenes al tamaño que queramos
		try {
			BufferedImage imagen = ImageIO.read(new File("./resultado.jpg"));
			Image enIcono = imagen.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
			labelImagen.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		labelImagen.setBounds(243, 80, 223, 88);
		add(labelImagen);
	}

	private static class __Tmp {
		private static void __tmp() {
			javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
