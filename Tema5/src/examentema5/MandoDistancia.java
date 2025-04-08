package examentema5;

public class MandoDistancia implements Comparable<MandoDistancia> {

	private String modelo;

	private double anchura;

	private double precio;

	private boolean encendido = false;

	
	
	public MandoDistancia(String modelo, double anchura, double precio) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (anchura > 0) {
			this.anchura = anchura;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	
	
	
}
