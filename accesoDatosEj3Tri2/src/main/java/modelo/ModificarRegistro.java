package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class ModificarRegistro {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		ThreadLocalSessionContext.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();
			session.beginTransaction();

			String updateHql = "UPDATE Alumnos SET nombre='Guillermo' WHERE id=10";
			Query<?> updateQuery = session.createQuery(updateHql);
			updateQuery.executeUpdate();

			String selectHql = "FROM Alumnos WHERE id=10";
			Query<Alumnos> selectQuery = session.createQuery(selectHql, Alumnos.class);
			List<Alumnos> alumnos = selectQuery.list();

			System.out.println("Registros de la tabla alumno después de la actualización: ");
			for (Alumnos a : alumnos) {
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
