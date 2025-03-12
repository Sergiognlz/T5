package parte1.ejercicio4;

public class Electrodomestico {
	// enumerado de tipo color
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	// enumerado de tipo consumo
	enum Consumo {
		A, B, C, D, E, F
	};

//atributo privado precio base
	private double precioBase = 100;
//atributo privado color
	private Color color = Color.BLANCO;
//atributo privado consumo energético
	private Consumo consumoEnergetico = Consumo.F;
// atributo privado peso
	private double peso = 5;

	/**
	 * constructor electrodoméstico
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * constructor electrodoméstico
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {

		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (color != null) {
			compruebaColor(color.toUpperCase());
		}

		compruebaConsumo(consumoEnergetico);

		if (peso > 0) {
			this.peso = peso;
		}

	}

	/**
	 * función que comprueba que el color está dentro del rango de los deseados
	 * 
	 * @param color
	 */

	private void compruebaColor(String color) {

		switch (color) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = Color.valueOf(color);
		}
		}
	}

	/**
	 * función que comprueba que el consumo está dentro del rango deseado
	 * 
	 * @param consumo
	 */
	private void compruebaConsumo(char consumo) {

		switch (consumo) {
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			this.consumoEnergetico = Consumo.valueOf(String.valueOf(consumo).toUpperCase());
		}
		}
	}

	/**
	 * muestra precio base
	 * 
	 * @return precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * modifica precio base
	 * 
	 * @param precioBase
	 */
	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * muestra color
	 * 
	 * @return color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * muestra consumo energético
	 * 
	 * @return consumo
	 */
	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * muestra peso
	 * 
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * método que modifica el precio base aumentándolo en base a su consumo
	 * energético y peso
	 */
	public void precioFinal() {

		switch (this.consumoEnergetico) {

		case A -> {
			this.precioBase += 80;
		}
		case B -> {
			this.precioBase += 60;
		}
		case C -> {
			this.precioBase += 50;
		}
		case D -> {
			this.precioBase += 30;
		}
		case E -> {
			this.precioBase += 10;
		}
		case F -> {
			this.precioBase += 100;
		}
		}

		if (this.peso >= 0 && this.peso <= 19) {
			this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precioBase += 80;
		} else {
			this.precioBase += 100;
		}

	}

}
