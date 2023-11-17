package modelovistacontrolador;

import java.util.List;
import java.sql.Connection;

public class ProductoView {
	// Método para mostrar los clientes en la vista
	public void mostrarClientes(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println("ID: " + producto.getId());
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Fabricante: " + producto.getFabricante());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println("Número de serie: " + producto.getNumeroSerie());
			System.out.println();
		}
	}
}
