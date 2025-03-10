package parte1.ejercicio1;

import java.util.Scanner;

public class PrincipalHoras {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// variable opción
		int opcion;
		// variable hora
		int hora;
		// variable minuto
		int minuto;
		// variable segundo
		int segundo;
			
		//variable objeto HoraExacta que inicializamos llamando al método creaHoraExacta;
		HoraExacta hE=creaHoraExacta();
		//creamos objeto Hora y la igualamos a he
		Hora h=hE;
		//do while para repetir el proceso hasta que elijamos salir
		do {
			//llamamos mostrar menú
			mostrarMenu(hE);
			//pedimos opción y la guardamos en variable opcion
			opcion=pedirOpcion();
			
			//swtich con las operaciones
			switch(opcion) {
			//caso 1: inc minutos
			case 1->{
				//llamamos a la función inc() del objeto h
				h.inc();
			
		
			}
			//caso 0: salir
			case 0->{
				System.out.println("Saliendo del Progama");
			}
			
			default->{
				System.out.println("La opción introducida no existe");
			}
			}
			
			
			
		}while(opcion!=0);
		
		
		//cerramos escaner
		sc.close();
	}

	/**
	 * método que pide el atributo hora al usuario
	 * 
	 * @return hora
	 */
	public static int pedirHora() {
		int hora;

		System.out.println("Introduce la hora");
		hora = sc.nextInt();

		return hora;
	}

	/**
	 * método que pide el atributo minuto al usuario
	 * 
	 * @return minuto
	 */
	public static int pedirMinuto() {
		int minuto;

		System.out.println("Introduce el minuto");
		minuto = sc.nextInt();

		return minuto;
	}

	/**
	 * método que pide el atributo segundo al usuario
	 * 
	 * @return segundo
	 */
	public static int pedirSegundo() {
		int segundo;

		System.out.println("Introduce segundos");
		segundo = sc.nextInt();

		return segundo;
	}

	/**
	 * método que llama a las funciones pedir horas, minutos y segundos y llama al
	 * constructor devolviendo un obejeto HoraExacta.
	 * 
	 * @return objeto HoraExacta;
	 */
	public static HoraExacta creaHoraExacta() {
		int hora = pedirHora();
		int minuto = pedirMinuto();
		int segundo = pedirSegundo();
		HoraExacta objeto = new HoraExacta(hora, minuto, segundo);

		return objeto;
	}

	/**
	 * función que muestra menú
	 * @param objeto hora exacta
	 */
public static void mostrarMenu(HoraExacta objeto) {
	
	System.out.println(objeto);
	System.out.println();
	System.out.println("Menú:");
	System.out.println("1. Incrementar segundos");

	System.out.println("0. Salir");
	System.out.println();

	
}
	
/**
 * función que pide la opción
 * @return opcion
 */
public static int pedirOpcion() {
	int opcion;
	
	System.out.println("Introduce opcion");
	opcion=sc.nextInt();
	
	return opcion;
}


}
