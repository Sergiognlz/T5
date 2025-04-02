package analisis.ejercicio2;

/**
 * clase abstracta Ficha
 */
public abstract class Ficha implements Comparable<Ficha> {

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
	 * 
	 * @param num    ficha
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

	
	
	public int getNum() {
		return num;
	}



	public String getTitulo() {
		return titulo;
	}



	/**
	 * función abstracta prestar
	 */
	public abstract void prestar();

	@Override
	public int compareTo(Ficha o) {
		int res=this.num-o.num;
		
		
		return res;
	}

	@Override
	public String toString() {
		String cadena=this.num+" "+this.titulo;
		
		return cadena;
	}
	
}
