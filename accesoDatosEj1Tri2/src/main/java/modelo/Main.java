package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			// Crear objeto cliente
			Clientes cliente = new Clientes("Eva", "Sevilla");

			// Obtener la sesión actual
			Session session = context.currentSession();

			// Iniciar transacción
			session.beginTransaction();

			// Guardar objeto en la base de datos
			session.save(cliente);

			// Hacer commit en la transacción
			session.getTransaction().commit();

			// Imprimir cliente guardado en la base de datos
			System.out.println("Cliente guardado: " + cliente);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Desligar la sesión del contexto
			ThreadLocalSessionContext.unbind(sessionFactory);

			// Cerrar la sesión de Hibernate
			sessionFactory.close();
		}
	}

}
