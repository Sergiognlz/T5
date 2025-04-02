package interfaces.ejercicio2;

/**
 * Clase futbolista con sus datos implementando la interfaz Comparable de tipo Futbolista
 */
public class Futbolista implements Comparable<Futbolista> {

	/**
	 * atributo privado número de camiseta
	 */
	private int numCamiseta;
	/**
	 * atributo privato nombre de futbolista
	 */
	private String nombre;
	/**
	 * atributo privado edad de futbolista
	 */
	private int edad;
	/**
	 * atributo privado número de goles del futbolista
	 */
	private int numGoles;

	/**
	 * constructor futbolista
	 * 
	 * @param numCamiseta
	 * @param nombre
	 */
	public Futbolista(int numCamiseta, String nombre) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * constructor completo futbolista
	 * 
	 * @param numCamiseta
	 * @param nombre
	 * @param edad
	 * @param numGoles
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad >= 16) {
			this.edad = edad;
		}
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	
	
	
	/**
	 * 
	 * @return
	 */
	public int getNumCamiseta() {
		return numCamiseta;
	}
/**
 * 
 * @return
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @return
 */
	public int getEdad() {
		return edad;
	}
/**
 * 
 * @return
 */
	public int getNumGoles() {
		return numGoles;
	}

	@Override
	public int compareTo(Futbolista obj) {
		// variable respuesta igual al número de la camiseta del objeto menos el número
		// que la camiseta con el que comparamos
		int res = this.numCamiseta - obj.numCamiseta;
		// si los números son iguales
		if (this.numCamiseta == obj.numCamiseta) {
			// hacemos una comparación de los nombres
			res = this.nombre.compareTo(obj.nombre);
		}
		// devolvemos respuesta
		return res;
	}

	/**
	 * Sobreescritura del método toString
	 */
	@Override
	public String toString() {
		// variable cadena
		String cadena = "Nombre: " + this.nombre + " Nº Camiseta: " + this.numCamiseta + "\nEdad: " + this.edad
				+ " Nº Goles: " + this.numGoles;
		// devolvemos cadena
		return cadena;
	}

	/**
	 * sobreescritura de equals
	 */
	@Override
	public boolean equals(Object obj) {
		// variable éxito
		boolean exito = false;
		// creamos objeto futbolista
		Futbolista fut = (Futbolista) obj;
		// si dos futbolistas coinciden en número de camiseta y nombre serán el mismo
		if (this.numCamiseta == fut.numCamiseta && this.nombre.equals(fut.nombre)) {
			// éxito será true
			exito = true;
		}
		//devolvemos éxito
		return exito;
	}

}
