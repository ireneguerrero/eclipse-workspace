package apuntes1DAM;

import javax.swing.JOptionPane;

public class JOptionPane3 {

	public static void main(String[] args) {
		String respuesta = JOptionPane.showInputDialog(null, "Dime tu nombre", "Datos personales",
				JOptionPane.QUESTION_MESSAGE);

		if (respuesta != null) {
			System.out.println("Respuesta del usuario: " + respuesta);
		} else {
			System.out.println("Le has dado a cancelar");
		}

	}

}
