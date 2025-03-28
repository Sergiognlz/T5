package analisis.ejercicio1;

public class PrincipalVehiculo {
	
public static void main(String[] args) {
	
	
	Vehiculo coche=new Turismo("Toyota", "Corolla", "Rojo", "1234ABC", 5, "PARTICULAR");
	

	coche.arrancar();
	coche.acelerar(50);
	coche.desacelerar(0);
	coche.parar();
}
	
	

}
