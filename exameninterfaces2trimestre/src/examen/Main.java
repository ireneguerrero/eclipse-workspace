package examen;

import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneBuilderExamen.fxml"));
		Parent root = loader.load();

		primaryStage.setTitle("Mi Aplicación JavaFX");
		primaryStage.setScene(new Scene(root, 700, 400));
		primaryStage.show();

		String dbURL = "jdbc:mysql://localhost/universidad";
		String dbUser = "root";
		String dbPassword = "";

		try {
			Controller controller = loader.getController();
			controller.inicializar(dbURL, dbUser, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}