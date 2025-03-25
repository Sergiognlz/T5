package interfaces.ejercicio3;

/**
 * clase abstracta animal doméstico que guarda los datos del animal y las cosas
 * que hace
 */
public abstract class AnimalDomestico implements Animal{
	/**
	 * atributo privado nombre del animal
	 */
	private String nombre;
	/**
	 * atributo privado raza del animal
	 */
	private String raza;
	/**
	 * atributo privado peso del animal
	 */
	private double peso;
	/**
	 * atributo privado color del animal
	 */
	private String color;

	/**
	 * método vacunar que imprime visita al veterinario
	 */
	public void vacunar() {
		System.out.println("Visita al veterinario");
	}
	
	/**
	 * método abstracto hacer caso
	 */
	public abstract boolean hacerCaso();
	
	/**
	 * método abstracto hacer ruido
	 */
	public abstract void hacerRuido();
	
	/**
	 * Método comer que imprime un mensaje 
	 */
	public void comer() {
		System.out.println("Ñam, ñam...");
	}
	
	/**
	 * método dormir que imprime una onomatopeya de dormir
	 */
	public void domir() {
		System.out.println("ZZZZZ....");
	}
	
	
	
	
}
