package analisis.ejercicio3;

/**
 * clase cuenta de ahorros hija de cuenta bancaria
 */
public class CuentaAhorro extends CuentaBancaria {

	/**
	 * atributo privado estático cuota mensual establecida a 15.99
	 */
	private static double  cuotaMensual = 15.99;
	/**
	 * atributo privado estático interés anual establecido a 2%
	 */
	private static double interesAnual = 2;

	/**
	 * constructor CuentaAhorro sin atributos propios
	 * 
	 * @param numeroCuenta
	 * @param titular
	 */
	public CuentaAhorro(String numeroCuenta, Titular titular) {
		super(numeroCuenta, titular);

	}

	/**
	 * función que muestra cuanto sería el saldo con el interés
	 * 
	 * @return total saldo con interés
	 */
	public double aplicarInteres() {
		// atributo total calculado sobre el 2% del saldo
		double total = (super.getSaldo() * 2) / 100;
		// devolvemos total
		return total;
	}

	/**
	 * función que resta la cuota de mantenimiento del saldo actual
	 */
	public void aplicarMantenimiento() {
		//resta el mantenimiento al saldo
		super.setSaldo(super.getSaldo()-15.99);
	}

	
	
}
