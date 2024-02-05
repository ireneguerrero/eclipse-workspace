package ej5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("SceneEj5.fxml"));
		primaryStage.setTitle("Mi Aplicación JavaFX");
		primaryStage.setScene(new Scene(root, 120, 110));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
