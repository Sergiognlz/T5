package examentema5;

/**
 * clase MandoAspiradora que es hija de MandoDistancia e implementa Velocidad
 */
public class MandoAspiradora extends MandoDistancia implements Velocidad{
	/**
	 * atributo privado velocidad por defecto a 0
	 */
	private int velocidad=0;

	/**
	 * constructor MandoAspiradora
	 * @param modelo mando
	 * @param anchura mando
	 * @param precio mando
	 * @throws PrecioNegativoException
	 * @throws ModeloException
	 */
	public MandoAspiradora(String modelo, double anchura, double precio)
			throws PrecioNegativoException, ModeloException {
		super(modelo, anchura, precio);
		
	}
/**
 * método que incrementa la velocidad en 1 hasta 3;
 */
	public void subirVelocidad() {
		if(this.velocidad<3) {
			this.velocidad++;
		}
	}
	/**
	 * método que decrementa la velocidad en 1 hasta 0
	 */
	public void bajarVelocidad() {
		if(this.velocidad>0) {
			this.velocidad--;
		}
	}
	
	/**
	 *sobreescritura del método toString 
	 */
	@Override
	public String toString() {
		//devuelve toString del padre y datos del hijo
		return super.toString()+"Velocidad: "+this.velocidad;
	}
}
