package analisis.ejercicio1;

public class Camion extends Vehiculo {
	
	//atributo privado peso máximo
	private double pesoMax;
	
	//atributo privado mercancía Peligrosa
	private boolean mercanciaPeligrosa;

	
	/**
	 * constructor camión
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param pesoMax
	 * @param mercanciaPeligrosa
	 */
	public Camion(String marca, String modelo, String color, String matricula, double pesoMax,boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
	if(pesoMax>0) {
		this.pesoMax=pesoMax;
	}

		this.mercanciaPeligrosa=mercanciaPeligrosa;
	}
	
	
	
	
	
}
