package interfaces.ejercicio3;

import java.util.Random;
/**
 *clase gato, hereda de animal doméstico
 */
public class Gato extends AnimalDomestico {

	/**
	 * método toser bola de pelo
	 */
	public void toserBolaPelo() {
		System.out.println("Te deja un bola asquerosa en la alfombra");
	}

	/**
	 * Método hacer caso. El objeto gato tiene un 5% de hacer caso
	 * @return caso
	 */
	public boolean hacerCaso() {
		//creamos objeto random
		Random rand = new Random();
		//generamos un valor aleatorio entre 1 y 100
		int prob = rand.nextInt(1, 101);
		//caso es false por defecto
		boolean caso = false;
		//si la probabilidad es menor o igual de 5 ...
		if (prob <= 5) {
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
		System.out.println("Miau, Miau...");
	}
	
}
