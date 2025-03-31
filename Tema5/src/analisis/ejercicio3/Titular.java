package analisis.ejercicio3;

/**
 * clase Titular que guardaremos en el conjunto titulares
 */
public class Titular {
	/**
	 * atributo privado dni
	 */
	private String dni;
	/**
	 * atributo privado nombre
	 */
	private String nombre;
	/**
	 * atributo privado nombre
	 */
	private String apellidos;
	/**
	 * atributo privado telefono
	 */
	private String telefono;

	/**
	 * constructor titular solo dni
	 * 
	 * @param dni
	 */
	public Titular(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
	}

	/**
	 * constructor titular completo
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param telefono
	 */
	public Titular(String dni, String nombre, String apellidos, String telefono) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (telefono != null && !telefono.isBlank()) {
			this.telefono = telefono;
		}
	}

	/**
	 * sobreescritura de método equals
	 */
	@Override
	public boolean equals(Object obj) {
		//no son iguales de base
		boolean iguales=false;
		//casteamos objeto a titular
		Titular t1=(Titular)obj;
		//serán iguales cuando tengan el mismo dni
		if(this.dni.equals(t1.dni)) {
			//serán iguales
			iguales=true;
		}
		/**
		 * devolvemos iguales
		 */
		return iguales;
	}
	
}
