package parte1.ejercicio3;

public class Perecedero extends Producto {

	// atributo privado días a caducar
	private int diasACaducar;

	/**
	 * constructor desde la superclase
	 * 
	 * @param nombre producto
	 * @param precio producto
	 * @param dias   para caducar
	 */
	public Perecedero(String nombre, double precio, int dias) {
		super(nombre, precio);

		if (dias > 0) {
			this.diasACaducar = dias;
		}

	}

	/**
	 * muestra días a caducar
	 * 
	 * @return dias a caducar
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * modifica días a caducar
	 * 
	 * @param diasACaducar
	 */
	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * sobreescritura del método toString
	 */
	@Override
	public String toString() {
		String cadena = super.toString() + " Días a caducar: " + this.diasACaducar + "\n";

		return cadena;
	}

	/**
	 * función a la que pasamos una cantidad de productos y calcula el precio final
	 * teniendo en cuanta los días que le queden de caducidad
	 * 
	 * @param cantidad
	 * @return total
	 */
	public double calcular(int cantidad) {

		double total = (double) super.getPrecio() * cantidad;

		switch (this.diasACaducar) {

		case 1 -> {
			total /= 4;
		}
		case 2 -> {
			total /= 3;
		}
		case 3 -> {
			total /= 2;
		}
		}

		return total;
	}

}
