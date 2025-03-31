package analisis.ejercicio3;

/**
 * clase transacción para la lista transacciones
 */
public class Transacion {
/**
 * atributo privado día
 */
	private int dia;
	/**
	 * atributo privado mes
	 */
	private int mes;
	/**
	 * atributo privado año
	 */
	private int año;
	/**
	 * atributo privado concepto
	 */
	private String concepto;
	/**
	 * atributo privado importe
	 */
	private double importe;

	/**
	 * constructor Transacción
	 * @param dia
	 * @param mes
	 * @param año
	 * @param concepto
	 * @param importe
	 */
	public Transacion(int dia, int mes, int año, String concepto, double importe) {
		if(dia>0&&dia<=31) {
		this.dia = dia;
		}
		if(mes>0&&mes<=12) {
		this.mes = mes;
		}
		if(año>1900) {
		this.año = año;
		}
		if(concepto!=null&&!concepto.isBlank()) {
		this.concepto = concepto;
		}
		if(importe>0) {
		this.importe = importe;
		}
	}
	
	

}
