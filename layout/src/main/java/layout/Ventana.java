package layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana {

	public static void main(String[] args) {
//		JFrame ventana = new JFrame("Ventana con etiqueta");
//		ventana.setSize(400, 200);
//		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JLabel texto = new JLabel("Hola Irene");
//		ventana.getContentPane().add(texto);

//		JFrame ventana = new JFrame("Ventana con Botón");
//		String nombre = "Irene";
//
//		ventana.setSize(400, 200);
//		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		JButton boton = new JButton("Haz click aquí");
//		ventana.add(boton);
//		boton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales",
//						JOptionPane.QUESTION_MESSAGE);
//			}
//		});

//		JFrame ventana = new JFrame("Nueva ventana");
//		JButton boton = new JButton("Pulsa aquí");
//		boton.setBounds(106, 56, 109, 36);
//		ventana.setSize(300, 300);
//		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ventana.getContentPane().setLayout(null);
//		ventana.getContentPane().add(boton);
//		boton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales",
//						JOptionPane.QUESTION_MESSAGE);
//			}
//		});
		
		//variación de ventana con botón
		JFrame ventana = new JFrame("Ventana con Botón");
		String nombre = "Irene";

		ventana.setSize(400, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton boton = new JButton("Haz click aquí");
		ventana.add(boton);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales",
						JOptionPane.QUESTION_MESSAGE);
			}
		});
		ventana.setVisible(true);
		
	}

}
