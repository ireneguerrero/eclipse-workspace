package apuntes1DAM;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane8 {

	public static void main(String[] args) {
		UIManager.put("OptionPane.yesButtonText", "Sí");
		UIManager.put("OptionPane.noButtonText", "No");

		int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);

		if (opcion == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Has elegido Sí");
		} else if (opcion == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has elegido No");
		}
	}

}
