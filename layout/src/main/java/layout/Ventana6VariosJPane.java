package layout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Ventana6VariosJPane extends JFrame {
	
	
	private JLabel etiquetaMensaje;

	public Ventana6VariosJPane() {
		setTitle("Ejemplo con dos contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelBotones = new JPanel();

		etiquetaMensaje = new JLabel("Mensaje: ");
		JPanel panelMensaje = new JPanel();

		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Botón " + i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();

					etiquetaMensaje.setText(etiquetaMensaje.getText() + " " + textoBoton + ",");
				}
			});
			panelBotones.add(boton);
		}
		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.NORTH);
		add(panelMensaje, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ventana6VariosJPane();
			}
		});
	}
}
