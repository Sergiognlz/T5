package parte1.ejercicio3;

public class Producto {
	// atributo privado nombre
	private String nombre;

	// atriburo privado precio
	private double Precio;

	/**
	 * constructor del objeto producto
	 * 
	 * @param nombre
	 */
	public Producto(String nombre) {
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;
		}
	}

	/**
	 * constructor alterno objeto producto
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;
		}
		if (precio > 0) {
			Precio = precio;
		}
	}

	/**
	 * Muestra nombre del producto
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * modifica nombre del producto
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if(nombre!=null&&!nombre.isBlank()) {
		this.nombre = nombre;
		}
	}
	
	/**
	 * muestra precio del producto
	 * @return precio
	 */
	public double getPrecio() {
		return Precio;
	}
	
	/**
	 * Modifica precio del producto
	 * @param precio
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
		Precio = precio;
		}
	}

	/**
	 * Sobreescritura del método toString
	 */
	@Override
	public String toString() {
		String cadena="Producto: "+this.nombre+"\n Precio: "+this.Precio+" €\n";
		
		return cadena;
	}
	
	/**
	 * función a la que pasamos una cantidad de productos y calcula el precio final
	 * @param cantidad
	 * @return total
	 */
	public double calcular(int cantidad) {
		double total=(double)this.Precio*cantidad;
		
		return total;
	}
	
}
