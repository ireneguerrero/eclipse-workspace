package interfaces.java.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class EjercicioCheckBox1 extends JFrame {
	public EjercicioCheckBox1() {
		setTitle("Ejemplo JCheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox checkBoxDeseaRecibirPublicidad = new JCheckBox("Desea recibir publicidad");
		getContentPane().add(checkBoxDeseaRecibirPublicidad, BorderLayout.EAST);

		JCheckBox checkBox1 = new JCheckBox("Aceptar términos y condiciones");
		getContentPane().add(checkBox1, BorderLayout.WEST);
		setSize(445, 213);
		setLocationRelativeTo(null);

		checkBox1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBox1.isSelected()) {
					mostrarMensaje("Indica el código", "Has aceptado los términos y condiciones");
				} else {
					mostrarMensaje("Indica el código", "Has desmarcado los términos y condiciones");
				}
			}
		});
		checkBoxDeseaRecibirPublicidad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBoxDeseaRecibirPublicidad.isSelected()) {
					mostrarMensaje("Indica el código", "Has aceptado recibir publicidad");
				} else {
					mostrarMensaje("Indica el código", "Has desmarcado recibir publicidad");
				}
			}
		});
	}

	private void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioCheckBox1().setVisible(true);
		});

	}

}
