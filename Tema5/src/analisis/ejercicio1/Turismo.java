package analisis.ejercicio1;

public class Turismo extends Vehiculo {
	/**
	 * enumerado de tipo Uso
	 */
	enum Uso{PROFESIONAL,PARTICULAR}
	/**
	 * atributo privado número de plazas
	 */
	private int numPlazas;
/**
 * atributo privado uso del vehículo
 */
	private Uso uso;
public Turismo(String marca, String modelo, String matricula, int numPlazas, Uso uso) {
	super(marca, modelo, matricula);
	if(numPlazas>1) {
	this.numPlazas = numPlazas;
	}
	this.uso = uso;
}
	
	
	
}
