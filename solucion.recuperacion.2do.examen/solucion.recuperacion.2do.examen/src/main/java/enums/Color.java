package enums;

public enum Color {
	ROJO, AZUL, VERDE, ROSA, AMARILLO, NEGRO, BLANCO;

	/**
	 * Función que no pide el enunciado del examen, pero que viene bien tener.
	 * devuelve un color en base a un código numérico. Si no se le pasa por
	 * argumentos un código numérico correcto, asigna el color blanco por defecto.
	 * Códigos numéricos válidos: 1- Rojo, 2 - Azul , 3 - Verde, 4 - Rosa 5 -
	 * Amarillo, 6 - Negro, 7 - Blanco
	 * 
	 * @param opcion código numérico que se transformará en color. Debe ser uno de
	 *               los códigos válidos, o el color asignado será siempre blanco.
	 * @return Color asociado al código numérico escogido, blanco si se ha escogido
	 *         un no válido
	 */
	public static Color opcionNumericaAColor(byte opcion) {
		switch (opcion) {
		case 1:
			return Color.ROJO;
		case 2:
			return Color.AZUL;
		case 3:
			return Color.VERDE;
		case 4:
			return Color.ROSA;
		case 5:
			return Color.AMARILLO;
		case 6:
			return Color.NEGRO;
		default:
		case 7:
			return Color.BLANCO;
		}
	}
	
	/**
	 * Función que devuelve un menú listo para devolver por pantalla en modo texto,
	 * que propone seleccionar uno de los códigos numéricos de color válidos para
	 * usar con la función opcionNumericaAColor
	 * @return menú listo para devolver por pantalla en modo texto,
	 * que propone seleccionar uno de los códigos numéricos de color válidos para
	 * usar con la función opcionNumericaAColor
	 */
	public static String imprimirMenuSeleccionColor() {
		return "Elige un color:"+
				"\n\t1 - Rojo"+
				"\n\t2 - Azul"+
				"\n\t3 - Verde"+
				"\n\t4 - Rosa"+
				"\n\t5 - Amarillo"+
				"\n\t6 - Negro"+
				"\n\t7 - Blanco";
	}
}
