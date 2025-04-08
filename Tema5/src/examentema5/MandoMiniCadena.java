package examentema5;

/**
 * clase MandoMiniCadena hija de MandoDistancia y que implementa Volumen
 */
public class MandoMiniCadena extends MandoDistancia implements Volumen {
	/**
	 * atributo privado volumen a 0 por defecto
	 */
	private int volumen=0;

	/**
	 * constructor MandoMiniCadena
	 * @param modelo del mando
	 * @param anchura mando
	 * @param precio mando
	 * @throws PrecioNegativoException
	 * @throws ModeloException
	 */
	public MandoMiniCadena(String modelo, double anchura, double precio)
			throws PrecioNegativoException, ModeloException {
		super(modelo, anchura, precio);

	}
	
	/**
	 * método que incrementa el valor de volumen de 10 en 10 mientras sea menor que
	 * 100;
	 */
	public void subirVolumen() {

		if (this.volumen < 100) {

			this.volumen += 10;
		}
	}
	/**
	 * método que decrementa el valor de volumen de 10 en 10 mientras sea mayor que 0
	 */
	public void bajarVolumen() {
		if (this.volumen > 0) {
			this.volumen -= 10;
		}
	}
	
	/**
	 * sobreescritura del método toString
	 */
	@Override
	public String toString() {
		//devolvemos toString de la clase padre más los datos propios de la hija
		return super.toString()+"Volumen: "+this.volumen;
	}

}
