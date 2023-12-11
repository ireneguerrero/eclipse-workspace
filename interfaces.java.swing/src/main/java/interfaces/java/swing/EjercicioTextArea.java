package interfaces.java.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class EjercicioTextArea extends JFrame {
	public EjercicioTextArea() {
		setTitle("Formulario básico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2));

		JLabel labelComentario = new JLabel("Comentario: ");
		JTextArea textAreaComentario = new JTextArea();
		textAreaComentario.setLineWrap(true);
		textAreaComentario.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(textAreaComentario);
		add(labelComentario);
		add(scrollPane);

		JButton botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(e -> {
			// Puedes agregar aquí la lógica para procesar la información del formulario
			String comentario = textAreaComentario.getText();

			// Ejemplo de imprimir la información en consola

			System.out.println("Comentario: " + comentario);
		});
		add(botonEnviar);

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioTextArea().setVisible(true);
		});

	}

}
