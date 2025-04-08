package examentema5;

/**
 * clase ModeloException que hereda de la clase Exception y que vamos a usar
 * para mostrar un mensaje personalizado cuando nos tire una excepción cuando el modelo sea nulo o esté vacío
 */
public class ModeloException extends Exception {
/**
 * sobreescritura del método toString
 */
	@Override
	public String toString() {
		//devolvemos mensaje error
		return "Modelo nulo o vacío";
	}
/**
 * sobreescritura del método getMessage
 */
	public String getMessage() {
		//devolvemos mensaje error
		return "Modelo nulo o vacío";
	}

}
