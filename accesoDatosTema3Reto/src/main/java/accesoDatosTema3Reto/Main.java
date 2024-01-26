package accesoDatosTema3Reto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		ThreadLocalSessionContext.bind(sessionFactory.openSession());

		try {
			// Crear autores
			Autor autor1 = new Autor("Neil Gaiman");
			Autor autor2 = new Autor("Terry Pratchett");

			// Crear categoría
			Categoria categoria = new Categoria("Género fantástico");

			// Crear libro asociado a autores y categoría
			Set<Autor> autores = new HashSet<>();
			autores.add(autor1);
			autores.add(autor2);

			Libro libro = new Libro("Buenos Presagios", "844500669", autores);
			libro.getCategorias().add(categoria);

			// Crear cliente
			Cliente cliente = new Cliente("Irene", "Guerrero");

			// Crear pedido asociado a cliente y libro
			Pedido pedido = new Pedido(Date.valueOf("2024-01-25"), cliente);
			LibroPedido libroPedido = new LibroPedido(libro, pedido, 1);
			pedido.getLibroPedidos().add(libroPedido);

			// Operaciones CRUD
			Funciones.crearRegistro(sessionFactory, autor1, autor2, categoria, libro, cliente, pedido);
			Funciones.leerRegistro(sessionFactory, Autor.class, Libro.class, Categoria.class, Cliente.class,
					Pedido.class, LibroPedido.class);
			Funciones.modificarRegistro(sessionFactory, Libro.class, libro.getIdLibro(), "Good Omens");
			Funciones.borrarRegistro(sessionFactory, Pedido.class, pedido.getIdPedido());

			// Consultas HQL
			Funciones.librosPorAutor(sessionFactory, autor1);
			Funciones.librosPorCategoria(sessionFactory, categoria);
			Funciones.historialCliente(sessionFactory, cliente);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}
