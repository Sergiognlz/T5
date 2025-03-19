package parte1.ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class PrincipalPoli {
	public static void main(String[] args) {
			double area;
		// conjunto de polígonos
		 Set<Poligono> conjuntoPoli = new HashSet<>();

		Poligono p1 = new Rectangulo(5, 10);
		Poligono p2 = new Triangulo(5, 10, 15);
		Poligono p3 = new Rectangulo(2, 5);
		Poligono p4 = new Triangulo(2, 5, 10);

		conjuntoPoli.add(p1);
		conjuntoPoli.add(p2);
		conjuntoPoli.add(p3);
		conjuntoPoli.add(p4);
		
		
		for(Poligono poli:conjuntoPoli) {
			System.out.println(poli);
			
		
	
			
		}
		
		

	}
}
