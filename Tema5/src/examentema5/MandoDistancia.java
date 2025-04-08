package examentema5;

public class MandoDistancia implements Comparable<MandoDistancia> {

	private String modelo;

	private double anchura;

	private double precio;

	private boolean encendido = false;

	public MandoDistancia(String modelo, double anchura, double precio) throws PrecioNegativoException, ModeloException {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}else {
			throw new ModeloException();
		}
		if (anchura > 0) {
			this.anchura = anchura;
		}

		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new PrecioNegativoException();

		}

	}

	public void interruptorMando() {

		if (this.encendido) {
			this.encendido = false;
		} else {
			this.encendido = true;
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;

		MandoDistancia m = (MandoDistancia) obj;

		if (this.modelo.equals(m.modelo)) {
			iguales = true;
		}
		return iguales;
	}

	@Override
	public String toString() {
		String cadena = "Modelo: " + this.modelo + "\n Anchura: " + this.anchura + "\n Precio: " + this.precio
				+ "\n Encendido: " + this.encendido + "\n";

		return cadena;
	}

	@Override
	public int compareTo(MandoDistancia o) {

		return this.modelo.compareTo(o.modelo);
	}

}
