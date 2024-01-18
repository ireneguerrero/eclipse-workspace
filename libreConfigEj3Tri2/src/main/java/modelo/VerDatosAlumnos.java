package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class VerDatosAlumnos {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		ThreadLocalSessionContext.bind(sessionFactory.openSession());

		try {
			// Obtener la sesión actual
			Session session = context.currentSession();

			// Iniciar transacción
			session.beginTransaction();

			// Crear consulta HQL para seleccionar todos los registros de la tabla fabricante
			String hql = "FROM Alumnos";
			Query<Alumnos> query = session.createQuery(hql, Alumnos.class);

			// Ejecutar consulta y obtener resultados
			List<Alumnos> alumnos = query.list();

			// Imprimir resultados
			System.out.println("Registros en la tabla alumno:");
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
