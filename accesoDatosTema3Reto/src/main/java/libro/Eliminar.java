package libro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import modulo.Libro;

import java.util.List;

public class Eliminar {

	public static void main(String[] args) {

		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			// Obtener la sesión actual
			Session session = context.currentSession();

			// Iniciar transacción
			session.beginTransaction();

			// Realizar una consulta para obtener los datos antes de la eliminación
			String selectHqlBeforeDelete = "FROM Libro WHERE id = 1";
			Query<Libro> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Libro.class);
			List<Libro> productosBeforeDelete = selectQueryBeforeDelete.list();

			// Imprimir resultados antes de la eliminación
			System.out.println("Registros en la tabla Libro antes de la eliminación:");
			for (Libro a : productosBeforeDelete) {
				System.out.println(a.toString());
			}

			// Eliminar el registro
			String deleteHql = "DELETE FROM Libro WHERE id = 1";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos después de la eliminación
			String selectHqlAfterDelete = "FROM Libro";
			Query<Libro> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Libro.class);
			List<Libro> productosAfterDelete = selectQueryAfterDelete.list();

			// Imprimir resultados después de la eliminación
			System.out.println("Registros en la tabla Cliente después de la eliminación:");
			for (Libro f : productosAfterDelete) {
				System.out.println(f.toString());
			}

			// Hacer commit de la transacción
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}
