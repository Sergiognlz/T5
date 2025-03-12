package parte1.ejercicio4;

public class Lavadora extends Electrodomestico {
	
	//atributo privado carga
	private double carga=5;

	
	/**
	 * constructor desde super clase
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		
	}


	/**
	 * constructor desde super clase
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		
		if(carga>0) {
		this.carga=carga;
		}
		
	}

/**
 * muestra carga
 * @return carga
 */
	public double getCarga() {
		return carga;
	}
	
/**
 * función que calcula el precio final de la lavadora. 
 */
	public void precioFinal() {
		
		super.precioFinal();
		
		if(this.carga>30) {
			super.setPrecioBase(super.getPrecioBase()+50);
		}
	}
	
	
}
