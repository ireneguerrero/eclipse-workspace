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
			Profesores profesor = new Profesores("Alberto", "Ruiz", "Demasiado cerca de Cenec el suertudo", "29002",
					"Málaga", "Málaga", "123456");
			Session session = context.currentSession();
			session.beginTransaction();
			session.save(profesor);
			session.getTransaction().commit();
			System.out.println(profesor.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}
	}

}
