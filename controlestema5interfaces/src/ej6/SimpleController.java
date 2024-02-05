package ej6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class SimpleController {
	@FXML
	private void handleMenuAction(ActionEvent event) {
		// Este método se llamará cuando se seleccione una opción del menú
		MenuItem sourceMenuItem = (MenuItem) event.getSource();

		// Obtener información sobre la categoría y la opción seleccionada
		String category = "";
		String option = sourceMenuItem.getText();

		if (sourceMenuItem.getParentMenu() != null) {
			category = sourceMenuItem.getParentMenu().getText();
		}

		// Mostrar el mensaje en la consola
		System.out.println("Categoría: " + category + ", Opción: " + option);
	}
}
