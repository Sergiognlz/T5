package analisis.ejercicio3;

import java.util.Comparator;

/**
 * clase compara saldo que ordena las cuentas bancarias en base al saldo de manera descendente
 */
public class ComparaSaldo implements Comparator<CuentaBancaria> {
	
	/**
	 * sobreescritura del método compare
	 */
	@Override
	public int compare(CuentaBancaria o1, CuentaBancaria o2) {
		//respuesta será el casteo a int de la resta de números decimales del saldo de o2-o1 (orden descendente)
		int res=(int)(o2.getSaldo()-o1.getSaldo());
		
		return res;
	}

}
