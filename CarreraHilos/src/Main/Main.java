package Main;

import Business.Carrera;
import Business.Equipo;

/**
 * CLASE MAIN
 * @author GONZALO
 */

public class Main {

	/**
	 * CLASE Principal
	 * @param args menu
	 */
	public static void main(String[] args) {
		
		System.out.println("Carrera de Netasystems!!!!");
		Carrera carrera = new Carrera();
		
		Equipo eqAzul = new Equipo(carrera, "Azul");
		Equipo eqAmarillo = new Equipo(carrera, "Amarillo");
		Equipo eqRojo = new Equipo(carrera, "Verde");	
		
		Thread teqAz = new Thread(eqAzul);
		Thread teqAm = new Thread(eqAmarillo);
		Thread teqRo = new Thread(eqRojo);
		
		teqAm.start();
		teqAz.start();
		teqRo.start();
			
	}

}
