package examentema5;

public class PrecioNegativoException extends Exception {

	@Override
	public String toString() {

		return "El precio es negativo";
	}

	@Override
	public String getMessage() {

		return "El precio es negativo";

	}
}
