module exameninterfaces2trimestre {
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens examen to javafx.graphics, javafx.fxml;
}
