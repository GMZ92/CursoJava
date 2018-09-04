package Business;

/**
 * Clase Carrera
 * @author NetaSystems/Gonzalo
 */
public class Carrera {
	
	/**
	 * Estado de bandera tomada
	 */
	private boolean flagTaken = false;
	/**
	 * Estado de bandera parada
	 */
	private boolean flagstop = false;
	
	/**
	 * Metodo aquireFlag Metodo estado quien tiene la bandera
	 * @param threadName Nombre del equipo
	 * @return Valor de la bandera
	 */
	public synchronized boolean aquireFlag(String threadName) {
		
		if(flagTaken) {
			return false;
		}
		
		System.out.println("La bandera la tiene el equipo: " + threadName);
		flagTaken = true;
		return true;
	}
	
	/**
	 * Metodo estado de la bandera
	 */
	public void releaseFlag() {
		flagTaken = false;
	}
	
	
	/**
	 * Metodo dejar bandera
	 * @return flagstop Retorna bandera alto
	 */
	public synchronized boolean leaveFlag() {
		return flagstop;
	}
	

	/**
	 * Metodo estado terminado
	 * @param flagstop bandera alto
	 */
	public void fFlagFinish(boolean flagstop) {
		this.flagstop = flagstop;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carrera [flagTaken= " + flagTaken + "]";
	}
		
	
}
