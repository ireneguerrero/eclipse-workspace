package modelo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		EmpresaDao empresaDAO = new EmpresaDaoHibernate(sessionFactory);

		System.out.println("Empresas existentes: ");
		empresaDAO.obtenerTodasLasEmpresas().forEach(empresa -> {
			System.out.println(
					"ID: " + empresa.getId() + ", Nombre: " + empresa.getNombre() + ", País: " + empresa.getPais());
		});

		empresaDAO.agregarEmpresa(new Empresa(6, "Juan", "España"));

		sessionFactory.close();

	}

}
