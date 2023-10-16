package apuntes1DAM;

import javax.swing.JOptionPane;

public class JOptionPane6 {

	public static void main(String[] args) {
		int codigo = JOptionPane.showConfirmDialog(null, "¿Tienes un euro para una buena causa?", "Donación",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		if (codigo == JOptionPane.YES_OPTION) {
			System.out.println("Has pulsado Sí");
		} else if (codigo == JOptionPane.NO_OPTION) {
			System.out.println("Has pulsado No");
		} else {
			System.out.println("Has pulsado Cancelar");
		}

	}

}
