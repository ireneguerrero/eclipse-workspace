module examen.interfaces.irene.guerrero {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
