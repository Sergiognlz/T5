package parte1.ejercicio2;

public class Oficial extends Operario {

	
	/**
	 * Constructor desde la superclase
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
		
	}
	
	/**
	 * Sobreescritura del método toString
	 */
	@Override
	public String toString() {
		String cadena=super.toString()+" -> Operario -> Oficial";
		
		return cadena;
	}
	

}
