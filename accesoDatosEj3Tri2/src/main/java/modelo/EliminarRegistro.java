package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarRegistro {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		ThreadLocalSessionContext.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();
			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Alumnos WHERE id=10";
			Query<Alumnos> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Alumnos.class);
			List<Alumnos> alumnosBeforeDelete = selectQueryBeforeDelete.list();

			// Imprimir resultados antes de la eliminación
			System.out.println("Registros de la tabla alumnos antes de la eliminación: ");
			for (Alumnos f : alumnosBeforeDelete) {
				System.out.println(f.toString());
			}

			// Eliminar el registro
			String deleteHql = "DELETE FROM Alumnos WHERE id=10";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos después de la eliminación
			String selectHqlAfterDelete = "FROM Alumnos";
			Query<Alumnos> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Alumnos.class);
			List<Alumnos> alumnosAfterDelete = selectQueryAfterDelete.list();

			// Imprimir resultados después de la eliminación
			System.out.println("Registros en la tabla fabricante después de la eliminación: ");
			for (Alumnos a : alumnosAfterDelete) {
				System.out.println(a.toString());
			}

			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}

	}

}
