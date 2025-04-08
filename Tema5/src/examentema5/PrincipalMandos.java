package examentema5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalMandos {
	public static void main(String[] args) {
		/**
		 * lista de tipo MandoDistancia
		 */
		List<MandoDistancia> listaMandos = new ArrayList<>();

		try {
			MandoDistancia m1 = new MandoTelevision("M80", 2.5, 50);
			MandoDistancia m2 = new MandoTelevision("PK3000", 2.5, 50);
			MandoDistancia m3 = new MandoTelevision("N80", 2.5, 50);
			MandoDistancia m4 = new MandoMiniCadena("AV700", 3.5, 75);
			MandoDistancia m5 = new MandoMiniCadena("GT2000", 5.5, 115);
			MandoDistancia m6 = new MandoMiniCadena("P20", 2.5, 45);
			MandoDistancia m7 = new MandoAspiradora("TG2", 10.4, 200);
			MandoDistancia m8 = new MandoAspiradora("VP22", 5.4, 25);
			MandoDistancia m9 = new MandoAireAcondicionado("V14", 1.45, 40);
			MandoDistancia m10 = new MandoAireAcondicionado("F299", 4.0, 60);

			listaMandos.add(m1);
			listaMandos.add(m2);
			listaMandos.add(m3);
			listaMandos.add(m4);
			listaMandos.add(m5);
			listaMandos.add(m6);
			listaMandos.add(m7);
			listaMandos.add(m8);
			listaMandos.add(m9);
			listaMandos.add(m10);

		} catch (ModeloException e) {

			System.out.println(e.getMessage());

		} catch (PrecioNegativoException e) {

			System.out.println(e.getMessage());

		}
		/*
		 * listaMandos.add(m1); listaMandos.add(m2); listaMandos.add(m3);
		 * listaMandos.add(m4); listaMandos.add(m5); listaMandos.add(m6);
		 * listaMandos.add(m7); listaMandos.add(m8); listaMandos.add(m9);
		 * listaMandos.add(m10);
		 */
		
		Collections.sort(listaMandos);
		
		for(MandoDistancia m:listaMandos) {
			
			m.interruptorMando();
			
		//	System.out.println(m);
			//System.out.println("---------------------------------");
			
			if(m instanceof MandoTelevision) {
				((MandoTelevision) m).masCanal();
				((MandoTelevision) m).subirVolumen();
				((MandoTelevision) m).bajarVolumen();
			}else if(m instanceof MandoMiniCadena) {
				((MandoMiniCadena) m).subirVolumen();
				((MandoMiniCadena) m).bajarVolumen();
			}else if(m instanceof MandoAspiradora) {
				((MandoAspiradora) m).subirVelocidad();
				((MandoAspiradora) m).bajarVelocidad();
			}else if(m instanceof MandoAireAcondicionado) {
				((MandoAireAcondicionado) m).cambiarModo();
				((MandoAireAcondicionado) m).subirTemperatura();
				((MandoAireAcondicionado) m).subirVelocidad();
				((MandoAireAcondicionado) m).bajarVelocidad();
			}
			
			System.out.println(m);
			System.out.println("---------------------------------");
			
		}
		
		
	}
}
