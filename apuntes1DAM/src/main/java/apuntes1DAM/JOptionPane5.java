package apuntes1DAM;

import javax.swing.JOptionPane;

public class JOptionPane5 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "Datos personales", "edad", JOptionPane.INFORMATION_MESSAGE);
		if (nombre != null) {
			System.out.println("La edad es: " + nombre);
		} else {
			JOptionPane.showMessageDialog(null, "Hasta luego Lucas");
			System.out.println("Te has ido :(");
		}

	}

}
