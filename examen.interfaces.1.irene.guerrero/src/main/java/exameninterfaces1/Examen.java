package exameninterfaces1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Examen extends JFrame {
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6;
	JLabel etiquetaMensaje;

	public Examen() {
		// Configuramos la ventana
		setTitle("Examen Práctico");
		setSize(400, 300);
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creamos los contenedores
		JPanel panelNorte = new JPanel();
		JPanel panelSur = new JPanel();

		// Creamos el mensaje que aparecerá en la ventana emergente
		etiquetaMensaje = new JLabel("Se ha pulsado el: ");

		// Creamos los botones del norte
		for (int i = 1; i <= 3; i++) {
			JButton botonNorte = new JButton("Botón " + i);
			// Añadimos el listener para cada botón
			botonNorte.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Extraemos el nombre del botón
					String textoBotonNorte = ((JButton) e.getSource()).getText();

					// Creamos la ventana emergente
					JFrame ventanaEmergenteNorte = new JFrame("Ventana " + textoBotonNorte);
					ventanaEmergenteNorte.setSize(300, 200);
					ventanaEmergenteNorte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaEmergenteNorte.add(new JLabel("Se ha pulsado el: " + textoBotonNorte));
					ventanaEmergenteNorte.setVisible(true);
				}
			});

			panelNorte.add(botonNorte);
		}

		// Creamos los botones del sur
		for (int i = 4; i <= 6; i++) {
			JButton botonSur = new JButton("Botón " + i);
			// Añadimos el listener para cada botón
			botonSur.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Extraemos el nombre del botón
					String textoBotonSur = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText("Se ha pulsado el: " + textoBotonSur);

					// Creamos la ventana emergente
					JFrame ventanaEmergenteSur = new JFrame("Ventana " + textoBotonSur);
					ventanaEmergenteSur.setSize(300, 200);
					ventanaEmergenteSur.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaEmergenteSur.add(new JLabel("Se ha pulsado el: " + textoBotonSur));
					ventanaEmergenteSur.setVisible(true);

				}
			});

			panelSur.add(botonSur);
		}

		// Creamos el panel principal
		setLayout(new BorderLayout());
		add(panelNorte, BorderLayout.NORTH);
		panelNorte.add(etiquetaMensaje);
		add(panelSur, BorderLayout.SOUTH);
		panelSur.add(etiquetaMensaje);

		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Examen();
			}
		});
	}

}
