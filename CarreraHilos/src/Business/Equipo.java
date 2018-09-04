package Business;

import java.util.ArrayList;
import java.util.List;

import Business.Corredor;
import Business.Carrera;

/**
 * CLASE EQUIPO
 * @author GONZALO
 */

public class Equipo implements Runnable{

	private List<Corredor> corredores;
	private String name;
	private Carrera carrera;
	private int pendientes = 3;
	
	/**
	 * Constructor Equipo
	 * @param carrera parametro carrera
	 * @param name parametro nombre
	 */
	public Equipo(Carrera carrera, String name){
		this.name = name;
		this.carrera = carrera;
		corredores = new ArrayList<>();
		for(int i = 0; i < pendientes; i++) {
			Corredor c = new Corredor(carrera, this.name + " Corredor:" + i, this);
			corredores.add(c);
		}
	}
	

	/**
	 * Metodo corredorTerminado
	 */
	public void corredorTermina() {
		this.pendientes--;
		if(pendientes == 0) {
			System.out.println("El equipo: " + this.name + " ha terminado!!!!");
			carrera.fFlagFinish(true);	
			return;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Equipo: " + this.name + " ha iniciado!!!!");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(Corredor c : corredores) {
			Thread t = new Thread(c);
			t.start();
		}
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Equipos [corredores=" + corredores + ", name=" + name + ", carrera=" + carrera + ", pendientes="
				+ pendientes + "]";
	}

	
	
}
