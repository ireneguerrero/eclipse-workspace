package modelovistacontrolador;

import java.util.List;
import java.sql.*;

public class ProductoController {
	private ProductoModel model; // Instancia del modelo
	private ProductoView view; // Instancia de la vista

	// Constructor que recibe la URL de la base de datos, el usuario y la contraseña
	public ProductoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new ProductoModel(dbURL, dbUser, dbPassword); // Inicializa el modelo con la conexión a la base de datos
		view = new ProductoView(); // Inicializa la vista
	}

	// Método para mostrar los clientes
	public void mostrarProductos() throws SQLException {
		List<Producto> productos = model.getAllProductos(); // Obtiene la lista de clientes desde el modelo
		view.mostrarClientes(productos); // Muestra los clientes en la vista
	}

	// Método para cerrar la conexión a la base de datos
	public void cerrarConexion() throws SQLException {
		model.close(); // Cierra la conexión en el modelo
	}
}
