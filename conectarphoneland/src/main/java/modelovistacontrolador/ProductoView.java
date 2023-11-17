package modelovistacontrolador;

import java.util.List;
import java.sql.Connection;

public class ProductoView {
	// Método para mostrar los clientes en la vista
	public void mostrarClientes(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println("id_PRODUCTO: " + producto.getIdProducto());
			System.out.println("id_proveedor: " + producto.getIdProveedor());
			System.out.println("NOMBRE: " + producto.getNombre());
			System.out.println("FABRICANTE: " + producto.getFabricante());
			System.out.println("PRECIO: " + producto.getPrecio());
			System.out.println("PVP: " + producto.getPvp());
			System.out.println("Descripcion: " + producto.getDescripcion());
			System.out.println("Columna 8: " + producto.getColumna8());
			System.out.println();
		}
	}
}
