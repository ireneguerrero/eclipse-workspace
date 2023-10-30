package layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana5ConMetodo extends JFrame {
	private JPanel panel;

	// inicializamos la ventana se podria haber realizado con un constructor
	private void inicializarVentana() {
		setSize(400, 400);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}

	// agregamos el boton y al mismo tiempo al pulsar crea una nueva ventana con un
	// texto
	private void agregarBoton(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x, y, 150, 50); // Posición (x, y) y tamaño (ancho, alto) del botón en relación al panel.
		panel.add(boton);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaNueva = new JFrame("Nueva ventana");
				if (nombreBoton.equals("Redimensionar")) {
					ventanaNueva.setSize(400, 400);
					ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaNueva.add(new JLabel("Has pulsado el botón que te lleva a otra dimensión"));
					ventanaNueva.setVisible(true);
				} else {
					ventanaNueva.setSize(200, 200);
					ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaNueva.add(new JLabel("Has pulsado el botón " + nombreBoton));
					ventanaNueva.setVisible(true);
				}
			}
		});

	}

	// añadimos botones usando un bucle
	public static void main(String[] args) {
		Ventana5ConMetodo ventana = new Ventana5ConMetodo();
		ventana.inicializarVentana();
		String[] botones = { "Aceptar", "Cancelar", "Siguiente", "Anterior" };
		int y = 50;
		for (String boton : botones) {
			ventana.agregarBoton(boton, 50, y);
			y = y + 50;
		}

//		for (int i = 1; i < 4; i++) {
//			ventana.agregarBoton("Botón " + i, 50, y);
//			y = y + 50;
//		}

		ventana.agregarBoton("Redimensionar", 50, y);
	}
}