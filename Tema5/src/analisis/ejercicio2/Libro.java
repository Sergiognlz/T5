package analisis.ejercicio2;

/**
 * clase Libro hija de Ficha
 */
public class Libro extends Ficha {

	/**
	 * atributo privado autor
	 */
	private String autor;

	/**
	 * atributo privado editorial
	 */
	private String editorial;

	/**
	 * Constructor Libro
	 * 
	 * @param num
	 * @param titulo
	 * @param autor
	 * @param editorial
	 */
	public Libro(int num, String titulo, String autor, String editorial) {
		super(num, titulo);

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}

	/**
	 * función prestar
	 */
	public void prestar() {
		System.out.println("Tiempo de préstamo: 15 días");
	}

	@Override
	public String toString() {
		
		return super.toString()+" "+this.autor+" "+this.editorial;
	}
	
}
