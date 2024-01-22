package ej1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleController {
	@FXML
	private TextField textooperador1;

	@FXML
	private TextField textooperador2;

	@FXML
	private Label resultadoLabel;

	@FXML
	private void sumar() {
		// Lógica para sumar los operandos
		double operando1 = Double.parseDouble(textooperador1.getText());
		double operando2 = Double.parseDouble(textooperador2.getText());
		double resultado = operando1 + operando2;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void restar() {
		// Lógica para restar los operandos
		double operando1 = Double.parseDouble(textooperador1.getText());
		double operando2 = Double.parseDouble(textooperador2.getText());
		double resultado = operando1 - operando2;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void multiplicar() {
		// Lógica para multiplicar los operandos
		double operando1 = Double.parseDouble(textooperador1.getText());
		double operando2 = Double.parseDouble(textooperador2.getText());
		double resultado = operando1 * operando2;
		resultadoLabel.setText("Resultado: " + resultado);
	}

	@FXML
	private void dividir() {
		// Lógica para dividir los operandos
		double operando1 = Double.parseDouble(textooperador1.getText());
		double operando2 = Double.parseDouble(textooperador2.getText());

		// Asegurate de manejar la división por cero
		if (operando2 != 0) {
			double resultado = operando1 / operando2;
			resultadoLabel.setText("Resultado: " + resultado);
		} else {
			resultadoLabel.setText("Error: División por cero");
		}
	}

	@FXML
	private void limpiar() {
		// Lógica para limpiar los campos
		textooperador1.clear();
		textooperador2.clear();
		resultadoLabel.setText("Resultado: ");
	}

	@FXML
	private void salir() {
		// Lógica para cerrar la aplicación
		System.exit(0);
	}

}
