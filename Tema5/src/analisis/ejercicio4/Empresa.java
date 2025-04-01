package analisis.ejercicio4;

/**
 * clase Empresa hija de Contacto
 */
public class Empresa extends Contacto {
	/**
	 * atributo privado web
	 */
	private String web;

	/**
	 * constructor Empresa solo nombre
	 * 
	 * @param nombre
	 */
	public Empresa(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor Empresa completo
	 * 
	 * @param nombre
	 * @param telefono
	 * @param web
	 */
	public Empresa(String nombre, String telefono, String web) {
		super(nombre, telefono);
		if (web != null && !web.isBlank()) {
			this.web = web;
		}
	}

	/**
	 * muestra web
	 * 
	 * @return web
	 */
	public String getWeb() {
		return web;
	}

	/**
	 * modifica web
	 * 
	 * @param web
	 */
	public void setWeb(String web) {
		if (web != null && !web.isBlank()) {
			this.web = web;
		}
	}

	@Override
	public String toString() {
		
		return super.toString()+this.web+"\t";
	}
	
	
}
