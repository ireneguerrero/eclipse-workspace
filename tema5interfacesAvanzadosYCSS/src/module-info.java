module tema5interfacesAvanzadosYCSS {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ej1 to javafx.graphics, javafx.fxml;
	opens ej2 to javafx.graphics, javafx.fxml;
	opens calculadora to javafx.graphics, javafx.fxml;
	opens menu to javafx.graphics, javafx.fxml;
	opens hilo to javafx.graphics, javafx.fxml;
	opens progressSlider to javafx.graphics, javafx.fxml;
}
