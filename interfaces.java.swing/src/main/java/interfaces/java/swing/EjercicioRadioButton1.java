package interfaces.java.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class EjercicioRadioButton1 extends JFrame {
	public EjercicioRadioButton1() {
		setTitle("Matrix");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JRadioButton radioButton1 = new JRadioButton("Pastilla azul");
		JRadioButton radioButton2 = new JRadioButton("Pastilla roja");

		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);

		JPanel panel = new JPanel();
		panel.add(radioButton1);
		panel.add(radioButton2);
		add(panel);
		pack();
		setLocationRelativeTo(null);

		radioButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarMensaje("Pastilla azul", "Has elegido la pastilla azul");
			}
		});
		radioButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarMensaje("Pastilla roja", "Has elegido la pastilla roja");
			}
		});
	}

	protected void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioRadioButton1().setVisible(true);
		});
	}

}
