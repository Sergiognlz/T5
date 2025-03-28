package analisis.ejercicio2;

public class PrincipalFicha {
public static void main(String[] args) {
	
	Ficha libro=new Libro(1, "El Hobbit", "J.R.L. Tolkien", "Salvat");
	Ficha revista=new Revista(2, "1984", 54, 1987);
	Ficha dvd=new DVD(3, "The Matrix", " Hermanos Wachowski", 1998,"PELICULA");
	
	libro.prestar();
	revista.prestar();
	dvd.prestar();
	
}
}
