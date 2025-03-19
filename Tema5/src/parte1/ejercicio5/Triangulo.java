package parte1.ejercicio5;

/**
 * subclase de polígono triángulo
 */
public class Triangulo extends Poligono {
	/**
	 * atributo privado lado1
	 */
	private double lado1 = 1;
	/**
	 * atributo privado lado2
	 */
	private double lado2 = 1;

	/**
	 * atributo privado lado3
	 */
	private double lado3 = 1;

	/**
	 * constructr triángulo sin parámetros
	 */
	public Triangulo() {
		super(3);

	}

	/**
	 * Constructor triángulo
	 * 
	 * @param numLados
	 * @param lado1
	 * @param lado2
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}

		if (lado3 > 0) {
			this.lado3 = lado3;
		}

	}

	/**
	 * muestra lado 1
	 * 
	 * @return lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * modifica lado1
	 * 
	 * @param lado1
	 */
	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	/**
	 * muestra lado2
	 * 
	 * @return lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * modifica el atributo lado2
	 * 
	 * @param lado2
	 */
	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * muestra lado3
	 * 
	 * @return lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * modifica lado3
	 * 
	 * @param lado3
	 */
	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * sobrescritura del método área
	 * 
	 * @return area
	 */
	@Override
	public double area() {
		double semper = (this.lado1 + this.lado2 + this.lado3) / 2;

		double area = Math.sqrt(semper * (semper - this.lado1) * (semper - this.lado2) * semper - this.lado3);

		return area;
	}

	@Override
	public String toString() {
		// cadena
		String cadena = getClass().getName() + "\n";
		cadena += "Lado1: " + getLado1() + "\n";
		cadena += "Lado2: " + getLado2() + "\n";
		cadena += "Lado3: " + getLado3() + "\n";
		cadena+="Área: "+this.area()+"\n";
		
		return cadena;
	}

}
