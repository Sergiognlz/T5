package interfaces.ejercicio2;

import java.util.Comparator;

public class ComparaGoles implements Comparator<Futbolista> {

	/**
	 * sobreescritura método compare
	 */
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		int res = o2.getNumGoles() - o1.getNumGoles();

		return res;
	}

}
