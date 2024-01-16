package ej9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {
	@FXML
	private Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;

	@FXML
	private void handleButtonClick(ActionEvent event) {
		String idBotonPulsado = ((Button) event.getSource()).getId();
		System.out.println("Botón pulsado: " + idBotonPulsado);

		switch (idBotonPulsado) {
		case "boton1":
			System.out.println("¡Has pulsado el botón 1!");
			break;
		case "boton2":
			System.out.println("¡Has pulsado el botón 2!");
			break;
		case "boton3":
			System.out.println("¡Has pulsado el botón 3!");
			break;
		case "boton4":
			System.out.println("¡Has pulsado el botón 4!");
			break;
		case "boton5":
			System.out.println("¡Has pulsado el botón 5!");
			break;
		case "boton6":
			System.out.println("¡Has pulsado el botón 6!");
			break;
		case "boton7":
			System.out.println("¡Has pulsado el botón 7!");
			break;
		case "boton8":
			System.out.println("¡Has pulsado el botón 8!");
			break;
		case "boton9":
			System.out.println("¡Has pulsado el botón 9!");
			break;
		default:
			System.out.println("Botón no reconocido");
			break;
		}
	}
}
