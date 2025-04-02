package comparables.ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class PrincipalNumeros {
	// Implementar una clase comparadora que permita ordenar números enteros en
	// sentido decreciente. Crear una tabla de 20 números aleatorios comprendidos
	// entre 1 y 100 y ordenarla en sentido decreciente.
	public static void main(String[] args) {
		/**
		 * creamos array lista de tamaño 20
		 */
		Integer lista[] = new Integer[20];
		// creamos objeto random
		Random rand = new Random();
		// recorremos lista
		for (int i = 0; i < lista.length; i++) {
			// y rellenamos con valores aleatorios entre 1,100
			lista[i] = rand.nextInt(1, 101);
		}

		// ordenamos llamando al método sorte de la clase Arrays y le pasamos la lista y
		// el objeto ComparaNumeros
		Arrays.sort(lista, new ComparaNumeros());
		// imprimimos lista con el método toString de la clase Arrays
		System.out.println(Arrays.toString(lista));

	}
}
