package modelo;

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
			Tvideojuegos videojuego = new Tvideojuegos("World of Wordcraft", 2010, "Blizzard", 80, "Pedazo de juego",
					"todas");
			Session session = context.currentSession();
			session.beginTransaction();
			session.save(videojuego);
			session.getTransaction().commit();
			System.out.println("Videojuego guardado: " + videojuego);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}

	}

}
