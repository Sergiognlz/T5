package parte1.ejercicio2;

public class Tecnico extends Operario {

	/**
	 * constructor desde la superclase
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
		
	}
	
	/**
	 * Sobreescritura del método toString
	 */
	@Override
	public String toString() {
	String cadena=super.toString()+" -> Operario -> Técnico";
		return cadena;
	}
	

}
