package comparables.ejercicio1;

import java.util.Comparator;
/**
 * clase compara número que implementa la interfaz comparator y le pasamos un tipo Integer porque es un número
 */
public class ComparaNumeros implements Comparator<Integer>{
	
	/**
	 * sobreescritura de la clase compare
	 */
	@Override
	public int compare(Integer o1, Integer o2) {
		int res=o2-o1;
		
		return res;
	}

}
