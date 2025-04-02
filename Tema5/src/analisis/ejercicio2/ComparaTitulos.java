package analisis.ejercicio2;

import java.util.Comparator;

public class ComparaTitulos implements Comparator<Ficha>{
	
	@Override
	public int compare(Ficha o1, Ficha o2) {
		int res=o1.getTitulo().compareTo(o2.getTitulo());
		

		return res;
	}

}
