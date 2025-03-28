package analisis.ejercicio1;

public class Motocicleta extends Vehiculo {

	/**
	 * atributo privado cilindrada
	 */
	private int cilindrada;

	/**
	 * constructor motocicleta
	 * 
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param cilindrada
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}
	}

	/**
	 * función que nos dice si nuestra moto necesita carnet
	 * @return true si necesita y false si no
	 */
	public boolean carnet() {
		//variable carnet
		boolean carnet=false;
		//si la moto tiene más de 50 de cc..
		if(this.cilindrada>50) {
			//necesita carnet
			carnet=true;
		}
		return carnet;
	}
	
	
	
	
}
