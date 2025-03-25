package interfaces.ejercicio3;

import java.util.Random;

/**
 * Clase perro que hereda de animal doméstico
 */
public class Perro extends AnimalDomestico {

	/**
	 * método sacar de paseo al perro
	 */
	public void sacarPaseo() {
		System.out.println("Haciendo pipí en la esquina");
	}

	/**
	 * Método hacer caso. El objeto perro tiene un 90% de hacer caso
	 * @return caso
	 */
	public boolean hacerCaso() {
		//creamos objeto random
		Random rand = new Random();
		//generamos un valor aleatorio entre 1 y 100
		int prob = rand.nextInt(1, 101);
		//caso es false por defecto
		boolean caso = false;
		//si la probabilidad es menor o igual de 90 ...
		if (prob <= 90) {
			//hará caso
			caso = true;
		}
		//devolvemos caso
		return caso;
	}

	/**
	 * método que imprime el ruido que hace un perro
	 */
	public void hacerRuido() {
		System.out.println("Guau, Guau...");
	}
	
}
