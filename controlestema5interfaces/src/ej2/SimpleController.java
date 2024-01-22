package ej2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleController {
	@FXML
	private TextField textoimporte;

	@FXML
	private Label resultadoLabel;

	@FXML
	private void iva4() {
		// Lógica para sacar el iva 4%
		double operando = Double.parseDouble(textoimporte.getText());
		double resultado = operando * 0.04;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void iva10() {
		// Lógica para sacar el iva 10%
		double operando = Double.parseDouble(textoimporte.getText());
		double resultado = operando * 0.1;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void iva21() {
		// Lógica para sacar el iva 21%
		double operando = Double.parseDouble(textoimporte.getText());
		double resultado = operando * 0.21;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void limpiar() {
		// Lógica para limpiar los campos
		textoimporte.clear();
		resultadoLabel.setText("Resultado: ");
	}

	@FXML
	private void salir() {
		// Lógica para cerrar la aplicación
		System.exit(0);
	}
}
