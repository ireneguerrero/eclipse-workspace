package modelo;

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

		try {
			Alumnos alumno = new Alumnos("Alberto", "Ruiz", "Rodriguez", Date.valueOf("1990-05-05"), "no", 33333);
			Session session = context.currentSession();
			session.beginTransaction();
			session.save(alumno);
			session.getTransaction().commit();
			System.out.println("Alumno guardado: " + alumno);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}

	}

}
