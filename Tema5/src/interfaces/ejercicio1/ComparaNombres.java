package interfaces.ejercicio1;

import java.util.Comparator;

/**
 * Clase compara nombres
 */
public class ComparaNombres implements Comparator<Socio> {
	
	/**
	 * sobreescritura de la clase compare
	 */
	@Override
	public int compare(Socio o1, Socio o2) {
		
		int res=o1.getNombre().compareTo(o2.getNombre());
		
		return res;
	}

	
	
}
