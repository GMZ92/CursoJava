package Business;

import java.util.ArrayList;
import java.util.List;

import Business.Corredor;
import Business.Carrera;

/**
 * Clase Equipo
 * @author NetaSystems/Gonzalo 
 */
public class Equipo implements Runnable{

	/**
	 * Lista de Corredores
	 */
	private List<Corredor> corredores;
	/**
	 * Nombre del Equipo
	 */
	private String name;
	/**
	 * Nombre de la carrera
	 */
	private Carrera carrera;
	/**
	 * Corredores pendientes
	 */
	private int pendientes = 3;
	
	/**
	 * Constructor Equipo
	 * @param carrera Parametro de Carrera
	 * @param name Parametro nombre del equipo 
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
	 * Metodo corredor termina
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
