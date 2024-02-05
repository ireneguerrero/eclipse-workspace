package ej2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primaryStage) throws IOException {
		Parent root;
			root = FXMLLoader.load(getClass().getResource("SceneEj2.fxml"));

			primaryStage.setTitle("Mi Aplicación JavaFX");
			primaryStage.setScene(new Scene(root, 650, 400));
			primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
