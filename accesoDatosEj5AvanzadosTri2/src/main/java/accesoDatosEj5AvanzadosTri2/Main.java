package accesoDatosEj5AvanzadosTri2;

import java.sql.Date;

import org.hibernate.Session;
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
			Fabricante fabricante = new Fabricante("Samsung");

			Session session = context.currentSession();
			session.beginTransaction();
			session.save(fabricante);
			session.getTransaction().commit();

			// Crear objeto producto
			Productos producto = new Productos("TELEFONO Samsung", 500, fabricante);

			// Obtener la sesión actual
			Session session1 = context.currentSession();
			session1.beginTransaction();
			session1.save(producto);
			session1.getTransaction().commit();

			Compras compra = new Compras(Date.valueOf("2024-01-20"), producto, 30);

			Session session2 = context.currentSession();
			session2.beginTransaction();
			session2.save(compra);
			session2.getTransaction().commit();

			System.out.println(producto.toString());
			System.out.println(fabricante.toString());
			System.out.println(compra.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}

	}

}
