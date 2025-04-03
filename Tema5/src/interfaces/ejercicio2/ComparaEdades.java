package interfaces.ejercicio2;

import java.util.Comparator;

import interfaces.ejercicio1.Socio;

/**
 * Clase compara Edades
 */
public class ComparaEdades implements Comparator<Futbolista> {
	
	/**
	 * sobreescritura de la clase compare
	 */
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		
		int res=o1.getEdad()-o2.getEdad(); //comparación de forma ascendente 
		
		return res;
	}

	
	
}