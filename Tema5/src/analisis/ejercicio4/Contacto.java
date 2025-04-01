package analisis.ejercicio4;

/**
 * clase Contacto que tiene como hijas Persona y Empresa
 */
public class Contacto {
	/**
	 * atributo privado nombre
	 */
	private String nombre;
	/**
	 * atributo privado nombre
	 */
	private String telefono;

	/**
	 * constructor objeto Contacto solo con nombre
	 * 
	 * @param nombre
	 */
	public Contacto(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * constructor objeto Contacto
	 * 
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, String telefono) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (telefono != null && !telefono.isBlank()) {
			this.telefono = telefono;
		}
	}

	/**
	 * muestra nombre
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * modifica nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * muestra telefono
	 * 
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * modifica telefono
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		if (telefono != null && !telefono.isBlank()) {
			this.telefono = telefono;
		}
	}

	/**
	 * sobreescritura de la clase equals en base a nombre
	 */
	@Override
	public boolean equals(Object obj) {
		// partimos de que no sean iguales
		boolean iguales = false;
		// casteamos obj a Contacto
		Contacto c1 = (Contacto) obj;
		// si tienen el mismo nombre son el mismo
		if (this.nombre.equals(c1.nombre)) {
			// iguales será true
			iguales = true;
		}
		// devolvemos iguales
		return iguales;
	}

	/**
	 * sobreescritura método toString
	 */
	@Override
	public String toString() {
		String cadena = this.nombre +"\t" + this.telefono + "\t";

		return cadena;
	}

}
