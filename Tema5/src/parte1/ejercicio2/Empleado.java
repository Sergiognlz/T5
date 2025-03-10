package parte1.ejercicio2;

public class Empleado {

	//atributo privado nombre
	private String nombre;

	/**
	 * constructor Empleado con nombre
	 * @param nombre
	 */
	public Empleado(String nombre) {
		
		this.nombre = nombre;
	}

	/**
	 * Muestra nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * sobreescritura método toString
	 */
	@Override
	public String toString() {
		String cadena="Empleado "+this.nombre;
		
		return cadena;
	}
	
	
}
