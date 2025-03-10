package parte1.ejercicio2;

public class Directivo extends Empleado {

	
	
	/**
	 * Constructor desde la superClase
	 */
	public Directivo(String nombre) {
		super(nombre);
		
	}
	
	
	
	
	/**
	 * Sobreescritura del método toString
	 */
	@Override
	public String toString() {
		String cadena=super.toString()+" -> Directivo";
		 
		 return cadena;
	}

	
	
	
}
