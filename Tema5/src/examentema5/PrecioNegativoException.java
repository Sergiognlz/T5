package examentema5;

/**
 * clase PrecioNegativoException que hereda de la clase Exception y que nos
 * servirá para personalizar los mensajes de error que nos mostrará cuando nos
 * lance una excepción por el precio negativo
 */
public class PrecioNegativoException extends Exception {

	/**
	 * sobreescritura del método toString
	 */
	@Override
	public String toString() {
		//devolvemos mensaje de error
		return "El precio es negativo";
	}
	/**
	 * sobreescritura del método getMessage
	 */
	@Override
	public String getMessage() {
		//devolvemos mensaje error
		return "El precio es negativo";

	}
}
