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

			// Modificar el nombre por "Gandalf"
			String updateHql = "UPDATE Fabricante SET nombre='Gandalf' WHERE id=9";
			Query<?> updateQuery = session.createQuery(updateHql);
			updateQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos actualizados
			String selectHql = "FROM Fabricante WHERE id=9";
			Query<Fabricante> selectQuery = session.createQuery(selectHql, Fabricante.class);
			List<Fabricante> fabricantes = selectQuery.list();

			// Imprimir resultados
			System.out.println("Registros de la tabla fabricante después de la actualización: ");
			for (Fabricante f : fabricantes) {
				System.out.println(f.toString());
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
