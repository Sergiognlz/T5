package analisis.ejercicio1;

public class Turismo extends Vehiculo {
	/**
	 * enumerado de tipo Uso
	 */
	enum TipoUso{PROFESIONAL,PARTICULAR}
	/**
	 * atributo privado número de plazas
	 */
	private int numPlazas;
/**
 * atributo privado uso del vehículo
 */
	private TipoUso uso;
public Turismo(String marca, String modelo,String color, String matricula, int numPlazas, String uso) {
	super(marca, modelo,color, matricula);
	if(numPlazas>1) {
	this.numPlazas = numPlazas;
	}
	switch(uso) {
	case "PARTICULAR", "PROFESIONAL"->{
	this.uso = TipoUso.valueOf(uso);
	}
	}
}
	
	
	
}
