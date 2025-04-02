package interfaces.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrincipalSocio {
public static void main(String[] args) {
	/**
	 * conjunto de socios
	 */
	List<Socio>conjuntoSocios=new ArrayList<>();
	
	Socio s1=new Socio(3,"Paco Merla",45);
	Socio s2=new Socio(1,"María Unpajote",25);
	Socio s3=new Socio(2,"Elver Galarga",35);
	
	conjuntoSocios.add(s3);
	conjuntoSocios.add(s2);
	conjuntoSocios.add(s1);
	
	Collections.sort(conjuntoSocios, new ComparaNombres());
	
	
	
	for(Socio so:conjuntoSocios) {
		
		System.out.println(so);
		System.out.println("--------------------------");
		
	}
	Collections.sort(conjuntoSocios, new ComparaEdades());
	
	System.out.println("----------------------------------------------------------------------------------------------------------");
	
	for(Socio so:conjuntoSocios) {
		
		System.out.println(so);
		System.out.println("--------------------------");
		
	}
}
}
