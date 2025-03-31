package analisis.ejercicio3;

import java.util.Set;
import java.util.TreeSet;

public class CuentaBancaria {

	private String numeroCuenta;

	private double saldo = 0;

	private Set<Titular> titulares = new TreeSet<>();

	public CuentaBancaria(String numeroCuenta, Titular titular) {

		if (numeroCuenta != null && !numeroCuenta.isBlank()) {
			this.numeroCuenta = numeroCuenta;
		}

		this.titulares.add(titular);
	}

}
