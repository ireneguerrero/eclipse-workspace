package accesoDatosTema3Reto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Funciones {

	public static void crearRegistro(SessionFactory sessionFactory, Object... entidades) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			for (Object entidad : entidades) {
				session.save(entidad);
			}
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public static void leerRegistro(SessionFactory sessionFactory, Class<?>... entidadClases) {
		Session session = sessionFactory.openSession();

		try {
			for (Class<?> entidadClase : entidadClases) {
				List<?> entidades = session.createQuery("FROM " + entidadClase.getSimpleName()).getResultList();
				System.out.println("Entities of type " + entidadClase.getSimpleName() + ":");
				for (Object entidad : entidades) {
					System.out.println(entidad);
				}
				System.out.println();
			}
		} finally {
			session.close();
		}
	}

	public static void modificarRegistro(SessionFactory sessionFactory, Class<?> entidadClases, int idEntidad,
			String titulo) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Object entidad = session.get(entidadClases, idEntidad);
			if (entidad != null) {
				if (entidad instanceof Libro) {
					((Libro) entidad).setTitulo(titulo);
				}
				session.update(entidad);
				tx.commit();
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public static void borrarRegistro(SessionFactory sessionFactory, Class<?> entidadClases, int idEntidad) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {
			Object entidad = session.get(entidadClases, idEntidad);
			if (entidad != null) {
				session.delete(entidad);
				tx.commit();
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public static void librosPorAutor(SessionFactory sessionFactory, Autor autor) {
		Session session = sessionFactory.openSession();

		try {
			Query<?> query = session.createQuery("FROM Libro l WHERE :autor MEMBER OF l.autores");
			query.setParameter("autor", autor);
			List<?> resultado = query.getResultList();

			System.out.println("Libros por el autor " + autor.getNombre() + ":");
			for (Object entidad : resultado) {
				System.out.println(entidad);
			}
		} finally {
			session.close();
		}
	}

	public static void librosPorCategoria(SessionFactory sessionFactory, Categoria categoria) {
		Session session = sessionFactory.openSession();

		try {
			Query<?> query = session.createQuery("FROM Libro l WHERE :categoria MEMBER OF l.categorias");
			query.setParameter("categoria", categoria);
			List<?> resultado = query.getResultList();

			System.out.println("Libros por la categoría " + categoria.getNombre() + ":");
			for (Object entidad : resultado) {
				System.out.println(entidad);
			}
		} finally {
			session.close();
		}
	}

	public static void historialCliente(SessionFactory sessionFactory, Cliente cliente) {
		Session session = sessionFactory.openSession();

		try {
			Query<?> query = session.createQuery("FROM Pedido p WHERE p.cliente = :cliente");
			query.setParameter("cliente", cliente);
			List<?> resultado = query.getResultList();

			System.out.println("Historial del cliente " + cliente.getNombre() + ":");
			for (Object entidad : resultado) {
				System.out.println(entidad);
			}
		} finally {
			session.close();
		}
	}
}
