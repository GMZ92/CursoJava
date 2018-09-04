package com.masterchef.bussines;

/**
 * Clase Ingredientes
 * @author Netasystems/Gonzalo
 */
public class Ingredientes 
{
	/**
	 * Nombre ingredientes
	 */
	private String nombre;
	/**
	 * Cantidad de ingredientes
	 */
	private String cantidad;
	
	
	/**
	 * Constructor con parametros
	 * @param nombre Parametro nombre del ingrediente
	 * @param cantidad Parametro cantidad del ingrediente
	 */
	public Ingredientes(String nombre, String cantidad) 
	{
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	
	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Asigna el valor
	 * @param nombre Asigna el valor nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de cantidad
	 */
	public String getCantidad() {
		return cantidad;
	}


	/**
	 * Asigna el valor
	 * @param cantidad Asigna el valor cantidad
	 */
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Ingredientes other = (Ingredientes) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}	
	
	
}
