package analisis.ejercicio4;

/**
 * clase Persona hija de Contacto
 */
public class Persona extends Contacto {
	/**
	 * atributo privado cumpleaños
	 */
	private String cumpleaños;

	/**
	 * constructo Persona solo con nombre
	 * 
	 * @param nombre
	 */
	public Persona(String nombre) {
		super(nombre);

	}

	/**
	 * constructor persona completo
	 * 
	 * @param nombre
	 * @param telefono
	 */
	public Persona(String nombre, String telefono, String cumpleaños) {
		super(nombre, telefono);

		if (cumpleaños != null && !cumpleaños.isBlank()) {
			this.cumpleaños = cumpleaños;
		}
	}

	/**
	 * muestra cumpleaños
	 * 
	 * @return cumpleaños
	 */
	public String getCumpleaños() {
		return cumpleaños;
	}

	/**
	 * modifica cumpleaños
	 * 
	 * @param cumpleaños
	 */
	public void setCumpleaños(String cumpleaños) {
		if (cumpleaños != null && !cumpleaños.isBlank()) {
			this.cumpleaños = cumpleaños;
		}
	}

	/**
	 * sobreescritura del método toString
	 */
	@Override
	public String toString() {
		
		return super.toString()+this.cumpleaños+"\t";
	}
	
	
}
