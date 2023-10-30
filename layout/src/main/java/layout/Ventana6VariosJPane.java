package layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana6VariosJPane extends JFrame {
	private JLabel etiquetaMensaje;
	private JPanel panel;

	private void inicializarVentana() {
		setSize(400, 400);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}

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
	}

	public static void main(String[] args) {
		Ventana6VariosJPane ventana = new Ventana6VariosJPane();
		ventana.inicializarVentana();
	}
}
