package analisis.ejercicio2;

/**
 * clase Revista hija de Ficha
 */
public class Revista extends Ficha {

	/**
	 * atributo privado numRevista
	 */
	private int numRevista;

	/**
	 * atributo privado añoPublicación
	 */
	private int añoPublicacion;

	/**
	 * Constructor Revista
	 * @param num
	 * @param titulo
	 * @param numRevista
	 * @param añoPublicacion
	 */
	public Revista(int num, String titulo, int numRevista, int añoPublicacion) {
		super(num, titulo);

		if (numRevista > 0) {
			this.numRevista = numRevista;
		}
		if (añoPublicacion > 1700) {
			this.añoPublicacion = añoPublicacion;
		}
	}

	/**
	 * función prestar
	 */
	public void prestar() {
		System.out.println("Tiempo de préstamo: 10 días");
	}
	
}
