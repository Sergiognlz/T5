package analisis.ejercicio2;

/**
 * clase abstracta Ficha
 */
public abstract class Ficha {

	/**
	 * atributo privado número
	 */
	private int num;

	/**
	 * atributo privado título
	 */
	private String titulo;

	/**
	 * Constructor ficha
	 * @param num ficha
	 * @param titulo ficha
	 */
	public Ficha(int num, String titulo) {
		if (num > 0) {
			this.num = num;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	/**
	 * función abstracta prestar
	 */
	public abstract void prestar();
		
	
	
	
}
