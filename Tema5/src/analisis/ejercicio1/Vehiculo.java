package analisis.ejercicio1;

/**
 * Clase vehículo con sus datos
 */
public class Vehiculo {
	/**
	 * atributo privado marca
	 */
	private String marca;
	/**
	 * atributo privado modelo
	 */
	/**
	 * atributo privado color
	 */
	private String color;

	private String modelo;
	/**
	 * atributo privado matrícula
	 */
	private String matricula;
	/**
	 * atributo privado motor encendido inicializado a false
	 */
	private boolean mortorEcendido = false;
	/**
	 * atributo privado marcha actual es 0
	 */
	private int marchaActual = 0;
	/**
	 * atributo privado velocidad actual a 0
	 */
	private int velocidadActual = 0;

	/**
	 * constructor con los datos relevantes
	 * 
	 * @param marca
	 * @param modelo
	 * @param matricula
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {

		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}

		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}

	}

	/**
	 * método parar que establece el estado por defecto del vehículo, es decir
	 * parado. Motor apagado, velocidad a 0 y marcha a 0
	 */
	public void parar() {
		this.mortorEcendido = false;
		System.out.println("Motor apagado");
	}

	/**
	 * método arrancar que arranca el vehículo encendiendo el motor, metiendo
	 * primera y estableciendo velocidad a 1 k/h
	 */
	public void arrancar() {
		this.mortorEcendido = true;
		
		System.out.println("Motor en marcha");

	}

	/**
	 * método que incrementa la marcha
	 */
	public void subirMarcha() {
		if (this.marchaActual < 5) {
			this.marchaActual++;

		} else {
			System.out.println("Ya estás en la marcha máxima del vehículo");
		}
	}

	/**
	 * método que reduce la marcha, si la marcha llega a 0 para el vehículo
	 */
	public void bajarMarcha() {
		if (this.marchaActual > 1) {
			this.marchaActual--;

		} else {
			
			System.out.println("La marcha actual es la 0");
		}
	}

	/**
	 * método que recibe una velocidad y devuelve la marcha a la que se encuentra;
	 * 
	 * @param velocidad
	 */
	public void acelerar(int velocidad) {

		if (this.mortorEcendido && this.velocidadActual < velocidad) {

			while (this.velocidadActual < velocidad) {

				System.out.println(this.velocidadActual + " k/h");

				if (this.velocidadActual >= 0 && this.velocidadActual <= 30 && this.marchaActual != 1) {

					subirMarcha();
					System.out.println("Marcha " + this.marchaActual);

				} else if (this.velocidadActual > 30 && this.velocidadActual <= 50 && this.marchaActual != 2) {

					subirMarcha();
					System.out.println("Marcha " + this.marchaActual);

				} else if (this.velocidadActual > 50 && this.velocidadActual <= 70 && this.marchaActual != 3) {

					subirMarcha();
					System.out.println("Marcha " + this.marchaActual);

				} else if (this.velocidadActual > 70 && this.velocidadActual <= 100 && this.marchaActual != 4) {

					subirMarcha();
					System.out.println("Marcha " + this.marchaActual);

				} else if (this.velocidadActual > 100 && this.marchaActual != 5) {

					subirMarcha();
					System.out.println("Marcha " + this.marchaActual);
				}
				this.velocidadActual++;
			}

		} else {
			System.out.println("No se puede realizar la opción");
		}
	}

	/**
	 * método que recibe una velocidad y devuelve la marcha a la que se encuentra;
	 * 
	 * @param velocidad
	 */
	public void desacelerar(int velocidad) {

		if (this.mortorEcendido && this.velocidadActual > velocidad) {

			while (this.velocidadActual >= velocidad) {

				System.out.println(this.velocidadActual + " k/h");

				if (this.velocidadActual >= 0 && this.velocidadActual <= 30 && this.marchaActual != 1) {

					bajarMarcha();
					System.out.println("Marcha "+this.marchaActual);

				} else if (this.velocidadActual > 30 && this.velocidadActual <= 50 && this.marchaActual != 2) {

					bajarMarcha();
					System.out.println("Marcha "+this.marchaActual);

				} else if (this.velocidadActual > 50 && this.velocidadActual <= 70 && this.marchaActual != 3) {

					bajarMarcha();
					System.out.println("Marcha "+this.marchaActual);

				} else if (this.velocidadActual > 70 && this.velocidadActual <= 100 && this.marchaActual != 4) {

					bajarMarcha();
					System.out.println("Marcha "+this.marchaActual);

				} else if (this.velocidadActual > 100 && this.marchaActual != 5) {

					bajarMarcha();
					System.out.println("Marcha "+this.marchaActual);
				}
				this.velocidadActual--;
			}

		} else {
			System.out.println("No se puede realizar la opción");
		}
	}
}
