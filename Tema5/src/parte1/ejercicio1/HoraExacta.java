package parte1.ejercicio1;

public class HoraExacta extends Hora {
	// atributo segundo
	int segundo;

	/**
	 * constructor Hora Exacta
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);

		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
	}

	/**
	 * Muestra Segundo
	 * 
	 * @return segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Modifica segundo
	 * 
	 * @param segundo
	 */
	public void setSegundo(int segundo) {
		if (segundo <= 0 && segundo > 60) {
			this.segundo = segundo;
		}
	}

	/**
	 * método que incrementa un segundo. Llama a su vez al método de la superclase
	 * inc()
	 */
	public void inc() {
		segundo++;

		if (segundo == 60) {
			super.inc();
			segundo = 0;
		}
	}

	
	/**
	 * sobreescritura del método string
	 */
	@Override
	public String toString() {

		String cadena = super.toString();

		cadena += ":";
		if (segundo < 10) {
			cadena += "0" + this.segundo;
		} else {
			cadena += this.segundo;
		}

		return cadena;
	}

}
