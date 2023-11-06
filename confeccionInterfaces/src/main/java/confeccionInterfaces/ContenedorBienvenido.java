package confeccionInterfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ContenedorBienvenido extends JFrame {
	JLabel etiquetaMensaje;
	JLabel etiquetaBienvenido;

	public ContenedorBienvenido() {
		setTitle("Ejemplo con dos contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creamos los contenedores
		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel panelBienvenida = new JPanel();

		// El mensaje que aparece en la ventana
		etiquetaMensaje = new JLabel("Mensaje: ");
		etiquetaBienvenido = new JLabel("Bienvenido: ");

		// Bucle donde creamos los diferentes botones
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Botón " + i);
			// Le añadimos el listener para cada boton
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Extraemos el nombre del boton
					String textoBoton = ((JButton) e.getSource()).getText();
					etiquetaBienvenido.setText("Bienvenido: " + textoBoton + " otra vez");
					etiquetaMensaje.setText("Mensaje: " + textoBoton);
				}
			});

			panelBotones.add(boton);
		}
		setLayout(new BorderLayout());

		add(panelBienvenida, BorderLayout.NORTH);
		panelBienvenida.add(etiquetaBienvenido);

		add(panelBotones, BorderLayout.CENTER);

		add(panelMensaje, BorderLayout.SOUTH);
		panelMensaje.add(etiquetaMensaje);

		pack(); // Ajusta el tamaño de los elementos del JFrame
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ContenedorBienvenido();
			}
		});
	}
}
