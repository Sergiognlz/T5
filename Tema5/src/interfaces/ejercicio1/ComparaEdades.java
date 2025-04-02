package interfaces.ejercicio1;

import java.util.Comparator;

/**
 * Clase compara Edades
 */
public class ComparaEdades implements Comparator<Socio> {
	
	/**
	 * sobreescritura de la clase compare
	 */
	@Override
	public int compare(Socio o1, Socio o2) {
		
		int res=o2.getEdad()-o1.getEdad();
		
		return res;
	}

	
	
}