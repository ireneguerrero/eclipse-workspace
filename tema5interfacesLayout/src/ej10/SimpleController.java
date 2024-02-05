package ej10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {
	@FXML
	private Button boton1, boton2, boton3, boton4, boton5, boton6, salir, opciona, opcionb, opcionc, opcion1, opcion2,
			opcion3, aceptar, cancelar;

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
		case "salir":
			System.out.println("¡Has pulsado salir!");
			break;
		case "aceptar":
			System.out.println("¡Has pulsado aceptar!");
			break;
		case "cancelar":
			System.out.println("¡Has pulsado cancelar!");
			break;
		case "opciona":
			System.out.println("¡Has pulsado la opción A!");
			break;
		case "opcionb":
			System.out.println("¡Has pulsado la opción B!");
			break;
		case "opcionc":
			System.out.println("¡Has pulsado la opción C!");
			break;
		case "opcion1":
			System.out.println("¡Has pulsado la opción 1!");
			break;
		case "opcion2":
			System.out.println("¡Has pulsado la opción 2!");
			break;
		case "opcion3":
			System.out.println("¡Has pulsado la opción 3!");
			break;
		default:
			System.out.println("Botón no reconocido");
			break;
		}
	}
}
