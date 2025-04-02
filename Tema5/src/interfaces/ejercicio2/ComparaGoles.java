package interfaces.ejercicio2;

import java.util.Comparator;

public class ComparaGoles implements Comparator<Futbolista> {

	/**
	 * sobreescritura método compare
	 */
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		int res = o1.getNumGoles() - o2.getNumGoles();

		return res;
	}

}
