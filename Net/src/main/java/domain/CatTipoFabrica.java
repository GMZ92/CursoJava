package domain;

import java.io.Serializable;
import java.util.Date;


/**
 * Clase CatTipoFabrica
 * @author NetaSystems/Gonzalo
 *
 */
public class CatTipoFabrica implements Serializable{

	/**
	 * Id de Tipo de Fabrica 
	 */
	private long idCatTipoFabrica;
	/**
	 * Nombre de la fabrica
	 */
	private String nombre;
	/**
	 * Estatus de la fabrica
	 */
	private Character status;
	/**
	 * Fecha modificacion
	 */
	private Date fechaModificacion;
	/**
	 * Id de Usuario
	 */
	private Long idUsuario;
	
	
	
	/**
	 * Constructor Vacio
	 */
	public CatTipoFabrica() {
	
	}

	
	/**
	 * Constructor con los parametros
	 * @param idCatTipoFabrica Id Tipo Fabrica de fabrica asignada
	 * @param nombre Nombre de la fabrica
	 * @param status Estatus de la fabrica
	 * @param fechaModificacion Fecha Modificacion
	 * @param idUsuario Id Usuario
	 */
	public CatTipoFabrica(long idCatTipoFabrica, String nombre, char status, Date fechaModificacion, long idUsuario) {
		super();
		this.idCatTipoFabrica = idCatTipoFabrica;
		this.nombre = nombre;
		this.status = status;
		this.fechaModificacion = fechaModificacion;
		this.idUsuario = idUsuario;
	}
	
	
	/**
	 * Obtener el valor asignado 
	 * @return el valor idCatTipoFabrica
	 */
	public long getIdCatTipoFabrica() {
		return idCatTipoFabrica;
	}


	/**
	 * Asignar el valor
	 * @param idCatTipoFabrica Valor asignado idCatTipoFabrica
	 */
	public void setIdCatTipoFabrica(long idCatTipoFabrica) {
		this.idCatTipoFabrica = idCatTipoFabrica;
	}


	/**
	 * Obtener el valor asignado 
	 * @return el valor nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Asignar el valor
	 * @param nombre Valor asignado nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Obtener el valor asignado 
	 * @return el valor status
	 */
	public Character getStatus() {
		return status;
	}


	/**
	 * Asignar el valor
	 * @param status Valor asignado status
	 */
	public void setStatus(Character status) {
		this.status = status;
	}


	/**
	 * Obtener el valor asignado 
	 * @return el valor fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}


	/**
	 * Asignar el valor
	 * @param fechaModificacion Valor asignado fechaModificacion
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	/**
	 * Obtener el valor asignado 
	 * @return el valor idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}


	/**
	 * Asignar el valor
	 * @param idUsuario Valor asignado idUsuario
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaModificacion == null) ? 0 : fechaModificacion.hashCode());
		result = prime * result + (int) (idCatTipoFabrica ^ (idCatTipoFabrica >>> 32));
		result = prime * result + (int) (idUsuario ^ (idUsuario >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + status;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatTipoFabrica other = (CatTipoFabrica) obj;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (idCatTipoFabrica != other.idCatTipoFabrica)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CatTipoFabrica [idCatTipoFabrica=" + idCatTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaModificacion=" + fechaModificacion + ", idUsuario=" + idUsuario + "]";
	}
	
		
}
