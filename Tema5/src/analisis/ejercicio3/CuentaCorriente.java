package analisis.ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * clase cuenta corriente hija de cuenta bancaria
 */
public class CuentaCorriente extends CuentaBancaria{
	/**
	 * atributo privado estático porcentaje cobrado establecido a 5%
	 */
	private static double porcentajeCobrado=5;
	/**
	 * lista privada de tipo Transacción
	 */
	private List<Transacion>transaciones=new ArrayList<>();
	
	
	/**
	 * Constructor con valores heredados de la clase padre
	 * @param numeroCuenta
	 * @param titular
	 */
	public CuentaCorriente(String numeroCuenta, Titular titular) {
		super(numeroCuenta, titular);
		
	}
	
	/**
	 * función que recibe una transacción y la añade a la lista
	 * @param trans
	 * @return
	 */
	public boolean agregarTransacion(Transacion trans) {
		//devuelve true si agrega la transación y false si no
		return this.transaciones.add(trans);
	}
	
	
	
}
