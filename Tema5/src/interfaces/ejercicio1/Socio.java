package interfaces.ejercicio1;

/**
 * Clase socio
 */
public class Socio implements Comparable {

	/**
	 * número id socio
	 */
	private int id;

	/**
	 * nombre socio
	 */
	private String nombre;

	/**
	 * edad socio
	 */
	private int edad;

	/**
	 * constructor socio
	 * 
	 * @param id
	 * @param nombre
	 * @param socio
	 */
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	/**
	 * Sobreescritura del método compareTo
	 * 
	 * @return un número positivo si es mayor el id del objeto desde el que
	 *         llamamos, negativo si es menor o 0 si son iguales
	 */
	@Override
	public int compareTo(Object o) {
		// guardamos el obejto en un objeto de tipo socio y casteamos a socio
		Socio s = (Socio) o;
		// devolvemos la diferencia entre los ids
		return (this.id - s.id);
	}

	
@Override
public String toString() {
	String cadena="ID: "+this.id+"\n";
			cadena+="Nombre: "+this.nombre+"\n";
			cadena+="Edad: "+this.edad;
			
	return cadena;
}	
	
}
