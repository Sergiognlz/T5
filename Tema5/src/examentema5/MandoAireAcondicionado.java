package examentema5;

public class MandoAireAcondicionado extends MandoDistancia implements Velocidad {
	/**
	 * enumerado de tipo Modo
	 */
	enum Modo {
		FRIO, CALOR
	};
	
	/**
	 * atributo de tipo Modo inicializado a frio
	 */
	private Modo modo=Modo.FRIO;
	
	/**
	 * atributo privado temperatura por defecto a 22
	 */
	private int temperatura = 22;
	/**
	 * atributo privado velocidad por defecto a 0
	 */
	private int velocidad = 0;
	
	/**
	 * Constructor MandoAireAcondicionado
	 * @param modelo mando
	 * @param anchura mando
	 * @param precio mando
	 * @throws PrecioNegativoException
	 * @throws ModeloException
	 */
	public MandoAireAcondicionado(String modelo, double anchura, double precio)
			throws PrecioNegativoException, ModeloException {
		super(modelo, anchura, precio);

	}
	
	/**
	 * método que incrementa la velocidad en 1 hasta 5;
	 */
		public void subirVelocidad() {
			if(this.velocidad<5) {
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
	 * método que incrementa la temperatura hasta 40
	 */
	public void subirTemperatura() {
		if(this.temperatura<40) {
			this.temperatura++;
		}
	}
	/**
	 * método que baja la temperatura hasta 14
	 */
	public void bajarTemperatura() {
		if(this.temperatura<14) {
			this.temperatura++;
		}
	}
	
	/**
	 * método que cambia el modo
	 */
	public void cambiarModo() {
		if(this.modo==Modo.FRIO) {
			this.modo=Modo.CALOR;
		}else {
			this.modo=Modo.FRIO;
		}
	}
	
	/**
	 * sobreescritura del método toString
	 * @return toString del padre y datos del hijo
	 */
	@Override
	public String toString() {
		
		return super.toString()+this.modo+"\nTemperatura: "+this.temperatura+"º \nVelocidad: "+this.velocidad;
	}
	
}
