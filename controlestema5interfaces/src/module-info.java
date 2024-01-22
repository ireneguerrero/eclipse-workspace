module controlestema5interfaces {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ej1 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ej2 to javafx.graphics, javafx.controls, javafx.fxml;
}
