package interfaces.ejercicio1;

/**
 * Clase socio
 */
public class Socio implements Comparable<Socio> {

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
	 * muestra id
	 * @return id
	 */
	public int getId() {
		return id;
	}

/**
 * muestra nombre
 * @return
 */
	public String getNombre() {
		return nombre;
	}
/**
 * muestra edad
 * @return edad
 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sobreescritura del método compareTo
	 * 
	 * @return un número positivo si es mayor el id del objeto desde el que
	 *         llamamos, negativo si es menor o 0 si son iguales
	 */
	@Override
	public int compareTo(Socio o) {
		// guardamos el obejto en un objeto de tipo socio y casteamos a socio
	
		// devolvemos la diferencia entre los ids
		return (this.id - o.id);
	}

	
@Override
public String toString() {
	String cadena="ID: "+this.id+"\n";
			cadena+="Nombre: "+this.nombre+"\n";
			cadena+="Edad: "+this.edad;
			
	return cadena;
}	
	
}
