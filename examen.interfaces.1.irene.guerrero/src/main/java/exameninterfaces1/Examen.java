package exameninterfaces1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Examen extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu botones;
	private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6;
	JLabel etiquetaMensaje;

	public Examen() {
		// Configuramos la ventana
		setTitle("Examen Práctico");
		setSize(400, 300);
		setBounds(100, 100, 300, 300);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creamos los contenedores
		JPanel panelNorte = new JPanel();
		JPanel panelSur = new JPanel();

		// Creamos el mensaje que aparecerá en la ventana emergente
		etiquetaMensaje = new JLabel("Se ha pulsado el: ");

		// Creamos los botones del norte
		for (int i = 1; i <= 3; i++) {
			JButton botonNorte = new JButton("Botón " + i);
			botonNorte.setBackground(Color.cyan);
			botonNorte.setForeground(Color.black);
			// Añadimos el listener para cada botón
			botonNorte.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Extraemos el nombre del botón
					String textoBotonNorte = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText("Se ha pulsado el: " + textoBotonNorte);

					// Creamos la ventana emergente
					JFrame ventanaEmergenteNorte = new JFrame("Ventana " + textoBotonNorte);
					ventanaEmergenteNorte.setSize(300, 200);
					ventanaEmergenteNorte.add(new JLabel("Se ha pulsado el: " + textoBotonNorte));

					// No me sale el botón cerrar, se ha intentado
					JButton cerrar = new JButton("Cerrar");
					cerrar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							ventanaEmergenteNorte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						}
					});
					ventanaEmergenteNorte.setVisible(true);
				}
			});

			panelNorte.add(botonNorte);
		}

		// Creamos los botones del sur
		for (int i = 4; i <= 6; i++) {
			JButton botonSur = new JButton("Botón " + i);
			botonSur.setBackground(Color.cyan);
			botonSur.setForeground(Color.black);
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

		// Creamos el menú
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		botones = new JMenu("Botones");
		menuBar.add(botones);

		mi1 = new JMenuItem("Botón 1");
		mi1.addActionListener(this);
		botones.add(mi1);

		mi2 = new JMenuItem("Botón 2");
		mi2.addActionListener(this);
		botones.add(mi2);

		mi3 = new JMenuItem("Botón 3");
		mi3.addActionListener(this);
		botones.add(mi3);

		mi4 = new JMenuItem("Botón 4");
		mi4.addActionListener(this);
		botones.add(mi4);

		mi5 = new JMenuItem("Botón 5");
		mi5.addActionListener(this);
		botones.add(mi5);

		mi6 = new JMenuItem("Botón 6");
		mi6.addActionListener(this);
		botones.add(mi6);

	}

	// Ventana emergente con el menú
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mi1) {
			JOptionPane.showMessageDialog(mi1, "Has pulsado el botón 1");
		}

		if (e.getSource() == mi2) {
			JOptionPane.showMessageDialog(mi2, "Has pulsado el botón 2");
		}

		if (e.getSource() == mi3) {
			JOptionPane.showMessageDialog(mi3, "Has pulsado el botón 3");
		}

		if (e.getSource() == mi4) {
			JOptionPane.showMessageDialog(mi4, "Has pulsado el botón 4");
		}

		if (e.getSource() == mi5) {
			JOptionPane.showMessageDialog(mi5, "Has pulsado el botón 5");
		}

		if (e.getSource() == mi6) {
			JOptionPane.showMessageDialog(mi6, "Has pulsado el botón 6");
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Examen().setVisible(true);
				;
			}
		});
	}

	// No me ha dado tiempo de hacer el extra

}
