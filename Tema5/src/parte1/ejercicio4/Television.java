package parte1.ejercicio4;

public class Television extends Electrodomestico {

	
	//atributo privado resolucion
	private double resolucion=20;
	
	//atributo privado sintonizador tdt
	private boolean sintonizadorTDT=false;

	
	
	/**
	 * constructor desde la superclase
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		
	}


/**
 * constructor  
 * 
 * @param precioBase
 * @param color
 * @param consumoEnergetico
 * @param peso
 * @param resolucion
 * @param tdt
 */
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, char tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		
		if(resolucion>0) {
		this.resolucion=resolucion;
		}
		
		compruebaTDT(tdt);
	
	}
	
	/**
	 * comprueba tdt
	 * @param tdt
	 */
	private void compruebaTDT(char tdt) {
		
	if(tdt=='S') {
		this.sintonizadorTDT=true;
	}
	}

	
	
/**
 * muestra resolución
 * @return resolución
 */
	public double getResolucion() {
		return resolucion;
	}

/**
 * muestra  si tiene tdt
 * @return true o false
 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * función que modifica el precio final
	 */
public void precioFinal() {
	
	super.precioFinal();
	
	double incremento=30*super.getPrecioBase()/100;
	
	if(this.resolucion>40) {
		
		super.setPrecioBase(super.getPrecioBase()+incremento);
	}
	
	if(this.sintonizadorTDT) {
		super.setPrecioBase(super.getPrecioBase()+50);	
	}
	
	
}

	
	
	
	
}
