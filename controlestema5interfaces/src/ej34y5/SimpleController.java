package ej34y5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SimpleController implements Initializable {

	@FXML
	private ComboBox<String> comboBox1;

	@FXML
	private ChoiceBox<String> choiceBox1;

	@FXML
	private RadioButton radioButtonParticular;

	@FXML
	private RadioButton radioButtonEmpresa;

	@FXML
	private CheckBox checkBox1;

	@FXML
	private CheckBox checkBox2;

	@FXML
	private CheckBox checkBox3;

	@FXML
	private ColorPicker colorPicker;

	@FXML
	private DatePicker datePicker;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// Configurar elementos del ComboBox
		ObservableList<String> items = FXCollections.observableArrayList("Opción 1", "Opción 2", "Opción 3");
		comboBox1.setItems(items);

		// Configurar elementos del ChoiceBox
		ObservableList<String> items1 = FXCollections.observableArrayList("Contado", "Transferencia", "Paypal");
		choiceBox1.setItems(items1);

		// Crear un grupo para los RadioButtons
		ToggleGroup toggleGroup = new ToggleGroup();
		radioButtonParticular.setToggleGroup(toggleGroup);
		radioButtonEmpresa.setToggleGroup(toggleGroup);
	}

	@FXML
	private void handleBtnAceptarAction() {
		// onAction="#handleBtnAceptarAction"
		mostrarResultado();
	}

	@FXML
	private void mostrarResultado() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Resultado.fxml"));
			Parent root = loader.load();

			// Obtener el controlador de la nueva ventana
			ResultadoController resultadoController = loader.getController();

			// Construir el mensaje de resultados
			StringBuilder mensaje = new StringBuilder();
			mensaje.append("ComboBox: ").append(comboBox1.getValue()).append("\n");

			if (radioButtonParticular.isSelected()) {
				mensaje.append("RadioButton seleccionado: Particular\n");
			} else if (radioButtonEmpresa.isSelected()) {
				mensaje.append("RadioButton seleccionado: Empresa\n");
			}

			mensaje.append("ChoiceBox: ").append(choiceBox1.getValue()).append("\n");

			if (checkBox1.isSelected()) {
				mensaje.append("CheckBox 1 seleccionado\n");
			}
			if (checkBox2.isSelected()) {
				mensaje.append("CheckBox 2 seleccionado\n");
			}
			if (checkBox3.isSelected()) {
				mensaje.append("CheckBox 3 seleccionado\n");
			}

			// Agregar información sobre color y fecha
			mensaje.append("Color seleccionado: ").append(colorPicker.getValue()).append("\n");
			mensaje.append("Fecha seleccionada: ").append(datePicker.getValue()).append("\n");

			// Mostrar el resultado en la nueva ventana
			resultadoController.mostrarResultado(mensaje.toString());

			// Configurar la nueva ventana y mostrarla
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("Resultados");
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
