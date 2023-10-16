package apuntes1DAM;

import javax.swing.JOptionPane;

public class JOptionPane7 {

	public static void main(String[] args) {
		int res = JOptionPane.showConfirmDialog(null, "Cita", "¿Quieres salir conmigo?",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if (res == JOptionPane.YES_OPTION) {
			System.out.println("Tu respuesta ha sido Sí");
		} else if (res == JOptionPane.NO_OPTION) {
			System.out.println("Tu respuesta ha sido No");
		} else {
			System.out.println("Tu respuesta ha sido Cancelar");
			String name = JOptionPane.showInputDialog("Escribe tu nombre");
		}

	}

}
