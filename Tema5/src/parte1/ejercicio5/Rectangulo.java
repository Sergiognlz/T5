package parte1.ejercicio5;

	
	/**
	 * subclase de polígono triángulo
	 */
	public class Rectangulo extends Poligono {
		/**
		 * atributo privado lado1
		 */
		private double lado1 = 1;
		/**
		 * atributo privado lado2
		 */
		private double lado2 = 1;
		

		/**
		 * constructr triángulo sin parámetros
		 */
		public Rectangulo() {
			super(3);

		}

		/**
		 * Constructor triángulo
		 * 
		 * @param numLados
		 * @param lado1
		 * @param lado2
		 */
		public Rectangulo(double lado1, double lado2) {
			super(3);
			if (lado1 > 0) {
				this.lado1 = lado1;
			}
			if (lado2 > 0) {
				this.lado2 = lado2;
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
		 * sobrescritura del método área 
		 *@return area
		 */
		@Override
		public double area() {
			double area=this.lado1*this.lado2;
			
			return area;
		}

		
		@Override
		public String toString() {
			//cadena
			String cadena=getClass().getName()+"\n";
			cadena+="Lado1: "+getLado1()+"\n";
			cadena+="Lado2: "+getLado2()+"\n";
			cadena+="Área: "+this.area()+"\n";
			
			return cadena;
		}
	}
	
