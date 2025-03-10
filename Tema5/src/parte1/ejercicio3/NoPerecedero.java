package parte1.ejercicio3;

public class NoPerecedero extends Producto{

	//atributo private tipo
	private String tipo;
	
	/**
	 * constructo desde la superclase
	 * @param nombre producto
	 * @param precio producto
	 * @param tipo producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo=tipo;
		
	}

	/**
	 * muestra tipo de producto
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * modifica tipo de producto
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * sobreescritura del método toString
	 */
	@Override
	public String toString() {
		String cadena=super.toString()+"Tipo: "+this.tipo+"\n";
		
		return cadena;
	}
	

	/**
	 * función a la que pasamos una cantidad de productos y calcula el precio final
	 * @param cantidad
	 * @return total
	 */
	public double calcular(int cantidad) {
		double total=(double)super.getPrecio()*cantidad;
		
		return total;
	}
	
}
