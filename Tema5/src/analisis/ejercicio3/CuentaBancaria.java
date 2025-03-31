package analisis.ejercicio3;

import java.util.Set;
import java.util.TreeSet;

/**
 * clase cuenta bancaria
 */
public class CuentaBancaria {
	/**
	 * atributo privado numero de cuenta
	 */
	private String numeroCuenta;
	/**
	 * atributo privado saldo inicializado a 0
	 */
	private double saldo = 0;
	/**
	 * conjunto de tipo Titular
	 */
	private Set<Titular> titulares = new TreeSet<>();

	/**
	 * constructor cuenta bancaria
	 * 
	 * @param numeroCuenta
	 * @param titular
	 */

	public CuentaBancaria(String numeroCuenta, Titular titular) {

		if (numeroCuenta != null && !numeroCuenta.isBlank()) {
			this.numeroCuenta = numeroCuenta;

		}

		this.titulares.add(titular);
	}

	/**
	 * muestra numeroCuenta
	 * 
	 * @return numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * muestra saldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * modifica saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		
		this.saldo = saldo;

	}

	/**
	 * muestra titulares
	 * 
	 * @return conjunto titulares
	 */
	public Set<Titular> getTitulares() {
		return titulares;
	}

	/**
	 * función que recibe una cantidad de dinero por parámetros y modifica el saldo
	 * de la cuenta sumando esa cantidad
	 * 
	 * @param dinero que se sumará al saldo
	 * @return true si modifica el valor de saldo y false si no
	 */
	public boolean ingresar(double dinero) {
		// variable exito
		boolean exito = false;
		// si dinero es positivo
		if (dinero > 0) {
			// modifica saldo
			this.saldo += dinero;
			// la transacción será un éxito
			exito = true;
		}
		// devolvemos exito
		return exito;
	}

	/**
	 * función que recibe una cantidad de dinero por parámetros y modifica el saldo
	 * de la cuenta restando esa cantidad siempre que esté disponible
	 * 
	 * @param dinero que se restará al saldo
	 * @return true si modifica el valor de saldo y false si no
	 */
	public boolean retirar(double dinero) {
		// variable exito
		boolean exito = false;
		// si dinero es positivo
		if (dinero > 0) {
			// modifica saldo
			this.saldo -= dinero;
			// la transacción será un éxito
			exito = true;
		}
		// devolvemos exito
		return exito;
	}

	/**
	 * función que añade titulares a la cuenta bancaria
	 * 
	 * @param titular que se añadirá
	 * @return true si lo añade o false si no
	 */
	public boolean añadirTitular(Titular titular) {
		// devolverá true si lo añade y false si no
		return this.titulares.add(titular);
	}

	/**
	 * función que elimina un titular de la cuenta bancaria
	 * 
	 * @param titular que se eliminará
	 * @return true si lo elimina o false si no
	 */
	public boolean eliminarTitular(Titular titular) {
		// devolverá true si lo elimina y false si no
		return this.titulares.remove(titular);
	}

	/**
	 * sobreescritura del método equals
	 */
	@Override
	public boolean equals(Object obj) {
		// variable iguales false por defecto
		boolean iguales = false;
		// casteo de obj a tipo CuentaBancaria
		CuentaBancaria cb = (CuentaBancaria) obj;
		// será iguales si el número de cuenta es el mismo
		if (this.numeroCuenta.equals(cb.numeroCuenta)) {
			// iguales a true
			iguales = true;
		}
		// devolvemos iguales
		return iguales;
	}


	
	
}
