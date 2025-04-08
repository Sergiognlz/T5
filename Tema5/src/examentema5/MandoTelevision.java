package examentema5;

/**
 * clase MandoTelevision que hereda de MandoDistancia
 */
public class MandoTelevision extends MandoDistancia implements Volumen {
	/**
	 * atributo privado volumen a 0 por defecto. Entendemos que el volumen va de 0 a 100
	 */
	private int volumen = 0;
	/**
	 * atributo privado canal a 1 por defecto. Entendemos que los canales van de 1 a 100
	 */
	private int canal = 1;

	/**
	 * constructor mandoTelevision
	 * 
	 * @param modelo
	 * @param anchura
	 * @param precio
	 * @param volumen
	 * @param canal
	 * @throws PrecioNegativoException
	 * @throws ModeloException
	 */
	public MandoTelevision(String modelo, double anchura, double precio)
			throws PrecioNegativoException, ModeloException {
		// heredamos atributos de clase padre
		super(modelo, anchura, precio);
	}

	/**
	 * método que incrementa los canales en 1. Solo cuando el canal es menor que 100
	 */
	public void masCanal() {
		if (this.canal < 100) {
			this.canal++;
		}
	}

	/**
	 * método que reduce el canal en 1. Solo cuando el canal es mayor que 1
	 */
	public void menosCanal() {
		if (canal > 1) {
			this.canal--;
		}
	}

	/**
	 * método que incrementa el valor de volumen de 5 en 5 mientras sea menor que
	 * 100;
	 */
	public void subirVolumen() {

		if (this.volumen < 100) {

			this.volumen += 5;
		}
	}
	/**
	 * método que decrementa el valor de volumen de 5 en 5 mientras sea mayor que 0
	 */
	public void bajarVolumen() {
		if (this.volumen > 0) {
			this.volumen -= 5;
		}
	}
	
	/**
	 * sobreescritura del método toString llamando a los datos de la clase padre
	 * @return datos del padre más los del hijo
	 */
	@Override
	public String toString() {
		//devolvemos datos
		return super.toString()+ "Volumen: "+this.volumen+"\nCanal: "+this.canal;
	}
}
