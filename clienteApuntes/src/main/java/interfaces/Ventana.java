package interfaces;

import javax.swing.JFrame;

import clases.Cliente;

public class Ventana extends JFrame {

	protected Cliente clienteLogado;

	public Ventana() {
		this.setSize(700, 500); // tamaño de la ventana
		this.setTitle("Programa de prueba de clase"); // título de la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // si se cierra la ventana termina el programa
		this.setLocationRelativeTo(null); // se pone la ventana centrada
		this.setContentPane(new PantallaLogin(this));
		this.setVisible(true); // tiene que ser la última línea del constructor, se hace visible la ventana
	}

	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if (clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if (clase.equals(PantallaListado.class)) {
			this.setContentPane(new PantallaListado(this));
		}
		this.getContentPane().setVisible(true);
	}

}
