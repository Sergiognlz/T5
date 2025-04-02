package interfaces.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalFutbolista {
	public static void main(String[] args) {
		// creamos lista de arrays de tipo futbolista
		List<Futbolista> listaFutbolistas = new ArrayList<>();
		// creamos objetos futbolistas
		Futbolista fut1 = new Futbolista(1, "Paco Merla", 28, 5);
		Futbolista fut2 = new Futbolista(2, "Elver Galarga", 30, 10);
		Futbolista fut3 = new Futbolista(3, "María Unpajote", 18, 0);
		Futbolista fut4 = new Futbolista(4, "Elva Ginón", 22, 0);
		Futbolista fut5 = new Futbolista(5, "Tomás Turbado", 40, 2);
		// añadimos los futbolistas
		listaFutbolistas.add(fut1);
		listaFutbolistas.add(fut2);
		listaFutbolistas.add(fut3);
		listaFutbolistas.add(fut4);
		listaFutbolistas.add(fut5);
		
		//ordenamos lista
		Collections.sort(listaFutbolistas, new ComparaEdades());
		//recorremos la lista con un for each
		for(Futbolista fut:listaFutbolistas) {
			//imprimimos futbolistas
			System.out.println(fut);
			System.out.println();
		}
		
		System.out.println();
		//ordenamos lista
		Collections.sort(listaFutbolistas, new ComparaGoles());
		//recorremos la lista con un for each
		for(Futbolista fut:listaFutbolistas) {
			//imprimimos futbolistas
			System.out.println(fut);
			System.out.println();
		}
		
		
	}
}
