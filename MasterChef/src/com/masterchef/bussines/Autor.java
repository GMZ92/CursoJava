package com.masterchef.bussines;

/**
 * Clase Autor
 * @author NetaSystems/Gonzalo
 */
public class Autor 
{
	/**
	 * Numero de Autor
	 */
	private int numAutor;
	/**
	 * Nombre de Autor
	 */
	private String nomAutor;
	
	
	/**
	 * Constructor con parametros
	 * @param numAutor Numero de autor
	 * @param nomAutor Nombre del autor
	 */
	public Autor(int numAutor, String nomAutor) 
	{
		super();
		this.numAutor = numAutor;
		this.nomAutor = nomAutor;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de numAutor
	 */
	public int getNumAutor() {
		return numAutor;
	}

	/**
	 * Asigna el valor
	 * @param numAutor Asigna el valor numAutor
	 */
	public void setNumAutor(int numAutor) {
		this.numAutor = numAutor;
	}


	/**
	 * Obtener el valor asignado 
	 * @return El valor de la propiedad de nomAutor
	 */
	public String getNomAutor() {
		return nomAutor;
	}

	/**
	 * Asigna el valor
	 * @param nomAutor Asigna el valor nomAutor
	 */
	public void setNomAutor(String nomAutor) {
		this.nomAutor = nomAutor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomAutor == null) ? 0 : nomAutor.hashCode());
		result = prime * result + numAutor;
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
		Autor other = (Autor) obj;
		if (nomAutor == null) {
			if (other.nomAutor != null)
				return false;
		} else if (!nomAutor.equals(other.nomAutor))
			return false;
		if (numAutor != other.numAutor)
			return false;
		return true;
	}
	
	

}
