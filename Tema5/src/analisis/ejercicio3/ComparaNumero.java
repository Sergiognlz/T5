package analisis.ejercicio3;

import java.util.Comparator;

/**
 * Establece como orden por defecto para las Cuentas Bancarias el número de cuenta en orden ascendente.
 */
public class ComparaNumero implements Comparator<CuentaBancaria> {
	
	/**
	 * sobreescritura método compare
	 */
	@Override
	public int compare(CuentaBancaria o1, CuentaBancaria o2) {
		//respuesta será la diferencia usando el método compareTo entre o2 y o1 (orden ascendente)
			int res=o1.getNumeroCuenta().compareTo(o2.getNumeroCuenta());
		//devolvemos res
		return res;
	}

}
