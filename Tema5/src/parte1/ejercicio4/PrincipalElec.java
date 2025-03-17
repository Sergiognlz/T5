package parte1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class PrincipalElec {
	public static void main(String[] args) {

		// creamos lista electrodomésticos
		List<Electrodomestico> listaElec = new ArrayList<>();
		//creamos las variables dónde vamos a guardar la suma de los precios
		double sumaElectro=0;
		double sumaTv=0;
		double sumaLava=0;
		//creamos los objetos de la lista e invocamos al constructor
		Electrodomestico e1 = new Electrodomestico(500, 20);
		Electrodomestico e2 = new Lavadora(300, 50);
		Electrodomestico e3 = new Television(700, 15);
		Electrodomestico e4 = new Electrodomestico(800, 100);
		Electrodomestico e5 = new Television(600, 10);
		//añadimos los objetos a la lista
		listaElec.add(e1);
		listaElec.add(e2);
		listaElec.add(e3);
		listaElec.add(e4);
		listaElec.add(e5);
		
		//recorremos la lista con un for each
		for (Electrodomestico elec : listaElec) {
			//concatenamos en sumaElectro los precios de todos los objetos que recorren
			sumaElectro+=elec.getPrecioBase();
			//si los objetos son de clase television...
			if(elec instanceof Television) {
				//sumamos en sumaTv
				sumaTv+=elec.getPrecioBase();
				//si los objetos son de tipo Lavadora
			}else if(elec instanceof Lavadora) {
				//sumamamos en sumaLava
				sumaLava+=elec.getPrecioBase();
			}
		}
		
		//mostramos por pantalla los precios totales de cada objeto
		System.out.println("Electrodomésticos: "+sumaElectro+" €");
		System.out.println("Televisores: "+sumaTv+" €");
		System.out.println("Lavadoras: "+sumaLava+" €");
		
		
	}
}