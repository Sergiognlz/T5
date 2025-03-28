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
	 * atributo privado color
	 */
	private String color;
	/**
	 * atributo privado modelo
	 */
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
	 * método que recibe una velocidad e incrementa la velocidad cambieando de
	 * marcha cuando sea necesario.
	 * 
	 * @param velocidad
	 */
	public void acelerar(int velocidad) {
		// primero comprobamos que el motor esté encendido y que la velocidad actual sea
		// menor que la que le pasamos por parámetro
		if (this.mortorEcendido && this.velocidadActual < velocidad) {
			// bucle while para que itere hasta que la velocidad actual alcance a la que le
			// pasamos
			while (this.velocidadActual < velocidad) {
				// imprimimos velocidad actual
				System.out.println(this.velocidadActual + " k/h");
				// si la velocidad actual se encuentra en el rango de la primera marcha y la
				// marcha 1 no está siendo usada...
				if (this.velocidadActual >= 0 && this.velocidadActual <= 30 && this.marchaActual != 1) {
					// llamamos a la función subir marcha
					subirMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la segunda marcha y la
					// marcha 2 no está siendo usada...
				} else if (this.velocidadActual > 30 && this.velocidadActual <= 50 && this.marchaActual != 2) {
					// llamamos a la función subir marcha
					subirMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la tercera marcha y la
					// marcha 3 no está siendo usada...
				} else if (this.velocidadActual > 50 && this.velocidadActual <= 70 && this.marchaActual != 3) {
					// llamamos a la función subir marcha
					subirMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la cuarta marcha y la
					// marcha 4 no está siendo usada...
				} else if (this.velocidadActual > 70 && this.velocidadActual <= 100 && this.marchaActual != 4) {
					// llamamos a la función subir marcha
					subirMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la quinta marcha y la
					// marcha 5 no está siendo usada...
				} else if (this.velocidadActual > 100 && this.marchaActual != 5) {
					// llamamos a la función subir marcha
					subirMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
				}
				// incrementamos velocidad actual
				this.velocidadActual++;
			}
			// si el motor está apagado o la velocidad pasada por parámetro no es válida
		} else {
			// mensaje de error
			System.out.println("No se puede realizar la opción");
		}
	}

	/**
	 * método que recibe una velocidad y decrementa la velocidad cambiando marchas
	 * cuando sea necesario. Muestra cuenta km
	 * 
	 * @param velocidad
	 */
	public void desacelerar(int velocidad) {
		// primero comprobamos que el motor esté encendido y que la velocidad actual sea
		// mayor que la que le pasamos por parámetro
		if (this.mortorEcendido && this.velocidadActual > velocidad) {
			// bucle while para que itere hasta que la velocidad actual alcance a la que le
			// pasamos
			while (this.velocidadActual >= velocidad) {
				// imprimimos velocidad actual
				System.out.println(this.velocidadActual + " k/h");
				// si la velocidad actual se encuentra en el rango de la primera marcha y la
				// marcha 1 no está siendo usada...
				if (this.velocidadActual >= 0 && this.velocidadActual <= 30 && this.marchaActual != 1) {
					// llamamos a la función bajarMarcha
					bajarMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la segunda marcha y la
					// marcha 2 no está siendo usada...
				} else if (this.velocidadActual > 30 && this.velocidadActual <= 50 && this.marchaActual != 2) {
					// llamamos a la función bajarMarcha
					bajarMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la tercera marcha y la
					// marcha 3 no está siendo usada...
				} else if (this.velocidadActual > 50 && this.velocidadActual <= 70 && this.marchaActual != 3) {
					// llamamos a la función bajarMarcha
					bajarMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la cuarta marcha y la
					// marcha 4 no está siendo usada...
				} else if (this.velocidadActual > 70 && this.velocidadActual <= 100 && this.marchaActual != 4) {
					// llamamos a la función bajarMarcha
					bajarMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
					// si la velocidad actual se encuentra en el rango de la quinta marcha y la
					// marcha 5 no está siendo usada...
				} else if (this.velocidadActual > 100 && this.marchaActual != 5) {
					// llamamos a la función bajarMarcha
					bajarMarcha();
					// imprimimos marcha actual
					System.out.println("Marcha " + this.marchaActual);
				}
				// decrecemos la velocidad actual
				this.velocidadActual--;
			}
			// si el motor está apagado o la velocidad pasada por parámetro no es válida
		} else {
			// mensaje error
			System.out.println("No se puede realizar la opción");
		}
	}
}
