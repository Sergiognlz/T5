package parte1.ejercicio5;

/**
 * Clase abstracta polígono que representa un polígono
 */
public abstract class Poligono {

	/**
	 * atributo privado número lados
	 */
	private int numLados;


	/**
	 * constructor polígono
	 * @param numLados
	 */
	public Poligono(int numLados) {
		
		if(numLados>2) {
		this.numLados = numLados;
		}
	}

	
	/**
	 * muestra número de lados
	 * @return número lados
	 */
	public int getNumLados() {
		return numLados;
	}




	/**
	 * sobreescritura del método toString
	 * @return cadena
	 */
	@Override
	public String toString() {
		//cadena
		String cadena="Lados: " +String.valueOf(numLados);
		//devolvemos número de lados
		return cadena;
	
	}

	/**
	 * método abtracto area
	 */
	public abstract double area();

}
