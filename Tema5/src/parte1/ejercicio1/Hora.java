package parte1.ejercicio1;

public class Hora {
	// atributos hora
	int hora;
	// atributo minutos
	int minuto;

	/**
	 * constructor Hora
	 * 
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		super();
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	/**
	 * función que incrementa la hora en un minuto. Si la hora llega a 24 pasa a ser
	 * 0
	 */
	public void inc() {

		minuto++;

		if (minuto == 60) {
			hora++;
			minuto = 0;
			if(hora==24) {
				hora=0;
			}
		}
	}

	/**
	 * Muestra hora
	 * 
	 * @return hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Modifica hora
	 * 
	 * @param hora
	 */
	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}

	/**
	 * Muestra minuto
	 * 
	 * @return minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Modifica minuto
	 * 
	 * @param minuto
	 */
	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	/**
	 * Sobreescritura to string
	 */
	@Override
	public String toString() {
		String cadena = "";
		if (hora < 10) {

			cadena += "0" + this.hora;

		} else {
			cadena += this.hora;
		}
		cadena += ":";

		if (minuto < 10) {
			cadena += "0" + this.minuto;
		} else {
			cadena += this.minuto;
		}

		return cadena;
	}

}
