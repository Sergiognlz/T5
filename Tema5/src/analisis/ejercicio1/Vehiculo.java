package analisis.ejercicio1;

/**
 * Clase vehículo con sus datos
 */
public abstract class Vehiculo {
	/**
	 * atributo privado marca
	 */
	private String marca;
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
	public Vehiculo(String marca, String modelo, String matricula) {

		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
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
		this.velocidadActual = 0;
		this.marchaActual = 0;
	}

	/**
	 * método arrancar que arranca el vehículo encendiendo el motor, metiendo
	 * primera y estableciendo velocidad a 1 k/h
	 */
	public void arrancar() {
		this.mortorEcendido = true;
		this.velocidadActual = 1;
		this.marchaActual = 1;
	}

	/**
	 * método que incrementa la marcha
	 */
	public void subirMarcha() {
		if (this.marchaActual < 5) {
			this.marchaActual++;
			switch(this.marchaActual) {
			case 1->{
				this.velocidadActual=1;
			}
			case 2->{
				this.velocidadActual=30;
			}
			case 3->{
				
			}
			}

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
			parar();
			System.out.println("La marcha actual es la 0");
		}
	}

	/**
	 * método que recibe una velocidad y devuelve la marcha a la que se encuentra;
	 * 
	 * @param velocidad
	 */
	public void modVelocidad(int velocidad) {
		if (velocidad > 0) {
			this.velocidadActual = velocidad;
			if (velocidad > 0 && velocidad <= 30) {
				this.marchaActual = 1;
			} else if (velocidad > 30 && velocidad <= 50) {
				this.marchaActual = 2;
			} else if (velocidad > 50 && velocidad <= 70) {
				this.marchaActual = 3;
			} else if (velocidad > 70 && velocidad <= 100) {
				this.marchaActual = 4;
			} else {
				this.marchaActual = 5;
			}
		}else {
			parar();
		}
	}

}
