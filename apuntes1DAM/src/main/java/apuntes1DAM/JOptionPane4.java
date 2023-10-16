package apuntes1DAM;

import javax.swing.JOptionPane;

public class JOptionPane4 {

	public static void main(String[] args) {
		String edad = JOptionPane.showInputDialog(null, "Datos personales", "edad", 0);
		if (edad != null) {
			System.out.println("La edad es: " + edad);
		} else {
			System.out.println("Te has ido :(");
		}

	}

}
