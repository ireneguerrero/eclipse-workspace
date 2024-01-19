module tema5interfaces {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ej1 to javafx.graphics, javafx.fxml;
	opens ej2 to javafx.graphics, javafx.fxml;
	opens ej3 to javafx.graphics, javafx.fxml;
	opens ej4 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ej5 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ej6 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ej7 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ej9 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ej10 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ejercicio6 to javafx.graphics, javafx.controls, javafx.fxml;
}
