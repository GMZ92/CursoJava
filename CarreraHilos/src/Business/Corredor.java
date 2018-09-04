package Business;

/**
 * CLASE CORREDOR
 * @author GONZALO
 */

public class Corredor implements Runnable{

	private Carrera carrera;
	private boolean corre = true;
	private String name;
	private Equipo equipo;
	
	/**
	 * Constructor
	 * @param carrera parámetro de la carrera
	 * @param name  parámetro del nombre
	 * @param equipo  parámetro del equipo
	 */
	public Corredor(Carrera carrera, String name, Equipo equipo) {
		this.carrera = carrera;
		this.name = name;
		this.equipo = equipo;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
			
		while(corre && !carrera.leaveFlag()) {
			boolean aquired = false;
			
			try {
				Thread.sleep(1500);
				
				if(!carrera.leaveFlag()) {
					aquired = carrera.aquireFlag(this.name);
				}
				
				if(aquired) {
					Thread.sleep(2000);
					carrera.releaseFlag();
					this.corre = false;
					equipo.corredorTermina();
				}
				
				if(carrera.leaveFlag()) {
					if(corre)
					{
						System.out.println("Falto:  " + this.name);
					}
					this.corre = true;
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Corredores [carrera=" + carrera + ", corre=" + corre + ", name=" + name + ", equipo=" + equipo + "]";
	}
	
}
