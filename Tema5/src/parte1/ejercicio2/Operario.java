package parte1.ejercicio2;

public class Operario extends Empleado {

	/**
	 * Constructor desde la superClase
	 */
	public Operario(String nombre) {
		super(nombre);

	}


	/**
	 * sobreescritura del método toString
	 */
	@Override
	public String toString() {
		String cadena =super.toString()+" -> Operario";

		return cadena;
	}

}
