package accesoDatosEj4AvanzadosTri2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);

		try {
			Fabricante fabricante = new Fabricante("pc gaming2");

			Session session = context.currentSession();
			session.beginTransaction();
			session.save(fabricante);
			session.getTransaction().commit();

			// Crear objeto producto
			Productos producto = new Productos("PORTATIL gaming2", 3000, fabricante);

			// Obtener la sesión actual
			Session session1 = context.currentSession();
			session1.beginTransaction();
			session1.save(producto);
			session1.getTransaction().commit();

			System.out.println(producto.toString());
			System.out.println(fabricante.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}

	}

}
