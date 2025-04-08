package examentema5;

/**
 * clase mando a distancia que implementa la interfaz comparable
 */
public class MandoDistancia implements Comparable<MandoDistancia> {
	/**
	 * atributo privado modelo del mando
	 */
	private String modelo;
	/**
	 * atributo privado anchura del mando
	 */
	private double anchura;
	/**
	 * atributo privado precio del mando
	 */
	private double precio;
	/**
	 * atributo privado encendido, por defecto en false (apagado)
	 */
	private boolean encendido = false;

	/**
	 * constructor MandoDistancia
	 * 
	 * @param modelo
	 * @param anchura
	 * @param precio
	 * @throws PrecioNegativoException
	 * @throws ModeloException
	 */
	public MandoDistancia(String modelo, double anchura, double precio)
			throws PrecioNegativoException, ModeloException {
		// si es nulo o está vacío
		if (modelo != null && !modelo.isBlank()) {
			// asignamos al atributo modelo el valor de modelo
			this.modelo = modelo;
			// si fuese nulo o vacío
		} else {
			// arroja una excepción
			throw new ModeloException();
		}
		// si es mayor que 0
		if (anchura > 0) {
			// asigna al atributo anchura el valor de anchura
			this.anchura = anchura;
		}
		// si es mayor que 0
		if (precio > 0) {
			// se asigna al atributo precio el valor de precio
			this.precio = precio;
			// si no
		} else {
			// lanza una excepción
			throw new PrecioNegativoException();

		}

	}

	/**
	 * método que modifica el valor de encendido dependiendo de si se encuentra
	 * apagado o encendido
	 */
	public void interruptorMando() {
		// Si encendido es true
		if (this.encendido) {
			// lo cambia a false, es decir lo apaga
			this.encendido = false;
			// en caso de que esté apagado
		} else {
			// lo pone a true, es decir, lo enciende
			this.encendido = true;
		}
	}

	/**
	 * sobreescritura del método equals. Dos mandos serán iguales si tiene el mismo
	 * modelo
	 * @return devolvemos true si son iguales y false si no son
	 */
	@Override
	public boolean equals(Object obj) {
		//variable booleana iguales a false por defecto
		boolean iguales = false;
		//casteo de objeto y lo guardamos en un objeto m de tipo MandoDistancia
		MandoDistancia m = (MandoDistancia) obj;
		//si el modelo de los dos es el mismo
		if (this.modelo.equals(m.modelo)) {
			//serán iguales
			iguales = true;
		}
		//devolvemos iguales
		return iguales;
	}

	/**
	 * sobreescritura del método toString con los datos de impresión
	 * @return cadena con los datos a imprimir
	 */
	@Override
	public String toString() {
		//variable botón que nos mostrará una cadena diciéndonos si el mando está encencido o apagado
		String boton=this.encendido?"Encendido":"Apagado";
		//variable cadena con los datos a imprimir
		String cadena = "Modelo: " + this.modelo + "\nAnchura: " + this.anchura + "\nPrecio: " + this.precio
				+ "\n" + boton+"\n";
		//devuelve cadena
		return cadena;
	}

	/**
	 * sobreescritura del método compareTo
	 * @return devolvemos comparación entre el modelo del objeto y el del que le pasamos
	 */
	@Override
	public int compareTo(MandoDistancia o) {
		//devolvemos comparación entre el modelo del objeto y el del que le pasamos
		return this.modelo.compareTo(o.modelo);
	}

}
