package apuntes16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import clases.Bicicleta;
import clases.Cliente;

public class Main {

	public static void main(String[] args) {
//		 Tema 11, colecciones
//		LinkedHashSet<String> ingredientes = new LinkedHashSet<String>();
//		ingredientes.add("Cebolla");
//		ingredientes.add("Patata");
//		ingredientes.add("Pimientos");
//		ingredientes.add("Sal");
//		ingredientes.add("Huevo");
//		ingredientes.add("Panceta");
//		ingredientes.add("Chorizo");
//
//		System.out.println(ingredientes.size());
//
//		System.out.println("¿Tiene sal? " + ingredientes.contains("Sal"));
//		System.out.println("¿Tiene ajo? " + ingredientes.contains("Ajo"));

//		 ingredientes.clear();
//		ingredientes.remove("Panceta");

//		 Importar siempre de java.util
//		 Se inicializa siempre con la colección, por ahora lo entenderemos como una
//		 flechita que siempre apunta a la posición que hay antes del 0
//		 Se puede obtener elementos, avanzar una posición y comprobar si ha llegado al
//		 final.
//		 Tiene una función clave que se llama next, avanza una posición y nos devuelve
//		 la posición a la que ha llegado.
//		Iterator it = ingredientes.iterator();
//		while (it.hasNext()) {
//			String actual = (String) it.next();
//			System.out.println(actual);
//		}
//
//		System.out.println(ingredientes);

//		Cliente c1 = new Cliente("pepe@gmail.com", "pepeelmejor", 123456789, "Pepe");
//		Cliente c2 = new Cliente("pepa@gmail.com", "pepalamejor", 987654321, "Pepa");
//		Cliente c3 = new Cliente("pepi@gmail.com", "pepilamejor", 987654320, "Pepi");
//		Cliente c4 = new Cliente("pepo@gmail.com", "pepoelmejor", 987654301, "Pepo");
//		Cliente c5 = new Cliente("pepu@gmail.com", "pepuelmejor", 987654021, "Pepu");

//		HashMap<String, Cliente> porEmail = new HashMap<String, Cliente>();
//		HashMap<Integer, Cliente> porTelefono = new HashMap<Integer, Cliente>();

//		LinkedHashMap<String, Cliente> porEmail = new LinkedHashMap<String, Cliente>();
//		LinkedHashMap<Integer, Cliente> porTelefono = new LinkedHashMap<Integer, Cliente>();

//		TreeMap<String, Cliente> porEmail = new TreeMap<String, Cliente>();
//		TreeMap<Integer, Cliente> porTelefono = new TreeMap<Integer, Cliente>();
//
//		porEmail.put(c1.getEmail(), c1);
//		porTelefono.put(c1.getTelefono(), c1);
//
//		porEmail.put(c2.getEmail(), c2);
//		porTelefono.put(c2.getTelefono(), c2);
//
//		porEmail.put(c3.getEmail(), c3);
//		porTelefono.put(c3.getTelefono(), c3);
//
//		porEmail.put(c4.getEmail(), c4);
//		porTelefono.put(c4.getTelefono(), c4);
//
//		porEmail.put(c5.getEmail(), c5);
//		porTelefono.put(c5.getTelefono(), c5);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Dime tu email y te busco");
//		Cliente personaEncontrada = porEmail.get(sc.nextLine());
//		System.out.println(personaEncontrada);
//
//		Cliente borrado = porTelefono.remove(c3.getTelefono());

//		Iterator itm = porEmail.keySet().iterator();
//		while (itm.hasNext()) {
//			String actual = (String) itm.next();
//			System.out.println(actual);
//		}

//		Iterator itm = porEmail.values().iterator();
//		while (itm.hasNext()) {
//			Cliente actual = (Cliente) itm.next();
//			System.out.println(actual);
//		}

//		Iterator itm = porEmail.entrySet().iterator();
//		while (itm.hasNext()) {
//			Entry actual = (Entry) itm.next();
//			String clave = (String) actual.getKey();
//			Cliente valor = (Cliente) actual.getValue();
//			System.out.println(clave + ": " + valor);
//		}

//		Bicicleta b1 = new Bicicleta("BMX", "La mejor bici", c1);
//		Bicicleta b2 = new Bicicleta("BMX", "La peor bici", c1);
//		Bicicleta b3 = new Bicicleta("BMX", "La bici sin más", c2);
//
//		c1.getBicicleta().add(b1);
//		c1.getBicicleta().add(b2);
//		c1.getBicicleta().add(b3);
//
//		System.out.println(c1);
//		System.out.println(c2);

//		System.out.println("¿Tiene bici? " + a.getBicicleta().contains(c));
//		System.out.println("¿Tiene bici? " + a.getBicicleta().contains(d));
//		System.out.println("¿Tiene bici? " + a.getBicicleta().contains(e));

		/*
		 * 1 - Crea un HashMap <String,Cliente> donde la clave sean los emails de los usuarios
		 * 2 - Crea un menú en texto con en principio 4 opciones
		 * 			0 - Salir 
		 * 			1 - Crear un usuario: Si se selecciona,
		 * 				se piden los datos del cliente por teclado (nombre, email, telf, contraseña)
		 * 				y se inserta un cliente en el HashMap
		 * 			2 - Modificar nombre del cliente: Si se selecciona, se pide el email del cliente a buscar en el HashMap.
		 * 				Si no lo encuentra, vuelve otra vez al menú principal. Se modifica el cliente en el map.
		 * 			3 - Modificar email del cliente: Si se selecciona se le pide el email de un cliente a buscar en el HashMap.
		 * 				Si no lo encuentra, vuelve otra vez al menú principal. Si lo encuentra, pide por teclado el nuevo email,
		 * 				saca del mapa el usuario con el email antiguo, modifica su variable interna email, y lo devuelve al HashMap 
		 * 				con su nueva clave escrita.
		 * 			4 - Imprimir un cliente: Si se selecciona, se pide el email de un cliente a buscar en el HashMap.
		 * 				Si no lo encuentra, imprime la frase "email no encontrado". Si lo encuentra, imprime todos los datos del cliente por teclado.
		 * Si lo montas bien, no necesitas declarar ninguna variable de tipo cliente en todo el programa. Inicializar si que necesitarás inicializar.
		 */

		Scanner sc = new Scanner(System.in);

		HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
		String nombre;
		String email;
		int tel;
		String contra;
		byte opcion = -1;
		while (opcion != 0) {
			System.out.println("¿Qué quieres hacer?" + "\n\t0 - Salir" + "\n\t1 - Crear un usuario"
					+ "\n\t2 - Modificar nombre del cliente" + "\n\t3 - Modificar email del cliente"
					+ "\n\t4 - Imprimir un cliente");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego Lucas");
				break;
			case 1:
				System.out.println("Dime el nombre del cliente");
				nombre = sc.nextLine();
				System.out.println("Dime el email");
				email = sc.nextLine();
				System.out.println("Dime el teléfono");
				tel = Integer.parseInt(sc.nextLine());
				System.out.println("Dime la contraseña");
				contra = sc.nextLine();
				clientes.put(email, new Cliente(email, contra, tel, nombre) );
				System.out.println(clientes);
				break;
			case 2:
				System.out.println("Dime el email del cliente a modificar");
				String emailMod = sc.nextLine();
				if (clientes.get(emailMod)==null) {
					System.out.println("El email de ese cliente no existe");
				} else {
					System.out.println("Dime el nuevo nombre del cliente");
					String nuevoNombre = sc.nextLine();
					clientes.get(emailMod).setNombre(nuevoNombre);
					System.out.println(clientes);
				}
				break;
			case 3:
				System.out.println("Dime el email del cliente a modificar");
				String emailMod2 = sc.nextLine();
				if (clientes.get(emailMod2)== null) {
					System.out.println("El email de ese cliente no existe");
				} else {
					System.out.println("Dime el nuevo email del cliente");
					String nuevoEmail = sc.nextLine();
					clientes.get(emailMod2).setEmail(nuevoEmail);
					Cliente b=clientes.remove(emailMod2);
					clientes.put(nuevoEmail, b);
					System.out.println(clientes);
				}
				break;
			case 4:
				System.out.println("Dime el email del cliente");
				String emailC = sc.nextLine();
				System.out.println(clientes.get(emailC));
				break;
			}
		}
	}

}
