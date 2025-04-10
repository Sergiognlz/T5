package analisis.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrincipalFicha {
public static void main(String[] args) {
	
	Ficha libro=new Libro(1, "El Hobbit", "J.R.L. Tolkien", "Salvat");
	Ficha revista=new Revista(2, "1984", 54, 1987);
	Ficha dvd=new DVD(3, "The Matrix", " Hermanos Wachowski", 1998,"PELICULA");
	
	List<Ficha>listaFichas=new ArrayList<>();
	
	listaFichas.add(libro);
	listaFichas.add(revista);
	listaFichas.add(dvd);
	
	libro.prestar();
	revista.prestar();
	dvd.prestar();
	
	System.out.println();
	
	Collections.sort(listaFichas);
	
	
	Collections.sort(listaFichas, new ComparaTitulos());
	
	listaFichas.sort((a, b)->{return a.getTitulo().compareTo(b.getTitulo());});
	
	for(Ficha obj:listaFichas) {
		System.out.println(obj);
		System.out.println();
	}
	
	
}
}
