package Business;

/**
 * CLASE CARRERA
 * @author GONZALO
 */

public class Carrera {
	
	private boolean flagTaken = false;
	private boolean flagstop = false;
	
	/**
	 * Metodo aquireFlag Metodo bandera
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
	 * Metodo relaseFlag
	 */
	public void releaseFlag() {
		flagTaken = false;
	}
	
	
	/**
	 * @return flagstop Retorna bandera alto
	 */
	public synchronized boolean leaveFlag() {
		return flagstop;
	}
	

	/**
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
