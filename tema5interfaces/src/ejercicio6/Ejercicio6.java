package ejercicio6;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Ejercicio6 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("exercise6.fxml"));

			primaryStage.setTitle("Mi Aplicación JavaFX");
			primaryStage.setScene(new Scene(root, 600,600));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

