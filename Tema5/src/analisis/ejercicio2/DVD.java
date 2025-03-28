package analisis.ejercicio2;

/**
 * clase DVD hija de Ficha
 */
public class DVD extends Ficha {

	/**
	 * enumerado de tipo Tipo
	 */
	enum Tipo {
		PELICULA, DOCUMENTAL, SERIE
	};

	/**
	 * atributo privado director
	 */
	private String director;

	/**
	 * Atributo privado año
	 */
	private int año;

	/**
	 * atributo privado Tipo
	 */
	private Tipo tipo;

	/**
	 * Constructor DVD
	 * @param num
	 * @param titulo
	 * @param director
	 * @param año
	 * @param tipo
	 */
	public DVD(int num, String titulo, String director, int año, String tipo) {
		super(num, titulo);

		if (director != null && !director.isBlank()) {
			this.director = director;
		}
		if(año>1800) {
			this.año=año;
		}
		switch(tipo) {
		case "PELICULA","DOCUMENTAL","SERIE"->{
			this.tipo=Tipo.valueOf(tipo);
		}
		}
	}

	/**
	 * función prestar
	 */
	public void prestar() {
		System.out.println("Tiempo de préstamo: 5 días");
	}
}
